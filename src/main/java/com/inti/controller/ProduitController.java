package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.model.Produit;
import com.inti.repository.IProduitRepository;
import com.inti.service.ProduitServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("Produit")
public class ProduitController {
	
	@Autowired
	IProduitRepository ipr;

	@Autowired
	ProduitServiceImpl psi;

	@PostMapping("/saveProduit")
	public void saveProduit(@RequestBody Produit prod) {
		if (prod != null) {
			psi.saveProduit(prod);
		}
		log.error("L'objet Produit " + prod + "n'a pas pu être enregistré en BDD.");
	}

	@GetMapping("/getProduit/{id}")
	public Produit getProduit(@PathVariable int id) {
		return psi.getProduit(id);
	}

	@GetMapping("/getProduits")
	public List<Produit> getProduits() {
		return psi.getProduits();
	}

	@PostMapping("deleteProduit/{id}")
	public boolean deleteProduit(@PathVariable int id) {

		if (id > 0) {
			ipr.deleteById(id);
			return true;
		}
		return false;
	}
	
	

}
