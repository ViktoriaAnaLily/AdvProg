package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SaturdayOpen;

@Repository
public interface SaturdayOpenRepository extends JpaRepository<SaturdayOpen, Long>{
	
	public List<SaturdayOpen> findAll();

}

