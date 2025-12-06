package com.elitech.model;

import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User extends BaseEntity {

	
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false,unique = true)
	private String email;
	@Column(nullable = false)
	private String password;
	@Column(columnDefinition = "varchar(20) default 'utilisateur' ")
	private String role;
	@OneToOne(mappedBy = "user")
	private Profile profile;
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private Set<Formation> formations;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
}
