/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-29 03:39:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \r\n");
      out.write("    <title>Calculo IMC</title>\r\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro\" rel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("      <h2>Calcular IMC</h2>\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div id=\"form\">\r\n");
      out.write("        <div class=\"imgcontainer\">\r\n");
      out.write("          <img src=\"imagem_imc.jpg\" alt=\"Avatar\" class=\"avatar\">\r\n");
      out.write("        </div>\r\n");
      out.write("          <form name=\"imcForm\" id=\"imcForm\" action=\"#\">\r\n");
      out.write("\r\n");
      out.write("        <label>Altura</label><br />\r\n");
      out.write("        <input type=\"text\" placeholder=\"Digite sua altura em cm\" name=\"altura\" id=\"altura\" required>\r\n");
      out.write("\r\n");
      out.write("        <br /><label>Peso</label><br />\r\n");
      out.write("        <input type=\"text\" placeholder=\"Digite seu peso em kg\" name=\"peso\" id=\"peso\" required>\r\n");
      out.write("        \r\n");
      out.write("        <input class=css_btn_class name=\"Enviar\" type=\"submit\" value=\"Calcular\" />\r\n");
      out.write("    </p>\r\n");
      out.write("                \r\n");
      out.write("              \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");

String alturaStr = request.getParameter("altura");
String pesoStr = request.getParameter("peso");
if( pesoStr == null || alturaStr == null || pesoStr == "" || alturaStr == ""){
        return;
}
double peso = Double.parseDouble(pesoStr);
double altura = Double.parseDouble(alturaStr);
altura = altura == 0 ? 1 : altura;
double calculo = peso / (altura*altura);
String resultado = "";
if(calculo<18.5){
	resultado = "VocÃª estÃ¡ magro com esse indice: " + calculo;
}
else if(calculo>=18.5 && calculo<24.9){
	resultado = "VocÃª estÃ¡ normal com esse indice:" + calculo;
}
else if(calculo>=24.9 && calculo<29.9) {
	resultado = "VocÃª estÃ¡ com sobre peso com esse indice: " + calculo;
}
else if(calculo>=29.9 && calculo<39.9) {
	resultado = "VocÃª estÃ¡ com obesidade com esse indice: " + calculo;
}
else if (calculo>39.9) {
	resultado =  "VocÃª estÃ¡ com obesidade grave com esse indice: " + calculo;
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"alert\"> ");
      out.print(resultado);
      out.write(" </div>\r\n");
      out.write("\t\r\n");
      out.write("    </div>\r\n");
      out.write("        </div>   \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </form>\r\n");
      out.write("  \r\n");
      out.write("</body>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
