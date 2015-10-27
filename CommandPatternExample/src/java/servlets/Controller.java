package servlets;

import commands.Command;
import commands.CommandFactory;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Controller extends HttpServlet
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        Command command = CommandFactory.createCommand(request, response);
        String viewPage = command.execute();
        
        RequestDispatcher rd = request.getRequestDispatcher(viewPage);
        rd.include(request, response);
    }
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }
}
