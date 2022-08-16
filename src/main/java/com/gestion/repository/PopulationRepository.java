package com.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.model.Population;

//Héritage depuis JpaRepository pour utiliser ses différentes méthodes
public interface PopulationRepository  extends JpaRepository<Population, Long>{

}
