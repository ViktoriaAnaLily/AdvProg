package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;
import com.example.demo.model.Business;
import com.example.demo.model.FridayUntil23;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Long> {

	List<Business> findAll();

	@Query(value = "SELECT b.business_id, b.name, b.friday FROM fridayuntil23 b", nativeQuery = true)
	List<FridayUntil23> findAllByQuery();
}
