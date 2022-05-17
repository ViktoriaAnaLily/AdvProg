package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BusinessReview;

@Repository
public interface BusinessReviewRepository extends JpaRepository<BusinessReview, Long> {
	List<BusinessReview> findAll();

}
