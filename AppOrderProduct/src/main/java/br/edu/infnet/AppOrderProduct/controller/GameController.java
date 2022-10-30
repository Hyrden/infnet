package br.edu.infnet.AppOrderProduct.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppOrderProduct.DataFactory;
import br.edu.infnet.AppOrderProduct.model.domain.Game;

@Controller
public class GameController {
	private static Map<Integer,Game> mpGame = new HashMap<Integer,Game>();
	
	public static void insertGame(Game game) {
		mpGame.put(game.getId(), game);
	}
	public static void deleteGame(Integer id) {
		mpGame.remove(id);
	}
	public static Collection<Game> getGameList(){
		return mpGame.values();
	}
	@GetMapping(value="/game/list")
	public String gameScreen(Model model) {	
		model.addAttribute("games",getGameList());
		return "game/list";
	}
	@GetMapping(value="/game/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		deleteGame(id);
		return "redirect:/game/list";
	}
}
