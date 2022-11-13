package br.edu.infnet.apiuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiuser.model.domain.User;
import br.edu.infnet.apiuser.model.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping(value = "/insert")
	public void insert(@RequestBody User user) {
		userService.insert(user);
	}	
	@DeleteMapping(value = "/{id}/delete")
	public void delete(@PathVariable Integer id) {
		userService.delete(id);
	}	
	@GetMapping(value = "/list")
	public List<User> getList(){
		return userService.getList();
	}	
	@PostMapping(value = "/validate")
	public User validate(@RequestParam String email, @RequestParam String password) {
		return userService.validate(email, password);
	}
}
