/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.62
 * Generated at: 2016-06-20 10:54:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write('\n');

String un = request.getParameter("username");
String error = request.getParameter("error");
if(un != null) {
	out.print("<center><h3>Please check your Username and password"+un+"</h3></center>");
}
if(error != null) {
	out.print("<h1><font color = red >"+error+"</font></h1>");
}

      out.write('\n');

String message = request.getParameter("msg");
if(message != null){
    out.print(message);
}

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<div style='position:absolute;z-index:0;left:0;top:0;width:100%;height:100%'>\n");
      out.write("  <img src='http://wallpaper.zone/img/2097194.jpg' style='width:100%;height:100%' alt='[]' />\n");
      out.write("</div>\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("    background-color:rgb(243, 243, 216)\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center><h1>WELCOME</h1></center>\n");
      out.write("<form method = \"post\"  action = \"login\">\n");
      out.write("<div class=\"container\">\n");
      out.write(" <div class = \"row\">\n");
      out.write(" <div class=\"col-sm-6 col-md-4 col-md-offset-4\">\n");
      out.write("<center><h1>FriendSter</h1></center>\n");
      out.write(" <div class = \"well\">\n");
      out.write("  <h2><center>log in</center></h2>\n");
      out.write("  <form role=\"form\" action = \"login\" method = \"post\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"username\">UserName:</label>\n");
      out.write("      <input type=\"username\" class=\"form-control\" id=\"username\" name = username placeholder=\"Enter  username\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"password\">Password:</label>\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"password\" name = password placeholder=\"Enter password\" required>\n");
      out.write("    </div>\n");
      out.write("    <form model = \"post\" action = \"login\">\n");
      out.write("    <button type=\"submit\" class=\"btn btn-danger\">Log in</button><br>\n");
      out.write("    </form> \n");
      out.write("     <a href = \"ForgotPasswordForm.html\">ForgotPassword</a>\n");
      out.write("    <a href = \"signupView.jsp\" class=\"btn btn-danger\">Sign Up</a>\n");
      out.write("   </form>\n");
      out.write("   </div>   \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("</body>\n");
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
