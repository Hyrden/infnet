package br.edu.infnet.AppOrderProduct.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
	private Integer id;
	private Integer orderNumber;
	private LocalDateTime createdDate;
	private String paymentMethod;
	private Account account;
	private List<Product> products;	
	
	public Order() {
		//Como iniciei manipulando datas diferentes do LocalDateTime.now(), decidi não colocar nada neste construtor por enquanto
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
			   ";Product Size:"+products.size();
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
}
