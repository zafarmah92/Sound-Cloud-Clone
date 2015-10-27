package commands;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HomeJsp implements Command
{
    private HttpServletRequest request;
    private HttpServletResponse response;
    
    public HomeJsp(HttpServletRequest request, HttpServletResponse response)
    {
        this.request = request;
        this.response = response;
    }
    
    public String execute() throws ServletException, IOException
    {
        String viewName = "";
        viewName = "index.jsp";
        return viewName;
    }
}
