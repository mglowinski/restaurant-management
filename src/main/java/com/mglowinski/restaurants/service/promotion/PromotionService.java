package com.mglowinski.restaurants.service.promotion;

import com.mglowinski.restaurants.model.dto.PromotionCreateDto;
import com.mglowinski.restaurants.model.dto.PromotionDto;

import java.util.List;

public interface PromotionService {

	void notifyClients(Integer restaurantId, Integer promotionId);

	PromotionDto createPromotion(Integer restaurantId, PromotionCreateDto promotionCreateDto);

	List<PromotionDto> getPromotions(Integer restaurantId);
}
