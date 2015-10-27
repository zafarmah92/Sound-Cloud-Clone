package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contacts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Music Library</title>\n");
      out.write("<link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://w.soundcloud.com/player/api.js\"></script>\n");
      out.write("        <script src=\"//connect.soundcloud.com/sdk.js\"></script>\n");
      out.write("         \n");
      out.write("             \n");
      out.write("             \n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("\t<div id=\"menu\">\n");
      out.write("             <form action=\"main\" method=\"get\">\n");
      out.write("\t\t<ul>\n");
      out.write("                    <li class=\"current_page_item\">\n");
      out.write("                        <input type=\"submit\" name=\"command\" value=\"Home\"/>\n");
      out.write("                    </li>\n");
      out.write("\t\t\t<li><input type=\"submit\" name=\"command\" value=\"Search\"/></li>\n");
      out.write("\t\t\t<li><input type=\"submit\" name=\"command\" value=\"Username\"/></li>\n");
      out.write("\t\t</ul>\n");
      out.write("            </form>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"banner\"><img src=\"images/header-image-bg.jpg\" width=\"1200\" height=\"400\" alt=\"\" /></div>\n");
      out.write("        <div id=\"three-columns\">\n");
      out.write("            <p></p>\n");
      out.write("            <h1>Contacts</h1><p></p>\n");
      out.write("            <p>Member 1:</p>\n");
      out.write("            <p>Sohaib Khalid</p>\n");
      out.write("            <p>miansohaibau@hotmail.com</p>\n");
      out.write("            <p>+92334-6565588</p>\n");
      out.write("            <p></p>\n");
      out.write("            <p>Member 2:</p>\n");
      out.write("            <p>Zafar Mehmood</p>\n");
      out.write("            <p>zafarmehmood@hotmail.com</p>\n");
      out.write("            <p>+92334-5894342</p>\n");
      out.write("            <p></p>\n");
      out.write("            <p>Member 3:</p>\n");
      out.write("            <p>Naila Rasheed</p>\n");
      out.write("            <p>nailarasheed@hotmail.com</p>\n");
      out.write("            <p>+92334-5649821</p>\n");
      out.write("        </div>     \n");
      out.write("        \n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("<div id=\"footer\">\n");
      out.write("\t<p>&copy; All rights reserved. Design by Airian</p>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
