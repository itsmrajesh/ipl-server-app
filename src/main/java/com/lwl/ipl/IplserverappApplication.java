package com.lwl.ipl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lwl.ipl.repo.PlayerRepo;
import com.lwl.ipl.repo.TeamRepo;

@SpringBootApplication
public class IplserverappApplication implements CommandLineRunner {

	@Autowired
	private TeamRepo teamRepo;

	@Autowired
	private PlayerRepo playerRepo;

	public static void main(String[] args) {
		SpringApplication.run(IplserverappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		System.out.println(teamRepo.getTeamLabels());
//		System.out.println(playerRepo.findAllPlayerByLabel("CSK"));
//		System.out.println(playerRepo.getRoleCountByTeam("CSK"));
//		System.out.println(playerRepo.getPlayersByTeamAndRole("CSK", "Batsman"));
//		System.out.println(playerRepo.getTotalAmountByTeam());
//		System.out.println(playerRepo.getAllPlayers().size());
//		System.out.println(playerRepo.search("Da"));
//		System.out.println(playerRepo.getRoleAmountTeam("CSK"));
//		System.out.println(teamRepo.getAllTeams());

	}

}
