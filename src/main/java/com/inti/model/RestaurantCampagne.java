package com.inti.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class RestaurantCampagne extends Restaurant{
	private boolean circulationEtRondPoint;

	public RestaurantCampagne(int numero, String numTel, List<Produit> listeProduit) {
		super(numero, numTel, listeProduit);
	}

	public RestaurantCampagne(int numero, String numTel, List<Produit> listeProduit, boolean circulationEtRondPoint) {
		super(numero, numTel, listeProduit);
		this.circulationEtRondPoint = circulationEtRondPoint;
	}

	
	

	@Override
	public String toString() {
		return "RestaurantCampagne [circulationEtRondPoint=" + circulationEtRondPoint + ", numero=" + numero
				+ ", numTel=" + numTel + "]";
	}





	



	



}
