package com.mglowinski.restaurants.service.promotion;

import com.mglowinski.restaurants.model.dto.PromotionCreateDto;
import com.mglowinski.restaurants.model.dto.PromotionDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionServiceImpl implements PromotionService {

	@Override
	public PromotionDto createPromotion(Integer restaurantId, PromotionCreateDto promotionCreateDto) {
		return null;
	}

	@Override
	public List<PromotionDto> getPromotions(Integer restaurantId) {
		return null;
	}

	@Override
	public void notifyClients(Integer restaurantId, Integer promotionId) {

	}

}
