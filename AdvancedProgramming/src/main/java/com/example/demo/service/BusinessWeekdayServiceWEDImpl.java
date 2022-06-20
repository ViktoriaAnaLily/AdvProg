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
public class BusinessWeekdayServiceWEDImpl implements BusinessWeekdayServiceWED{
	private static final Logger log = LoggerFactory.getLogger(BusinessWeekdayServiceWEDImpl.class);

	private BusinessRepository businessRepository;

	@Autowired
	public BusinessWeekdayServiceWEDImpl(BusinessRepository businessRepository) {
		log.debug("BusinessWeekdayService instantiated...");
		this.businessRepository = businessRepository;
	}
	
	@Override
	public List<Integer> finalWednesdayListValues() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopen("%09:%");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopen("%10:%");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopen("%10:%");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopen("%12:%");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopen("%13:%");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopen("%14:%");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopen("%15:%");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopen("%16:%");

		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());

		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}
	
	
	@Override
	public List<Integer> finalWednesdayListValuesAB() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "AB");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "AB");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "AB");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "AB");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "AB");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "AB");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "AB");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "AB");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}

	
	@Override
	public List<Integer> finalWednesdayListValuesAZ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "AZ");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "AZ");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "AZ");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "AZ");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "AZ");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "AZ");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "AZ");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "AZ");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}
	
	@Override
	public List<Integer> finalWednesdayListValuesCA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "CA");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "CA");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "CA");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "CA");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "CA");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "CA");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "CA");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "CA");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}
	
	@Override
	public List<Integer> finalWednesdayListValuesDE() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "DE");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "DE");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "DE");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "DE");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "DE");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "DE");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "DE");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "DE");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}
	
	@Override
	public List<Integer> finalWednesdayListValuesFL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "FL");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "FL");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "FL");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "FL");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "FL");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "FL");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "FL");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "FL");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}
	
	@Override
	public List<Integer> finalWednesdayListValuesID() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "ID");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "ID");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "ID");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "ID");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "ID");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "ID");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "ID");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "ID");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}
	@Override
	public List<Integer> finalWednesdayListValuesIL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "IL");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "IL");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "IL");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "IL");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "IL");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "IL");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "IL");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "IL");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}
	
	@Override
	public List<Integer> finalWednesdayListValuesIN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "IN");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "IN");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "IN");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "IN");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "IN");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "IN");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "IN");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "IN");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}
	
	@Override
	public List<Integer> finalWednesdayListValuesLA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "LA");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "LA");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "LA");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "LA");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "LA");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "LA");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "LA");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "LA");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}
	
	@Override
	public List<Integer> finalWednesdayListValuesMO() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "MO");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "MO");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "MO");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "MO");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "MO");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "MO");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "MO");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "MO");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}
	
	@Override
	public List<Integer> finalWednesdayListValuesNJ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "NJ");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "NJ");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "NJ");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "NJ");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "NJ");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "NJ");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "NJ");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "NJ");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}
	
	@Override
	public List<Integer> finalWednesdayListValuesNV() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "NV");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "NV");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "NV");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "NV");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "NV");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "NV");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "NV");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "NV");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}

	
	@Override
	public List<Integer> finalWednesdayListValuesPA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "PA");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "PA");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "PA");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "PA");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "PA");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "PA");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "PA");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "PA");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}
	
	@Override
	public List<Integer> finalWednesdayListValuesTN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listWednesday9_ = businessRepository.findByWednesdayopenState("%09:%", "TN");
		List<String> listWednesday10_ = businessRepository.findByWednesdayopenState("%10:%", "TN");
		List<String> listWednesday11_ = businessRepository.findByWednesdayopenState("%10:%", "TN");
		List<String> listWednesday12_ = businessRepository.findByWednesdayopenState("%12:%", "TN");
		List<String> listWednesday13_ = businessRepository.findByWednesdayopenState("%13:%", "TN");
		List<String> listWednesday14_ = businessRepository.findByWednesdayopenState("%14:%", "TN");
		List<String> listWednesday15_ = businessRepository.findByWednesdayopenState("%15:%", "TN");
		List<String> listWednesday16_ = businessRepository.findByWednesdayopenState("%16:%", "TN");
		
		hmap.put("09:00", listWednesday9_.size());
		hmap.put("10:00", listWednesday10_.size());
		hmap.put("11:00", listWednesday11_.size());
		hmap.put("12:00", listWednesday12_.size());
		hmap.put("13:00", listWednesday13_.size());
		hmap.put("14:00", listWednesday14_.size());
		hmap.put("15:00", listWednesday15_.size());
		hmap.put("16:00", listWednesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalWednesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalWednesdayListValues.add(value);

		}
		log.debug("finalWednesdayListValues -> " + finalWednesdayListValues);

		return finalWednesdayListValues;
	}

	
}
