package br.edu.infnet.AppOrderProduct.model.domain;

import java.time.LocalDate;

public class Game extends Product{
	
	private boolean preOrder;//if true, the user can buy the game before the release date
	private LocalDate releaseDate;//specify the date which the game released/will release
	
	@Override
	public String toString() {
		return super.toString() + ";isPreOrder:" + isPreOrder() +
								  ";releaseDate:" + getReleaseDate();
								  
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public boolean isPreOrder() {
		return preOrder;
	}
	public void setPreOrder(boolean preOrder) {
		this.preOrder = preOrder;
	}
	
	
}
