package com.lwl.ipl.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwl.ipl.domain.Player;
import com.lwl.ipl.domain.Team;
import com.lwl.ipl.dto.MaxAmountPlayerByRoleDTO;
import com.lwl.ipl.dto.PlayerDTO;
import com.lwl.ipl.dto.RoleAmountDTO;
import com.lwl.ipl.dto.RoleCountDTO;
import com.lwl.ipl.dto.TeamAmountDTO;
import com.lwl.ipl.dto.TeamDTO;
import com.lwl.ipl.dto.TeamLabelDTO;

@Service
public class DaoImpl implements Dao {

	@Autowired
	private EntityManager entityManager;

	private final String teamLabelsQuery = "select label from Team";

	private final String getPlayerByTeamQuery = "select p from Player p where p.label = ?1";

	private final String getRoleCountByTeamQuery = "select p_role,count(pid) from Player where label = ?1 group by p_role";

	private final String getPlayersByTeamAndRoleQuery = "select label,name,price,p_role from players where label = ?1 and p_role=?2";

	private final String getTeamDetailsQuery = "";

	@Override
	public TeamLabelDTO getTeamLabels() {
		List<String> labels = entityManager.createQuery(teamLabelsQuery, String.class).getResultList();
		TeamLabelDTO teamLabelDTO = new TeamLabelDTO();
		teamLabelDTO.setLabels(labels);
		return teamLabelDTO;
	}

	@Transactional
	@Override
	public List<PlayerDTO> getPlayersByTeam(String teamLabel) {
		Team team = entityManager.find(Team.class, teamLabel);
		if (team != null) {
			List<Player> list = team.getPlayers();
			System.out.println(list);
		}
		return null;
	}

	@Override
	public List<RoleCountDTO> getRoleCountByTeam(String teamLabel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerDTO> getPlayersByTeamAndRole(String teamLabel, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamDTO> getTeamDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamAmountDTO> getTotalAmountByTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MaxAmountPlayerByRoleDTO> getMaxAmountPlayerByRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerDTO> getAllPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerDTO> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleAmountDTO> getRoleAmountTeam(String teamLabel) {
		// TODO Auto-generated method stub
		return null;
	}

}
