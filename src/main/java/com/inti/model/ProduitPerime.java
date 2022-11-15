package com.inti.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "refProduit")
@Data @AllArgsConstructor @NoArgsConstructor
public class ProduitPerime extends Produit{

	private boolean isPerime;
}
