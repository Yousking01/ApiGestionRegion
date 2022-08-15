package com.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.gestion.model.Population;
import com.gestion.repository.PopulationRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Service
@NoArgsConstructor
@AllArgsConstructor
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
		this.populationrepository.deleteById(id);
		return "Population supprimer avec succès";
	}

	@Override
	public Population Modifier(Population population, Long id) {
		// TODO Auto-generated method stub
		return populationrepository.findById(id).map(
                p->{
                  p.setAnnee(population.getAnnee());
                  p.setNb_population(population.getNb_population());
                    return populationrepository.save(p);

                }
        ).orElseThrow(()-> new RuntimeException("Population non trouvé"));
	}

	@Override
	public List<Population> lister() {
		// TODO Auto-generated method stub
		return this.populationrepository.findAll();
	}

}
