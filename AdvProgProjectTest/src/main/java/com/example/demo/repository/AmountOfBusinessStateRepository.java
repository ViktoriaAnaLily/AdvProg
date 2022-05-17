package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AmountOfBusinessState;

@Repository
public interface AmountOfBusinessStateRepository extends JpaRepository<AmountOfBusinessState, Long> {
	List<AmountOfBusinessState> findAll();

}
