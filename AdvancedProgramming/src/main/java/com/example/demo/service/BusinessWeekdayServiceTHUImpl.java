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
public class BusinessWeekdayServiceTHUImpl implements BusinessWeekdayServiceTHU{
	private static final Logger log = LoggerFactory.getLogger(BusinessWeekdayServiceTHUImpl.class);

	private BusinessRepository businessRepository;

	@Autowired
	public BusinessWeekdayServiceTHUImpl(BusinessRepository businessRepository) {
		log.debug("BusinessWeekdayService instantiated...");
		this.businessRepository = businessRepository;
	}
	
	
	@Override
	public List<Integer> finalThursdayListValues() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopen("%09:%");
		List<String> listThursday10_ = businessRepository.findByThursdayopen("%10:%");
		List<String> listThursday11_ = businessRepository.findByThursdayopen("%10:%");
		List<String> listThursday12_ = businessRepository.findByThursdayopen("%12:%");
		List<String> listThursday13_ = businessRepository.findByThursdayopen("%13:%");
		List<String> listThursday14_ = businessRepository.findByThursdayopen("%14:%");
		List<String> listThursday15_ = businessRepository.findByThursdayopen("%15:%");
		List<String> listThursday16_ = businessRepository.findByThursdayopen("%16:%");

		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());

		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	
	@Override
	public List<Integer> finalThursdayListValuesAB() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "AB");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "AB");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "AB");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "AB");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "AB");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "AB");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "AB");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "AB");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	@Override
	public List<Integer> finalThursdayListValuesAZ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "AZ");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "AZ");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "AZ");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "AZ");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "AZ");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "AZ");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "AZ");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "AZ");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	@Override
	public List<Integer> finalThursdayListValuesCA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "CA");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "CA");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "CA");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "CA");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "CA");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "CA");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "CA");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "CA");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	@Override
	public List<Integer> finalThursdayListValuesDE() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "DE");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "DE");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "DE");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "DE");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "DE");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "DE");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "DE");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "DE");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	@Override
	public List<Integer> finalThursdayListValuesFL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "FL");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "FL");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "FL");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "FL");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "FL");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "FL");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "FL");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "FL");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	@Override
	public List<Integer> finalThursdayListValuesID() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "ID");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "ID");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "ID");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "ID");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "ID");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "ID");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "ID");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "ID");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	@Override
	public List<Integer> finalThursdayListValuesIL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "IL");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "IL");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "IL");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "IL");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "IL");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "IL");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "IL");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "IL");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	@Override
	public List<Integer> finalThursdayListValuesIN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "IN");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "IN");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "IN");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "IN");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "IN");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "IN");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "IN");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "IN");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	@Override
	public List<Integer> finalThursdayListValuesLA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "LA");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "LA");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "LA");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "LA");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "LA");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "LA");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "LA");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "LA");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	@Override
	public List<Integer> finalThursdayListValuesMO() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "MO");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "MO");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "MO");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "MO");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "MO");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "MO");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "MO");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "MO");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	@Override
	public List<Integer> finalThursdayListValuesNJ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "NJ");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "NJ");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "NJ");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "NJ");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "NJ");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "NJ");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "NJ");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "NJ");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	@Override
	public List<Integer> finalThursdayListValuesNV() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "NV");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "NV");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "NV");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "NV");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "NV");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "NV");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "NV");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "NV");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	@Override
	public List<Integer> finalThursdayListValuesPA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "PA");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "PA");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "PA");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "PA");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "PA");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "PA");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "PA");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "PA");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
	
	@Override
	public List<Integer> finalThursdayListValuesTN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listThursday9_ = businessRepository.findByThursdayopenState("%09:%", "TN");
		List<String> listThursday10_ = businessRepository.findByThursdayopenState("%10:%", "TN");
		List<String> listThursday11_ = businessRepository.findByThursdayopenState("%10:%", "TN");
		List<String> listThursday12_ = businessRepository.findByThursdayopenState("%12:%", "TN");
		List<String> listThursday13_ = businessRepository.findByThursdayopenState("%13:%", "TN");
		List<String> listThursday14_ = businessRepository.findByThursdayopenState("%14:%", "TN");
		List<String> listThursday15_ = businessRepository.findByThursdayopenState("%15:%", "TN");
		List<String> listThursday16_ = businessRepository.findByThursdayopenState("%16:%", "TN");
		
		hmap.put("09:00", listThursday9_.size());
		hmap.put("10:00", listThursday10_.size());
		hmap.put("11:00", listThursday11_.size());
		hmap.put("12:00", listThursday12_.size());
		hmap.put("13:00", listThursday13_.size());
		hmap.put("14:00", listThursday14_.size());
		hmap.put("15:00", listThursday15_.size());
		hmap.put("16:00", listThursday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalThursdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalThursdayListValues.add(value);

		}
		log.debug("finalThursdayListValues -> " + finalThursdayListValues);

		return finalThursdayListValues;
	}
}
