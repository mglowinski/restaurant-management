package com.mglowinski.restaurants.service.client;

import com.mglowinski.restaurants.model.dto.ClientCreateDto;
import com.mglowinski.restaurants.model.dto.ClientDto;
import com.mglowinski.restaurants.model.dto.PointsForClientDto;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

	@Override
	public void addClientToRestaurant(Integer restaurantId, ClientCreateDto clientCreateDto) {

	}

	@Override
	public ClientDto addPointsForClient(Integer restaurantId, Integer clientId, PointsForClientDto pointsForClientDto) {
		return null;
	}

}
