package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BusinessStateStarsCategories;

@Repository
public interface BusinessStateStarsCategoriesRepository extends JpaRepository<BusinessStateStarsCategories, Long> {
	List<BusinessStateStarsCategories> findAll();

}
