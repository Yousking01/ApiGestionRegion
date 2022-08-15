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


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.gestion.model.Pays;
import com.gestion.service.PaysService;


@RestController
@RequestMapping("/api/pays")
@Api(value = "hello", description = "Cette API permettra de faire la gestion des régions de mon pays(Mali)")
public class PaysController {
	@Autowired
	PaysService paysservice;
	@ApiOperation(value = "Cette requette permet d'ajouter des pays")
	@PostMapping("/ajouter_pays")
	public Pays Ajouter(@RequestBody Pays pays) {
		return paysservice.Ajouter(pays);
	}
	@ApiOperation(value = "Cette requette permet de supprimer des pays")
	@DeleteMapping("/Supprimer_pays")
	public String Supprimer(Long id) {
		 	paysservice.Supprimer(id);
		 return "Supprimer avec succes";
	}
	@ApiOperation(value = "Cette requette permet d'afficher la liste des pays")
	@GetMapping("/liste_pays")
	public List<Pays> lister() {
		return paysservice.lister();
	}
	@ApiOperation(value = "Cette requette permet de modifier des pays")
	@PutMapping("/modifier_pays/{id}")
	public Pays Modifier(@RequestBody Pays pays,@PathVariable Long id) {
		System.out.println("Modifier avec succès");
		return paysservice.Modifier(pays, id);
	}
}
