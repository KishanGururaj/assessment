package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.wolken.wolkenapp.service.LibraryService;
import com.wolken.wolkenapp.service.LibraryServiceImpl;

@WebServlet(urlPatterns = "/updatebook")
public class UpdateServelet extends HttpServlet {
	Logger logger = Logger.getLogger("UpdateServelet");

	LibraryService libraryService = new LibraryServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info("inside do get inside update servelet ");
		String name = req.getParameter("book_name");
		String author = req.getParameter("book_author");
		if (name != null && author != null) {
			logger.info("inside null check for name and author inside update servelet");
			if (libraryService.validateAndUpdate(name, author)) {
				logger.info("condition is true for validate and update ");
				logger.info("update succesfull");
				PrintWriter printWriter = resp.getWriter();
				printWriter.print("Update Successfull");
				resp.setContentType("text/html");
				printWriter.print("<body><a href='http://localhost:8080/library-hibernate/display?'>back</a></body>");
			} else {
				logger.error("Update Unsuccessfull");
				PrintWriter printWriter = resp.getWriter();
				printWriter.print("Update Unsuccessfull");

			}
		} else {
			logger.warn("name or author is null");
		}
	}

}
