package br.edu.infnet.AppOrderProduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.AppOrderProduct.model.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping(value="/product/list")
	public String productScreen(Model model) {
		model.addAttribute("products",productService.getProductList());
		return "product/list";
	}
	@GetMapping(value="/product/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		productService.deleteProduct(id);
		return "redirect:/product/list";
	}
}
