package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BusinessMap;

@Repository
public interface BusinessMapRepository extends JpaRepository<BusinessMap, Long> {
	List<BusinessMap> findAll();
	
	@Query(value = "SELECT * FROM mapmap m where m.state = ?1", nativeQuery = true)
	public List<BusinessMap> findByState(String state);
}
