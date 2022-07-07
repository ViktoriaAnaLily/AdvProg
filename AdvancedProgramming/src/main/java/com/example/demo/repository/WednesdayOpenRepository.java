package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.WednesdayOpen;

@Repository
public interface WednesdayOpenRepository extends JpaRepository<WednesdayOpen, Long> {

	public List<WednesdayOpen> findAll();

}
