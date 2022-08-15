package com.gestion.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "pays")
public class Pays {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Pays_id")
    private Long id;

    @Column(name = "nom")
    private String nom;

    public Pays() {}
	public Pays(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

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
