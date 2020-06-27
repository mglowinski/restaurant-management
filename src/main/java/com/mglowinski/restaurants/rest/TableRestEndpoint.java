package com.mglowinski.restaurants.rest;

import com.mglowinski.restaurants.model.dto.TableDto;
import com.mglowinski.restaurants.service.table.TableService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurants/{restaurantId}/tables")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class TableRestEndpoint {

	private final TableService tableService;

	@GetMapping
	public ResponseEntity<List<TableDto>> getTables(@PathVariable Integer restaurantId) {
		return ResponseEntity.status(HttpStatus.OK).body(tableService.getTables(restaurantId));
	}

}
