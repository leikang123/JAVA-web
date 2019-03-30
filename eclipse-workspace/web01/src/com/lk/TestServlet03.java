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

public class TestServlet03 extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException	{
		
		// 得到对象
		 ServletContext sc = this.getServletContext();
		 // 设置属性值
		 sc.setAttribute("data", "我们的心");
		
	

		 }
		
	
 protected void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
	 
 }
}
