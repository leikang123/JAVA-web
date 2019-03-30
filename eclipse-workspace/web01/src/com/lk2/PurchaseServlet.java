package com.lk2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PurchaseServlet extends HttpServlet{
	private static final long serialVersionUID=1l;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		String id=request.getParameter("id");
		if(id==null) {
			String url="/web01/ListBookServlet";
			response.sendRedirect(url);
			return;
		}
		Book book =BookDB.getBook(id);
		HttpSession session = request.getSession();
            List<Book> cart = (List<Book>) session.getAttribute("cart");
            if(cart==null) {
            	cart=new ArrayList<Book>();
            	session.setAttribute("cart",cart);
            }
            cart.add(book);
            Cookie cookie = new Cookie("JSESSIONID",session.getId());
            cookie.setMaxAge(60*30);
            cookie.setPath("/web01");
            response.addCookie(cookie);
            
            String url="/web01/CartServlet";
            response.sendRedirect(url);
            
	}
	

}
