package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TuesdayOpen;

@Repository
public interface TuesdayOpenRepository extends JpaRepository<TuesdayOpen, Long> {

	public List<TuesdayOpen> findAll();

}