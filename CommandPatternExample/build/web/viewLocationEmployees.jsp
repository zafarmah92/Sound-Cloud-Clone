<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.*, java.util.*" %>
<%  ArrayList<Employee> employees = 
           (ArrayList<Employee>)request.getAttribute("locationEmployeeList");
    Location location = null;
    if (employees.size() > 0)
    {
        location = employees.get(0).getLocation();
    }
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Design Patterns Example</title>
        <link rel="stylesheet" type="text/css" href="DesignPatternsExample.css">
    </head>
    <body>
        <h1>Design patterns example</h1>
        <h2>Location's Employees</h2>

<%  if (employees.size() == 0)
    {
%>      <p>There are no employees at the selected location.</p>
<%  }
    else
    {
%>
        <h3>Location</h3>
        <p><b>Name: </b><%= location.getName() %></p>
        <p><b>Address: </b><%= location.getLocation() %></p>
        
        <table>
            <tr>
                <th>Emp No</th>
                <th>Name</th>
                <th>Job</th>
            </tr>

<%      int ctr = 0;
        for (Employee e : employees)
        {
%>
            <tr<%= ctr++%2==0 ? " class=\"shaded\"" : "" %>>
                <td><%= e.getEmpNo() %></td>
                <td><%= e.getName() %></td>
                <td><%= e.getJob() %></td>
            </tr>
<%      }
%>            
        </table>
<%  }
%>            
    </body>
</html>