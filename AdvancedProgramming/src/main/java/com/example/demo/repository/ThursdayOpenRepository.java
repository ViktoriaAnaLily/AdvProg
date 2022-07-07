package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ThursdayOpen;

@Repository
public interface ThursdayOpenRepository extends JpaRepository<ThursdayOpen, Long>{
	
	public List<ThursdayOpen> findAll();

}
