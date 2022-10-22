package br.edu.infnet.AppOrderProduct.model.domain;

import java.util.Date;

public class Software extends Product{
	
	private String license;
	private int maxPCAllowed,//Specify how many PCs can run the software simultaneously
				currentInstallations;//Specify the current number of PCs running the software
	
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
