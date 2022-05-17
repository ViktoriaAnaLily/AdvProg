package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FridayUntil23;

@Repository
public interface FridayUntil23Repository extends JpaRepository<FridayUntil23, Long>{
	List<FridayUntil23> findAll();

}
