package com.elitech.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;

@Entity

public class Formation extends BaseEntity{
	
@Column(nullable = false)
@NotBlank
private String titre;
@Column(length = 100)
private String description;
@Column(unique = true,length = 30)
private String formateur;
@Column(nullable = true)
private int duree;
@ManyToMany(mappedBy = "formations")
private Set<User> users;



public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getFormateur() {
	return formateur;
}
public void setFormateur(String formateur) {
	this.formateur = formateur;
}
public int getDuree() {
	return duree;
}
public void setDuree(int duree) {
	this.duree = duree;
}

}
