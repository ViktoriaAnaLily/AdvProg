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
public class BusinessWeekdayServiceFRIImpl implements BusinessWeekdayServiceFRI{
	private static final Logger log = LoggerFactory.getLogger(BusinessWeekdayServiceFRIImpl.class);

	private BusinessRepository businessRepository;

	@Autowired
	public BusinessWeekdayServiceFRIImpl(BusinessRepository businessRepository) {
		log.debug("BusinessWeekdayService instantiated...");
		this.businessRepository = businessRepository;
	}
	
	
	@Override
	public List<Integer> finalFridayListValues() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopen("%09:%");
		List<String> listFriday10_ = businessRepository.findByFridayopen("%10:%");
		List<String> listFriday11_ = businessRepository.findByFridayopen("%10:%");
		List<String> listFriday12_ = businessRepository.findByFridayopen("%12:%");
		List<String> listFriday13_ = businessRepository.findByFridayopen("%13:%");
		List<String> listFriday14_ = businessRepository.findByFridayopen("%14:%");
		List<String> listFriday15_ = businessRepository.findByFridayopen("%15:%");
		List<String> listFriday16_ = businessRepository.findByFridayopen("%16:%");

		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());

		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	
	
	@Override
	public List<Integer> finalFridayListValuesAB() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "AB");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "AB");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "AB");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "AB");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "AB");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "AB");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "AB");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "AB");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	
	@Override
	public List<Integer> finalFridayListValuesAZ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "AZ");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "AZ");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "AZ");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "AZ");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "AZ");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "AZ");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "AZ");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "AZ");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	
	@Override
	public List<Integer> finalFridayListValuesCA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "CA");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "CA");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "CA");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "CA");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "CA");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "CA");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "CA");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "CA");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	
	@Override
	public List<Integer> finalFridayListValuesDE() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "DE");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "DE");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "DE");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "DE");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "DE");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "DE");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "DE");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "DE");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	
	@Override
	public List<Integer> finalFridayListValuesFL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "FL");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "FL");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "FL");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "FL");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "FL");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "FL");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "FL");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "FL");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	
	@Override
	public List<Integer> finalFridayListValuesID() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "ID");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "ID");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "ID");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "ID");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "ID");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "ID");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "ID");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "ID");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	@Override
	public List<Integer> finalFridayListValuesIL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "IL");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "IL");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "IL");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "IL");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "IL");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "IL");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "IL");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "IL");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	@Override
	public List<Integer> finalFridayListValuesIN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "IN");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "IN");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "IN");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "IN");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "IN");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "IN");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "IN");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "IN");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	
	@Override
	public List<Integer> finalFridayListValuesLA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "LA");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "LA");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "LA");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "LA");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "LA");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "LA");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "LA");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "LA");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	
	@Override
	public List<Integer> finalFridayListValuesMO() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "MO");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "MO");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "MO");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "MO");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "MO");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "MO");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "MO");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "MO");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	
	@Override
	public List<Integer> finalFridayListValuesNJ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "NJ");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "NJ");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "NJ");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "NJ");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "NJ");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "NJ");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "NJ");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "NJ");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	
	@Override
	public List<Integer> finalFridayListValuesNV() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "NV");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "NV");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "NV");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "NV");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "NV");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "NV");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "NV");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "NV");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	
	@Override
	public List<Integer> finalFridayListValuesPA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "PA");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "PA");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "PA");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "PA");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "PA");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "PA");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "PA");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "PA");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}
	
	@Override
	public List<Integer> finalFridayListValuesTN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listFriday9_ = businessRepository.findByFridayopenState("%09:%", "TN");
		List<String> listFriday10_ = businessRepository.findByFridayopenState("%10:%", "TN");
		List<String> listFriday11_ = businessRepository.findByFridayopenState("%10:%", "TN");
		List<String> listFriday12_ = businessRepository.findByFridayopenState("%12:%", "TN");
		List<String> listFriday13_ = businessRepository.findByFridayopenState("%13:%", "TN");
		List<String> listFriday14_ = businessRepository.findByFridayopenState("%14:%", "TN");
		List<String> listFriday15_ = businessRepository.findByFridayopenState("%15:%", "TN");
		List<String> listFriday16_ = businessRepository.findByFridayopenState("%16:%", "TN");
		
		hmap.put("09:00", listFriday9_.size());
		hmap.put("10:00", listFriday10_.size());
		hmap.put("11:00", listFriday11_.size());
		hmap.put("12:00", listFriday12_.size());
		hmap.put("13:00", listFriday13_.size());
		hmap.put("14:00", listFriday14_.size());
		hmap.put("15:00", listFriday15_.size());
		hmap.put("16:00", listFriday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalFridayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalFridayListValues.add(value);

		}
		log.debug("finalFridayListValues -> " + finalFridayListValues);

		return finalFridayListValues;
	}

}
