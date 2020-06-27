package com.mglowinski.restaurants.service.restaurant;

import com.mglowinski.restaurants.config.OrikaMapper;
import com.mglowinski.restaurants.model.dto.RestaurantCreateDto;
import com.mglowinski.restaurants.model.dto.RestaurantShortViewDto;
import com.mglowinski.restaurants.model.dto.RestaurantViewDto;
import com.mglowinski.restaurants.model.entity.Restaurant;
import com.mglowinski.restaurants.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class RestaurantServiceImpl implements RestaurantService {

	private final OrikaMapper orikaMapper;
	private final RestaurantRepository restaurantRepository;

	@Override
	public RestaurantShortViewDto createRestaurant(RestaurantCreateDto restaurantCreateDto) {
		Restaurant restaurant = orikaMapper.map(restaurantCreateDto, Restaurant.class);
		Restaurant savedRestaurant = restaurantRepository.save(restaurant);
		return orikaMapper.map(savedRestaurant, RestaurantShortViewDto.class);
	}

	@Override
	public List<RestaurantViewDto> getRestaurants() {
		List<Restaurant> restaurants = restaurantRepository.findAll();
		return orikaMapper.mapAsList(restaurants, RestaurantViewDto.class);
	}

}
