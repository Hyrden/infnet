package br.edu.infnet.AppOrderProduct.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.AppOrderProduct.model.domain.Game;
import br.edu.infnet.AppOrderProduct.model.repository.GameRepository;

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
	public List<Game> getGameList(){
		return (List<Game>) gameRepository.findAll();
	}
}
