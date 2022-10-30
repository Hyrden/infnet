package br.edu.infnet.AppOrderProduct.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppOrderProduct.model.domain.Order;

@Controller
public class OrderController {
private static Map<Integer,Order> mpOrder = new HashMap<Integer,Order>();
	
	public static void insertOrder(Order order) {
		mpOrder.put(order.getId(), order);
	}
	public static void deleteOrder(Integer id) {
		mpOrder.remove(id);
	}
	public static Collection<Order> getOrderList(){
		return mpOrder.values();
	}
	@GetMapping(value="/order/list")
	public String orderScreen(Model model) {
		model.addAttribute("orders",getOrderList());
		return "order/list";
	}
	@GetMapping(value="/order/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		deleteOrder(id);
		return "redirect:/order/list";
	}
}
