package com.gestion.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.gestion.model.Regions;

@Service
public interface RegionService {
    Regions Ajouter(Regions region);
    String Supprimer(Long id);
    Regions Modifier(Regions region, Long id);
    List<Regions> lister();


}