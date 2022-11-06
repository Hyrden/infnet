package br.edu.infnet.AppOrderProduct.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppOrderProduct.model.domain.Order;
import br.edu.infnet.AppOrderProduct.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRep;
	
	public void insertOrder(Order order) {
		orderRep.save(order);
	}
	public void deleteOrder(Integer id) {
		orderRep.deleteById(id);
	}
	public Collection<Order> getOrderList(){
		return (Collection<Order>) orderRep.findAll();
	}
}
