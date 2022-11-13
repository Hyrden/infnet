package br.edu.infnet.AppOrderProduct.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import br.edu.infnet.AppOrderProduct.model.domain.User;
import br.edu.infnet.AppOrderProduct.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRep;
	
	public void insertUser(User user) {
		userRep.save(user);
	}
	public void deleteUser(Integer id) {
		userRep.deleteById(id);
	}
	public Collection<User> getUserList(){
		return (Collection<User>) userRep.findAll();
	}
	public String validateSignup(User u, String confirmPassword, Model model) {
		if(u.getPassword().equals(confirmPassword)) {
			User alreadyCreated = userRep.findByEmail(u.getEmail());
			if(alreadyCreated!= null) {
				model.addAttribute("message","This email is already being used");
				model.addAttribute("user","");
				return "user/signup";
			}
			insertUser(u);
			return "redirect:/login";
		}else {
			model.addAttribute("message","Password and Confirm Password does not match");
			model.addAttribute("user","");
			return "user/signup";
		}
	}
	public User validate(String email, String password,Model model) {
		User user = userRep.findByEmail(email);		
		if(user != null && password.equals(user.getPassword()))return user;
		else {
			model.addAttribute("message","Your login or password is invalid");
			return null;
		}
	}
}
