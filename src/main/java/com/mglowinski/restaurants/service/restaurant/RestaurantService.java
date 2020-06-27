package com.mglowinski.restaurants.service.restaurant;

import com.mglowinski.restaurants.model.dto.RestaurantCreateDto;
import com.mglowinski.restaurants.model.dto.RestaurantShortViewDto;
import com.mglowinski.restaurants.model.dto.RestaurantViewDto;

import java.util.List;

public interface RestaurantService {

	RestaurantShortViewDto createRestaurant(RestaurantCreateDto restaurantCreateDto);

	List<RestaurantViewDto> getRestaurants();
}
