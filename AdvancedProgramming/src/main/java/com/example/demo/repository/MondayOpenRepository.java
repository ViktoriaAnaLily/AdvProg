package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MondayOpen;

@Repository
public interface MondayOpenRepository extends JpaRepository<MondayOpen, Long>{
	
	public List<MondayOpen> findAll();

}
