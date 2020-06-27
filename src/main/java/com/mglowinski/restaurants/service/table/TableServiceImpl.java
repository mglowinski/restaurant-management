package com.mglowinski.restaurants.service.table;

import com.mglowinski.restaurants.model.dto.TableDto;
import com.mglowinski.restaurants.repository.TableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class TableServiceImpl implements TableService {

	private final TableRepository tableRepository;

	@Override
	public List<TableDto> getTables(Integer restaurantId) {
		return null;
	}

}
