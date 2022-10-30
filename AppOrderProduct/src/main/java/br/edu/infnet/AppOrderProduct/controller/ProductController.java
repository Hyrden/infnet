package br.edu.infnet.AppOrderProduct.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppOrderProduct.model.domain.Product;

@Controller
public class ProductController {
private static Map<Integer,Product> mpProduct;
	
	public ProductController() {
		if (mpProduct == null)mpProduct = new HashMap<Integer,Product>();
	}

	public static void insertProduct(Product product) {
		mpProduct.put(product.getId(), product);
	}
	public static void deleteProduct(Integer id) {
		mpProduct.remove(id);
	}
	public static Collection<Product> getProductList(){
		return mpProduct.values();
	}
	@GetMapping(value="/product/list")
	public String productScreen(Model model) {
		model.addAttribute("products",getProductList());
		return "product/list";
	}
	@GetMapping(value="/product/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		deleteProduct(id);
		return "redirect:/product/list";
	}
}
