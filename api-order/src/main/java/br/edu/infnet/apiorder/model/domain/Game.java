package br.edu.infnet.apiorder.model.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@Table (name = "tgame")
public class Game extends Product{
	
	private boolean preOrder;//if true, the user can buy the game before the release date
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate releaseDate;//specify the date which the game released/will release
	@JsonCreator
    public Game(@JsonProperty("preOrder") boolean preOrder, @JsonProperty("releaseDate") LocalDate releaseDate){ 
		this.setPreOrder(preOrder);
		this.setReleaseDate(releaseDate);
	}
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
