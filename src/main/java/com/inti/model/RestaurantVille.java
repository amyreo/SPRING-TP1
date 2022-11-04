package com.inti.model;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Table
@Data
public class RestaurantVille extends Restaurant{
	

	private double taxe;
	
	public RestaurantVille(int numero, String numTel, List<Produit> listeProduit, Entreprise entreprise) {
		super(numero, numTel, listeProduit, entreprise);
	}

	public RestaurantVille(int numero, String numTel, List<Produit> listeProduit, double taxe, Entreprise entreprise) {
		super(numero, numTel, listeProduit, entreprise);
		this.taxe = taxe;
	}
	
	

	
	
	@Override
	public String toString() {
		return "RestaurantVille [taxe=" + taxe + ", numero=" + numero + ", numTel=" + numTel + "]";
	}



	

	

}
