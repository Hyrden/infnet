package br.edu.infnet.apiproduct.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "tsoftware")
public class Software extends Product{
	
	private String license;
	private int maxPCAllowed,//Specify how many PCs can run the software simultaneously
				currentInstallations;//Specify the current number of PCs running the software
	
	@Override
	public String toString() {
		return super.toString() + ";license:" + getLicense() + 
								  ";maxPCAllowed:" + getMaxPCAllowed() +
								  ";currentInstallations:" + getCurrentInstallations();
								  
	}
	
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public int getMaxPCAllowed() {
		return maxPCAllowed;
	}
	public void setMaxPCAllowed(int maxPCAllowed) {
		this.maxPCAllowed = maxPCAllowed;
	}
	public int getCurrentInstallations() {
		return currentInstallations;
	}
	public void setCurrentInstallations(int currentInstallations) {
		this.currentInstallations = currentInstallations;
	}
	
}
