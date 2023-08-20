package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import pack.Dbconn;;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("        <meta name=\"description\" content=\"A Bootstrap based app landing page template\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/ico/favicon.ico\">\n");
      out.write("\n");
      out.write("        <title>IPB - Users</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/custom.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/flexslider.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Noto+Sans:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <!--\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"#topWrap\">\n");
      out.write("                                                                            <span class=\"fa-stack fa-lg\">\n");
      out.write("                                                                                    <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("                                                                                    <i class=\"fa fa-mobile fa-stack-1x fa-inverse\"></i>\t\t\t\t\t\t\t</span>\n");
      out.write("                                                                            App<span class=\"title\">Bay</span>\n");
      out.write("                                                                    </a>-->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse appiNav\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"users.jsp\">Users</a></li>\n");
      out.write("                        <li><a href=\"key.jsp\">User Keys</a></li>\n");
      out.write("                        <li><a href=\"hfrodo.jsp\">Dashboard</a></li>\n");
      out.write("                        <li><a href=\"frodo1.jsp\">Logout</a></li>\t\n");
      out.write("                    </ul>\n");
      out.write("                </div><!--/.nav-collapse -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"topWrap\" class=\"jumbotron\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"col-md-6 col-md-push-6 jumboText\">\n");
      out.write("                    ");


                        Connection con = Dbconn.getConnection();

                        System.out.println("Database connected");

                        Statement st = con.createStatement();
                        ResultSet rt = st.executeQuery("select * from register ");


                    
      out.write("\n");
      out.write("                    <div class=\"htext\">\n");
      out.write("                        <h2>USER DETAILS</h2>\n");
      out.write("                        <table style=\"border-style: solid;border-collapse: collapse\" border=\"5\">\n");
      out.write("                            <tr style=\"background-color: burlywood\">\n");
      out.write("                                <td align=\"center\" width=\"5%\">NAME</td><br><td>PASSWORD</td><br><td>CARD NO</td><td>BANK</td><td>BRANCH</td><td>PHONE NO</td><td>STATUS</td><td>ACTIVATE</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
                  while (rt.next()) {
                                    String uname = rt.getString("name");
                                    String pass = rt.getString("pass");
                                    String acno = rt.getString("acno");
                                    String bname = rt.getString("bname");
                                    String address = rt.getString("address");
                                    String cno = rt.getString("cno");
                                    String status = rt.getString("status");


                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(uname);
      out.write("</td><td align=\"center\">****</td><td>");
      out.print(acno);
      out.write("</td><td>");
      out.print(bname);
      out.write("</td><td>");
      out.print(address);
      out.write("</td><td>");
      out.print(cno);
      out.write("</td><td>");
      out.print(status);
      out.write("</td>\n");
      out.write("                                <td><a href=\"activate.jsp?");
      out.print(uname);
      out.write("\" >Activate</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                }
                                con.close();
                            
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 col-md-pull-6 hidden-xs\">\n");
      out.write("                    <div class=\"mobile\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/flexslider.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("\n");
      out.write("                $('.mobileSlider').flexslider({\n");
      out.write("                    animation: \"slide\",\n");
      out.write("                    slideshowSpeed: 3000,\n");
      out.write("                    controlNav: false,\n");
      out.write("                    directionNav: true,\n");
      out.write("                    prevText: \"&#171;\",\n");
      out.write("                    nextText: \"&#187;\"\n");
      out.write("                });\n");
      out.write("                $('.flexslider').flexslider({\n");
      out.write("                    animation: \"slide\",\n");
      out.write("                    directionNav: false\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $('a[href*=#]:not([href=#])').click(function () {\n");
      out.write("                    if (location.pathname.replace(/^\\//, '') == this.pathname.replace(/^\\//, '') || location.hostname == this.hostname) {\n");
      out.write("                        var target = $(this.hash);\n");
      out.write("                        target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');\n");
      out.write("                        if ($(window).width() < 768) {\n");
      out.write("                            if (target.length) {\n");
      out.write("                                $('html,body').animate({\n");
      out.write("                                    scrollTop: target.offset().top - $('.navbar-header').outerHeight(true) + 1\n");
      out.write("                                }, 1000);\n");
      out.write("                                return false;\n");
      out.write("                            }\n");
      out.write("                        } else {\n");
      out.write("                            if (target.length) {\n");
      out.write("                                $('html,body').animate({\n");
      out.write("                                    scrollTop: target.offset().top - $('.navbar').outerHeight(true) + 1\n");
      out.write("                                }, 1000);\n");
      out.write("                                return false;\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $('#toTop').click(function () {\n");
      out.write("                    $('html,body').animate({\n");
      out.write("                        scrollTop: 0\n");
      out.write("                    }, 1000);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                var timer;\n");
      out.write("                $(window).bind('scroll', function () {\n");
      out.write("                    clearTimeout(timer);\n");
      out.write("                    timer = setTimeout(refresh, 50);\n");
      out.write("                });\n");
      out.write("                var refresh = function () {\n");
      out.write("                    if ($(window).scrollTop() > 100) {\n");
      out.write("                        $(\".tagline\").fadeTo(\"slow\", 0);\n");
      out.write("                    } else {\n");
      out.write("                        $(\".tagline\").fadeTo(\"slow\", 1);\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
