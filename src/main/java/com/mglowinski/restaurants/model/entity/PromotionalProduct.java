package com.mglowinski.restaurants.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PromotionalProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	private BigDecimal oldPrice;
	private BigDecimal newPrice;

	@ManyToMany(mappedBy = "promotionalProducts")
	private List<Promotion> promotions = new ArrayList<>();
}
