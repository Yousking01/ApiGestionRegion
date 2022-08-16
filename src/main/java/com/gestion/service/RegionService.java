package com.gestion.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.gestion.model.Regions;

//Annotation pour spécifier au programme que c'est un service
@Service
public interface RegionService {
    //Déclarations des différentes méthodes propres à ce service
    Regions Ajouter(Regions region);
    String Supprimer(Long id);
    Regions Modifier(Regions region, Long id);
    List<Regions> lister();




}