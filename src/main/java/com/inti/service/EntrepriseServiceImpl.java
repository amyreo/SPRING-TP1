package com.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Entreprise;
import com.inti.repository.IEntrepriseRepository;

@Service
public class EntrepriseServiceImpl implements IEntrepriseService {

	@Autowired
	IEntrepriseRepository ipr;

	@Override
	public List<Entreprise> getEntreprises() {
		List<Entreprise> lEntreprise = ipr.findAll();
		return lEntreprise;
	}

	@Override
	public Entreprise getEntreprise(int id) {
		return ipr.findById(id).get();
	}

	@Override
	public void saveEntreprise(Entreprise ent) {
		ipr.save(ent);

	}

	@Override
	public void deleteEntreprise(int id) {
		ipr.delete(ipr.findById(id).get());

	}

}
