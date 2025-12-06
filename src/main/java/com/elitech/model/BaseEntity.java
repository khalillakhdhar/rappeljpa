package com.elitech.model;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDateTime createdAt,updatedAt;
	@PrePersist
	public void Oncreate()
	{
		
		this.createdAt=this.updatedAt=LocalDateTime.now();
		}
	@PreUpdate
	public void onUpdate()
	{
		this.updatedAt=LocalDateTime.now();
		
	}
	
	
}
