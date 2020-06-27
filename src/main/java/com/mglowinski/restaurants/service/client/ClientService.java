package com.mglowinski.restaurants.service.client;

import com.mglowinski.restaurants.model.dto.ClientCreateDto;
import com.mglowinski.restaurants.model.dto.ClientDto;
import com.mglowinski.restaurants.model.dto.PointsForClientDto;

public interface ClientService {

	void addClientToRestaurant(Integer restaurantId, ClientCreateDto clientCreateDto);

	ClientDto addPointsForClient(Integer restaurantId, Integer clientId, PointsForClientDto pointsForClientDto);
}
