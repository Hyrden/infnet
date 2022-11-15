package br.edu.infnet.apiproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiproduct.model.domain.Game;
import br.edu.infnet.apiproduct.model.domain.Peripheral;
import br.edu.infnet.apiproduct.model.domain.Product;
import br.edu.infnet.apiproduct.model.domain.Software;
import br.edu.infnet.apiproduct.model.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	@Autowired
	ProductService prodService;
	@PostMapping(value = "/insert")
	public void insert(@RequestBody Object object) {
		prodService.insert(object);
	}	
	@DeleteMapping(value = "/{id}/delete")
	public void delete(@PathVariable Integer id) {
		prodService.delete(id);
	}
	@GetMapping(value = "/game/list")
	public List<Game> getGameList(){
		return prodService.getGameList();
	}
	@GetMapping(value = "/software/list")
	public List<Software> getSoftwareList(){
		return prodService.getSoftwareList();
	}
	@GetMapping(value = "/peripheral/list")
	public List<Peripheral> getPeripheralList(){
		return prodService.getPeripheralList();
	}
}
