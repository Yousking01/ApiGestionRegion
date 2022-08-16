package com.gestion.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//Annotation qui fait comprendre au programme que c'est une entité de la BDD
@Entity
//Annotation pour nommer la table dans la BDDr
@Table(name = "pays")
public class Pays {

	//Clé primaire de cette table
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	//Annotation pour spécifier le nom de la colonne dans la BDDr reliée
    @Column(name = "Pays_id")
    private Long id;

    @Column(name = "nom")
    private String nom;

	//Déclaration d'un constructeur vide
    public Pays() {}

	//Utilisation du constructeur
	public Pays(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	//Paire de Getters/Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
    
    
}
