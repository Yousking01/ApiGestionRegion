package com.gestion.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//Annotation qui fait comprendre au programme que c'est une entité de la BDD
@Entity
//Annotation pour nommer la table dans la BDDr
@Table(name = "population")

public class Population {

	//Clé primaire de cette table
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//Annotation pour spécifier le nom de la colonne dans la BDDr reliée
	@Column(name = "Population_id")
	private Long id;
	@Column(name = "Population")
	private Long nb_population;
	@Column(name = "annee")
	private Long annee;

	//Annotation pour exporter la clé dans Region
	@ManyToOne
	private Regions region;

	//Déclaration d'un constructeur vide
	public Population() {}

	//Utilisation du constructeur
	public Population(long id, long nb_population, long annee) {
		super();
		this.id = id;
		this.nb_population = nb_population;
		this.annee = annee;
	}

	//Paire de Getters/Setters
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