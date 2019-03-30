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

public class TestServlet06 extends HttpServlet{
	
		public void init(HttpServletRequest request,HttpServletResponse response)
				throws ServletException {
			System.out.println("init......");
		}

		 
		
	
 public  void service(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
	 System.out.println("service.......");
	 
 
}
 public void destroy(HttpServletRequest request,HttpServletResponse response) {
	 System.out.println("destroy.........");
 }
}