package com.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.model.Population;

//Annotation pour spécifier qu'il s'agit d'un service
@Service
public interface PopulationService {
	//Déclarations des différentes méthodes propres à ce service
	Population Ajouter(Population population);
	String Supprimer(Long id);
	Population Modifier(Population population, Long id);
	List<Population> lister();
}
