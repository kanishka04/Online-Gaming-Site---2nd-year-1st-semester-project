package com.oop.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.oop.bean.GameBean;
import com.oop.bean.*;
import com.oop.dbconnection.ConnectionProvider;

public class GameDao {

    private Connection conn;

    public GameDao() {
    	conn = ConnectionProvider.getConnection();
    }

    public void addUser(GameBean userBean) {
        try {
        	String sql = "INSERT INTO games12(gamesid, gameName,developerName)" +
    		" VALUES (?, ?, ? )";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, userBean.getId());
            ps.setString(2, userBean.getGameName());
            ps.setString(3, userBean.getDeveloperName());            
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeUser(int userId) {
        try {
        	String sql = "DELETE FROM games12 WHERE gamesid=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setInt(1, userId);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
      }

    public void editUser(GameBean userBean) {    	
    	try {
    		String sql = "UPDATE games12 SET gameName=?, developerName=?" +
            " WHERE gamesid=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setString(1, userBean.getGameName());
            ps.setString(2, userBean.getDeveloperName());            
            ps.setInt(3, userBean.getId());
            ps.executeUpdate();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List getAllUsers() {
        List users = new ArrayList();
        try {
        	String sql = "SELECT * FROM games12";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GameBean userBean = new GameBean();
                userBean.setId(rs.getInt("gamesid"));
                userBean.setGameName(rs.getString("gameName"));
                userBean.setDeveloperName(rs.getString("developerName"));                             
                users.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public GameBean getUserById(int userId) {
    	GameBean userBean = new GameBean();
        try {
        	String sql = "SELECT * FROM games12 WHERE gamesid=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	userBean.setId(rs.getInt("gamesid"));
            	userBean.setGameName(rs.getString("gameName"));
            	userBean.setDeveloperName(rs.getString("developerName"));                           
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }
}