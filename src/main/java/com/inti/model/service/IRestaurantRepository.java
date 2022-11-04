package com.inti.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inti.model.Produit;
import com.inti.model.Restaurant;

@Repository
@Transactional
public interface IRestaurantRepository extends JpaRepository<Restaurant, Integer> {
	
//	@Query(value = "update restaurant set ")
//	void ajoutProduitDansRestoById(@Param("produit") Produit prod, @Param("idResto") int id);
	
	boolean ajoutProduitDansRestoById();

}




//@PostMapping("updateAdresseAndCp")
//public void updateMagasinByAdresseAndCp(@RequestParam(name = "adresse") String adresse, @RequestParam(name = "cp") String cp, @RequestParam(name = "id") int id) {
//	imr.updateAdresseAndCpById(adresse, cp, id);
//}


// 	@PostMapping("associerProduits/{id}")
//public boolean associerProduitsToMagasin(@PathVariable int id) {
//
//	try {
//		Magasin magasin = imr.findById(id).get();
//		List<Produit> listeProduit = ipr.findAll();
//		magasin.setLProduit(listeProduit);
//		imr.save(magasin);
//		return true;
//
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	return false;
//
//}