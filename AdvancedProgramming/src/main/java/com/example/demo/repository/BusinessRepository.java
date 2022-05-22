package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Business;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Long> {

	@Query(value = "SELECT * FROM businessdatei b where b.stars like %?1", nativeQuery = true)
	public List<Business> findByStars(String stars);
	
	
	

}