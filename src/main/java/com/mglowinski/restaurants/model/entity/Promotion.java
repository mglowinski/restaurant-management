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
public class Promotion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn
	private Restaurant restaurant;

	@Enumerated(EnumType.STRING)
	private PromotionStatus promotionStatus;

	@ManyToMany
	@JoinTable(
			name = "promotion_promotionalproducts",
			joinColumns = @JoinColumn(name = "promotion_id"),
			inverseJoinColumns = @JoinColumn(name = "promotionalproduct_id")
	)
	private List<PromotionalProduct> promotionalProducts;
}
