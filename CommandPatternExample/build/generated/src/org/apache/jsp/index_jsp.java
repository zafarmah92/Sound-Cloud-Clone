package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <script>\n");
      out.write("             \n");
      out.write("             SC.initialize({\n");
      out.write("  client_id: 'ee6fa492f06e41811e2f45df5c11fa7b'\n");
      out.write("});\n");
      out.write("var track = '';\n");
      out.write("\n");
      out.write("var count = 10 ;\n");
      out.write("    \n");
      out.write("$(document).ready(function() {\n");
      out.write("     var id = '';\n");
      out.write("        SC.get('/tracks/',{q:track} , function(tracks) {\n");
      out.write("        var t = tracks[count];\n");
      out.write("        $(tracks).each(function(index, track) {  \n");
      out.write("         $('#second').append('<img src=\"images/soundcloud-icon.png\" width=\"50\" height=\"50\"/>'+'  '+track.title+'');\n");
      out.write("         $('#second').append('<p><button onClick=\"fun(this)\" type=\"submit\" id=\"'+track.uri+'\">Play</button>');\n");
      out.write("         $('#second').append('</p>');\n");
      out.write("         $('#second').append('</br>');\n");
      out.write("    });\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("        </script>\n");
      out.write("             <script>\n");
      out.write("                 function getTrack() {\n");
      out.write("                     \n");
      out.write("                     val = document.getElementById(\"trck\").value;\n");
      out.write("                     track = val;\n");
      out.write("                     alert(track);\n");
      out.write("                       SC.get('/tracks/',{q:track} , function(tracks) {\n");
      out.write("                       $(tracks).each(function(index, track) {\n");
      out.write("                      $('#fourth').append('<button onClick=\"fun(this)\" type=\"submit\" id=\"'+track.uri+'\">'+track.title+'</button>');\n");
      out.write("                       \n");
      out.write("                     $('#fourth').append('</br>');\n");
      out.write("                       });\n");
      out.write("    });\n");
      out.write("                     \n");
      out.write("                 }\n");
      out.write("                 \n");
      out.write("             </script>\n");
      out.write("             \n");
      out.write("             <script>\n");
      out.write("   SC.initialize({\n");
      out.write("  client_id: 'ee6fa492f06e41811e2f45df5c11fa7b'\n");
      out.write("});\n");
      out.write("\n");
      out.write("     function fun (clicked_id) {\n");
      out.write("       \n");
      out.write("       count = 18;\n");
      out.write("       var t = clicked_id;\n");
      out.write("       alert(t.id);\n");
      out.write("       SC.oEmbed(t.id,  {maxheight :200 , auto_play : true}, document.getElementById(\"third\"));\n");
      out.write("       $('#second').append('</br>');\n");
      out.write("     }  \n");
      out.write("        </script>\n");
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
      out.write("                        <li class=\"last\"><input type=\"submit\" name=\"command\" value=\"Contacts\"/></li>\n");
      out.write("\t\t</ul>\n");
      out.write("            </form>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"banner\"><img src=\"images/header-image-bg.jpg\" width=\"1200\" height=\"400\" alt=\"\" /></div>\n");
      out.write("        <div class=\"two-columns\" id=\"third\">\n");
      out.write("        </div>     \n");
      out.write("        <div class=\"two-columns\" id=\"fourth\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"two-columns\"  id=\"second\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
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
