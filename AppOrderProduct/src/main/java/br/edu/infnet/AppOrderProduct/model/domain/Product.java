package br.edu.infnet.AppOrderProduct.model.domain;

public abstract class Product {
	
	private Integer id;
	private double value;
	private String name,
				   code,
				   description,
				   category,
				   company;	
	
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
	
}
