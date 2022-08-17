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


//Annotation qui fait comprendre au programme que c'est un controller
@RestController
//Adresse à laquelle il faut accèder pour faire les différentes opérations
@RequestMapping("/api/population")
//Annotation pour Swagger
@Api(value = "hello", description = "Cette API permet de faire la gestion des régions d'un pays (ici le Mali)")
public class PopulationController {

	//Annotation pour l'injection de dépendance entre les beans du programmes
	@Autowired
	PopulationService populationservice;

	//Méthode pour ajouter une population
	@ApiOperation(value = "Cette requête permet d'ajouter une population")
	@PostMapping("/ajouter_population")
	public Population Ajouter(Population population ) {
		return populationservice.Ajouter(population);
	}

	//Méthode pour supprimer une population
	@ApiOperation(value = "Cette requête permet de suprimer une population")
	@DeleteMapping("/Supprimer_population/{id}")
	public String Supprimer(@PathVariable long id) {
		 	populationservice.Supprimer(id);
		 return "Supprimé avec succes";
	}

	//Méthode pour afficher la liste des populations
	@ApiOperation(value = "Cette requête permet d'afficher la liste des populations")
	@GetMapping("/liste_population")
	public List<Population> lister() {
		return populationservice.lister();
	}


	//Méthode pour modifier une population
	@ApiOperation(value = "Cette requête permet de modifier des populations")
	@PutMapping("/modifier_population/{id}")
	public Population Modifier(Population population,@PathVariable long id) {
		System.out.println("Modifier avec succès");
		return populationservice.Modifier(population, id);
	}
}
