package com.inti.model.service;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.model.Restaurant;

@Repository
@Transactional
public interface IRestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
