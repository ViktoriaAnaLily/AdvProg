package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FridayOpen;

@Repository
public interface FridayOpenRepository extends JpaRepository<FridayOpen, Long>{
	
	public List<FridayOpen> findAll();

}
