package com.lwl.ipl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lwl.ipl.domain.Player;
import com.lwl.ipl.dto.PlayerDTO;
import com.lwl.ipl.dto.RoleAmountDTO;
import com.lwl.ipl.dto.RoleCountDTO;
import com.lwl.ipl.dto.TeamAmountDTO;

public interface PlayerRepo extends JpaRepository<Player, Integer> {

	@Query("SELECT new com.lwl.ipl.dto.PlayerDTO(p.label,p.name,p.price,p.role) FROM Player p where p.label = ?1")
	List<PlayerDTO> findAllPlayerByLabel(String label);

	@Query("SELECT new com.lwl.ipl.dto.RoleCountDTO( count(p.pid),p.role ) FROM Player p where p.label = ?1 group by p.role")
	List<RoleCountDTO> getRoleCountByTeam(String teamLabel);

	@Query("SELECT new com.lwl.ipl.dto.PlayerDTO(p.label,p.name,p.price,p.role) FROM Player p where p.label = ?1 and p.role=?2")
	List<PlayerDTO> getPlayersByTeamAndRole(String teamLabel, String role);

	@Query("SELECT new com.lwl.ipl.dto.TeamAmountDTO( p.label,sum(p.price) ) from Player p group by p.label")
	List<TeamAmountDTO> getTotalAmountByTeam();

	// @Query("SELECT new com.lwl.ipl.dto.MaxAmountPlayerByRoleDTO( p.role,p.amount,
	// new com.lwl.ipl.dto.PlayerDTO( p.label,p.name,p.price,p.role )) FROM Player p
	// where p.price in (SELECT max(player.price) from Player player group by
	// player.role)")
	// @Query(value="select pl.p_role,pl.price,pl.label,pl.name,pl.price,pl.p_role
	// from players pl where price in (select max(p.price) from players p group by
	// p_role)",nativeQuery = true)
	// List<MaxAmountPlayerByRoleDTO> getMaxAmountPlayerByRole();

	@Query("SELECT new com.lwl.ipl.dto.PlayerDTO(p.label,p.name,p.price,p.role) FROM Player p")
	List<PlayerDTO> getAllPlayers();

	@Query("SELECT new com.lwl.ipl.dto.PlayerDTO(p.label,p.name,p.price,p.role) FROM Player p where name like %:name%")
	List<PlayerDTO> search(@Param("name") String name);

	@Query("SELECT new com.lwl.ipl.dto.RoleAmountDTO(p.role,p.price) FROM Player p WHERE p.label = ?1 GROUP BY p.role")
	List<RoleAmountDTO> getRoleAmountTeam(String teamLabel);

}
