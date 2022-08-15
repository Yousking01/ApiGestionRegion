package com.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.model.Regions;
import com.gestion.repository.RegionRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@NoArgsConstructor
@AllArgsConstructor
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
       this.regionrepository.deleteById(id);
       return "Region supprimer avec succès";
    }

    @Override
    public Regions Modifier(Regions region, Long id) {
        // TODO Auto-generated method stub
    	return regionrepository.findById(id).map(
                r->{
                  r.setCodeRegion(region.getCodeRegion());
                  r.setDomaine_activite(region.getDomaine_activite());
                  r.setLangue_majoritaire(region.getLangue_majoritaire());
                  r.setNom(region.getNom());
                  r.setSuperficie(region.getSuperficie());
                    return regionrepository.save(r);

                }
        ).orElseThrow(()-> new RuntimeException("Population non trouvé"));
    }

    @Override
    public List<Regions> lister() {
        // TODO Auto-generated method stub
        return this.regionrepository.findAll();
    }

}