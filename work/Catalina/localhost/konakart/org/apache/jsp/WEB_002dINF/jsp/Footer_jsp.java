/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.22
 * Generated at: 2013-09-21 00:16:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/kk.tld", Long.valueOf(1378980218000L));
    _jspx_dependants.put("/WEB-INF/jsp/Taglibs.jsp", Long.valueOf(1378980218000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 com.konakart.al.KKAppEng kkEng = (com.konakart.al.KKAppEng) session.getAttribute("konakartKey");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function onBlur(el) {\r\n");
      out.write("    if (el.value == '') {\r\n");
      out.write("        el.value = el.defaultValue;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("function onFocus(el) {\r\n");
      out.write("    if (el.value == el.defaultValue) {\r\n");
      out.write("        el.value = '';\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(function() {\r\n");
      out.write("\t$(\"#newsletter-input\").keydown(function (e){\r\n");
      out.write("\t    if(e.keyCode == 13){\r\n");
      out.write("\t    \tsubmitNewsletterForm();\r\n");
      out.write("\t    }\r\n");
      out.write("\t});\r\n");
      out.write("});\t\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"kkfooter\">\r\n");
      out.write("    <div id=\"contact-info\" class=\"footer-area narrow\">\r\n");
      out.write("    \tKonaKart<br />\r\n");
      out.write("\t\t020 7946 0000<br />\r\n");
      out.write("\t\t<a href =\"#\">info@konakart.com</a>\r\n");
      out.write("    </div>\r\n");
      out.write("   \t<div id=\"newsletter\" class=\"footer-area wide\">\r\n");
      out.write("   \t\t");
      if (_jspx_meth_kk_005fmsg_005f0(_jspx_page_context))
        return;
      out.write("<br />\r\n");
      out.write(" \t\t<input type=\"text\" id=\"newsletter-input\" class=\"rounded-corners-left\" onblur=\"onBlur(this)\" onfocus=\"onFocus(this)\" value=\"");
      if (_jspx_meth_kk_005fmsg_005f1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t<a id=\"newsletter-button\" class=\"rounded-corners-right\">");
      if (_jspx_meth_kk_005fmsg_005f2(_jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("\t\t<div id=\"newsletter-msg\"></div>\r\n");
      out.write("   \t</div>\r\n");
      out.write("   \t<div id=\"links-1\" class=\"footer-area narrow\">\r\n");
      out.write("\t\t<a href =\"AboutUs.action\">");
      if (_jspx_meth_kk_005fmsg_005f3(_jspx_page_context))
        return;
      out.write("</a><br />\r\n");
      out.write("\t\t<a href =\"ShippingAndHandling.action\">");
      if (_jspx_meth_kk_005fmsg_005f4(_jspx_page_context))
        return;
      out.write("</a><br />\r\n");
      out.write("\t\t<a href =\"Returns.action\">");
      if (_jspx_meth_kk_005fmsg_005f5(_jspx_page_context))
        return;
      out.write("</a><br />\r\n");
      out.write("\t\t<a href =\"InternationalOrders.action\">");
      if (_jspx_meth_kk_005fmsg_005f6(_jspx_page_context))
        return;
      out.write("</a><br />\r\n");
      out.write("   \t</div>\r\n");
      out.write("   \t<div id=\"links-2\" class=\"footer-area narrow\">\r\n");
      out.write("\t\t<a href =\"PrivacyPolicy.action\">");
      if (_jspx_meth_kk_005fmsg_005f7(_jspx_page_context))
        return;
      out.write("</a><br />\r\n");
      out.write("\t\t<a href =\"TermsOfUse.action\">");
      if (_jspx_meth_kk_005fmsg_005f8(_jspx_page_context))
        return;
      out.write("</a><br />\r\n");
      out.write("\t\t<a href =\"Help.action\">");
      if (_jspx_meth_kk_005fmsg_005f9(_jspx_page_context))
        return;
      out.write("</a><br />\r\n");
      out.write("\t\t<a href =\"ContactUs.action\">");
      if (_jspx_meth_kk_005fmsg_005f10(_jspx_page_context))
        return;
      out.write("</a><br />\r\n");
      out.write("   \t</div>\r\n");
      out.write("   \t<div id=\"social\" class=\"footer-area narrow last-child\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_kk_005fmsg_005f11(_jspx_page_context))
        return;
      out.write("<br />\r\n");
      out.write("\t\t<a href=\"http://www.twitter.com\" target=\"_blank\" class=\"twitter-grey social-icon\"></a>\r\n");
      out.write("\t\t<a href=\"http://www.facebook.com\" target=\"_blank\" class=\"facebook-grey social-icon\"></a>\r\n");
      out.write("\t\t<a href=\"http://www.pinterest.com\" target=\"_blank\" class=\"pinterest-grey social-icon\"></a>\r\n");
      out.write("   \t</div>\r\n");
      out.write("</div>");
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

  private boolean _jspx_meth_kk_005fmsg_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  kk:msg
    com.konakart.kktags.MsgTag _jspx_th_kk_005fmsg_005f0 = (com.konakart.kktags.MsgTag) _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.get(com.konakart.kktags.MsgTag.class);
    _jspx_th_kk_005fmsg_005f0.setPageContext(_jspx_page_context);
    _jspx_th_kk_005fmsg_005f0.setParent(null);
    // /WEB-INF/jsp/Footer.jsp(52,5) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_kk_005fmsg_005f0.setKey("footer.subscribe");
    int _jspx_eval_kk_005fmsg_005f0 = _jspx_th_kk_005fmsg_005f0.doStartTag();
    if (_jspx_th_kk_005fmsg_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f0);
    return false;
  }

  private boolean _jspx_meth_kk_005fmsg_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  kk:msg
    com.konakart.kktags.MsgTag _jspx_th_kk_005fmsg_005f1 = (com.konakart.kktags.MsgTag) _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.get(com.konakart.kktags.MsgTag.class);
    _jspx_th_kk_005fmsg_005f1.setPageContext(_jspx_page_context);
    _jspx_th_kk_005fmsg_005f1.setParent(null);
    // /WEB-INF/jsp/Footer.jsp(53,126) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_kk_005fmsg_005f1.setKey("footer.your.email");
    int _jspx_eval_kk_005fmsg_005f1 = _jspx_th_kk_005fmsg_005f1.doStartTag();
    if (_jspx_th_kk_005fmsg_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f1);
    return false;
  }

  private boolean _jspx_meth_kk_005fmsg_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  kk:msg
    com.konakart.kktags.MsgTag _jspx_th_kk_005fmsg_005f2 = (com.konakart.kktags.MsgTag) _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.get(com.konakart.kktags.MsgTag.class);
    _jspx_th_kk_005fmsg_005f2.setPageContext(_jspx_page_context);
    _jspx_th_kk_005fmsg_005f2.setParent(null);
    // /WEB-INF/jsp/Footer.jsp(54,58) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_kk_005fmsg_005f2.setKey("footer.signup");
    int _jspx_eval_kk_005fmsg_005f2 = _jspx_th_kk_005fmsg_005f2.doStartTag();
    if (_jspx_th_kk_005fmsg_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f2);
    return false;
  }

  private boolean _jspx_meth_kk_005fmsg_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  kk:msg
    com.konakart.kktags.MsgTag _jspx_th_kk_005fmsg_005f3 = (com.konakart.kktags.MsgTag) _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.get(com.konakart.kktags.MsgTag.class);
    _jspx_th_kk_005fmsg_005f3.setPageContext(_jspx_page_context);
    _jspx_th_kk_005fmsg_005f3.setParent(null);
    // /WEB-INF/jsp/Footer.jsp(58,28) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_kk_005fmsg_005f3.setKey("footer.about.us");
    int _jspx_eval_kk_005fmsg_005f3 = _jspx_th_kk_005fmsg_005f3.doStartTag();
    if (_jspx_th_kk_005fmsg_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f3);
    return false;
  }

  private boolean _jspx_meth_kk_005fmsg_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  kk:msg
    com.konakart.kktags.MsgTag _jspx_th_kk_005fmsg_005f4 = (com.konakart.kktags.MsgTag) _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.get(com.konakart.kktags.MsgTag.class);
    _jspx_th_kk_005fmsg_005f4.setPageContext(_jspx_page_context);
    _jspx_th_kk_005fmsg_005f4.setParent(null);
    // /WEB-INF/jsp/Footer.jsp(59,40) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_kk_005fmsg_005f4.setKey("footer.shipping.and.handling");
    int _jspx_eval_kk_005fmsg_005f4 = _jspx_th_kk_005fmsg_005f4.doStartTag();
    if (_jspx_th_kk_005fmsg_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f4);
    return false;
  }

  private boolean _jspx_meth_kk_005fmsg_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  kk:msg
    com.konakart.kktags.MsgTag _jspx_th_kk_005fmsg_005f5 = (com.konakart.kktags.MsgTag) _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.get(com.konakart.kktags.MsgTag.class);
    _jspx_th_kk_005fmsg_005f5.setPageContext(_jspx_page_context);
    _jspx_th_kk_005fmsg_005f5.setParent(null);
    // /WEB-INF/jsp/Footer.jsp(60,28) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_kk_005fmsg_005f5.setKey("footer.returns");
    int _jspx_eval_kk_005fmsg_005f5 = _jspx_th_kk_005fmsg_005f5.doStartTag();
    if (_jspx_th_kk_005fmsg_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f5);
    return false;
  }

  private boolean _jspx_meth_kk_005fmsg_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  kk:msg
    com.konakart.kktags.MsgTag _jspx_th_kk_005fmsg_005f6 = (com.konakart.kktags.MsgTag) _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.get(com.konakart.kktags.MsgTag.class);
    _jspx_th_kk_005fmsg_005f6.setPageContext(_jspx_page_context);
    _jspx_th_kk_005fmsg_005f6.setParent(null);
    // /WEB-INF/jsp/Footer.jsp(61,40) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_kk_005fmsg_005f6.setKey("footer.international.orders");
    int _jspx_eval_kk_005fmsg_005f6 = _jspx_th_kk_005fmsg_005f6.doStartTag();
    if (_jspx_th_kk_005fmsg_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f6);
    return false;
  }

  private boolean _jspx_meth_kk_005fmsg_005f7(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  kk:msg
    com.konakart.kktags.MsgTag _jspx_th_kk_005fmsg_005f7 = (com.konakart.kktags.MsgTag) _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.get(com.konakart.kktags.MsgTag.class);
    _jspx_th_kk_005fmsg_005f7.setPageContext(_jspx_page_context);
    _jspx_th_kk_005fmsg_005f7.setParent(null);
    // /WEB-INF/jsp/Footer.jsp(64,34) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_kk_005fmsg_005f7.setKey("footer.privacy.policy");
    int _jspx_eval_kk_005fmsg_005f7 = _jspx_th_kk_005fmsg_005f7.doStartTag();
    if (_jspx_th_kk_005fmsg_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f7);
    return false;
  }

  private boolean _jspx_meth_kk_005fmsg_005f8(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  kk:msg
    com.konakart.kktags.MsgTag _jspx_th_kk_005fmsg_005f8 = (com.konakart.kktags.MsgTag) _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.get(com.konakart.kktags.MsgTag.class);
    _jspx_th_kk_005fmsg_005f8.setPageContext(_jspx_page_context);
    _jspx_th_kk_005fmsg_005f8.setParent(null);
    // /WEB-INF/jsp/Footer.jsp(65,31) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_kk_005fmsg_005f8.setKey("footer.terms.of.use");
    int _jspx_eval_kk_005fmsg_005f8 = _jspx_th_kk_005fmsg_005f8.doStartTag();
    if (_jspx_th_kk_005fmsg_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f8);
    return false;
  }

  private boolean _jspx_meth_kk_005fmsg_005f9(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  kk:msg
    com.konakart.kktags.MsgTag _jspx_th_kk_005fmsg_005f9 = (com.konakart.kktags.MsgTag) _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.get(com.konakart.kktags.MsgTag.class);
    _jspx_th_kk_005fmsg_005f9.setPageContext(_jspx_page_context);
    _jspx_th_kk_005fmsg_005f9.setParent(null);
    // /WEB-INF/jsp/Footer.jsp(66,25) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_kk_005fmsg_005f9.setKey("footer.help");
    int _jspx_eval_kk_005fmsg_005f9 = _jspx_th_kk_005fmsg_005f9.doStartTag();
    if (_jspx_th_kk_005fmsg_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f9);
    return false;
  }

  private boolean _jspx_meth_kk_005fmsg_005f10(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  kk:msg
    com.konakart.kktags.MsgTag _jspx_th_kk_005fmsg_005f10 = (com.konakart.kktags.MsgTag) _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.get(com.konakart.kktags.MsgTag.class);
    _jspx_th_kk_005fmsg_005f10.setPageContext(_jspx_page_context);
    _jspx_th_kk_005fmsg_005f10.setParent(null);
    // /WEB-INF/jsp/Footer.jsp(67,30) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_kk_005fmsg_005f10.setKey("footer.contact.us");
    int _jspx_eval_kk_005fmsg_005f10 = _jspx_th_kk_005fmsg_005f10.doStartTag();
    if (_jspx_th_kk_005fmsg_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f10);
    return false;
  }

  private boolean _jspx_meth_kk_005fmsg_005f11(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  kk:msg
    com.konakart.kktags.MsgTag _jspx_th_kk_005fmsg_005f11 = (com.konakart.kktags.MsgTag) _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.get(com.konakart.kktags.MsgTag.class);
    _jspx_th_kk_005fmsg_005f11.setPageContext(_jspx_page_context);
    _jspx_th_kk_005fmsg_005f11.setParent(null);
    // /WEB-INF/jsp/Footer.jsp(70,2) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_kk_005fmsg_005f11.setKey("footer.connect");
    int _jspx_eval_kk_005fmsg_005f11 = _jspx_th_kk_005fmsg_005f11.doStartTag();
    if (_jspx_th_kk_005fmsg_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fkk_005fmsg_0026_005fkey_005fnobody.reuse(_jspx_th_kk_005fmsg_005f11);
    return false;
  }
}
