package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import cn.edu.nenu.acm.board.frontend.model.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


final long LOAD_TIME;
session.setAttribute("loadTime",LOAD_TIME=new Long(new Date().getTime()));
session.removeAttribute("since");
//TODO 要不要判断频繁刷新的问题？


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"author\" content=\"Winguse\" />\n");
      out.write("<title>2012 ACM-ICPC Asia Regional Contest (Changchun Site) On Site Realtime Ranking</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style/board.css\" title=\"default\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"message\">\n");
      out.write("\t<br/><h3>o(∩_∩)o</h3><p>One moment, Loading...</p><br/>\n");
      out.write("</div>\n");
      out.write("<div id=\"board\">\n");
      out.write("</div>\n");
      out.write("<div id=\"movingTeamInfo\">\n");
      out.write("\t<div class=\"teamName\">\n");
      out.write("\t\t<h3>\n");
      out.write("\t\t\t<b class=\"teamEnglishName\">Team English Name</b><br/>\n");
      out.write("\t\t\t<small class=\"teamChineseName\">Team Chinese Name</small>\n");
      out.write("\t\t</h3>\n");
      out.write("\t\t<p>\n");
      out.write("\t\tRank: <!--<span class=\"fromRank\">123</span> ➫ --><span class=\"toRank\">56</span>\n");
      out.write("\t\t</p>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"teamDetial\">\n");
      out.write("\t\t<dl>\n");
      out.write("\t\t\t<dt>School:</dt><dd class=\"school\">School English Name<br/><small>School Chinese Name</small></dd>\n");
      out.write("\t\t\t<dt>Coach:</dt><dd class=\"coach\">Coach English Name <small>Coach Chinese Name</small></dd>\n");
      out.write("\t\t\t<dt>Team Members:</dt><dd class=\"teamMembers\">\n");
      out.write("\t\t\t<ol>\n");
      out.write("\t\t\t\t<li>TeamMember Name <small>TeamMember Name</small></li>\n");
      out.write("\t\t\t\t<li>TeamMember Name <small>TeamMember Name</small></li>\n");
      out.write("\t\t\t\t<li>TeamMember Name <small>TeamMember Name</small></li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t\t</dd>\n");
      out.write("\t\t</dl>\n");
      out.write("\t</div>\n");
      out.write("\t<p align=\"center\">\n");
      out.write("\t\t<input class=\"button\" type=\"button\" value=\"Close\" onclick=\"board.closeTeamInfo();\"/>\n");
      out.write("\t</p>\n");
      out.write("</div>\n");
      out.write("<div id=\"setttingButton\"><small>&copy;2012 by <a href=\"http://winguse.com\">wingus<i title=\"For舒啸(兔子)\">e</i></a>, <a href=\"http://acm.nenu.edu.cn\">nenu acm</a>. good luck to all contestants!</small><span title=\"Board Settings\" onclick=\"$('#settings').fadeIn(500)\">✌</span></div>\n");
      out.write("<div id=\"settings\">\n");
      out.write("\t<h3>Board Display Settings</h3>\n");
      out.write("\t<p>\t\n");
      out.write("\t\t<label for=\"animateOn\">Board Animate On:</label>\n");
      out.write("\t\t<input id=\"animateOn\" type=\"checkbox\" onchange=\"board.animateOn=this.checked\"/>\n");
      out.write("\t</p>\n");
      out.write("\t<p>\t\n");
      out.write("\t\t<label for=\"autoScroll\">Auto Scroll On:</label>\n");
      out.write("\t\t<input id=\"autoScroll\" type=\"checkbox\" onchange=\"board.autoScroll=this.checked\"/>\n");
      out.write("\t</p>\n");
      out.write("\t<p>\t\n");
      out.write("\t\t<label for=\"scrollFollowing\">Scroll Follow Moving Team:</label>\n");
      out.write("\t\t<input id=\"scrollFollowing\" type=\"checkbox\" onchange=\"board.scrollFollow=this.checked\"/>\n");
      out.write("\t</p>\n");
      out.write("\t<p>\t\n");
      out.write("\t\t<label for=\"autoToggleDisplayName\">Auto Toggle DisplayName:</label>\n");
      out.write("\t\t<input id=\"autoToggleDisplayName\" type=\"checkbox\" onchange=\"board.autoToggleDisplayName=this.checked\"/>\n");
      out.write("\t</p>\n");
      out.write("\t<p>\n");
      out.write("\t\t<label for=\"toggleDisplayName\">Toggle Display Name Now:</label>\n");
      out.write("\t\t<input id=\"toggleDisplayName\" type=\"button\" value=\"Toggle\" onclick=\"board.toggleDisplayName()\"/>\n");
      out.write("\t</p>\n");
      out.write("\t<p>\n");
      out.write("\t\t<label for=\"setLongConnection\">Enable Long Connection:</label>\n");
      out.write("\t\t<input id=\"setLongConnection\" type=\"checkbox\" onchange=\"board.setLongConnection(this.checked)\"/>\n");
      out.write("\t</p>\n");
      out.write("\t<small>&copy;2012 By <a href=\"http://winguse.com\">Wingus<span title=\"iloveshuxiao\">e</span></a>, <a href=\"http://acm.nenu.edu.cn\">NENU ACM</a>. Good Luck to All Contestants! Enjoy it.</small>\n");
      out.write("\t<p align=\"center\">\n");
      out.write("\t\t<input id=\"settingClose\" class=\"button\" type=\"button\" value=\"Close Settings Dialog\" onclick=\"$('#settings').fadeOut(1000)\"/>\n");
      out.write("\t</p>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/boardinfo.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var pc2_teams=");
      out.print(TeamCache.getInstance().getTeams());
      out.write(",pc2_problems=");
      out.print(ProblemCache.getInstance().getProblems());
      out.write(";\n");
      out.write("var due_ugly={};\n");
      out.write("var ugly_pc2_teams={};\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/board.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var LOAD_TIME=");
      out.print(LOAD_TIME);
      out.write(";\n");
      out.write("var board=new Board();\n");

