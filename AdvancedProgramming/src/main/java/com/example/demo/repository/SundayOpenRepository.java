package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SundayOpen;

@Repository
public interface SundayOpenRepository extends JpaRepository<SundayOpen, Long>{
	
	public List<SundayOpen> findAll();

}
