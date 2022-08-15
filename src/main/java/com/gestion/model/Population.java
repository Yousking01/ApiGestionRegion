package com.gestion.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;










@Entity
@Table(name = "population")


public class Population {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Population_id")
	private Long id;
	@Column(name = "Population")
	private Long nb_population;
	@Column(name = "annee")
	private Long annee;
	
	@ManyToOne
	private Regions region;
	
	public Population(Long id, Long nb_population, Long annee) {
		super();
		this.id = id;
		this.nb_population = nb_population;
		this.annee = annee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNb_population() {
		return nb_population;
	}

	public void setNb_population(Long nb_population) {
		this.nb_population = nb_population;
	}

	public Long getAnnee() {
		return annee;
	}

	public void setAnnee(Long annee) {
		this.annee = annee;
	}
	
	
	
}