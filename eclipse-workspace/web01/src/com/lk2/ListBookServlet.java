package com.lk2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID=1l;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		response.setContentType("text/html,charset=utf-8");
		response.setCharacterEncoding("utf-8");
	     PrintWriter out =response.getWriter();
	     Collection<Book> books=BookDB.getAll();
	     out.write("本站提供的图书有：<br>");
	     for(Book book:books) {
	    	 String url="/web01/PurchaseServlet?id="+book.getId();
	    	 out.write(book.getName()+"<a href='"+url+"'>点击购买</a><br>");
	     }
	}
	

}
