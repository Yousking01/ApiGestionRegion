package com.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.model.Population;

@Service
public interface PopulationService {

	
	Population Ajouter(Population population);
	String Supprimer(Long id);
	Population Modifier(Population population, Long id);
	List<Population> lister();
}
