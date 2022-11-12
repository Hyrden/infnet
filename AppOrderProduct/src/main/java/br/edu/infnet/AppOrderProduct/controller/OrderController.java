package br.edu.infnet.AppOrderProduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppOrderProduct.model.domain.Order;
import br.edu.infnet.AppOrderProduct.model.domain.User;
import br.edu.infnet.AppOrderProduct.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;
	@GetMapping(value="/order")
	public String orderScreen() {
		return "order/register";
	}
	@PostMapping(value="/order/insert")
	public String insert(Order order) {
		orderService.insertOrder(order);
		return "redirect:/order/list";
	}
	@GetMapping(value="/order/list")
	public String orderScreen(Model model,@SessionAttribute("user") User user) {
		model.addAttribute("orders",orderService.getOrderList(user,model));
		return "order/list";
	}
	@GetMapping(value="/order/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		orderService.deleteOrder(id);
		return "redirect:/order/list";
	}
}
