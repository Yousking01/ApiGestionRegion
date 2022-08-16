package com.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.model.Pays;

//Annotation pour spécifier qu'il s'agit d'un service
@Service
public interface PaysService {
	//Déclarations des différentes méthodes propres à ce service
	Pays Ajouter(Pays pays);
	String Supprimer(Long id);
	Pays Modifier(Pays pays, Long id);
	List<Pays> lister();

}
