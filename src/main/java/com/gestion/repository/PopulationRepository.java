package com.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.model.Population;

public interface PopulationRepository  extends JpaRepository<Population, Long>{

}
