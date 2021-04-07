package com.wolken.wolkenapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Component
@Entity
@NoArgsConstructor
@Table(name="team_table")
@NamedQueries({
@NamedQuery(name = "updateByTeamName", query = "update TeamDTO tr set tr.teamCaptain=:teamCaptain where tr.teamName=:teamName"),
@NamedQuery(name = "selectAll", query = "from TeamDTO tr ")})
public class TeamDTO {
	@Id
	@Column(name="team_id")
	private int teamId;
	@Column(name="team_name")
	private String teamName;
	@Column(name="team_ground")
	private String teamGround;
	@Column(name="team_captain")
	private String teamCaptain;
	
}
