package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.BusinessRepository;
@Service
public class BusinessCategoryServiceImpl implements BusinessCategoryService{
	private static final Logger log = LoggerFactory.getLogger(BusinessWeekdayServiceTUEImpl.class);

	private BusinessRepository businessRepository;

	@Autowired
	public BusinessCategoryServiceImpl(BusinessRepository businessRepository) {
		log.debug("BusinessCategoryCoffeeTea instantiated...");
		this.businessRepository = businessRepository;
	}
	@Override
	public List<Integer> businessCategoryAll() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}

	@Override
	public List<Integer> businessCategoryAB() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "AB");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "AB");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "AB");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	
	@Override
	public List<Integer> businessCategoryAZ() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "AZ");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "AZ");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "AZ");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	@Override
	public List<Integer> businessCategoryCA() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "CA");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "CA");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "CA");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	
	@Override
	public List<Integer> businessCategoryDE() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "DE");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "DE");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "DE");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	
	@Override
	public List<Integer> businessCategoryFL() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "FL");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "FL");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "FL");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	@Override
	public List<Integer> businessCategoryID() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "ID");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "ID");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "ID");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	
	@Override
	public List<Integer> businessCategoryIN() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "IN");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "IN");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "IN");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	@Override
	public List<Integer> businessCategoryIL() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "IL");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "IL");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "IL");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	
	public List<Integer> businessCategoryLA() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "LA");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "LA");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "LA");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	public List<Integer> businessCategoryMO() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "MO");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "MO");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "MO");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	public List<Integer> businessCategoryPA() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "PA");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "PA");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "PA");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	public List<Integer> businessCategoryNJ() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "NJ");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "NJ");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "NJ");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	public List<Integer> businessCategoryNV() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "NV");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "NV");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "NV");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	public List<Integer> businessCategoryTN() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listFood = businessRepository.findByCategoryFood("%Food%", "TN");
		log.debug("listFood --> " + listFood.size());
		
		List<String> listCoffeeTea = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "TN");
		log.debug("listCoffeeTea --> " + listCoffeeTea.size());
		
		List<String> listBakeries = businessRepository.findByCategoryBakery("%Bakeries%", "TN");
		log.debug("listBakeries --> " + listBakeries.size());
		
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer time : hmapTREE.values()) {
			finalList.add(time);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	
	
	
	
	public List<Integer> businessCategoryBakery() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listAB = businessRepository.findByCategoryBakery("%Bakeries%", "AB");
		log.debug("listAB --> " + listAB.size());
		
		List<String> listAZ = businessRepository.findByCategoryBakery("%Bakeries%", "AZ");
		log.debug("listAZ --> " + listAB.size());
		
		List<String> listCA = businessRepository.findByCategoryBakery("%Bakeries%", "CA");
		log.debug("listCA --> " + listAB.size());
		
		List<String> listDE = businessRepository.findByCategoryBakery("%Bakeries%", "DE");
		log.debug("listDE --> " + listDE.size());
		
		List<String> listFL = businessRepository.findByCategoryBakery("%Bakeries%", "FL");
		log.debug("listFL --> " + listFL.size());
		
		List<String> listID = businessRepository.findByCategoryBakery("%Bakeries%", "ID");
		log.debug("listID --> " + listID.size());
		
		List<String> listIL = businessRepository.findByCategoryBakery("%Bakeries%", "IL");
		log.debug("listIL --> " + listIL.size());
		
		List<String> listIN = businessRepository.findByCategoryBakery("%Bakeries%", "IN");
		log.debug("listIN --> " + listIN.size());
		
		List<String> listLA = businessRepository.findByCategoryBakery("%Bakeries%", "LA");
		log.debug("listLA --> " + listLA.size());
		
		List<String> listMO = businessRepository.findByCategoryBakery("%Bakeries%", "MO");
		log.debug("listMO --> " + listMO.size());
		
		List<String> listNJ = businessRepository.findByCategoryBakery("%Bakeries%", "NJ");
		log.debug("listNJ --> " + listNJ.size());
		
		List<String> listNV = businessRepository.findByCategoryBakery("%Bakeries%", "NV");
		log.debug("listNV --> " + listNV.size());
		
		List<String> listPA = businessRepository.findByCategoryBakery("%Bakeries%", "PA");
		log.debug("listPA --> " + listPA.size());
		
		List<String> listTN = businessRepository.findByCategoryBakery("%Bakeries%", "TN");
		log.debug("listTN --> " + listTN.size());
		
		hmapTREE.put("FoodAB", listAB.size());
		hmapTREE.put("FoodAZ", listAZ.size());
		hmapTREE.put("FoodCA", listCA.size());
		hmapTREE.put("FoodDE", listDE.size());
		hmapTREE.put("FoodFL", listFL.size());
		hmapTREE.put("FoodID", listID.size());
		hmapTREE.put("FoodIL", listIL.size());
		hmapTREE.put("FoodIN", listIN.size());
		hmapTREE.put("FoodLA", listLA.size());
		hmapTREE.put("FoodMO", listMO.size());
		hmapTREE.put("FoodNJ", listNJ.size());
		hmapTREE.put("FoodNV", listNV.size());
		hmapTREE.put("FoodPA", listPA.size());
		hmapTREE.put("FoodTN", listTN.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer VALUE : hmapTREE.values()) {
			finalList.add(VALUE);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	public List<Integer> businessCategoryFood() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listAB = businessRepository.findByCategoryFood("%Food%", "AB");
		log.debug("listAB --> " + listAB.size());
		
		List<String> listAZ = businessRepository.findByCategoryFood("%Food%", "AZ");
		log.debug("listAZ --> " + listAB.size());
		
		List<String> listCA = businessRepository.findByCategoryFood("%Food%", "CA");
		log.debug("listCA --> " + listAB.size());
		
		List<String> listDE = businessRepository.findByCategoryFood("%Food%", "DE");
		log.debug("listDE --> " + listDE.size());
		
		List<String> listFL = businessRepository.findByCategoryFood("%Food%", "FL");
		log.debug("listFL --> " + listFL.size());
		
		List<String> listID = businessRepository.findByCategoryFood("%Food%", "ID");
		log.debug("listID --> " + listID.size());
		
		List<String> listIL = businessRepository.findByCategoryFood("%Food%", "IL");
		log.debug("listIL --> " + listIL.size());
		
		List<String> listIN = businessRepository.findByCategoryFood("%Food%", "IN");
		log.debug("listIN --> " + listIN.size());
		
		List<String> listLA = businessRepository.findByCategoryFood("%Food%", "LA");
		log.debug("listLA --> " + listLA.size());
		
		List<String> listMO = businessRepository.findByCategoryFood("%Food%", "MO");
		log.debug("listMO --> " + listMO.size());
		
		List<String> listNJ = businessRepository.findByCategoryFood("%Food%", "NJ");
		log.debug("listNJ --> " + listNJ.size());
		
		List<String> listNV = businessRepository.findByCategoryFood("%Food%", "NV");
		log.debug("listNV --> " + listNV.size());
		
		List<String> listPA = businessRepository.findByCategoryFood("%Food%", "PA");
		log.debug("listPA --> " + listPA.size());
		
		List<String> listTN = businessRepository.findByCategoryFood("%Food%", "TN");
		log.debug("listTN --> " + listTN.size());
		
		hmapTREE.put("FoodAB", listAB.size());
		hmapTREE.put("FoodAZ", listAZ.size());
		hmapTREE.put("FoodCA", listCA.size());
		hmapTREE.put("FoodDE", listDE.size());
		hmapTREE.put("FoodFL", listFL.size());
		hmapTREE.put("FoodID", listID.size());
		hmapTREE.put("FoodIL", listIL.size());
		hmapTREE.put("FoodIN", listIN.size());
		hmapTREE.put("FoodLA", listLA.size());
		hmapTREE.put("FoodMO", listMO.size());
		hmapTREE.put("FoodNJ", listNJ.size());
		hmapTREE.put("FoodNV", listNV.size());
		hmapTREE.put("FoodPA", listPA.size());
		hmapTREE.put("FoodTN", listTN.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer VALUE : hmapTREE.values()) {
			finalList.add(VALUE);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
	
	
	public List<Integer> businessCategoryCoffeeTea() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listAB = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "AB");
		log.debug("listAB --> " + listAB.size());
		
		List<String> listAZ = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "AZ");
		log.debug("listAZ --> " + listAB.size());
		
		List<String> listCA = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "CA");
		log.debug("listCA --> " + listAB.size());
		
		List<String> listDE = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "DE");
		log.debug("listDE --> " + listDE.size());
		
		List<String> listFL = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "FL");
		log.debug("listFL --> " + listFL.size());
		
		List<String> listID = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "ID");
		log.debug("listID --> " + listID.size());
		
		List<String> listIL = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "IL");
		log.debug("listIL --> " + listIL.size());
		
		List<String> listIN = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "IN");
		log.debug("listIN --> " + listIN.size());
		
		List<String> listLA = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "LA");
		log.debug("listLA --> " + listLA.size());
		
		List<String> listMO = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "MO");
		log.debug("listMO --> " + listMO.size());
		
		List<String> listNJ = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "NJ");
		log.debug("listNJ --> " + listNJ.size());
		
		List<String> listNV = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "NV");
		log.debug("listNV --> " + listNV.size());
		
		List<String> listPA = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "PA");
		log.debug("listPA --> " + listPA.size());
		
		List<String> listTN = businessRepository.findByCategoryCoffeeTea("%Coffee & Tea%", "TN");
		log.debug("listTN --> " + listTN.size());
		
		hmapTREE.put("FoodAB", listAB.size());
		hmapTREE.put("FoodAZ", listAZ.size());
		hmapTREE.put("FoodCA", listCA.size());
		hmapTREE.put("FoodDE", listDE.size());
		hmapTREE.put("FoodFL", listFL.size());
		hmapTREE.put("FoodID", listID.size());
		hmapTREE.put("FoodIL", listIL.size());
		hmapTREE.put("FoodIN", listIN.size());
		hmapTREE.put("FoodLA", listLA.size());
		hmapTREE.put("FoodMO", listMO.size());
		hmapTREE.put("FoodNJ", listNJ.size());
		hmapTREE.put("FoodNV", listNV.size());
		hmapTREE.put("FoodPA", listPA.size());
		hmapTREE.put("FoodTN", listTN.size());
		
		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer VALUE : hmapTREE.values()) {
			finalList.add(VALUE);

		}
		log.debug("finalList -> " + finalList);

		
		return finalList;
	}
}
