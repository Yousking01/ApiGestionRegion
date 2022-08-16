package com.gestion.model;

import javax.persistence.*;

//Annotation qui fait comprendre au programme que c'est une entité de la BDD
@Entity
//Annotation pour nommer la table dans la BDDr
@Table(name = "region")
public class Regions {

	//Clé primaire de cette table
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	//Annotation pour spécifier le nom de la colonne dans la BDDr reliée
    @Column(name = "Region_id")
    private Long id;
    @Column(name = "codeRegion")
    private String codeRegion;
    @Column(name = "nom")
    private String nom;
    @Column
    private String domaine_activite;
    @Column(name = "superficie")
    private int superficie;
    @Column(name = "langue_majoritaire")
    private String langue_majoritaire;
    
    
    //@JsonIgnore

	//Importation des clés étrangères
    @ManyToOne
	private Pays pays;
    
	@ManyToOne
	@JoinColumn(name = "population_id ")
	private Population population;

	//Déclaration d'un constructeur vide
    public Regions() {
	}

	//Utilisation du constructeur
	public Regions(Long id, String codeRegion, String nom, String domaine_activite, int superficie,
			String langue_majoritaire, Pays pays) {
		super();
		this.id = id;
		this.codeRegion = codeRegion;
		this.nom = nom;
		this.domaine_activite = domaine_activite;
		this.superficie = superficie;
		this.langue_majoritaire = langue_majoritaire;
	
	}

	//Paire de Getters/Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeRegion() {
		return codeRegion;
	}
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDomaine_activite() {
		return domaine_activite;
	}
	public void setDomaine_activite(String domaine_activite) {
		this.domaine_activite = domaine_activite;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public String getLangue_majoritaire() {
		return langue_majoritaire;
	}
	public void setLangue_majoritaire(String langue_majoritaire) {
		this.langue_majoritaire = langue_majoritaire;
	}
	public Pays getPays() {
		return pays;
	}
	public void setPays(Pays pays) {
		this.pays = pays;
		
	}
	public Population getPopulation() {
		return population;
	}
	public void setPopulation(Population population) {
		this.population = population;
	}

	
	
	
    
	
	

    
    
	
	
}