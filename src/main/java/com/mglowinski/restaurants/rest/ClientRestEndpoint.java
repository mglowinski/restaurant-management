package com.mglowinski.restaurants.rest;

import com.mglowinski.restaurants.model.dto.ClientCreateDto;
import com.mglowinski.restaurants.model.dto.ClientDto;
import com.mglowinski.restaurants.model.dto.PointsForClientDto;
import com.mglowinski.restaurants.service.client.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurants/{restaurantId}/clients")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ClientRestEndpoint {

	private final ClientService clientService;

	@PostMapping
	public ResponseEntity<Void> addClientToRestaurant(@PathVariable Integer restaurantId, @RequestBody ClientCreateDto clientCreateDto) {
		clientService.addClientToRestaurant(restaurantId, clientCreateDto);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/{clientId}/points")
	public ResponseEntity<ClientDto> addPointsForClient(@PathVariable Integer restaurantId,
			@PathVariable Integer clientId,
			@RequestBody PointsForClientDto pointsForClientDto) {
		return ResponseEntity.status(HttpStatus.OK).body(clientService.addPointsForClient(restaurantId, clientId, pointsForClientDto));
	}

}
