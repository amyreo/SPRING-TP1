package com.inti.model;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Table
@Data
public class RestaurantVille extends Restaurant{
	

	private double taxe;
	
	public RestaurantVille(int numero, String numTel) {
		super(numero, numTel);
	}
	

	public RestaurantVille(int numero, String numTel, double taxe) {
		super(numero, numTel);
		this.taxe = taxe;
	}

	@Override
	public String toString() {
		return "RestaurantVille [taxe=" + taxe + ", numero=" + numero + ", numTel=" + numTel + "]";
	}


}
