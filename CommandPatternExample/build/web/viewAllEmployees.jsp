<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.*, java.util.*" %>
<%  ArrayList<Employee> employees = 
           (ArrayList<Employee>)request.getAttribute("employeeList");
%>

<html>
    <head>
        <title>Design Patterns Example</title>
        <link rel="stylesheet" type="text/css" href="DesignPatternsExample.css">
    </head>
    <body>
        <h1>Design patterns example</h1>
        <h2>All Employees</h2>
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
    </body>
</html>