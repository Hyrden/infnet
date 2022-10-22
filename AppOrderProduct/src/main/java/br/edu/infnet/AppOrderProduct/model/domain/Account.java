package br.edu.infnet.AppOrderProduct.model.domain;

public class Account{	
	private String name,
				   documentNumber,
				   email,
				   addressStreet,
				   addressNumber,
				   addressComplement,
				   addressState,
				   addressCountry,
				   addressPostalCode,
				   addressCity;
	
	 public String getAddressComplement() {
		return addressComplement;
	}

	public void setAddressComplement(String addressComplement) {
		this.addressComplement = addressComplement;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:"+getName()+
			   ";documentNumber:"+getDocumentNumber()+
			   ";email:"+getEmail()+
			   "Address: "+getAddressStreet()+
			   ", N:"+getAddressNumber()+ 
			   " - "+getAddressComplement()+
			   " - "+getAddressCity()+
			   " - "+getAddressState()+ 
			   " - "+getAddressCountry()+
			   " - Zip Code: "+getAddressPostalCode();
	}

	public String getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
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

	public String getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public String getAddressCountry() {
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	public String getAddressPostalCode() {
		return addressPostalCode;
	}

	public void setAddressPostalCode(String addressPostalCode) {
		this.addressPostalCode = addressPostalCode;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	
}
