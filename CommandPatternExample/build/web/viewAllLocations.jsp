<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.*, java.util.*" %>
<%  ArrayList<Location> locations = 
           (ArrayList<Location>)request.getAttribute("locationList");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Design Patterns Example</title>
        <link rel="stylesheet" type="text/css" href="DesignPatternsExample.css">
    </head>
    <body>
        <h1>Design patterns example</h1>
        <h2>All Locations</h2>
        <table>
            <tr>
                <th>Dept No</th>
                <th>Name</th>
                <th>Location</th>
                <th>Actions</th>
            </tr>

<%      int ctr = 0;
        for (Location loc : locations)
        {
%>
            <tr<%= ctr++%2==0 ? " class=\"shaded\"" : "" %>>
                <td><%= loc.getDeptNo() %></td>
                <td><%= loc.getName() %></td>
                <td><%= loc.getLocation() %></td>
                <td>
                    <form action="main" method="post">
                        <input type="submit" value="View employees">
                        <input type="hidden" name="command" value="locationEmployees">
                        <input type="hidden" name="locationId" value="<%= loc.getDeptNo() %>">
                    </form>
                </td>
            </tr>
<%      }
%>            
        </table>
    </body>
</html>
