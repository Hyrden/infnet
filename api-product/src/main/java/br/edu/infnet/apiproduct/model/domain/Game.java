package br.edu.infnet.apiproduct.model.domain;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tgame")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Game extends Product{
	
	private boolean preOrder;//if true, the user can buy the game before the release date
	private String releaseDate;//specify the date which the game released/will release
	public Game() {}
	@Override
	public String toString() {
		return super.toString() + ";isPreOrder:" + isPreOrder() +
								  ";releaseDate:" + getReleaseDate();
								  
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public boolean isPreOrder() {
		return preOrder;
	}
	public void setPreOrder(boolean preOrder) {
		this.preOrder = preOrder;
	}
	
	
}
