package br.edu.infnet.AppOrderProduct.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import br.edu.infnet.AppOrderProduct.clients.IOrderClient;
import br.edu.infnet.AppOrderProduct.model.domain.Order;
import br.edu.infnet.AppOrderProduct.model.domain.User;

@Service
public class OrderService {
	@Autowired
	IOrderClient clientApi;
	
	public void insertOrder(Order order) {
		clientApi.insert(order);
	}
	public void deleteOrder(Integer id) {
		clientApi.delete(id);
	}
	public List<Order> getOrderList(User u, Model model){		
		if(u.getIsAdmin()) {
			model.addAttribute("message","You're an admin, that's why you can see all orders.");
			return (List<Order>) clientApi.getList();
		}else {
			return (List<Order>) clientApi.getList(u.getId());
		}
	}
}
