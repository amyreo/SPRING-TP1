package com.inti.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.model.Entreprise;

@Repository
@Transactional
public interface IEntrepriseRepository extends JpaRepository<Entreprise, Integer> {

}