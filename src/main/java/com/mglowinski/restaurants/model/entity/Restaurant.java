package com.mglowinski.restaurants.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	@OneToOne
	@JoinColumn
	private Address address;

	@OneToMany(mappedBy = "restaurant")
	private List<Promotion> promotions = new ArrayList<>();

	@OneToMany(mappedBy = "restaurant")
	private List<Client> clients = new ArrayList<>();

	@OneToOne
	@JoinColumn
	private Menu menu;

	@OneToMany(mappedBy = "restaurant")
	private List<Table> tables = new ArrayList<>();

	@ManyToOne
	@JoinColumn
	private Owner owner;
}
