package com.lwl.ipl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlayerDTO {

	private String label;
	private String name;
	private double price;
	private String role;
}
