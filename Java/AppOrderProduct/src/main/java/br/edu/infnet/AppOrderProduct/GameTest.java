package br.edu.infnet.AppOrderProduct;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppOrderProduct.model.domain.Game;
import br.edu.infnet.AppOrderProduct.model.domain.User;
import br.edu.infnet.AppOrderProduct.model.service.GameService;
import br.edu.infnet.AppOrderProduct.model.service.ProductService;
@Order(2)
@Component
public class GameTest implements ApplicationRunner{
	
	@Autowired
	private GameService gameService;
	@Autowired
	ProductService productService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		User u = new User();
		u.setId(1);
		Game g1 = DataFactory.createGame(29.90, "The Witcher 3", "G-CDPROJEKTRED-TW-3", "As war rages on throughout the Northern Realms, you take on the greatest contract of your life — tracking down the Child of Prophecy, a living weapon that can alter the shape of the world.", 
				"Adventure", "CD Projekt RED", false, LocalDate.of(2015,5,18),u);
		
		System.out.println("Game 1 - " + g1);
		gameService.insertGame(g1);
		
		Game g2 = DataFactory.createGame(199.90, "Kerbal Space Program 2", "G-INTERCEPTGAMES-KSP-2", "Kerbal Space Program 2 is the sequel to the acclaimed space-flight simulation game Kerbal Space Program. Enter the next generation of space adventure with exciting new parts, stunning visuals, fully revamped UI and Map View, and rich new environments to explore.", 
				"Simulation", "Intercept Games", true, LocalDate.of(2023,2,24),u);
		gameService.insertGame(g2);
		
		Game g3 = DataFactory.createGame(129.90, "Cyberpunk 2077", "G-CDPROJEKTRED-CP2077-1", "Cyberpunk 2077 is an open-world, action-adventure RPG set in the dark future of Night City — a dangerous megalopolis obsessed with power, glamor, and ceaseless body modification.", 
				"Adventure", "CD Projekt RED", false, LocalDate.of(2020,12,9),u);
		gameService.insertGame(g3);
		
	}
		
}
