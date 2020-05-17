package com.lwl.ipl.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "players")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;

	private String name;
	private double price;

	@Column(name = "p_role")
	private String role;

	private String label;

//	@ManyToOne
//	@JoinColumn(name = "label", nullable = false)
//	private Team team;

}
