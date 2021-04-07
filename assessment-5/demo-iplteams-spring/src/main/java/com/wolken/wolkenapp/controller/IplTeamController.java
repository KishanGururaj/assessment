package com.wolken.wolkenapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.TeamDTO;
import com.wolken.wolkenapp.service.TeamService;

@Component
@RequestMapping("/")
public class IplTeamController {
	@Autowired
	TeamService service;
	Logger logger =Logger.getLogger("IplTeamController");
	@RequestMapping("/addteam.do")
	public String save(@ModelAttribute TeamDTO teamDTO,HttpServletRequest req) {
		
		logger.info("inside validate and save in IplTeamController");
		String msg=service.validateAndSave(teamDTO);
		req.setAttribute("msg", msg);
		return "add.jsp";
		
	}
	@RequestMapping("/updateteam.do")
	public String update(String teamName , String teamCaptain ,HttpServletRequest req) {
		logger.info("inside update method  in IplTeamController");
		String msg =service.validateAndUpdate(teamName, teamCaptain);
		req.setAttribute("msg", msg);
		return "add.jsp";
		
	}
	@RequestMapping("/deleteteam.do")
	public String delete(String teamName,HttpServletRequest req) {
		logger.info("inside delete method in IplTeamController");
		String msg =service.validateAndDelete(teamName);
		req.setAttribute("msg", msg);
		return "add.jsp";

		
	}
	@RequestMapping("/getallteam.do")
	public String getAll(HttpServletRequest req){
		logger.info("inside getall method in IplTeamController");
		List<TeamDTO>dtos=service.getAll();
		req.setAttribute("teamList", dtos);
		return "getall.jsp";
		
	}
}
