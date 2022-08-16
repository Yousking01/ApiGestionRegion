package com.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.model.Pays;

//Héritage depuis JpaRepository pour utiliser ses différentes méthodes
public interface PaysRepository extends JpaRepository<Pays, Long> {

}
