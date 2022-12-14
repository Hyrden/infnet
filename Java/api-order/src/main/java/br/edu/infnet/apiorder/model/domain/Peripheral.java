package br.edu.infnet.apiorder.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonTypeName;
@Entity
@Table (name = "tperipheral")
public class Peripheral extends Product{
	
	private String firmware;
	private int warrant;//Specify the warrant given by the manufacturer by months. Ex: a year: 12
	private float weight;
	public Peripheral() {}
	@Override
	public String toString() {
		return super.toString() + ";firmware:" + getFirmware() + 
								  ";warrant:" + getWarrant() +
								  ";weight:" + getWeight();
								  
	}
	
	public String getFirmware() {
		return firmware;
	}
	public void setFirmware(String firmware) {
		this.firmware = firmware;
	}
	public int getWarrant() {
		return warrant;
	}
	public void setWarrant(int warrant) {
		this.warrant = warrant;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}	
}
