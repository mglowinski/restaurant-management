package com.mglowinski.restaurants.repository;

import com.mglowinski.restaurants.model.entity.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<Table, Integer> {
}
