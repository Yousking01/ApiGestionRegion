package com.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.model.Pays;
import com.gestion.repository.PaysRepository;


import lombok.Getter;
import lombok.Setter;
@Service
@Getter
@Setter
public class PaysServiceImpl implements PaysService {

	@Autowired
	PaysRepository paysrepository;
	@Override
	public Pays Ajouter(Pays pays) {
		// TODO Auto-generated method stub
		System.out.println(pays.getNom());
		return paysrepository.save(pays);
	}

	@Override
	public String Supprimer(Long id) {
		this.paysrepository.deleteById(id);
		return "Supprimer Avec Succes";
	}

	@Override
	public Pays Modifier(Pays pays, Long id) {
		
		return paysrepository.findById(id).map(
                p->{
                  
                    return paysrepository.save(p);

                }
        ).orElseThrow(()-> new RuntimeException("Region non trouvé"));
	}

	@Override
	public List<Pays> lister() {
		// TODO Auto-generated method stub
		return this.paysrepository.findAll();
	}

}
