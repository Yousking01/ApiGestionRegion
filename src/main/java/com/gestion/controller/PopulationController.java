package com.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.model.Population;
import com.gestion.service.PopulationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/api/population")
@Api(value = "hello", description = "Cette API permettra de faire la gestion des régions de mon pays(Mali)")
public class PopulationController {

	@Autowired
	PopulationService populationservice;
	
	@ApiOperation(value = "Cette requette permet d'ajouter des populations")
	@PostMapping("/ajouter_population")
	public Population Ajouter(@RequestBody Population population ) {
		return populationservice.Ajouter(population);
	}
	
	@ApiOperation(value = "Cette requette permet de suprimer des populations")
	@DeleteMapping("/Supprimer_population")
	public String Supprimer(Long id) {
		 	populationservice.Supprimer(id);
		 return "Supprimer avec succes";
	}
	
	@ApiOperation(value = "Cette requette permet d'afficher la liste des populations")
	@GetMapping("/liste_population")
	public List<Population> lister() {
		return populationservice.lister();
	}
	
	@ApiOperation(value = "Cette requette permet de modifier des populations")
	@PutMapping("/modifier_population/{id}")
	public Population Modifier(@RequestBody Population population,@PathVariable Long id) {
		System.out.println("Modifier avec succès");
		return populationservice.Modifier(population, id);
	}
}
