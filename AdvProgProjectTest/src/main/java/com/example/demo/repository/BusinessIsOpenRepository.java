package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BusinessIsOpen;

@Repository
public interface BusinessIsOpenRepository extends JpaRepository<BusinessIsOpen, Long> {
	List<BusinessIsOpen> findAll();

}