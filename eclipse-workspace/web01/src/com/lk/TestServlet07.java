package com.lk;
/**
 * 获取网络连接信息
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

public class TestServlet07 extends HttpServlet{
	
		public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException{
			response.setContentType("text/html,charset=utf-8");
			PrintWriter out = response.getWriter();
		    out.println("str:"+request.getRemoteAddr()+"<br>");
			out.println("str2:"+request.getRemoteHost()+"<br>");
			out.println("str3:"+request.getServletPath()+"<br>");
			out.println("str4:"+request.getLocalName()+"<br>");
			out.println("str5:"+request.getServerName()+"<br>");
			out.println("str6:"+request.getServerPort()+"<br>");
			out.println("str7:"+request.getLocalAddr()+"<br>");
			
			
		}

		 
		
	
 public  void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
	 
	 
 
}
 
}