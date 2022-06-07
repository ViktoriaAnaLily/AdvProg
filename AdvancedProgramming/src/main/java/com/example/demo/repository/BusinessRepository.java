package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Business;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Long> {

	@Query(value = "SELECT * FROM businessdateinew b where b.stars like %?1", nativeQuery = true)
	public List<Business> findByStars(String stars);
	
	@Query(value = "SELECT * FROM businessdateinew b where b.state like %?1", nativeQuery = true)
	public List<Business> findByState(String state);
	
	@Query(value = "SELECT * FROM businessdateinew b where b.is_open = ?1", nativeQuery = true)
	public List<Business> findByIs_open(Integer i);
	
	@Query(value = "SELECT * FROM businessdateinew b where b.mondayopen like %?1", nativeQuery = true)
	public List<String> findByMondayopen(String mondayString);
	
	@Query(value = "SELECT * FROM businessdateinew b where b.mondayopen like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByMondayopenAB(String mondayString, String mondayStringAB);
	
	

}