package br.edu.infnet.AppOrderProduct.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppOrderProduct.model.domain.Product;
import br.edu.infnet.AppOrderProduct.model.domain.Account;
import br.edu.infnet.AppOrderProduct.model.domain.Order;
import br.edu.infnet.AppOrderProduct.model.domain.User;
import br.edu.infnet.AppOrderProduct.model.service.AccountService;
import br.edu.infnet.AppOrderProduct.model.service.OrderService;
import br.edu.infnet.AppOrderProduct.model.service.ProductService;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;
	@Autowired
	AccountService accountService;
	@Autowired
	ProductService productService;
	
	@GetMapping(value="/order")
	public String orderScreen(Model model,@SessionAttribute("user") User user) {
		model.addAttribute("accounts", accountService.getAccList(user));
		model.addAttribute("products", productService.getProductList());
		return "order/register";
	}
	@PostMapping(value="/order/insert")
	public String insert(Order order,@SessionAttribute("user") User user, @RequestParam String accId, @RequestParam String prodIds) {	
		/*Não sei porque, mas do nada o código parou de converter o objeto no html pro controller
		 * e passou a apenas enviar o id em formato de string, por isso tive que fazer a gambiarra abaixo:
		 */
		/*Extreme Go Horse Mode*/
		Account acc = new Account();
		acc.setId(Integer.valueOf(accId));
		order.setAccount(acc);
		
		String[] ltProd = prodIds.split(",");
		List<Product> ltProducts = new ArrayList<Product>();
		for(int i = 0; i < ltProd.length; i++) {
			Product p = new Product();
			p.setId(Integer.valueOf(ltProd[i]));
			ltProducts.add(p);
		}
		order.setProducts(ltProducts);
		/*Fim Extreme Go Horse Mode*/
		order.setUser(user);
		orderService.insertOrder(order);
		return "redirect:/order/list";
	}
	@GetMapping(value="/order/list")
	public String orderList(Model model,@SessionAttribute("user") User user) {
		model.addAttribute("orders",orderService.getOrderList(user,model));
		return "order/list";
	}
	@GetMapping(value="/order/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		orderService.deleteOrder(id);
		return "redirect:/order/list";
	}
}
