package br.edu.infnet.AppOrderProduct.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppOrderProduct.model.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	User findByEmail(String email);
}
