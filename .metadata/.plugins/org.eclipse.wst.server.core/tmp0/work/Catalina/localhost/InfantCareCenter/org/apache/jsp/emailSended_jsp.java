/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2018-12-26 10:28:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class emailSended_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/hushe/Desktop/InfantCareCenter/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/InfantCareCenter/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1545662960190L));
    _jspx_dependants.put("/./navbarTemplate.jsp", Long.valueOf(1545815282150L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./style.css\" type=\"text/css\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\">    \n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <script src=\"./script.js\"></script>\n");
      out.write("    <title>kly</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("\t<!-- 상단바(footer) -->\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\t.warn {\n");
      out.write("\t\tborder : 1px red solid;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-sm bg-dark navbar-dark navbar-fixed-top\">\n");
      out.write("        <!-- Brand/logo -->\n");
      out.write("        <a href=\"./index.jsp\"><img src=\"./images/kly_logo_white.png\" style=\"height: 45px\" /></a>\n");
      out.write("\n");
      out.write("        <!-- Links -->\n");
      out.write("\t\t<ul class=\"navbar-nav mx-auto\">\n");
      out.write("\t\t    <li class=\"nav-item\">\n");
      out.write("\t\t\t\t<a class=\"btn btn-outline-warning\" style=\"width:300px;\" href=\"./boardList.kly\">video list</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("        \n");
      out.write("        ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\n");
      out.write("        <!-- 로그인(modal) -->\n");
      out.write("        <div class=\"modal\" id=\"loginForm\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    \n");
      out.write("                       <div class=\"modal-header\">\n");
      out.write("                        <h4 class=\"modal-title\">로그인</h4>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <form action=\"memberLogin.do\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                       <a href=\"./index.jsp\"><img src=\"./images/kly.png\" style=\"display:block; height: 300px\" /></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <h5><label>아이디</label></h5>\n");
      out.write("                                    <input class=\"form-control\" name=\"loginId\" type=\"text\" id=\"id\" />\n");
      out.write("                                    <h5><label>비밀번호</label></h5>\n");
      out.write("                                    <input class=\"form-control\" name=\"loginPwd\" type=\"password\" id=\"pwd\" />\n");
      out.write("                                    <a data-toggle=\"modal\" data-target=\"#MissingForm\"><u>혹시 비밀번호를 잊어버리셨나요?</u></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <button class=\"btn btn-primary\" type=\"submit\">로그인</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- 회원가입(modal) -->\n");
      out.write("        <div class=\"modal\" id=\"joinForm\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4 class=\"modal-title\">회원가입</h4>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <form action=\"memberJoin.do\" method=\"post\" id=\"joinFomat\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                \n");
      out.write("                                <div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm\">\n");
      out.write("\t\t                                <h5><label>아이디</label></h5>\n");
      out.write("\t\t                            \t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t                                \t\t<input class=\"form-control\" name=\"MEMBER_ID\" type=\"text\" maxlength=\"10\" id=\"joinId\" placeholder=\"아이디를 입력해 주세요.\" />\n");
      out.write("\t\t                                \t\t<input class=\"form-control\" name=\"memberID\" type=\"hidden\" maxlength=\"10\" id=\"tempId\" placeholder=\"아이디를 입력해 주세요.\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-info\" id=\"checkButton\" onclick=\"idCheck()\">중복체크</button> <!-- 중복체크 완료시 disable -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row mt-2 mb-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label><h5>비밀번호</h5></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" name=\"MEMBER_PW\" type=\"password\" id=\"pass1\" onkeyup=\"passCheck()\" placeholder=\"비밀번호를 입력해 주세요.\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label><h5>비밀번호 확인</h5></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"password\" id=\"pass2\" onkeyup=\"passCheck()\" placeholder=\"한번 더  입력해 주세요.\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <label><h5>이메일</h5></label>\n");
      out.write("                                <input class=\"form-control\" name=\"MEMBER_EMAIL\" type=\"email\" id=\"inputEmail\" placeholder=\"이메일을 입력해 주세요.\"/>\n");
      out.write("                                    \n");
      out.write("                            </div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t<p style=\"color:red;\" id=\"passCheckMessage\"></p>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-primary\" onclick=\"join()\">가입</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<script>\n");
      out.write("\tvar overlap = 0; // 0  중복체크 안함, 1 했고 중복 안됌\n");
      out.write("\tvar passConfirm = 0;\n");
      out.write("\n");
      out.write("\t/* 아이디 중복체크 */\n");
      out.write("\tfunction idCheck() {\n");
      out.write("\t\tvar id = document.getElementById(\"joinId\");\n");
      out.write("\t\t\n");
      out.write("\t\tconsole.log(\"idCheck 실행\");\n");
      out.write("\t\tif(id.value == \"\"){\n");
      out.write("\t\t\tconsole.log(\"null if문 실행\")\n");
      out.write("\t\t\talert('id를 입력해주세요');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t} else if(id.value.match(/[가-힣ㄱ-ㅎㅏ-ㅣ]/)) {\n");
      out.write("\t\t\talert('아이디는 한글을 제외해 주세요.');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write(" \t\tvar req = new XMLHttpRequest();\n");
      out.write("\t\treq.onreadystatechange = function() {\n");
      out.write("\t\t\tif(this.readyState == 4 && this.status == 200) {\n");
      out.write("\t\t\t\tvar out = JSON.parse(this.responseText);\n");
      out.write("\t\t\t\tif(out.result == \"yes\") {\n");
      out.write("\t\t\t\t\talert('아이디가 존재합니다.');\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\talert('사용 가능한 아이디 입니다.');\n");
      out.write("\t\t\t\t\toverlap = 1; // 중복체크 완료\n");
      out.write("\t\t\t\t\tvar checkbutton = document.getElementById(\"checkButton\");\n");
      out.write("\t\t\t\t\tcheckbutton.className += \" disabled\";\n");
      out.write("\t\t\t\t\tid.disabled = true;\n");
      out.write("\t\t\t\t\tconsole.log('버튼 비활성화 완료');\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"tempId\").value = id.value;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\treq.open(\"GET\",\"./idOverlapCheck.do?check=\"+id.value, true);\n");
      out.write("\t\treq.send();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t/* 패스워드 일치 알림 */\n");
      out.write("\tfunction passCheck() {\n");
      out.write("\t\tvar pass1 = $(\"#pass1\").val();\n");
      out.write("\t\tvar pass2 = $(\"#pass2\").val();\n");
      out.write("\t\tif(pass1 != pass2) {\n");
      out.write("\t\t\t$(\"#passCheckMessage\").html(\"비밀번호와 비밀번호 확인이 일치하지 않습니다.\");\n");
      out.write("\t\t\t$(\"#pass1\").addClass(\"warn\");\n");
      out.write("\t\t\t$(\"#pass2\").addClass(\"warn\")\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\t$(\"#passCheckMessage\").html(\"\");\n");
      out.write("\t\t\t$(\"#pass1\").removeClass(\"warn\");\n");
      out.write("\t\t\t$(\"#pass2\").removeClass(\"warn\");\n");
      out.write("\t\t\t passConfirm = 1;\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t/* 가입 버튼 */\n");
      out.write("\tfunction join() {\n");
      out.write("\t\tvar email = $(\"#inputEmail\").val();\n");
      out.write("\t\tif(overlap==0) {\n");
      out.write("\t\t\talert(\"id 중복체크를 해주세요.\");\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t} else if(passConfirm==0) {\n");
      out.write("\t\t\talert(\"비밀번호가 일치하지 않습니다.\");\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t} else if(email==\"\") {\n");
      out.write("\t\t\tconsole.log(email);\n");
      out.write("\t\t\talert(\"이메일을 입력해 주세요.\");\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t} else if(overlap==1 && passConfirm==1) {\n");
      out.write("\t\t\t$(\"#joinFomat\").submit();\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- 회원 비밀번호 찾기(modal) -->\n");
      out.write("\t<form action=\"memberFindPass.kly\" method=\"post\">\n");
      out.write("\t<div class=\"modal\" id=\"MissingForm\">\n");
      out.write("\t\t<div class=\"modal-dialog  modal-lg\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("                   <div class=\"modal-header\">\n");
      out.write("                       <h4 class=\"modal-title\">비밀번호 찾기</h4>\n");
      out.write("                       <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                   </div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t현재 아이디를 입력하시면, 가입 정보에 기입된 이메일로 안내 메일을 발송해 드립니다.\n");
      out.write("\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"memberID\" placeholder=\"아이디를 입력해주세요.\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<p style=\"color:red;\" id=\"passCheckMessage\"></p>\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-info\" type=\"submit\">이메일 전송</button>\n");
      out.write("\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</form>\n");
      out.write("\t\n");
      out.write("\t<!-- 아이디 중복 체크 -->\n");
      out.write("<!-- \t<div class=\"modal\" id=\"idCheckForm\" tabindex=\"-1\" role=\"diolog\" aria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog modal-lg\">\n");
      out.write("\t\t\t<div class=\"modal-content panel-info %>\" id=\"checkType\">\n");
      out.write("\t\t\t\t <div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">확인 메세지</h4>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"modal-body\" id=\"idCheckMessage\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div> -->\n");
      out.write("\t</nav>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- 내용 부분 -->\n");
      out.write("\t<div class=\"container\" style=\"max-width:560px\">\n");
      out.write("\t\t<div class=\"alert alert-success mt-4\" role=\"alert\">\n");
      out.write("\t\t\t이메일 주소 인증메일이 전송 되었습니다. 가입시 입력한 이메일을 확인해 주세요.\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- 하단바(footer) -->\n");
      out.write("\t<div class=\"jumbotron text-center\">\n");
      out.write("\t\t<p>&copy; 2018 kly</p>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        \t");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("        \t\n");
          out.write("        \t");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /./navbarTemplate.jsp(32,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty loginInfo.getMEMBER_ID()}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        \t\t<div class=\"btn-group\">\n");
          out.write("\t\t       \t\t<button class=\"btn btn-outline-primary\" data-toggle=\"modal\" data-target=\"#loginForm\">\n");
          out.write("\t\t\t\t\t\t로그인\n");
          out.write("\t\t\t\t\t</button>\n");
          out.write("\t\t       \t\t<button class=\"btn btn-outline-primary\" data-toggle=\"modal\" data-target=\"#joinForm\">\n");
          out.write("\t\t\t\t\t\t회원가입\n");
          out.write("\t\t       \t\t</button>\n");
          out.write("        \t\t</div>\n");
          out.write("        \t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f1_reused = false;
    try {
      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /./navbarTemplate.jsp(43,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginInfo.getMEMBER_ID().equals('admin')}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
      if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        \t\t<div class=\"btn-group\">\n");
          out.write("\t\t       \t\t <button class=\"btn btn-outline-info\" onclick=\"location.href='./boardSuspendList.kly'\">\n");
          out.write("\t        \t    \t관리자 모드\n");
          out.write("\t        \t    </button>\n");
          out.write("\t        \t    <button class=\"btn btn-outline-danger\" onclick=\"location.href='./memberLogout.kly'\">\n");
          out.write("\t        \t    \t로그아웃\n");
          out.write("\t        \t    </button>\n");
          out.write("        \t\t</div>\n");
          out.write("        \t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      _jspx_th_c_005fwhen_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t        \t<div class=\"btn-group\">\n");
          out.write("\t        \t    <button class=\"btn btn-outline-primary\" onclick=\"location.href='./memberDetail.kly'\">\n");
          out.write("\t        \t    \t마이페이지\n");
          out.write("\t        \t    </button>\n");
          out.write("\t        \t    <button class=\"btn btn-outline-danger\" onclick=\"location.href='./memberLogout.kly'\">\n");
          out.write("\t        \t    \t로그아웃\n");
          out.write("\t        \t    </button>\n");
          out.write("\t        \t</div>\n");
          out.write("        \t");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}
