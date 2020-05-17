package com.lwl.ipl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lwl.ipl.domain.Team;
import com.lwl.ipl.dto.TeamDTO;

public interface TeamRepo extends JpaRepository<Team, String> {
	
	@Query("SELECT t.label from Team t")
	List<String> getTeamLabels();
	
	@Query("SELECT new com.lwl.ipl.dto.TeamDTO(t.city,t.coach,t.home,t.label,t.teamName) from Team t")
	List<TeamDTO> getAllTeams();
	
	
}
