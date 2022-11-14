package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.model.Produit;
import com.inti.model.Restaurant;
import com.inti.model.service.IRestaurantRepository;
import com.inti.repository.IProduitRepository;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/Restaurant")
@Slf4j
public class RestaurantController {

	@Autowired
	IRestaurantRepository irr;

	@Autowired
	IProduitRepository ipr;

	@GetMapping("/listeRestaurant")
	public List<Restaurant> getRestaurants() {
		return irr.findAll();
	}

	@PostMapping("/saveRestaurant")
	public boolean saveRestaurant(@RequestBody Restaurant r) {
		if (r.getNumero() > 0) {
			log.info("Le restaurant a été enregisté");
			irr.save(r);
			return true;
		}
		return false;
	}

	@GetMapping("/getRestaurant/{numero}")
	public Restaurant getRestaurant(@PathVariable int numero) {
		try {
			irr.findById(numero).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@DeleteMapping("/deleteRestaurant/{numero}")
	public boolean deleteRestaurant(@PathVariable int numero) {
		if (numero != 0) {
			irr.deleteById(numero);
			return true;
		}
		return false;
	}

	@PutMapping("/updateRestaurant/{numero}")
	public Restaurant updateRestaurant(@RequestBody Restaurant nouveauRestaurant, @PathVariable int numero) {
		return irr.findById(numero).map(Restaurant -> {
			Restaurant.setNumTel(nouveauRestaurant.getNumTel());
			return irr.save(Restaurant);
		}).orElseGet(() -> {
			return irr.save(nouveauRestaurant);
		});

	}

	@PostMapping("ajoutProduit/{idR}")
	public boolean associerProduitsToRestaurant(@PathVariable int idR, @RequestBody Produit prod) {

		try {
			Restaurant restaurant = irr.findById(idR).get();
			List<Produit> listeProduit = restaurant.getListeProduit();
			listeProduit.add(prod);
			log.debug("On a ajouté le prod à la liste");

			restaurant.setListeProduit(listeProduit);
			irr.save(restaurant);
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

}
