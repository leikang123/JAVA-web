package com.lk;
/**
 * servletContext接口的方法使用
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.naming.Context;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Param;
// web 的继承HTTP
public class TestServlet02 extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException	{
		
		this.doHead(request, response);
		 //设置字符集,响应得到的文字用utf-8输出，不然容易乱码
		 response.setContentType("text/html,charset=utf-8");
		 PrintWriter out =response.getWriter();
		 // 得到对象ServletContext
		 ServletContext sc = this.getServletContext();
		 //得到xx的参数名
		 Enumeration<String>paramNames=sc.getInitParameterNames();
		 out.println("all the paramName and paramValue are following:");
		   
		 while(paramNames.hasMoreElements()) {
         String name = paramNames.nextElement();
		 String value = sc.getInitParameter(name);
		 out.println("name:"+value);
		 out.println("<br>s");
		 

		 }
		
	}
 protected void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
	 
 }
}
