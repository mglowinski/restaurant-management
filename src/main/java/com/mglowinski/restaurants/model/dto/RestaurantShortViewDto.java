package com.mglowinski.restaurants.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantShortViewDto {

	private Integer id;
	private String name;
	private MenuDto menuDto;
	private List<TableDto> tableDtos;
}
