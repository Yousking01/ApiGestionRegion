package com.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.model.Pays;

@Service
public interface PaysService {
	
	Pays Ajouter(Pays pays);
	String Supprimer(Long id);
	Pays Modifier(Pays pays, Long id);
	List<Pays> lister();

}
