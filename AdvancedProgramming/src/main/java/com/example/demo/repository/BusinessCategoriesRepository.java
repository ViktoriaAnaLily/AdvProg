package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BusinessCategories;

@Repository
public interface BusinessCategoriesRepository extends JpaRepository<BusinessCategories, Long> {

	List<BusinessCategories> findAll();

}