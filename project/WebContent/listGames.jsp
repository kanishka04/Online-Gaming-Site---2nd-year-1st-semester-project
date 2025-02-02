<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="com.oop.bean.GameBean"%>
<%@ page import="com.oop.dao.GameDao"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="listgames.css" >
<title>All Games</title>
</head>
<body>
<%
	//UserBean user = new UserBean();
GameDao dao = new GameDao();
List<GameBean> userList = dao.getAllUsers();
//Iterator<UserBean> itr = userList.iterator();
%>
<table border="1">
<tr>
<th class="c1">GameID</th>
<th class="c2">Game Name</th>
<th class="c3">Developer</th>
<th></th>
</tr>
<tr>
<%
for (GameBean user : userList) {
%>
<td class="c1"><%=user.getId()%></td>
<td class="c2"><%=user.getGameName()%></td>
<td class="c3"><%=user.getDeveloperName()%></td>
<td class="c4"><a href="GameHandler?action=editform&userId=<%=user.getId()%>">Update</a></td>
<td class="c5"><a href="GameHandler?action=delete&userId=<%=user.getId()%>">Delete</a></td>

</tr>
<%
}
//}
%>
</table>
<p><a href="GameHandler?action=insert">Add Games</a></p>
</body>
</html>