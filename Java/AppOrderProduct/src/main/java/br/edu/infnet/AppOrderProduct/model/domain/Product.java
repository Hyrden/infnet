package br.edu.infnet.AppOrderProduct.model.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tproduct")
@Inheritance(strategy=InheritanceType.JOINED)
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private double value;
	private String name,
				   code,
				   category,
				   company;
	@Column(name="description",length=10000)
	private String description;
	@ManyToMany(mappedBy = "products")
	private List<Order> orders;
	
	@ManyToOne
	@JoinColumn(name = "idUser")
	private User user;
	public Product() {}
	@Override
	public String toString() {
		return "id:"+getId()+
			   ";name:"+getName()+
			   ";code:"+getCode()+
			   /*"description:"+getDescription()+*/
			   ";category:"+getCategory()+
			   ";company:"+getCompany()+
			   ";value:"+getValue();
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double d) {
		this.value = d;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
