/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.51
 * Generated at: 2018-05-19 05:13:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class article_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("div.container {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    border: 1px solid gray;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header, footer {\r\n");
      out.write("    padding: 1em;\r\n");
      out.write("    color: white;\r\n");
      out.write("    background-color: black;\r\n");
      out.write("    clear: left;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav {\r\n");
      out.write("    float: left;\r\n");
      out.write("    max-width: 160px;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 1em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav ul {\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("}\r\n");
      out.write("   \r\n");
      out.write("nav ul a {\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("article {\r\n");
      out.write("    margin-left: 170px;\r\n");
      out.write("    border-left: 1px solid gray;\r\n");
      out.write("    padding: 10em;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("   <h1>New Game releases</h1>\r\n");
      out.write("</header>\r\n");
      out.write("  \r\n");
      out.write("<nav>\r\n");
      out.write("  <ul>\r\n");
      out.write("    <li><a href=\"welcome2.jsp\">Home</a></li>\r\n");
      out.write("    <li><a href=\"payment.jsp\">Payment</a></li>\r\n");
      out.write("    <li><a href=\"downloaddota2.jsp\">GameView</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<article>\r\n");
      out.write("  <h1>Dota 2</h1>\r\n");
      out.write("  <p>Dota 2 titles have always had a big following in Japan, but struggled in the U.S. due to grind-heavy gameplay\r\n");
      out.write("   and extremely complex RPG systems that do little to hold your hand. That said, Monster Hunter Worldâs open beta was \r\n");
      out.write("   encouraging, showing a game that promises co-op fun for you and up to three friends, but with the rough edges from previous \r\n");
      out.write("   titles smoothed down, keeping the appealing core game loop alive: You gear up to hunt down some gargantuan bad guys, and then \r\n");
      out.write("   loot their \r\n");
      out.write("  corpses to fashion weapons and armor to hunt down even bigger and badder guys.</p>\r\n");
      out.write("  <p>Monster Hunter: World received critical acclaim upon release, with critics praising how Capcom was \r\n");
      out.write("  able to make the game more accessible to new players and to Western markets, without detracting from the \r\n");
      out.write("  series' core gameplay elements and enjoyable difficulty, and fully taking advantage of the computational capacity of \r\n");
      out.write("  modern consoles to create living ecosystems. Within a few weeks of release, the game became the fastest-selling game in \r\n");
      out.write("  Capcom's history, eventually becoming their \r\n");
      out.write("  best-selling game with 7.9 million copies shipped by March 2018..</p>\r\n");
      out.write("</article>\r\n");
      out.write("\r\n");
      out.write("<footer>Online Gaming Site Group 61</footer>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
