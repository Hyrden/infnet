package br.edu.infnet.apiorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiorder.model.domain.Order;
import br.edu.infnet.apiorder.model.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRep;
	
	public void insert(Order order) {
		orderRep.save(order);
	}
	public void delete(Integer id) {
		orderRep.deleteById(id);
	}
	public List<Order> getList(Integer id){
		if(id==null)return (List<Order>) orderRep.findAll();
		return orderRep.getList(id);
	}
	public List<Order> getAll(){
		return (List<Order>) orderRep.findAll();
	}
}
