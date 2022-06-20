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
public class BusinessCategoryServiceImpl implements BusinessCategoryService {
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

		// key, value
		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());

		// 7...

		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer var : hmapTREE.values()) {
			finalList.add(var);

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

		// 7...

		hmapTREE.put("Food", listFood.size());
		hmapTREE.put("Coffee & Tea", listCoffeeTea.size());
		hmapTREE.put("Bakeries", listBakeries.size());

		// 7...

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

	public List<Integer> businessCategoryBars() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listAB = businessRepository.findByCategoryBars("%Bars%", "AB");
		log.debug("listAB --> " + listAB.size());

		List<String> listAZ = businessRepository.findByCategoryBars("%Bars%", "AZ");
		log.debug("listAZ --> " + listAB.size());

		List<String> listCA = businessRepository.findByCategoryBars("%Bars%", "CA");
		log.debug("listCA --> " + listAB.size());

		List<String> listDE = businessRepository.findByCategoryBars("%Bars%", "DE");
		log.debug("listDE --> " + listDE.size());

		List<String> listFL = businessRepository.findByCategoryBars("%Bars%", "FL");
		log.debug("listFL --> " + listFL.size());

		List<String> listID = businessRepository.findByCategoryBars("%Bars%", "ID");
		log.debug("listID --> " + listID.size());

		List<String> listIL = businessRepository.findByCategoryBars("%Bars%", "IL");
		log.debug("listIL --> " + listIL.size());

		List<String> listIN = businessRepository.findByCategoryBars("Bars%", "IN");
		log.debug("listIN --> " + listIN.size());

		List<String> listLA = businessRepository.findByCategoryBars("%Bars%", "LA");
		log.debug("listLA --> " + listLA.size());

		List<String> listMO = businessRepository.findByCategoryBars("%Bars%", "MO");
		log.debug("listMO --> " + listMO.size());

		List<String> listNJ = businessRepository.findByCategoryBars("%Bars%", "NJ");
		log.debug("listNJ --> " + listNJ.size());

		List<String> listNV = businessRepository.findByCategoryBars("%Bars%", "NV");
		log.debug("listNV --> " + listNV.size());

		List<String> listPA = businessRepository.findByCategoryBars("%Bars%", "PA");
		log.debug("listPA --> " + listPA.size());

		List<String> listTN = businessRepository.findByCategoryBars("%Bars%", "TN");
		log.debug("listTN --> " + listTN.size());

		hmapTREE.put("BarsAB", listAB.size());
		hmapTREE.put("BarsAZ", listAZ.size());
		hmapTREE.put("BarsCA", listCA.size());
		hmapTREE.put("BarsDE", listDE.size());
		hmapTREE.put("BarsFL", listFL.size());
		hmapTREE.put("BarsID", listID.size());
		hmapTREE.put("BarsIL", listIL.size());
		hmapTREE.put("BarsIN", listIN.size());
		hmapTREE.put("BarsLA", listLA.size());
		hmapTREE.put("BarsMO", listMO.size());
		hmapTREE.put("BarsNJ", listNJ.size());
		hmapTREE.put("BarsNV", listNV.size());
		hmapTREE.put("BarsPA", listPA.size());
		hmapTREE.put("BarsTN", listTN.size());

		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer VALUE : hmapTREE.values()) {
			finalList.add(VALUE);

		}
		log.debug("finalList -> " + finalList);

		return finalList;
	}

	public List<Integer> businessCategoryHotels() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listAB = businessRepository.findByCategoryHotels("%Hotels%", "AB");
		log.debug("listAB --> " + listAB.size());

		List<String> listAZ = businessRepository.findByCategoryHotels("%Hotels%", "AZ");
		log.debug("listAZ --> " + listAB.size());

		List<String> listCA = businessRepository.findByCategoryHotels("%Hotels%", "CA");
		log.debug("listCA --> " + listAB.size());

		List<String> listDE = businessRepository.findByCategoryHotels("%Hotels%", "DE");
		log.debug("listDE --> " + listDE.size());

		List<String> listFL = businessRepository.findByCategoryHotels("Hotels%", "FL");
		log.debug("listFL --> " + listFL.size());

		List<String> listID = businessRepository.findByCategoryHotels("%Hotels%", "ID");
		log.debug("listID --> " + listID.size());

		List<String> listIL = businessRepository.findByCategoryHotels("%Hotels%", "IL");
		log.debug("listIL --> " + listIL.size());

		List<String> listIN = businessRepository.findByCategoryHotels("%Hotels%", "IN");
		log.debug("listIN --> " + listIN.size());

		List<String> listLA = businessRepository.findByCategoryHotels("%Hotels%", "LA");
		log.debug("listLA --> " + listLA.size());

		List<String> listMO = businessRepository.findByCategoryHotels("%Hotels%", "MO");
		log.debug("listMO --> " + listMO.size());

		List<String> listNJ = businessRepository.findByCategoryHotels("%Hotels%", "NJ");
		log.debug("listNJ --> " + listNJ.size());

		List<String> listNV = businessRepository.findByCategoryHotels("%Hotels%", "NV");
		log.debug("listNV --> " + listNV.size());

		List<String> listPA = businessRepository.findByCategoryHotels("%Hotels%", "PA");
		log.debug("listPA --> " + listPA.size());

		List<String> listTN = businessRepository.findByCategoryHotels("%Hotels%", "TN");
		log.debug("listTN --> " + listTN.size());

		hmapTREE.put("HotelsAB", listAB.size());
		hmapTREE.put("HotelsAZ", listAZ.size());
		hmapTREE.put("HotelsCA", listCA.size());
		hmapTREE.put("HotelsDE", listDE.size());
		hmapTREE.put("HotelsFL", listFL.size());
		hmapTREE.put("HotelsID", listID.size());
		hmapTREE.put("HotelsIL", listIL.size());
		hmapTREE.put("HotelsIN", listIN.size());
		hmapTREE.put("HotelsLA", listLA.size());
		hmapTREE.put("HotelsMO", listMO.size());
		hmapTREE.put("HotelsNJ", listNJ.size());
		hmapTREE.put("HotelsNV", listNV.size());
		hmapTREE.put("HotelsPA", listPA.size());
		hmapTREE.put("HotelsTN", listTN.size());

		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer VALUE : hmapTREE.values()) {
			finalList.add(VALUE);

		}
		log.debug("finalList -> " + finalList);

		return finalList;
	}

	public List<Integer> businessCategoryArtsEntertainment() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listAB = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "AB");
		log.debug("listAB --> " + listAB.size());

		List<String> listAZ = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "AZ");
		log.debug("listAZ --> " + listAB.size());

		List<String> listCA = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "CA");
		log.debug("listCA --> " + listAB.size());

		List<String> listDE = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "DE");
		log.debug("listDE --> " + listDE.size());

		List<String> listFL = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "FL");
		log.debug("listFL --> " + listFL.size());

		List<String> listID = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "ID");
		log.debug("listID --> " + listID.size());

		List<String> listIL = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "IL");
		log.debug("listIL --> " + listIL.size());

		List<String> listIN = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "IN");
		log.debug("listIN --> " + listIN.size());

		List<String> listLA = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "LA");
		log.debug("listLA --> " + listLA.size());

		List<String> listMO = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "MO");
		log.debug("listMO --> " + listMO.size());

		List<String> listNJ = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "NJ");
		log.debug("listNJ --> " + listNJ.size());

		List<String> listNV = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "NV");
		log.debug("listNV --> " + listNV.size());

		List<String> listPA = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "PA");
		log.debug("listPA --> " + listPA.size());

		List<String> listTN = businessRepository.findByCategoryArtsEntertainment("%Arts & Entertainment%", "TN");
		log.debug("listTN --> " + listTN.size());

		hmapTREE.put("ArtsEntertainmentAB", listAB.size());
		hmapTREE.put("ArtsEntertainmentAZ", listAZ.size());
		hmapTREE.put("ArtsEntertainmentCA", listCA.size());
		hmapTREE.put("ArtsEntertainmentDE", listDE.size());
		hmapTREE.put("ArtsEntertainmentFL", listFL.size());
		hmapTREE.put("ArtsEntertainmentID", listID.size());
		hmapTREE.put("ArtsEntertainmentIL", listIL.size());
		hmapTREE.put("ArtsEntertainmentIN", listIN.size());
		hmapTREE.put("ArtsEntertainmentLA", listLA.size());
		hmapTREE.put("ArtsEntertainmentMO", listMO.size());
		hmapTREE.put("ArtsEntertainmentNJ", listNJ.size());
		hmapTREE.put("ArtsEntertainmentNV", listNV.size());
		hmapTREE.put("ArtsEntertainmentPA", listPA.size());
		hmapTREE.put("ArtsEntertainmentTN", listTN.size());

		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer VALUE : hmapTREE.values()) {
			finalList.add(VALUE);

		}
		log.debug("finalList -> " + finalList);

		return finalList;
	}

	public List<Integer> businessCategoryHomeGarden() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listAB = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "AB");
		log.debug("listAB --> " + listAB.size());

		List<String> listAZ = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "AZ");
		log.debug("listAZ --> " + listAB.size());

		List<String> listCA = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "CA");
		log.debug("listCA --> " + listAB.size());

		List<String> listDE = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "DE");
		log.debug("listDE --> " + listDE.size());

		List<String> listFL = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "FL");
		log.debug("listFL --> " + listFL.size());

		List<String> listID = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "ID");
		log.debug("listID --> " + listID.size());

		List<String> listIL = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "IL");
		log.debug("listIL --> " + listIL.size());

		List<String> listIN = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "IN");
		log.debug("listIN --> " + listIN.size());

		List<String> listLA = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "LA");
		log.debug("listLA --> " + listLA.size());

		List<String> listMO = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "MO");
		log.debug("listMO --> " + listMO.size());

		List<String> listNJ = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "NJ");
		log.debug("listNJ --> " + listNJ.size());

		List<String> listNV = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "NV");
		log.debug("listNV --> " + listNV.size());

		List<String> listPA = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "PA");
		log.debug("listPA --> " + listPA.size());

		List<String> listTN = businessRepository.findByCategoryHomeGarden("%Home & Garden%", "TN");
		log.debug("listTN --> " + listTN.size());

		hmapTREE.put("HomeGardenAB", listAB.size());
		hmapTREE.put("HomeGardenAZ", listAZ.size());
		hmapTREE.put("HomeGardenCA", listCA.size());
		hmapTREE.put("HomeGardenDE", listDE.size());
		hmapTREE.put("HomeGardenFL", listFL.size());
		hmapTREE.put("HomeGardenID", listID.size());
		hmapTREE.put("HomeGardenIL", listIL.size());
		hmapTREE.put("HomeGardenIN", listIN.size());
		hmapTREE.put("HomeGardenLA", listLA.size());
		hmapTREE.put("HomeGardenMO", listMO.size());
		hmapTREE.put("HomeGardenNJ", listNJ.size());
		hmapTREE.put("HomeGardenNV", listNV.size());
		hmapTREE.put("HomeGardenPA", listPA.size());
		hmapTREE.put("HomeGardenTN", listTN.size());

		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer VALUE : hmapTREE.values()) {
			finalList.add(VALUE);

		}
		log.debug("finalList -> " + finalList);

		return finalList;
	}

	public List<Integer> businessCategoryMuseums() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listAB = businessRepository.findByCategoryMuseums("%Museums%", "AB");
		log.debug("listAB --> " + listAB.size());

		List<String> listAZ = businessRepository.findByCategoryMuseums("%Museums%", "AZ");
		log.debug("listAZ --> " + listAB.size());

		List<String> listCA = businessRepository.findByCategoryMuseums("%Museums%", "CA");
		log.debug("listCA --> " + listAB.size());

		List<String> listDE = businessRepository.findByCategoryMuseums("%Museums%", "DE");
		log.debug("listDE --> " + listDE.size());

		List<String> listFL = businessRepository.findByCategoryMuseums("%Museums%", "FL");
		log.debug("listFL --> " + listFL.size());

		List<String> listID = businessRepository.findByCategoryMuseums("%Museums%", "ID");
		log.debug("listID --> " + listID.size());

		List<String> listIL = businessRepository.findByCategoryMuseums("%Museums%", "IL");
		log.debug("listIL --> " + listIL.size());

		List<String> listIN = businessRepository.findByCategoryMuseums("%Museums%", "IN");
		log.debug("listIN --> " + listIN.size());

		List<String> listLA = businessRepository.findByCategoryMuseums("%Museums%", "LA");
		log.debug("listLA --> " + listLA.size());

		List<String> listMO = businessRepository.findByCategoryMuseums("%Museums%", "MO");
		log.debug("listMO --> " + listMO.size());

		List<String> listNJ = businessRepository.findByCategoryMuseums("%Museums%", "NJ");
		log.debug("listNJ --> " + listNJ.size());

		List<String> listNV = businessRepository.findByCategoryMuseums("%Museums%", "NV");
		log.debug("listNV --> " + listNV.size());

		List<String> listPA = businessRepository.findByCategoryMuseums("%Museums%", "PA");
		log.debug("listPA --> " + listPA.size());

		List<String> listTN = businessRepository.findByCategoryMuseums("%Museums%", "TN");
		log.debug("listTN --> " + listTN.size());

		hmapTREE.put("MuseumsAB", listAB.size());
		hmapTREE.put("MuseumsAZ", listAZ.size());
		hmapTREE.put("MuseumsCA", listCA.size());
		hmapTREE.put("MuseumsDE", listDE.size());
		hmapTREE.put("MuseumsFL", listFL.size());
		hmapTREE.put("MuseumsID", listID.size());
		hmapTREE.put("MuseumsIL", listIL.size());
		hmapTREE.put("MuseumsIN", listIN.size());
		hmapTREE.put("MuseumsLA", listLA.size());
		hmapTREE.put("MuseumsMO", listMO.size());
		hmapTREE.put("MuseumsNJ", listNJ.size());
		hmapTREE.put("MuseumsNV", listNV.size());
		hmapTREE.put("MuseumsPA", listPA.size());
		hmapTREE.put("MuseumsTN", listTN.size());

		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer VALUE : hmapTREE.values()) {
			finalList.add(VALUE);

		}
		log.debug("finalList -> " + finalList);

		return finalList;
	}

	public List<Integer> businessCategoryDoctors() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listAB = businessRepository.findByCategoryDoctors("%Doctors%", "AB");
		log.debug("listAB --> " + listAB.size());

		List<String> listAZ = businessRepository.findByCategoryDoctors("%Doctors%", "AZ");
		log.debug("listAZ --> " + listAB.size());

		List<String> listCA = businessRepository.findByCategoryDoctors("%Doctors%", "CA");
		log.debug("listCA --> " + listAB.size());

		List<String> listDE = businessRepository.findByCategoryDoctors("%Doctors%", "DE");
		log.debug("listDE --> " + listDE.size());

		List<String> listFL = businessRepository.findByCategoryDoctors("%Doctors%", "FL");
		log.debug("listFL --> " + listFL.size());

		List<String> listID = businessRepository.findByCategoryDoctors("%Doctors%", "ID");
		log.debug("listID --> " + listID.size());

		List<String> listIL = businessRepository.findByCategoryDoctors("%Doctors%", "IL");
		log.debug("listIL --> " + listIL.size());

		List<String> listIN = businessRepository.findByCategoryDoctors("%Doctors%", "IN");
		log.debug("listIN --> " + listIN.size());

		List<String> listLA = businessRepository.findByCategoryDoctors("%Doctors%", "LA");
		log.debug("listLA --> " + listLA.size());

		List<String> listMO = businessRepository.findByCategoryDoctors("%Doctors%", "MO");
		log.debug("listMO --> " + listMO.size());

		List<String> listNJ = businessRepository.findByCategoryDoctors("%Doctors%", "NJ");
		log.debug("listNJ --> " + listNJ.size());

		List<String> listNV = businessRepository.findByCategoryDoctors("%Doctors%", "NV");
		log.debug("listNV --> " + listNV.size());

		List<String> listPA = businessRepository.findByCategoryDoctors("%Doctors%", "PA");
		log.debug("listPA --> " + listPA.size());

		List<String> listTN = businessRepository.findByCategoryDoctors("%Doctors%", "TN");
		log.debug("listTN --> " + listTN.size());

		hmapTREE.put("DoctorsAB", listAB.size());
		hmapTREE.put("DoctorsAZ", listAZ.size());
		hmapTREE.put("DoctorsCA", listCA.size());
		hmapTREE.put("DoctorsDE", listDE.size());
		hmapTREE.put("DoctorsFL", listFL.size());
		hmapTREE.put("DoctorsID", listID.size());
		hmapTREE.put("DoctorsIL", listIL.size());
		hmapTREE.put("DoctorsIN", listIN.size());
		hmapTREE.put("DoctorsLA", listLA.size());
		hmapTREE.put("DoctorsMO", listMO.size());
		hmapTREE.put("DoctorsNJ", listNJ.size());
		hmapTREE.put("DoctorsNV", listNV.size());
		hmapTREE.put("DoctorsPA", listPA.size());
		hmapTREE.put("DoctorsTN", listTN.size());

		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer VALUE : hmapTREE.values()) {
			finalList.add(VALUE);

		}
		log.debug("finalList -> " + finalList);

		return finalList;
	}

	public List<Integer> businessCategoryShopping() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listAB = businessRepository.findByCategoryShopping("%Shopping%", "AB");
		log.debug("listAB --> " + listAB.size());

		List<String> listAZ = businessRepository.findByCategoryShopping("%Shopping%", "AZ");
		log.debug("listAZ --> " + listAB.size());

		List<String> listCA = businessRepository.findByCategoryShopping("%Shopping%", "CA");
		log.debug("listCA --> " + listAB.size());

		List<String> listDE = businessRepository.findByCategoryShopping("%Shopping%", "DE");
		log.debug("listDE --> " + listDE.size());

		List<String> listFL = businessRepository.findByCategoryShopping("%Shopping%", "FL");
		log.debug("listFL --> " + listFL.size());

		List<String> listID = businessRepository.findByCategoryShopping("%Shopping%", "ID");
		log.debug("listID --> " + listID.size());

		List<String> listIL = businessRepository.findByCategoryShopping("%Shopping%", "IL");
		log.debug("listIL --> " + listIL.size());

		List<String> listIN = businessRepository.findByCategoryShopping("%Shopping%", "IN");
		log.debug("listIN --> " + listIN.size());

		List<String> listLA = businessRepository.findByCategoryShopping("%Shopping%", "LA");
		log.debug("listLA --> " + listLA.size());

		List<String> listMO = businessRepository.findByCategoryShopping("%Shopping%", "MO");
		log.debug("listMO --> " + listMO.size());

		List<String> listNJ = businessRepository.findByCategoryShopping("%Shopping%", "NJ");
		log.debug("listNJ --> " + listNJ.size());

		List<String> listNV = businessRepository.findByCategoryShopping("%Shopping%", "NV");
		log.debug("listNV --> " + listNV.size());

		List<String> listPA = businessRepository.findByCategoryShopping("%Shopping%", "PA");
		log.debug("listPA --> " + listPA.size());

		List<String> listTN = businessRepository.findByCategoryShopping("%Shopping%", "TN");
		log.debug("listTN --> " + listTN.size());

		hmapTREE.put("ShoppingAB", listAB.size());
		hmapTREE.put("ShoppingAZ", listAZ.size());
		hmapTREE.put("ShoppingCA", listCA.size());
		hmapTREE.put("ShoppingDE", listDE.size());
		hmapTREE.put("ShoppingFL", listFL.size());
		hmapTREE.put("ShoppingID", listID.size());
		hmapTREE.put("ShoppingIL", listIL.size());
		hmapTREE.put("ShoppingIN", listIN.size());
		hmapTREE.put("ShoppingLA", listLA.size());
		hmapTREE.put("ShoppingMO", listMO.size());
		hmapTREE.put("ShoppingNJ", listNJ.size());
		hmapTREE.put("ShoppingNV", listNV.size());
		hmapTREE.put("ShoppingPA", listPA.size());
		hmapTREE.put("ShoppingTN", listTN.size());

		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer VALUE : hmapTREE.values()) {
			finalList.add(VALUE);

		}
		log.debug("finalList -> " + finalList);

		return finalList;
	}
}
