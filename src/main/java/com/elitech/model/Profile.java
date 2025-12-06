package com.elitech.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
	@Id
	private long id;
	
	private String photo;
	private String bio;
	private String telephone;
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "id_user")
	private User user;

}
