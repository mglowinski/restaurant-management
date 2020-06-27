package com.mglowinski.restaurants.model.dto;

import com.mglowinski.restaurants.model.entity.PromotionStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PromotionCreateDto {

	private PromotionStatus promotionStatus;
	private List<PromotionalProductDto> promotionalProductDtos;
}
