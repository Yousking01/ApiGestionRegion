package com.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.model.Regions;
import org.springframework.data.jpa.repository.Query;

//Héritage depuis JpaRepository pour utiliser ses différentes méthodes
public interface RegionRepository extends JpaRepository<Regions, Long> {

    @Query(value = "SELECT code_region, nom, domaine_activite, superficie FROM region", nativeQuery = true)
    Iterable<Object[]> listeSansPays();

}
