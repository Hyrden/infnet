package br.edu.infnet.AppOrderProduct.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppOrderProduct.model.domain.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer>{

}
