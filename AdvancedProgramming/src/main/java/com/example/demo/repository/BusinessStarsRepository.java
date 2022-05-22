package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.BusinessStars;

@Repository
public interface BusinessStarsRepository extends JpaRepository<BusinessStars, Long> {

	List<BusinessStars> findAll();

}