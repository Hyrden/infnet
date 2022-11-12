package br.edu.infnet.AppOrderProduct.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.AppOrderProduct.model.domain.User;
import br.edu.infnet.AppOrderProduct.service.UserService;

@SessionAttributes("user")
@Controller
public class AppController {
	@Autowired
	UserService userService;
	@GetMapping(value="/")
	public String homeScreen() {
		return "home"; 
	}
	@GetMapping(value="/login")
	public String loginScreen() {
		return "login"; 
	}
	@PostMapping(value="/login")
	public String checkAuth(Model model,@RequestParam String email, @RequestParam String password) {
		User u = userService.validate(email,password,model);
		if(u != null) {
			model.addAttribute("user",u);
			return "home";
		}
		else return "login"; 
	}
	@GetMapping(value="/logout")
	public String logout(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("user");
		return "redirect:/";
	}
}
