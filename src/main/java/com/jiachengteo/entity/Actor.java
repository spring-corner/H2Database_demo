package com.jiachengteo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "actor_title")
@Setter
@Getter
@ToString
public class Actor {
	@Id
	private Integer id;
	private String name;
}
