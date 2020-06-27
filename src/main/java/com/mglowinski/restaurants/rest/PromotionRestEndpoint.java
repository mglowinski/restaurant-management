package com.mglowinski.restaurants.rest;

import com.mglowinski.restaurants.model.dto.PromotionCreateDto;
import com.mglowinski.restaurants.model.dto.PromotionDto;
import com.mglowinski.restaurants.service.promotion.PromotionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants/{restaurantId}/promotions")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class PromotionRestEndpoint {

	private final PromotionService promotionService;

	@PostMapping
	public ResponseEntity<PromotionDto> createPromotion(@PathVariable Integer restaurantId, @RequestBody PromotionCreateDto promotionCreateDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(promotionService.createPromotion(restaurantId, promotionCreateDto));
	}

	@GetMapping
	public ResponseEntity<List<PromotionDto>> getPromotions(@PathVariable Integer restaurantId) {
		return ResponseEntity.status(HttpStatus.OK).body(promotionService.getPromotions(restaurantId));
	}

	@PutMapping("/{promotionId}/notify")
	public ResponseEntity<Void> notifyClients(@PathVariable Integer restaurantId, @PathVariable Integer promotionId) {
		promotionService.notifyClients(restaurantId, promotionId);
		return ResponseEntity.noContent().build();
	}

}
