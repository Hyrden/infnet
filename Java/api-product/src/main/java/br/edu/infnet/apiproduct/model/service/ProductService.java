package br.edu.infnet.apiproduct.model.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import br.edu.infnet.apiproduct.model.domain.Game;
import br.edu.infnet.apiproduct.model.domain.Peripheral;
import br.edu.infnet.apiproduct.model.domain.Product;
import br.edu.infnet.apiproduct.model.domain.Software;
import br.edu.infnet.apiproduct.model.repository.GameRepository;
import br.edu.infnet.apiproduct.model.repository.PeripheralRepository;
import br.edu.infnet.apiproduct.model.repository.ProductRepository;
import br.edu.infnet.apiproduct.model.repository.SoftwareRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository prodRep;
	@Autowired
	GameRepository gameRep;
	@Autowired
	PeripheralRepository peripheralRep;
	@Autowired
	SoftwareRepository softwareRep;
	public void insert(Object object) {
		ObjectMapper mapObject = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map <String,String> mapObj = mapObject.convertValue(object, Map.class);
		if(mapObj.get("preOrder")!= null) {
			gameRep.save(mapObject.convertValue(object, Game.class));
		}else if(mapObj.get("firmware")!= null) {
			peripheralRep.save(mapObject.convertValue(object, Peripheral.class));
		}else {
			softwareRep.save(mapObject.convertValue(object, Software.class));
		}
	}
	public void delete(Integer id) {
		prodRep.deleteById(id);
	}
	public List<Game> getGameList(){
		return (List<Game>) gameRep.findAll();		
	}
	public List<Software> getSoftwareList(){
		return (List<Software>) softwareRep.findAll();		
	}
	public List<Peripheral> getPeripheralList(){
		return (List<Peripheral>) peripheralRep.findAll();		
	}		
}
