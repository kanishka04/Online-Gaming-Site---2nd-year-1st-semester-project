/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.51
 * Generated at: 2018-05-19 09:44:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" >\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>Online gaming site payment</title>\r\n");
      out.write("  <link rel = \"stylesheet\" type = \"text/css\" href = \"payment.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<script src=\"payment/payment.js\">\r\n");
      out.write("function validate()\r\n");
      out.write("{ \r\n");
      out.write("\t var cardNumber = document.form.cardNumber.value;\r\n");
      out.write(" \tvar cardExpiry = document.form.cardExpiry.value;\r\n");
      out.write(" \tvar cardCVC = document.form.cardCVC.value; \r\n");
      out.write(" \tvar couponCode = document.form.couponCode.value;\r\n");
      out.write(" \t//var conpassword= document.form.conpassword.value;\r\n");
      out.write(" \r\n");
      out.write(" \tif (cardNumber==null || cardNumber==\"\")\r\n");
      out.write("\t { \r\n");
      out.write("\t\t alert(\"Card Number cannot be blank\"); \r\n");
      out.write(" \t\treturn false; \r\n");
      out.write(" \t}\r\n");
      out.write(" \telse if (cardExpiry==null || cardExpiry==\"\")\r\n");
      out.write(" \t{ \r\n");
      out.write(" \t\talert(\"Card expiry can't be blank\"); \r\n");
      out.write(" \t\treturn false; \r\n");
      out.write(" \t}\r\n");
      out.write(" \telse if (cardCVC==null || cardCVC==\"\")\r\n");
      out.write(" \t{ \r\n");
      out.write(" \talert(\"Card CVC can't be blank\"); \r\n");
      out.write("\t return false; \r\n");
      out.write(" \t}\r\n");
      out.write(" \telse if(couponCode.length<3)\r\n");
      out.write(" \t{ \r\n");
      out.write(" \t\talert(\"Coupon code must be at least 6 characters long.\"); \r\n");
      out.write(" \treturn false; \r\n");
      out.write("\t } \r\n");
      out.write("\t else if (password!=conpassword)\r\n");
      out.write("\t { \r\n");
      out.write(" \t\talert(\"Confirm Password should match with the Password\"); \r\n");
      out.write(" \t\treturn false; \r\n");
      out.write("\t } \r\n");
      out.write(" } \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<!-- You can make it whatever width you want. I'm making it full width\r\n");
      out.write("on <= small devices and 4/12 page width on >= medium devices -->\r\n");
      out.write("<div class=\"col-xs-12 col-md-4\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- CREDIT CARD FORM STARTS HERE -->\r\n");
      out.write("<div class=\"panel panel-default credit-card-box\">\r\n");
      out.write("<div class=\"panel-heading display-table\" >\r\n");
      out.write("<div class=\"row display-tr\" >\r\n");
      out.write("\t<h3 class=\"panel-title display-td\" >Payment Details</h3>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"display-td\" >                            \r\n");
      out.write("\t\t<img class=\"img-responsive pull-right\" src=\"http://i76.imgup.net/accepted_c22e0.png\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<h1>pay here 25$</h1>\r\n");
      out.write("</div>                    \r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"panel-body\">\r\n");
      out.write("<form name=\"form\" id=\"payment-form\" action =\"paymentFinish.jsp\" action = \"DownloadFile\" method = \"GET\" onsubmit = \"return validate()\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"cardNumber\">CARD NUMBER</label>\r\n");
      out.write("\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t<input type=\"tel\" class=\"form-control\" name=\"cardNumber\" placeholder=\"Valid Card Number\" autocomplete=\"cc-number\" required autofocus />\r\n");
      out.write("\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-credit-card\"></i></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>                            \r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-xs-7 col-md-7\">\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"cardExpiry\"><span class=\"hidden-xs\">EXPIRATION</span><span class=\"visible-xs-inline\">EXP</span> DATE</label>\r\n");
      out.write("\t\t\t<input type=\"tel\" class=\"form-control\" name=\"cardExpiry\" placeholder=\"MMYY\" autocomplete=\"cc-exp\"required />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-xs-5 col-md-5 pull-right\">\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("\t\t<label for=\"cardCVC\">CV CODE</label>\r\n");
      out.write("\t\t<input type=\"tel\" class=\"form-control\"name=\"cardCVC\" placeholder=\"CVC\"autocomplete=\"cc-csc\"required/>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label for=\"couponCode\">COUPON CODE</label>\r\n");
      out.write("\t\t\t<input type=\"text\" class=\"form-control\" name=\"couponCode\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>                        \r\n");
      out.write("</div>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t<button class=\"btn btn-success btn-lg btn-block\" type=\"submit\" >Pay Here</button>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<div class=\"row\" style=\"display:none;\">\r\n");
      out.write("\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t<p class=\"payment-errors\"></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t <tr>\r\n");
      out.write(" \t<td>");
      out.print((request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage"));
      out.write("</td>\r\n");
      out.write(" \t</tr>\r\n");
      out.write(" \t</table>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</div>            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>            \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://js.stripe.com/v2/\"></script>\r\n");
      out.write("\t\r\n");
      out.write("</body> \r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
