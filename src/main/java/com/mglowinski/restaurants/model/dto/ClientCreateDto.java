package com.mglowinski.restaurants.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientCreateDto {

	private Long externalId;
	private String username;
	private String password;
}
