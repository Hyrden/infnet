package br.edu.infnet.apiorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiorder.model.domain.Order;
import br.edu.infnet.apiorder.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	@Autowired
	OrderService orderService;
	@PostMapping(value = "/insert")
	public void insert(@RequestBody Order order) {
		orderService.insert(order);
	}	
	@DeleteMapping(value = "/{id}/delete")
	public void delete(@PathVariable Integer id) {
		orderService.delete(id);
	}	
	@GetMapping(value = "/list")
	public List<Order> getList(@RequestParam Integer id){
		return orderService.getList(id);
	}
	@GetMapping(value = "/listall")
	public List<Order> getList(){
		return orderService.getAll();
	}
}
