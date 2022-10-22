package br.edu.infnet.AppOrderProduct;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppOrderProduct.model.domain.Game;

@Component
public class GameTest implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Game g1 = new Game();
		g1.setName("The Witcher 3");
		g1.setDescription("As war rages on throughout the Northern Realms, you take on the greatest contract of your life — tracking down the Child of Prophecy, a living weapon that can alter the shape of the world.");
		g1.setCompany("CD Projekt RED");
		g1.setCategory("Adventure");
		g1.setCode("G-CDPROJEKTRED-TW-3");
		g1.setPreOrder(false);
		g1.setReleased(true);
		g1.setValue(29.90);
		g1.setReleaseDate(LocalDate.of(2015,5,18));
		System.out.println("Game - " + g1);
		
		Game g2 = new Game();
		g2.setName("Kerbal Space Program 2");
		g2.setDescription("Kerbal Space Program 2 is the sequel to the acclaimed space-flight simulation game Kerbal Space Program. Enter the next generation of space adventure with exciting new parts, stunning visuals, fully revamped UI and Map View, and rich new environments to explore.");
		g2.setCompany("Intercept Games");
		g2.setCategory("Simulation");
		g2.setCode("G-INTERCEPTGAMES-KSP-2");
		g2.setPreOrder(true);
		g2.setReleased(false);
		g2.setValue(29.90);
		g2.setReleaseDate(LocalDate.of(2023,2,24));
		System.out.println("Game - " + g2);
		
		Game g3 = new Game();
		g3.setName("Cyberpunk 2077");
		g3.setDescription("Cyberpunk 2077 is an open-world, action-adventure RPG set in the dark future of Night City — a dangerous megalopolis obsessed with power, glamor, and ceaseless body modification.");
		g3.setCompany("CD Projekt RED");
		g3.setCategory("Adventure");
		g3.setCode("G-CDPROJEKTRED-CP2077-1");
		g3.setPreOrder(false);
		g3.setReleased(true);
		g3.setValue(129.90);
		g3.setReleaseDate(LocalDate.of(2020,12,9));
		System.out.println("Game - " + g3);
		
		
	}
		
}
