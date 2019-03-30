package com.lk;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet08 extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException	{
		//设置字符集
		response.setContentType("text/html;charset=utf-8");
		//设置一个时间为空
		String lastAccesTime=null;
		// 获取所有的cookie,存放在数组中；
		Cookie [] cookies =request.getCookies();
		for(int i=0;cookies!=null && i<cookies.length;i++) {
			if("cookies".equals(cookies[i].getName())) {
				lastAccesTime=cookies[i].getValue();
				break;
			}
			
		}
		if(lastAccesTime==null) {
			response.getWriter().println("首次访问本站");
			
		}else {
			response.getWriter().println("你上一次访问的时间是："+lastAccesTime);
		}
		String  currenttime=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
				Cookie cookie= new Cookie("lastAcces",currenttime);
				response.addCookie(cookie);
	}
 protected void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
	    this.doHead(request, response);
	 
 }
 }

