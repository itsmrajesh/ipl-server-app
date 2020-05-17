package com.lwl.ipl.dao;

import java.util.List;

import com.lwl.ipl.dto.MaxAmountPlayerByRoleDTO;
import com.lwl.ipl.dto.PlayerDTO;
import com.lwl.ipl.dto.RoleAmountDTO;
import com.lwl.ipl.dto.RoleCountDTO;
import com.lwl.ipl.dto.TeamAmountDTO;
import com.lwl.ipl.dto.TeamDTO;
import com.lwl.ipl.dto.TeamLabelDTO;

public interface Dao {
	TeamLabelDTO getTeamLabels();

	List<PlayerDTO> getPlayersByTeam(String teamLabel);

	List<RoleCountDTO> getRoleCountByTeam(String teamLabel);

	List<PlayerDTO> getPlayersByTeamAndRole(String teamLabel, String role);

	List<TeamDTO> getTeamDetails();

	List<TeamAmountDTO> getTotalAmountByTeam();

	List<MaxAmountPlayerByRoleDTO> getMaxAmountPlayerByRole();

	List<PlayerDTO> getAllPlayers();

	List<PlayerDTO> search(String name);

	List<RoleAmountDTO> getRoleAmountTeam(String teamLabel);
}
