package com.mglowinski.restaurants.rest;

import com.mglowinski.restaurants.model.dto.RestaurantCreateDto;
import com.mglowinski.restaurants.model.dto.RestaurantShortViewDto;
import com.mglowinski.restaurants.model.dto.RestaurantViewDto;
import com.mglowinski.restaurants.service.restaurant.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class RestaurantRestEndpoint {

	private final RestaurantService restaurantService;

	@PostMapping
	public ResponseEntity<RestaurantShortViewDto> createRestaurant(@RequestBody RestaurantCreateDto restaurantCreateDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(restaurantService.createRestaurant(restaurantCreateDto));
	}

	@GetMapping
	public ResponseEntity<List<RestaurantViewDto>> getRestaurants() {
		return ResponseEntity.status(HttpStatus.OK).body(restaurantService.getRestaurants());
	}

}
