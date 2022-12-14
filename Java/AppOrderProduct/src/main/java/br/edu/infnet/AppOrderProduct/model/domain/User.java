package br.edu.infnet.AppOrderProduct.model.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tuser")
public class User{	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name,
				   email,
				   password;
	private Boolean isAdmin;
	@OneToMany
	@JoinColumn(name="idUser")
	private List<Account> accounts;
	@OneToMany
	@JoinColumn(name = "idUser")
	private List<Order> orders;
	@OneToMany
	@JoinColumn(name = "idUser")
	private List<Product> products;
	
	public User() {
		this.isAdmin = false;
	}
	public User(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		String stAdmin = isAdmin == true ? "Yes" : "No";
		return "id:"+getId()+";name:"+getName()+";email"+getEmail()+";password:"+getPassword()+";isAdmin:" + stAdmin;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
