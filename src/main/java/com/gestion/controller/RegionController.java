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

import com.gestion.model.Regions;
import com.gestion.service.RegionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


//Annotation qui fait comprendre au programme que c'est un controller
@RestController
//Adresse à laquelle il faut accèder pour faire les différentes opérations
@RequestMapping("/api/region")
//Annotation pour Swagger
@Api(value = "hello", description = "Cette API permet de faire la gestion des régions d'un pays (ici le Mali)")
public class RegionController {

    //Annotation pour l'injection de dépendance entre les beans du programme
    @Autowired
    RegionService regionservice;

    //Méthode pour ajouter une région
    @ApiOperation(value = "Cette requête permet d'ajouter une région")
    @PostMapping("/ajouter_region")
    public Object Ajouter(Regions region) {
        try {
            return regionservice.Ajouter(region);
        } catch (Exception e) {
            return errorMessage.ErrorResponse("Cette région existe déjà !", HttpStatus.OK,null);
        }
    }

    //Méthode pour supprimer une région
    @ApiOperation(value = "Cette requête permet de supprimer une région")
    @DeleteMapping("/Supprimer_region/{id}")
    public String Supprimer(@PathVariable long id) {
         regionservice.Supprimer(id);
         return "Region supprimée avec succes";
    }

    //Méthode pour afficher la liste des régions
    @ApiOperation(value = "Cette requête permet d'afficher la liste des regions")
    @GetMapping("/liste_region")
    public List<Regions> lister() {
        return regionservice.lister();
    }

    //Méthode pour afficher la liste des régions sans pays
    @ApiOperation(value = "Cette requête permet d'afficher la liste des regions sans pays")
    @GetMapping("/liste_region_sp")
    public Iterable<Object[]> listeSansPays() {
        return regionservice.listeSansPays();
    }

    //Méthode pour modifier une région
    @ApiOperation(value = "Cette requête permet de modifier une région")
    @PutMapping("/modifier_region/{id}")
    public Regions Modifier(Regions region,@PathVariable long id) {
        System.out.println("Modifier avec succès");
        return regionservice.Modifier(region, id);
    }
}