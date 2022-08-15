package com.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.model.Regions;
import com.gestion.repository.RegionRepository;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    RegionRepository regionrepository;
    
    @Override
    public Regions Ajouter(Regions region) {
        // TODO Auto-generated method stub
        return regionrepository.save(region);
    }

    @Override
    public String Supprimer(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Regions Modifier(Regions region, Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Regions> lister() {
        // TODO Auto-generated method stub
        return null;
    }

}