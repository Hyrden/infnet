package br.edu.infnet.AppOrderProduct.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import br.edu.infnet.AppOrderProduct.clients.IUserClient;
import br.edu.infnet.AppOrderProduct.model.domain.User;

@Service
public class UserService {
	@Autowired
	IUserClient clientApi;
	
	public void insertUser(User user) {
		clientApi.insert(user);
	}
	public void deleteUser(Integer id) {
		clientApi.delete(id);
	}
	public Collection<User> getUserList(){
		return (Collection<User>) clientApi.getList();
	}
	public String validateSignup(User u, String confirmPassword, Model model) {
		if(u.getPassword().equals(confirmPassword)) {
			User alreadyCreated = clientApi.validate(u.getEmail(), u.getPassword());
			if(alreadyCreated!= null) {
				model.addAttribute("message","This email is already being used");
				model.addAttribute("user","");
				return "user/signup";
			}
			try {
				insertUser(u);
			}catch(Exception ex) {
				model.addAttribute("message",ex.getMessage());
				model.addAttribute("user","");
				return "user/signup";
			}			
			return "redirect:/login";
		}else {
			model.addAttribute("message","Password and Confirm Password does not match");
			model.addAttribute("user","");
			return "user/signup";
		}
	}
	public User validate(String email, String password,Model model) {
		User user = clientApi.validate(email, password);
		if(user != null && password.equals(user.getPassword()))return user;
		else {
			model.addAttribute("message","Your login or password is invalid");
			return null;
		}
	}
}
