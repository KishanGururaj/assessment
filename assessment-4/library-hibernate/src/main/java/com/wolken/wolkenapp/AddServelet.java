package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.wolken.wolkenapp.dto.LibraryDTO;
import com.wolken.wolkenapp.service.LibraryService;
import com.wolken.wolkenapp.service.LibraryServiceImpl;

@WebServlet(urlPatterns = "/addbook")
public class AddServelet extends HttpServlet {
	Logger logger = Logger.getLogger("AddServelet");
	LibraryDTO libraryDTO = new LibraryDTO();
	LibraryService libraryService = new LibraryServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info("inside do get method in addservelet");
		libraryDTO.setBookId(Integer.parseInt(req.getParameter("book_id")));
		libraryDTO.setBookName(req.getParameter("book_name"));
		libraryDTO.setPrice(Double.parseDouble(req.getParameter("book_price")));
		libraryDTO.setBookAuthor(req.getParameter("book_author"));
		if (libraryDTO != null) {
			logger.info("library DTO is not null inside do get method inside add servlet");
			if (libraryService.validateAndSave(libraryDTO)) {
				logger.info("validate and save is true and enter inside if condition do get method inside add servlet");
				PrintWriter printwriter = resp.getWriter();
				printwriter.println("book added succesfully  ");
				resp.setContentType("text/html");
				printwriter.print("<body><a href='http://localhost:8080/library-hibernate/display?'>back</a></body>");
			} else {
				logger.error("add in addservlet is unsuccessfull do get method ");
				PrintWriter printwriter = resp.getWriter();
				printwriter.print("book added is unsuccessfull");
			}
		} else {
			logger.warn("library dto in addservlet is null");
		}
	}

}
