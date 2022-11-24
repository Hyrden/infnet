package br.edu.infnet.AppOrderProduct.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppOrderProduct.clients.IProductClient;
import br.edu.infnet.AppOrderProduct.model.domain.Game;

@Service
public class GameService {		
	@Autowired
	private IProductClient clientApi;
	
	public void insertGame(Game game) {
		clientApi.insert(game);
	}
	public void deleteGame(Integer id) {
		clientApi.delete(id);
	}
	public List<Game> getGameList(){
		return (List<Game>) clientApi.getGameList();
	}
}
