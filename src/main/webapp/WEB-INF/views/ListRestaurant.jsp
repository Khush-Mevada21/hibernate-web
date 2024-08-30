<%@page import="com.entity.RestaurantEntity"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Restaurants</title>
</head>
<body>
	
	<h3>List of Restaurants</h3>
	
	<%
		List<RestaurantEntity> restaurants = (List<RestaurantEntity>) request.getAttribute("restaurants");
	%>
	
	<table border="1">
		<tr>
			<th>RestaurantId</th>
			<th>Name</th>
			<th>category</th>
			<th>ACTION</th>
		</tr>
	
	<%
		for (RestaurantEntity r : restaurants){
			out.print("<tr>");
			out.print("<td>" + r.getRestaurantId() + "</td>");
			out.print("<td>" + r.getName() + "</td>");
			out.print("<td>" + r.getCategory() + "</td>");
			out.print("<td> <a href='deleterestaurant?restaurantId="+ r.getRestaurantId() +"'> DELETE </a> ");
			out.print(" | <a href='editrestaurant?restaurantId="+ r.getRestaurantId() +"'> EDIT </a> </td> ");
			out.print("</tr>");
		}
	%>
	</table>
	
</body>
</html>






