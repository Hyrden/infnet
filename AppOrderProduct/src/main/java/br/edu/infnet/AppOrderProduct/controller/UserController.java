package br.edu.infnet.AppOrderProduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppOrderProduct.model.domain.User;
import br.edu.infnet.AppOrderProduct.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping(value="/user/insert")
	public String insert(User u) {
		userService.insertUser(u);
		return "redirect:/user/list";
	}
	
	@GetMapping(value="/user/list")
	public String userScreen(Model model) {
		model.addAttribute("users",userService.getUserList());
		return "user/list";
	}
	@GetMapping(value="/user")
	public String userScreen() {
		return "user/signup";
	}
	@GetMapping(value="/user/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		userService.deleteUser(id);
		return "redirect:/user/list";
	}
}
