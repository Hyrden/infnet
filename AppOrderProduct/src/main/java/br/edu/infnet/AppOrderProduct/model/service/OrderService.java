package br.edu.infnet.AppOrderProduct.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import br.edu.infnet.AppOrderProduct.model.domain.Order;
import br.edu.infnet.AppOrderProduct.model.domain.User;
import br.edu.infnet.AppOrderProduct.model.repository.OrderRepository;

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
	public Collection<Order> getOrderList(User u, Model model){		
		if(u.getIsAdmin()) {
			model.addAttribute("message","You're an admin, that's why you can see all orders.");
			return (Collection<Order>) orderRep.findAll();
		}else {
			return (Collection<Order>) orderRep.getOrderList(u.getId());
		}
	}
}
