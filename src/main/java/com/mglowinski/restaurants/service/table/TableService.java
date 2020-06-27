package com.mglowinski.restaurants.service.table;

import com.mglowinski.restaurants.model.dto.TableDto;

import java.util.List;

public interface TableService {

	List<TableDto> getTables(Integer restaurantId);
}
