package com.inti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
	@Id
	protected int numero;
	protected String numTel;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Produits_Restaurant", joinColumns = @JoinColumn(name = "numRestaurant"), inverseJoinColumns = @JoinColumn(name = "idProduit"))
	protected List<Produit> listeProduit;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idEntreprise")
	protected Entreprise entreprise;

}
