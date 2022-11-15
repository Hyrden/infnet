package br.edu.infnet.AppOrderProduct.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table (name = "torder")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer orderNumber;
	private LocalDateTime createdDate;
	private String paymentMethod;
	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "idAccount")
	private Account account;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Product> products;
	@ManyToOne
	@JoinColumn(name = "idUser")
	private User user;
	
	public Order() {
		createdDate = LocalDateTime.now();
	}
	public Order(Account acc) {
		this();
		this.account = acc;
	}
	@Override
	public String toString() {
		return "id:"+getId()+
			   ";Number:"+getOrderNumber()+
			   ";Created Date:"+getCreatedDate()+
			   ";Payment Method:"+getPaymentMethod()+
			   ";Account: "+account+
			   ";User: "+user+
			   ";Products:"+products;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}	
}
