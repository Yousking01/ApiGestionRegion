package com.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.gestion.model.Population;
import com.gestion.repository.PopulationRepository;

import lombok.Getter;
import lombok.Setter;



@Service
@Getter
@Setter
public class PopulationServiceImpl implements PopulationService {
	 
	@Autowired
	PopulationRepository populationrepository;

	@Override
	public Population Ajouter(@RequestBody Population population) {
		// TODO Auto-generated method stub
		return populationrepository.save(population);
	}

	@Override
	public String Supprimer(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Population Modifier(Population population, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Population> lister() {
		// TODO Auto-generated method stub
		return null;
	}

}
