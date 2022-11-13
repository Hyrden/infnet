package br.edu.infnet.apiuser.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiuser.model.domain.User;
import br.edu.infnet.apiuser.model.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository userRep;

	public void insert(User user) {
		userRep.save(user);
	}

	public void delete(Integer id) {
		userRep.deleteById(id);
	}
	public List<User> getList(){
		return (List<User>) userRep.findAll();
	}
	public User validate(String email, String password) {		
		User user = userRep.findByEmail(email);		
		if(user != null && password.equals(user.getPassword())) {
			return user;
		}		
		return null;
	}
}
