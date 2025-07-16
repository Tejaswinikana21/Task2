package com.servlet;

import java.io.IOException;
import projects.Book;
import projects.dao.BookDao;
import projects.dao.BookDaoImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BookServlet extends HttpServlet {
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		float price = Float.parseFloat(request.getParameter("price"));
		String author = request.getParameter("author");
		
		Book book = new Book();
		book.setName(name);
		book.setPrice(price);
		book.setAuthor(author);
		
		BookDao bdao = new BookDaoImpl();
		bdao.insertBooksList(book);
		
		response.getWriter().println("Book successfully inserted");
	}

}
