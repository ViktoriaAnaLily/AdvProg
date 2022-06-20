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
public class BusinessWeekdayServiceSATImpl implements BusinessWeekdayServiceSAT{
	private static final Logger log = LoggerFactory.getLogger(BusinessWeekdayServiceSATImpl.class);

	private BusinessRepository businessRepository;

	@Autowired
	public BusinessWeekdayServiceSATImpl(BusinessRepository businessRepository) {
		log.debug("BusinessWeekdayService instantiated...");
		this.businessRepository = businessRepository;
	}
	
	
	@Override
	public List<Integer> finalSaturdayListValues() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopen("%09:%");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopen("%10:%");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopen("%10:%");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopen("%12:%");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopen("%13:%");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopen("%14:%");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopen("%15:%");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopen("%16:%");

		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());

		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
	
	
	@Override
	public List<Integer> finalSaturdayListValuesAB() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "AB");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "AB");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "AB");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "AB");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "AB");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "AB");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "AB");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "AB");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
	
	@Override
	public List<Integer> finalSaturdayListValuesAZ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "AZ");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "AZ");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "AZ");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "AZ");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "AZ");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "AZ");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "AZ");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "AZ");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
	
	@Override
	public List<Integer> finalSaturdayListValuesCA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "CA");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "CA");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "CA");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "CA");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "CA");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "CA");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "CA");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "CA");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
	
	@Override
	public List<Integer> finalSaturdayListValuesDE() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "DE");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "DE");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "DE");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "DE");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "DE");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "DE");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "DE");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "DE");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
	@Override
	public List<Integer> finalSaturdayListValuesFL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "FL");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "FL");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "FL");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "FL");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "FL");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "FL");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "FL");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "FL");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
	
	@Override
	public List<Integer> finalSaturdayListValuesID() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "ID");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "ID");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "ID");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "ID");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "ID");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "ID");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "ID");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "ID");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
	
	@Override
	public List<Integer> finalSaturdayListValuesIL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "IL");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "IL");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "IL");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "IL");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "IL");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "IL");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "IL");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "IL");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
	
	@Override
	public List<Integer> finalSaturdayListValuesIN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "IN");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "IN");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "IN");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "IN");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "IN");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "IN");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "IN");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "IN");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
	
	@Override
	public List<Integer> finalSaturdayListValuesLA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "LA");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "LA");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "LA");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "LA");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "LA");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "LA");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "LA");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "LA");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
	
	@Override
	public List<Integer> finalSaturdayListValuesMO() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "MO");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "MO");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "MO");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "MO");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "MO");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "MO");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "MO");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "MO");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}

	@Override
	public List<Integer> finalSaturdayListValuesNJ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "NJ");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "NJ");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "NJ");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "NJ");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "NJ");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "NJ");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "NJ");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "NJ");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
	
	@Override
	public List<Integer> finalSaturdayListValuesNV() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "NV");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "NV");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "NV");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "NV");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "NV");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "NV");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "NV");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "NV");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
	
	@Override
	public List<Integer> finalSaturdayListValuesPA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "PA");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "PA");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "PA");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "PA");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "PA");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "PA");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "PA");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "PA");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
	
	@Override
	public List<Integer> finalSaturdayListValuesTN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listSaturday9_ = businessRepository.findBySaturdayopenState("%09:%", "TN");
		List<String> listSaturday10_ = businessRepository.findBySaturdayopenState("%10:%", "TN");
		List<String> listSaturday11_ = businessRepository.findBySaturdayopenState("%10:%", "TN");
		List<String> listSaturday12_ = businessRepository.findBySaturdayopenState("%12:%", "TN");
		List<String> listSaturday13_ = businessRepository.findBySaturdayopenState("%13:%", "TN");
		List<String> listSaturday14_ = businessRepository.findBySaturdayopenState("%14:%", "TN");
		List<String> listSaturday15_ = businessRepository.findBySaturdayopenState("%15:%", "TN");
		List<String> listSaturday16_ = businessRepository.findBySaturdayopenState("%16:%", "TN");
		
		hmap.put("09:00", listSaturday9_.size());
		hmap.put("10:00", listSaturday10_.size());
		hmap.put("11:00", listSaturday11_.size());
		hmap.put("12:00", listSaturday12_.size());
		hmap.put("13:00", listSaturday13_.size());
		hmap.put("14:00", listSaturday14_.size());
		hmap.put("15:00", listSaturday15_.size());
		hmap.put("16:00", listSaturday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalSaturdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalSaturdayListValues.add(value);

		}
		log.debug("finalSaturdayListValues -> " + finalSaturdayListValues);

		return finalSaturdayListValues;
	}
}
