package commands;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class CommandFactory
{
    public static Command createCommand(HttpServletRequest request, 
                                        HttpServletResponse response)
    {
        Command command = null;
        String userCommand = request.getParameter("command");
        
        if (userCommand != null && !userCommand.equals(""))
        {
            if (userCommand.equalsIgnoreCase("Search"))
            {
                command = new SearchJsp(request, response);
            }
            else if (userCommand.equalsIgnoreCase("Home"))
            {
                command = new HomeJsp(request, response);
            }
            else if (userCommand.equalsIgnoreCase("Username"))
            {
                command = new UsernameJsp(request, response);
            }
            else if (userCommand.equalsIgnoreCase("Contacts"))
            {
                command = new ContactsJsp(request, response);
            }
        }
        return command;
    }
}