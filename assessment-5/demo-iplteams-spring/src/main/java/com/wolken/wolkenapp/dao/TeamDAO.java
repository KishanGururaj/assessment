package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.dto.TeamDTO;

public interface TeamDAO {
	public String save(TeamDTO teamDTO);

	public String delete(String teamName);

	public String updateCaptainByTeamName(String teamName, String teamCaptain);

	public List<TeamDTO> getAll();
}
