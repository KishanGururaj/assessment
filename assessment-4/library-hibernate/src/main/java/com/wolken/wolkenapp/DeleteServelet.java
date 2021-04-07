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

@WebServlet(urlPatterns = "/deletebook")
public class DeleteServelet extends HttpServlet {
	Logger logger = Logger.getLogger("DeleteServelet");

	LibraryService libraryService = new LibraryServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info("inside delete servlet inside do get ");
		String name = req.getParameter("book_name");
		if (name != null) {
			logger.info("name is not null inside delete servlet do get");
			if (libraryService.validateAndDelete(name)) {
				logger.info("true is returned validate and delete inside delete servlet");
				PrintWriter printWriter = resp.getWriter();
				printWriter.print("delete succesfully inside delete servlet");
				resp.setContentType("text/html");
				printWriter.print("<body><a href='http://localhost:8080/library-hibernate/display?'>back</a></body>");

			} else {
				logger.error("delete was unsuccesfull inside delete servlet");
				PrintWriter printWriter = resp.getWriter();
				printWriter.print("delete unsuccesfull");
			}

		} else {
			logger.warn("value of name is null inside delete servlet");
		}

	}

}
