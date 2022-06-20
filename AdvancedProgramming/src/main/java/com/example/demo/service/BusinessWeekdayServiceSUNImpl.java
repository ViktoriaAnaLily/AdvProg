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
public class BusinessWeekdayServiceSUNImpl implements BusinessWeekdayServiceSUN{
	private static final Logger log = LoggerFactory.getLogger(BusinessWeekdayServiceSUNImpl.class);

	private BusinessRepository businessRepository;

	@Autowired
	public BusinessWeekdayServiceSUNImpl(BusinessRepository businessRepository) {
		log.debug("BusinessWeekdayService instantiated...");
		this.businessRepository = businessRepository;
	}
	
	@Override
	public List<Integer> finalSundayListValues() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopen("%09:%");
		List<String> listSunday10_ = businessRepository.findBySundayopen("%10:%");
		List<String> listSunday11_ = businessRepository.findBySundayopen("%10:%");
		List<String> listSunday12_ = businessRepository.findBySundayopen("%12:%");
		List<String> listSunday13_ = businessRepository.findBySundayopen("%13:%");
		List<String> listSunday14_ = businessRepository.findBySundayopen("%14:%");
		List<String> listSunday15_ = businessRepository.findBySundayopen("%15:%");
		List<String> listSunday16_ = businessRepository.findBySundayopen("%16:%");

		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());

		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	
	@Override
	public List<Integer> finalSundayListValuesAB() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "AB");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "AB");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "AB");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "AB");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "AB");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "AB");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "AB");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "AB");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	
	@Override
	public List<Integer> finalSundayListValuesAZ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "AZ");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "AZ");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "AZ");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "AZ");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "AZ");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "AZ");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "AZ");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "AZ");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	@Override
	public List<Integer> finalSundayListValuesCA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "CA");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "CA");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "CA");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "CA");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "CA");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "CA");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "CA");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "CA");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	@Override
	public List<Integer> finalSundayListValuesDE() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "DE");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "DE");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "DE");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "DE");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "DE");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "DE");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "DE");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "DE");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	@Override
	public List<Integer> finalSundayListValuesFL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "FL");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "FL");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "FL");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "FL");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "FL");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "FL");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "FL");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "FL");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	@Override
	public List<Integer> finalSundayListValuesID() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "ID");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "ID");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "ID");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "ID");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "ID");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "ID");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "ID");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "ID");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	@Override
	public List<Integer> finalSundayListValuesIL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "IL");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "IL");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "IL");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "IL");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "IL");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "IL");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "IL");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "IL");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	@Override
	public List<Integer> finalSundayListValuesIN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "IN");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "IN");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "IN");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "IN");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "IN");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "IN");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "IN");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "IN");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	@Override
	public List<Integer> finalSundayListValuesLA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "LA");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "LA");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "LA");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "LA");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "LA");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "LA");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "LA");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "LA");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	@Override
	public List<Integer> finalSundayListValuesMO() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "MO");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "MO");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "MO");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "MO");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "MO");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "MO");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "MO");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "MO");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	@Override
	public List<Integer> finalSundayListValuesNJ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "NJ");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "NJ");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "NJ");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "NJ");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "NJ");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "NJ");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "NJ");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "NJ");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	@Override
	public List<Integer> finalSundayListValuesNV() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "NV");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "NV");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "NV");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "NV");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "NV");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "NV");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "NV");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "NV");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	@Override
	public List<Integer> finalSundayListValuesPA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "PA");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "PA");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "PA");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "PA");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "PA");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "PA");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "PA");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "PA");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}
	
	@Override
	public List<Integer> finalSundayListValuesTN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSunday9_ = businessRepository.findBySundayopenState("%09:%", "TN");
		List<String> listSunday10_ = businessRepository.findBySundayopenState("%10:%", "TN");
		List<String> listSunday11_ = businessRepository.findBySundayopenState("%10:%", "TN");
		List<String> listSunday12_ = businessRepository.findBySundayopenState("%12:%", "TN");
		List<String> listSunday13_ = businessRepository.findBySundayopenState("%13:%", "TN");
		List<String> listSunday14_ = businessRepository.findBySundayopenState("%14:%", "TN");
		List<String> listSunday15_ = businessRepository.findBySundayopenState("%15:%", "TN");
		List<String> listSunday16_ = businessRepository.findBySundayopenState("%16:%", "TN");
		
		hmap.put("09:00", listSunday9_.size());
		hmap.put("10:00", listSunday10_.size());
		hmap.put("11:00", listSunday11_.size());
		hmap.put("12:00", listSunday12_.size());
		hmap.put("13:00", listSunday13_.size());
		hmap.put("14:00", listSunday14_.size());
		hmap.put("15:00", listSunday15_.size());
		hmap.put("16:00", listSunday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSundayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSundayListValues.add(value);

		}
		log.debug("finalSundayListValues -> " + finalSundayListValues);

		return finalSundayListValues;
	}

}
