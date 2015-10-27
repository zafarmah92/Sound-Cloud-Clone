package commands;

import commands.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContactsJsp implements Command
{
    private HttpServletRequest request;
    private HttpServletResponse response;
    
    public ContactsJsp(HttpServletRequest request, HttpServletResponse response)
    {
        this.request = request;
        this.response = response;
    }
    
    public String execute() throws ServletException, IOException
    {
        String viewName = "";
        viewName = "Contacts.jsp";
        return viewName;
    }
}
