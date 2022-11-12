package br.edu.infnet.AppOrderProduct.model.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name = "taccount")
public class Account{	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthday;
	private String name,
				   documentNumber,
				   email;
	@ManyToOne
	@JoinColumn(name="idUser")
	private User user;
	@OneToMany
	@JoinColumn(name="idAccount")
	private List<Order> orders;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="idAddress")
	private Address address;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id:"+getId()+
			   ";name:"+getName()+
			   ";documentNumber:"+getDocumentNumber()+
			   ";email:"+getEmail()+
			   ";birthday:"+getBirthday();
			   /*"Address: "+getAddressStreet()+
			   ", N:"+getAddressNumber()+ 
			   " - "+getAddressComplement()+
			   " - "+getAddressCity()+
			   " - "+getAddressState()+ 
			   " - "+getAddressCountry()+
			   " - Zip Code: "+getAddressPostalCode();*/
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
