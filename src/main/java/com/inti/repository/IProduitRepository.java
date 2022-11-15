package com.inti.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.model.Produit;

@Repository
@Transactional
public interface IProduitRepository extends JpaRepository<Produit, Integer> {

}
