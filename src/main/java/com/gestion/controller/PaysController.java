package com.gestion.controller;

import java.util.List;

import com.gestion.others.errorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.gestion.model.Pays;
import com.gestion.service.PaysService;


//Annotation qui fait comprendre au programme que c'est un controller
@RestController
//Adresse à laquelle il faut accèder pour faire les différentes opérations
@RequestMapping("/api/pays")
//Annotation pour Swagger
@Api(value = "hello", description = "Cette API permet de faire la gestion des régions d'un pays (ici le Mali)")
public class PaysController {
	//Annotation pour l'injection de dépendance entre les beans du programmes
	@Autowired
	PaysService paysservice;

	//Méthode pour ajouter un pays
	@ApiOperation(value = "Cette requête permet d'ajouter un pays")
	@PostMapping("/ajouter_pays")
	public Object Ajouter(@RequestBody Pays pays) {
		try{
			return paysservice.Ajouter(pays);
		} catch(Exception e){
			return errorMessage.ErrorResponse("Ce pays existe déjà !", HttpStatus.OK,null);
		}

	}

	//Méthode pour supprimer un pays
	@ApiOperation(value = "Cette requête permet de supprimer un pays")
	@DeleteMapping("/Supprimer_pays/{id}")
	public String Supprimer(@PathVariable long id) {
		 	paysservice.Supprimer(id);
		 return "Supprimé avec succes";
	}

	//Méthode pour afficher la liste des pays
	@ApiOperation(value = "Cette requête permet d'afficher la liste des pays")
	@GetMapping("/liste_pays")
	public List<Pays> lister() {
		return paysservice.lister();
	}

	//Méthode pour modifier un pays
	@ApiOperation(value = "Cette requête permet de modifier un pays")
	@PutMapping("/modifier_pays/{id}")
	public Pays Modifier(@RequestBody Pays pays,@PathVariable long id) {
		System.out.println("Modifier avec succès");
		return paysservice.Modifier(pays, id);
	}
}
