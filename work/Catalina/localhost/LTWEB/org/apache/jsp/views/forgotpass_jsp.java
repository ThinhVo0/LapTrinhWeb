/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-09-20 07:31:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class forgotpass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/Admin/.m2/repository/org/glassfish/web/jakarta.servlet.jsp.jstl/3.0.1/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/fmt.tld", Long.valueOf(1664428278000L));
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar", Long.valueOf(1725890489292L));
    _jspx_dependants.put("jar:file:/C:/Users/Admin/.m2/repository/org/glassfish/web/jakarta.servlet.jsp.jstl/3.0.1/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/fn.tld", Long.valueOf(1664428278000L));
    _jspx_dependants.put("jar:file:/C:/Users/Admin/.m2/repository/org/glassfish/web/jakarta.servlet.jsp.jstl/3.0.1/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/c.tld", Long.valueOf(1664428278000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Forgot Password</title>\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <style>\r\n");
      out.write("    body {\r\n");
      out.write("      background-color: #f8f9fa;\r\n");
      out.write("    }\r\n");
      out.write("    .forgot-password-card {\r\n");
      out.write("      max-width: 450px;\r\n");
      out.write("      margin: 50px auto;\r\n");
      out.write("      background-color: #fff;\r\n");
      out.write("      border-radius: 10px;\r\n");
      out.write("      padding: 30px;\r\n");
      out.write("      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\r\n");
      out.write("    }\r\n");
      out.write("    .forgot-password-card h3 {\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      margin-bottom: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .form-label {\r\n");
      out.write("      font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("    .btn-reset {\r\n");
      out.write("      background-color: #007bff;\r\n");
      out.write("      color: white;\r\n");
      out.write("    }\r\n");
      out.write("    .btn-reset:hover {\r\n");
      out.write("      background-color: #0056b3;\r\n");
      out.write("    }\r\n");
      out.write("    .back-login-link {\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      margin-top: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .back-login-link a {\r\n");
      out.write("      color: #dc3545;\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("    }\r\n");
      out.write("    .back-login-link a:hover {\r\n");
      out.write("      text-decoration: underline;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"forgot-password-card\">\r\n");
      out.write("\r\n");
      out.write("  <h3>Forgot Password</h3>\r\n");
      out.write("\r\n");
      out.write("  <form action=\"http://localhost:8080/LTWEB/forgotpassword\" method=\"post\" id=\"resetPasswordForm\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Alert if needed -->\r\n");
      out.write("    <div id=\"error-message\" class=\"alert alert-danger\" role=\"alert\" style=\"display:none;\"></div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Username input -->\r\n");
      out.write("    <div class=\"mb-3\">\r\n");
      out.write("      <label for=\"username\" class=\"form-label\">Username</label>\r\n");
      out.write("      <input type=\"text\" id=\"username\" name=\"username\" class=\"form-control\" placeholder=\"Enter your username\" required>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Email input -->\r\n");
      out.write("    <div class=\"mb-3\">\r\n");
      out.write("      <label for=\"email\" class=\"form-label\">Email</label>\r\n");
      out.write("      <input type=\"email\" id=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Enter your registered email\" required>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- New Password input -->\r\n");
      out.write("    <div class=\"mb-3\">\r\n");
      out.write("      <label for=\"new_psw\" class=\"form-label\">New Password</label>\r\n");
      out.write("      <input type=\"password\" id=\"new_psw\" name=\"new_psw\" class=\"form-control\" placeholder=\"Enter new password\" required>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Confirm New Password input -->\r\n");
      out.write("    <div class=\"mb-3\">\r\n");
      out.write("      <label for=\"confirm_new_psw\" class=\"form-label\">Confirm New Password</label>\r\n");
      out.write("      <input type=\"password\" id=\"confirm_new_psw\" name=\"confirm_new_psw\" class=\"form-control\" placeholder=\"Confirm new password\" required>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Submit button -->\r\n");
      out.write("    <div class=\"d-grid\">\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-reset btn-lg\">Reset Password</button>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Back to login link -->\r\n");
      out.write("    <div class=\"back-login-link\">\r\n");
      out.write("      <p class=\"small\">Back to <a href=\"./login\">Login</a></p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  document.getElementById('resetPasswordForm').addEventListener('submit', function(event) {\r\n");
      out.write("    const newPassword = document.getElementById('new_psw').value;\r\n");
      out.write("    const confirmPassword = document.getElementById('confirm_new_psw').value;\r\n");
      out.write("    const errorMessageDiv = document.getElementById('error-message');\r\n");
      out.write("\r\n");
      out.write("    if (newPassword !== confirmPassword) {\r\n");
      out.write("      event.preventDefault(); // Ngăn không cho form submit\r\n");
      out.write("      errorMessageDiv.textContent = 'Confirm New Password does not match with New Password.';\r\n");
      out.write("      errorMessageDiv.style.display = 'block'; // Hiển thị lỗi\r\n");
      out.write("    } else {\r\n");
      out.write("      errorMessageDiv.style.display = 'none'; // Ẩn lỗi nếu khớp\r\n");
      out.write("    }\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
