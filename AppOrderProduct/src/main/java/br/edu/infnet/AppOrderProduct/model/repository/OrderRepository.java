package br.edu.infnet.AppOrderProduct.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.AppOrderProduct.model.domain.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer>{
	@Query("FROM Order o WHERE o.account.user.id =:userid")
	List<Order> getOrderList(Integer userid);
}