String login=(String) request.getSession().getAttribute("login");
if(login!=null){
      out.write("\n");
      out.write("board.scrollFollow=false;\n");
      out.write("board.autoScroll=false;\n");
      out.write("board.autoToggleDisplayName=false;\n");
      out.write("$team=$(\"#board>.line\");\n");
      out.write("//$problem=$(\".problem\");\n");
      out.write("$team.click(function(){\n");
      out.write("\tvar tid=this.id.replace(/team_(\\d+)/,\"$1\");\n");
      out.write("\t//var pid=this.id.replace(/teamProblem_(\\d+)_(\\d+)/,\"$2\");//TODO ??\n");
      out.write("\t$.post(\"ClearPedding\",{tid:tid},function(d){\n");
      out.write("\t\tif(d.code==0){\n");
      out.write("\t\t\t\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tShowMessage(\"好像出了点小毛病...\",5000);\n");
      out.write("\t\t}\n");
      out.write("\t},\"json\");\n");
      out.write("});\n");
}else{
      out.write("\n");
      out.write("$(\".cell-big\").click(function(){\n");
      out.write("\tvar tid=this.id.replace(/name(_\\d+)/,\"$1\");\n");
      out.write("\tboard.showTeamInfo(tid);\n");
      out.write("});\n");
}
      out.write("\n");
      out.write("board.update();\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("  var _gaq = _gaq || [];\n");
      out.write("  _gaq.push(['_setAccount', 'UA-7801267-8']);\n");
      out.write("  _gaq.push(['_trackPageview']);\n");
      out.write("\n");
      out.write("  (function() {\n");
      out.write("    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n");
      out.write("    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n");
      out.write("  })();\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<!-- winguse love shuxiao. -->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
