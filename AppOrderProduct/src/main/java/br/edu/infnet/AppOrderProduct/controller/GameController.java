package br.edu.infnet.AppOrderProduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppOrderProduct.model.domain.Game;
import br.edu.infnet.AppOrderProduct.service.GameService;

@Controller
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value="/game")
	public String gameScreen() {
		return "game/register";
	}
	@PostMapping(value="/game/insert")
	public String insert(Game game) {
		gameService.insertGame(game);
		return "redirect:/game/list";
	}
	@GetMapping(value="/game/list")
	public String gameScreen(Model model) {	
		model.addAttribute("games",gameService.getGameList());
		return "game/list";
	}
	@GetMapping(value="/game/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		gameService.deleteGame(id);
		return "redirect:/game/list";
	}
}
