package com.lwl.ipl.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "teams")
public class Team {

	@Id
	private String label;
	private String city;
	private String coach;
	private String home;

	@Column(name = "team_name")
	private String teamName;

	@OneToMany(targetEntity = Player.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "label", referencedColumnName = "label")
	private List<Player> players;
}
