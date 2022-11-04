package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.model.Entreprise;
import com.inti.repository.IEntrepriseRepository;
import com.inti.service.EntrepriseServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("Entreprise")
public class EntrepriseController {

	@Autowired
	IEntrepriseRepository ier;

	@Autowired
	EntrepriseServiceImpl esi;

	@PostMapping("/saveEntreprise")
	public void saveEntreprise(@RequestBody Entreprise ent) {
		if (ent != null) {
			esi.saveEntreprise(ent);
		}
		log.error("L'objet Entreprise " + ent + "n'a pas pu être enregistré en BDD.");
	}

	@GetMapping("/getEntreprise/{id}")
	public Entreprise getEntreprise(@PathVariable int id) {
		return esi.getEntreprise(id);
	}

	@GetMapping("/getEntreprises")
	public List<Entreprise> getEntreprises() {
		return esi.getEntreprises();
	}

	@PostMapping("deleteEntreprise/{id}")
	public boolean deleteEntreprise(@PathVariable int id) {

		if (id > 0) {
			ier.deleteById(id);
			return true;
		}
		return false;
	}

}
