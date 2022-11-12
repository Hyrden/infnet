package br.edu.infnet.AppOrderProduct.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.AppOrderProduct.model.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	@Query("FROM Product p WHERE p.user.id =:userid")
	List<Product> getProdList(Integer userid);
}
