package com.lk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// web的案例demo
public class TestServlet01 extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException	{
		//设置字符集
		response.setContentType("text/html;charset=utf-8");
		// 输出响应得到对象
		PrintWriter out = response.getWriter();
		// 得到servletConfig对象
		ServletConfig sc=this.getServletConfig();
		//获得参数名为endum的对应值
		//String s = sc.getInitParameter("encoding");
		String s = sc.getServletName();
		// 输出这个参数名的值
		out.println(s);
	}
 protected void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
	 this.doHead(request, response);
	 
 }
 }

