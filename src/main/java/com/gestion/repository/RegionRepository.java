package com.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.model.Regions;

public interface RegionRepository extends JpaRepository<Regions, Long> {

}
