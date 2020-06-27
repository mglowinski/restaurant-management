package com.mglowinski.restaurants.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Long externalId;
	private String username;
	private String password;
	private long points;

	@ManyToOne
	@JoinColumn
	private Restaurant restaurant;
}
