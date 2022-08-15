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

import com.gestion.model.Regions;
import com.gestion.service.RegionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/api/region")
@Api(value = "hello", description = "Cette API permettra de faire la gestion des régions de mon pays(Mali)")
public class RegionController {
    @Autowired
    RegionService regionservice;

    @ApiOperation(value = "Cette requette permet d'ajouter des regions")
    @PostMapping("/ajouter_region")
    public Regions Ajouter(@RequestBody Regions region) {
        return regionservice.Ajouter(region);
    }
    
    @ApiOperation(value = "Cette requette permet de suprimer des regions")
    @DeleteMapping("/Supprimer_region")
    public String Supprimer(Long id) {
         regionservice.Supprimer(id);
         return "Region supprimée avec succes";
    }

    @ApiOperation(value = "Cette requette permet d'afficher la liste des regions")
    @GetMapping("/liste_region")
    public List<Regions> lister() {
        return regionservice.lister();
    }
    
    @ApiOperation(value = "Cette requette permet de modifier les regions")
    @PutMapping("/modifier_region/{id}")
    public Regions Modifier(@RequestBody Regions region,@PathVariable Long id) {
        System.out.println("Modifier avec succès");
        return regionservice.Modifier(region, id);
    }
}