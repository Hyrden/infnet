package br.edu.infnet.AppOrderProduct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping(value="/")
	public String homeScreen() {
		return "home";
	}
}