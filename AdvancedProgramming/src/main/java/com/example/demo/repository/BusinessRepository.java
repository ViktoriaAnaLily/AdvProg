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

	@Query(value = "SELECT * FROM businessdateinew b where b.mondayopen is null", nativeQuery = true)
	public List<String> findByMondayopenIsNull();

	@Query(value = "SELECT * FROM businessdateinew b where b.mondayopen like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByMondayopenState(String mondayString, String mondayStringState);

	@Query(value = "SELECT * FROM businessdateinew b where b.thuesdayopen like %?1", nativeQuery = true)
	public List<String> findByTuesdayopen(String tuesdayString);

	@Query(value = "SELECT * FROM businessdateinew b where b.thuesdayopen is null", nativeQuery = true)
	public List<String> findByTuesdayopenIsNull();

	@Query(value = "SELECT * FROM businessdateinew b where b.thuesdayopen like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByTuesdayopenState(String wednes, String tuesdayStringState);

	@Query(value = "SELECT * FROM businessdateinew b where b.wednesdayopen like %?1", nativeQuery = true)
	public List<String> findByWednesdayopen(String wednesdayString);

	@Query(value = "SELECT * FROM businessdateinew b where b.wednesdayopen is null", nativeQuery = true)
	public List<String> findByWednesdayopenIsNull();

	@Query(value = "SELECT * FROM businessdateinew b where b.wednesdayopen like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByWednesdayopenState(String wednesdayString, String wednesdayStringState);

	@Query(value = "SELECT * FROM businessdateinew b where b.thursdayopen like %?1", nativeQuery = true)
	public List<String> findByThursdayopen(String thursdayString);

	@Query(value = "SELECT * FROM businessdateinew b where b.thursdayopen is null", nativeQuery = true)
	public List<String> findByThursdayopenIsNull();

	@Query(value = "SELECT * FROM businessdateinew b where b.thursdayopen like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByThursdayopenState(String thursdayString, String thursdayStringState);

	@Query(value = "SELECT * FROM businessdateinew b where b.fridayopen like %?1", nativeQuery = true)
	public List<String> findByFridayopen(String fridayString);

	@Query(value = "SELECT * FROM businessdateinew b where b.fridayopen is null", nativeQuery = true)
	public List<String> findByFridayopenIsNull();

	@Query(value = "SELECT * FROM businessdateinew b where b.fridayopen like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByFridayopenState(String fridayString, String fridayStringState);

	@Query(value = "SELECT * FROM businessdateinew b where b.saturdayopen like %?1", nativeQuery = true)
	public List<String> findBySaturdayopen(String saturdayString);

	@Query(value = "SELECT * FROM businessdateinew b where b.saturdayopen is null", nativeQuery = true)
	public List<String> findBySaturdayopenIsNull();

	@Query(value = "SELECT * FROM businessdateinew b where b.saturdayopen like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findBySaturdayopenState(String saturdayString, String saturdayStringState);

	@Query(value = "SELECT * FROM businessdateinew b where b.sundayopen like %?1", nativeQuery = true)
	public List<String> findBySundayopen(String sundayString);

	@Query(value = "SELECT * FROM businessdateinew b where b.sundayopen is null", nativeQuery = true)
	public List<String> findBySundayopenIsNull();

	@Query(value = "SELECT * FROM businessdateinew b where b.sundayopen like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findBySundayopenState(String sundayString, String sundayStringState);

	// General
	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1", nativeQuery = true)
	public List<String> findByCategoryCoffeeTea(String categoryString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1", nativeQuery = true)
	public List<String> findByCategoryFood(String categoryString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1", nativeQuery = true)
	public List<String> findByCategoryBakery(String categoryString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1", nativeQuery = true)
	public List<String> findByCategoryBars(String categoryStrinG);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1", nativeQuery = true)
	public List<String> findByCategoryHotels(String categoryString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1", nativeQuery = true)
	public List<String> findByCategoryArtsEntertainment(String categoryString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1", nativeQuery = true)
	public List<String> findByCategoryHomeGarden(String categoryString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1", nativeQuery = true)
	public List<String> findByCategoryMuseums(String categoryString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1", nativeQuery = true)
	public List<String> findByCategoryDoctors(String categoryString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1", nativeQuery = true)
	public List<String> findByCategoryShopping(String categoryString);

	// 7...

	// State
	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByCategoryCoffeeTea(String categoryString, String stateString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByCategoryFood(String categoryString, String stateString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByCategoryBakery(String categoryString, String stateString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByCategoryBars(String categoryString, String stateString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByCategoryHotels(String categoryString, String stateString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByCategoryArtsEntertainment(String categoryString, String stateString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByCategoryHomeGarden(String categoryString, String stateString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByCategoryMuseums(String categoryString, String stateString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByCategoryDoctors(String categoryString, String stateString);

	@Query(value = "SELECT * FROM businessdateinew b where b.categories like %?1 and b.state like %?2", nativeQuery = true)
	public List<String> findByCategoryShopping(String categoryString, String stateString);

}