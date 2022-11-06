package br.edu.infnet.AppOrderProduct.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public User validate(String email, String password) {
		User user = userRep.findByEmail(email);		
		if(user != null && password.equals(user.getPassword()))return user;
		else return null;
	}
}
