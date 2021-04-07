package com.wolken.wolkenapp;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.wolken.wolkenapp.dto.LibraryDTO;
import com.wolken.wolkenapp.service.LibraryService;
import com.wolken.wolkenapp.service.LibraryServiceImpl;

@WebServlet(urlPatterns = "/display", loadOnStartup = +1)
public class GetAllServelet extends HttpServlet {
	Logger logger = Logger.getLogger("GetAllServelet");

	LibraryService libraryService = new LibraryServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info("inside do get inside getall servelet");
		List<LibraryDTO> dtos = libraryService.getAll();
		if (dtos != null) {
			logger.info(" dtos is  not null inside getall servelet");
			req.setAttribute("bookList", dtos);
			RequestDispatcher dispatcher = req.getRequestDispatcher("getall.jsp");
			dispatcher.forward(req, resp);
		} else {
			logger.warn("dtos is null inside getall servelet");
		}

	}

}
