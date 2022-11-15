package com.inti.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "Produit")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Produit {
	@Id
	@NonNull
	protected int id;
	protected String reference;
	protected String type;
	protected LocalDate dateFab;
	protected LocalDate dateExp;
	

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Produits_Restaurant", joinColumns = @JoinColumn(name = "idProduit"), inverseJoinColumns = @JoinColumn(name = "numRestaurant"))
	protected List<Restaurant> listeRestaurant;
}



