package com.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.model.Pays;

public interface PaysRepository extends JpaRepository<Pays, Long> {

}
