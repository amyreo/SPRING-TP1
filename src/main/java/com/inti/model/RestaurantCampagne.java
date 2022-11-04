package com.inti.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class RestaurantCampagne extends Restaurant{
	private boolean circulationEtRondPoint;

	public RestaurantCampagne(int numero, int numTel) {
		super(numero, numTel);
	}

	public RestaurantCampagne(boolean circulationEtRondPoint) {
		super();
		this.circulationEtRondPoint = circulationEtRondPoint;
	}

	@Override
	public String toString() {
		return "RestaurantCampagne [circulationEtRondPoint=" + circulationEtRondPoint + ", numero=" + numero
				+ ", numTel=" + numTel + "]";
	}

}
