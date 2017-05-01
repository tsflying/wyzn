package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class news_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>万友智能</title>\r\n");
      out.write("<link href=\"");
      out.print(path);
      out.write("/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("  \t<div id=\"row2\">\r\n");
      out.write("    <!-- .nav -->\r\n");
      out.write("      \t<ol class=\"nav\">\r\n");
      out.write("          <li class=\"first\"><a href=\"index.do\">主页</a></li>\r\n");
      out.write("          <li><a href=\"abtouUs.do\">关于我们</a></li>\r\n");
      out.write("          <li><a href=\"news.do\">新闻中心</a></li>\r\n");
      out.write("          <li><a href=\"products.do\">产品展示</a></li>\r\n");
      out.write("          <li><a href=\"services.do\">服务项目</a></li>\r\n");
      out.write("          <li class=\"last\"><a href=\"contact.do\">联系我们</a></li>\r\n");
      out.write("        </ol>\r\n");
      out.write("      \t<!-- /.nav -->\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"content\"><div id=\"one\">\r\n");
      out.write("<div id=\"sidebar\">\r\n");
      out.write("<div id=\"services\">\r\n");
      out.write("<p class=\"Services\"><a href=\"#\">Services</a></p>\r\n");
      out.write("<ul>\r\n");
      out.write("<li><a href=\"#\">Strategy</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/12.jpg\" alt=\"img\" /></li>\r\n");
      out.write("<li><a href=\"#\">Investment banking<br /><img src=\"");
      out.print(path);
      out.write("/imgs/12.jpg\" alt=\"img\" /></a></li>\r\n");
      out.write("<li><a href=\"#\">Marceting consalting</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/12.jpg\" alt=\"img\" /></li>\r\n");
      out.write("<li><a href=\"#\">Research</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/12.jpg\" alt=\"img\" /></li>\r\n");
      out.write("<li><a href=\"#\">Project managment</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/12.jpg\" alt=\"img\" /></li>\r\n");
      out.write("<li><a href=\"#\">Tax services</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/12.jpg\" alt=\"img\" /></li>\r\n");
      out.write("<li><a href=\"#\">Business Banking</a></li></ul></div><br />\r\n");
      out.write("<p class=\"Services\"><a href=\"#\">Advantages</a></p>\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("   <img src=\"");
      out.print(path);
      out.write("/imgs/13.jpg\" alt=\"\" title=\"\" />\r\n");
      out.write("   <p><strong>Partnership</strong></p><p>Pellentesque pellentesque. Donec congue tempus velit.</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"wrapper1\">\r\n");
      out.write("   <img src=\"");
      out.print(path);
      out.write("/imgs/14.jpg\" alt=\"\" title=\"\" />\r\n");
      out.write("   <p><strong>Technologies</strong></p><p>Pellentesque pellentesque. Donec congue tempus .</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"center\">\r\n");
      out.write("<br />\r\n");
      out.write("<p class=\"name\">新闻动态</p>\r\n");
      out.write("<img src=\"");
      out.print(path);
      out.write("/imgs/05.jpg\"  alt=\"img\" />\r\n");
      out.write("\r\n");
      out.write("<div class=\"g\"><img src=\"");
      out.print(path);
      out.write("/imgs/wyzn2.png\"  alt=\"img\" style=\" width: 227px; height: 224px;\"/></div>\r\n");
      out.write("<div class=\"d\"><br /><p><span class=\"s\">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</span></p>  <p>Morbi aliquet euismod nulla. Maecenas facilisis consectetuer purus. Nulla vestibulum molestie elit.</p><br /> <br /> <p>Pellentesque pellentesque. Donec congue tempus velit. Sed aliquet risus ut sem.<br /> </p>\r\n");
      out.write("<span class=\"s\"> Pellentesque nisi </span>tincidunt  odio.<br /><br /><br /><br /><br /></div>\r\n");
      out.write("<p class=\"news\">最近新闻动态<br /><br /><br /></p>\r\n");
      out.write("<p><img src=\"");
      out.print(path);
      out.write("/imgs/05.jpg\"  alt=\"img\" /></p>\r\n");
      out.write("<div class=\"left\"><br /><br />\r\n");
      out.write("<p><p><a href=\"#\"><img class=\"gg\" src=\"");
      out.print(path);
      out.write("/imgs/07.jpg\" alt=\"img\" /></a></p><p class=\"dd\"><span class=\"s\">Morbi aliquet euismod </span><br />\r\n");
      out.write("   Maecenas facilisis ut consectetuer purus odio.Pellentesque pellentesque<br /><br /></p></p><br /><br /><br /><br />\r\n");
      out.write("<p><p><br /><a href=\"#\"><img class=\"gg\" src=\"");
      out.print(path);
      out.write("/imgs/08.jpg\" alt=\"img\" /></a></p><p class=\"dd\"><span class=\"s\">Morbi aliquet euismod </span><br /> Pellentesque pellentesque. Maecenas facilisis ut consectetuer purus odio.<br /><br /><br /></p></p>\r\n");
      out.write("<p><a href=\"#\"><img src=\"");
      out.print(path);
      out.write("/imgs/09.jpg\" alt=\"img\" /></a></p></div>\r\n");
      out.write("<div class=\"right\"><br /><br />\r\n");
      out.write("<p><p><a href=\"#\"><img class=\"gg\" src=\"");
      out.print(path);
      out.write("/imgs/07.jpg\" alt=\"img\" /></a></p><p class=\"dd\"><span class=\"s\">Morbi aliquet euismod </span><br />Donec congue tempus velit. Maecenas facilisis ut consectetuer purus odio.<br /><br /></p></p><br /><br /><br /><br />\r\n");
      out.write("<p><p><br /><a href=\"#\"><img class=\"gg\" src=\"");
      out.print(path);
      out.write("/imgs/08.jpg\" alt=\"img\" /></a></p><p class=\"dd\"><span class=\"s\">Morbi aliquet euismod </span><br />\r\n");
      out.write("   Maecenas facilisis ut consectetuer purus odio.Donec congue tempus velit<br /><br /><br /></p></p>\r\n");
      out.write("</div>\r\n");
      out.write("</div></div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("<div id=\"footercenter\">\r\n");
      out.write("<div id=\"related\">\r\n");
      out.write("<br />\r\n");
      out.write("<p class=\"text\">Related Links</p><br />\r\n");
      out.write("<ul class=\"style\">\r\n");
      out.write("<li><a target=\"_blank\" href=\"#\">Strategies</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/16.jpg\" alt=\"img\" /></li>\r\n");
      out.write("<li><a target=\"_blank\" href=\"#\">Resent issues</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/16.jpg\" alt=\"img\" /></li>\r\n");
      out.write("<li><a target=\"_blank\" href=\"#\">FAQ</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/16.jpg\" alt=\"img\" /></li>\r\n");
      out.write("<li><a target=\"_blank\" href=\"#\">Solutions</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/16.jpg\" alt=\"img\" /></li>\r\n");
      out.write("<li><a target=\"_blank\" href=\"#\">Contacts</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/16.jpg\" alt=\"img\" /></li></ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"address\">\r\n");
      out.write("<br />\r\n");
      out.write("<p class=\"text\">Address</p>\r\n");
      out.write("<br />\r\n");
      out.write("<p>9870 St Vincent Place,</p>\r\n");
      out.write("<p>Glasgow, DC 45 Fr 45.</p>\r\n");
      out.write("<br />\r\n");
      out.write("<p>Freephone:  +1 800 559 6580</p>\r\n");
      out.write("<p>Telephone:  +1 800 603 6035</p>\r\n");
      out.write("<p>FAX:        +1 800 889 9898</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"company\">\r\n");
      out.write("<br />\r\n");
      out.write("<p class=\"text\">Company</p>\r\n");
      out.write("<br />\r\n");
      out.write("<ul class=\"style\">\r\n");
      out.write("<li><a target=\"_blank\" href=\"#\">About us</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/16.jpg\" alt=\"img\" /></li>\r\n");
      out.write("<li><a target=\"_blank\" href=\"#\">Work team</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/16.jpg\" alt=\"img\" /></li>\r\n");
      out.write("<li><a target=\"_blank\" href=\"#\">What we do</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/16.jpg\" alt=\"img\" /></li>\r\n");
      out.write("<li><a target=\"_blank\" href=\"#\">Clients</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/16.jpg\" alt=\"img\" /></li>\r\n");
      out.write("<li><a target=\"_blank\" href=\"#\">Managment</a><br /><img src=\"");
      out.print(path);
      out.write("/imgs/16.jpg\" alt=\"img\" /></li></ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"testmonials\">\r\n");
      out.write("<br />\r\n");
      out.write("<p class=\"text\">Testimonials</p>\r\n");
      out.write("<br />\r\n");
      out.write("<p>Utoluptates estudesu usandaeItaque earumumos rerum hic teneturamos sapientemi delectu ut reiciedesto ndisum voluptatibus ass maiores alias dolore ipsum mode festum.</p>\r\n");
      out.write("<br />\r\n");
      out.write("<p><img src=\"");
      out.print(path);
      out.write("/imgs/17.jpg\" alt=\"img\" /></p><br />\r\n");
      out.write("<p><strong> Alex Grow (New York) </strong></p>            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer1\">\r\n");
      out.write("<div id=\"footer2\">\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("<div class=\"cc\"><a href=\"#\">TWITTER</a>&nbsp; |&nbsp;<a href=\"#\"> FACEBOOK</a>&nbsp; |&nbsp; <a href=\"#\">BLOG</a></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"display:none\"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div></body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
