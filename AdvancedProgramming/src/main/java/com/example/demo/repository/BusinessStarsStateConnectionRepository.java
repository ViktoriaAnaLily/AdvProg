package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.demo.model.BusinessStarsStateConnection;

@Repository
public interface BusinessStarsStateConnectionRepository extends JpaRepository<BusinessStarsStateConnection, Long> {

	@Query(value = "SELECT * FROM statestarsconnection b where b.state = ?1", nativeQuery = true)
	public List<BusinessStarsStateConnection> findByState(String state);
	
	public List<BusinessStarsStateConnection> findAll();
}
