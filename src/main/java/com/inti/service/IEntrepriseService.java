package com.inti.service;

import java.util.List;

import com.inti.model.Entreprise;

public interface IEntrepriseService {
	
	public List<Entreprise> getEntreprises();

	public Entreprise getEntreprise(int id);

	public void saveEntreprise(Entreprise ent);

	public void deleteEntreprise(int id);

}
