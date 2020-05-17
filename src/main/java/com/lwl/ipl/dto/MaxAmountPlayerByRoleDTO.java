package com.lwl.ipl.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MaxAmountPlayerByRoleDTO {

	private String role;
	private String amount;
	private List<PlayerDTO> players;

}
