package com.oop.handler;

import java.io.IOException;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.dao.GameDao;
import com.oop.dao.*;
import com.oop.bean.*;
import com.oop.bean.GameBean;

public class GameHandler extends HttpServlet {    
    private static String INSERT = "/addGames.jsp";
    private static String Edit = "/editGames.jsp";
    private static String UserRecord = "/listGames.jsp";
    private GameDao dao;

    public GameHandler() {
        super();
        dao = new GameDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String redirect="";
        String uId = request.getParameter("gamesid");        
        String action = request.getParameter("action");
        if(!((uId)== null) && action.equalsIgnoreCase("insert"))
        {
        	int id = Integer.parseInt(uId);
        	GameBean user = new GameBean();
        	user.setId(id);
            user.setGameName(request.getParameter("gameName"));
            user.setDeveloperName(request.getParameter("developerName"));
        	dao.addUser(user);
        	redirect = UserRecord;
            request.setAttribute("games12", dao.getAllUsers());    
           	System.out.println("Record Added Successfully");
        }
        else if (action.equalsIgnoreCase("delete")){
            String userId = request.getParameter("gamesid");
            int uid = Integer.parseInt(userId);
            dao.removeUser(uid);
            redirect = UserRecord;
            request.setAttribute("games12", dao.getAllUsers());
            System.out.println("Record Deleted Successfully");
        }else if (action.equalsIgnoreCase("editform")){        	
        	redirect = Edit;            
        } else if (action.equalsIgnoreCase("edit")){
        	String userId = request.getParameter("gamesid");
            int uid = Integer.parseInt(userId);            
            GameBean user = new GameBean();
        	user.setId(uid);
            user.setGameName(request.getParameter("gameName"));
            user.setDeveloperName(request.getParameter("developerName"));
            dao.editUser(user);
            request.setAttribute("games12", user);
            redirect = UserRecord;
            System.out.println("Record updated Successfully");
         } else if (action.equalsIgnoreCase("listUser")){
            redirect = UserRecord;
            request.setAttribute("games12", dao.getAllUsers());
         } else {
            redirect = INSERT;
        }

        RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}