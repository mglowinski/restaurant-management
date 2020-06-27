package com.mglowinski.restaurants.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToMany(mappedBy = "menu")
	private List<StandardProduct> standardProducts;

	@OneToOne(mappedBy = "menu")
	private Restaurant restaurant;
}
