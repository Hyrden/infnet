package br.edu.infnet.AppOrderProduct.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppOrderProduct.model.domain.Game;
import br.edu.infnet.AppOrderProduct.repository.GameRepository;

@Service
public class GameService {		
	@Autowired
	private GameRepository gameRepository;
	
	public void insertGame(Game game) {
		gameRepository.save(game);
	}
	public void deleteGame(Integer id) {
		gameRepository.deleteById(id);
	}
	public Collection<Game> getGameList(){
		return (Collection<Game>) gameRepository.findAll();
	}
}
