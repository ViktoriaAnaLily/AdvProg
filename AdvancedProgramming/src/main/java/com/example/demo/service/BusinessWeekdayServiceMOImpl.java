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
public class BusinessWeekdayServiceMOImpl implements BusinessWeekdayServiceMO {

	private static final Logger log = LoggerFactory.getLogger(BusinessWeekdayServiceMOImpl.class);

	private BusinessRepository businessRepository;

	@Autowired
	public BusinessWeekdayServiceMOImpl(BusinessRepository businessRepository) {
		log.debug("BusinessWeekdayService instantiated...");
		this.businessRepository = businessRepository;
	}

	@Override
	public List<String> finalMondayListTimes() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopen("%09:%");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopen("%10:%");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopen("%10:%");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopen("%12:%");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopen("%13:%");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopen("%14:%");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopen("%15:%");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopen("%16:%");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE.size());

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValues() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		

		List<String> listMonday9_ = businessRepository.findByMondayopen("%09:%");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopen("%10:%");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopen("%10:%");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopen("%12:%");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopen("%13:%");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopen("%14:%");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopen("%15:%");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopen("%16:%");
		log.debug("listMonday16_ --> " + listMonday16_.size());
		
		
		log.debug("AB ->" + businessRepository.findByMondayopenIsNull().size());
		
		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());

		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesAB() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "AB");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "AB");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "AB");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "AB");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "AB");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "AB");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "AB");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "AB");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesAB() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "AB");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "AB");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "AB");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "AB");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "AB");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "AB");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "AB");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "AB");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesAZ() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "AZ");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "AZ");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "AZ");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "AZ");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "AZ");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "AZ");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "AZ");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "AZ");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesAZ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "AZ");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "AZ");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "AZ");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "AZ");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "AZ");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "AZ");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "AZ");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "AZ");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesCA() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "CA");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "CA");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "CA");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "CA");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "CA");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "CA");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "CA");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "CA");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesCA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "CA");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "CA");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "CA");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "CA");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "CA");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "CA");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "CA");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "CA");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesDE() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "DE");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "DE");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "DE");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "DE");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "DE");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "DE");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "DE");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "DE");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesDE() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "DE");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "DE");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "DE");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "DE");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "DE");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "DE");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "DE");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "DE");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesFL() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "FL");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "FL");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "FL");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "FL");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "FL");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "FL");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "FL");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "FL");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesFL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "FL");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "FL");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "FL");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "FL");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "FL");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "FL");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "FL");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "FL");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesID() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "ID");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "ID");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "ID");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "ID");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "ID");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "ID");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "ID");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "ID");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesID() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "ID");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "ID");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "ID");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "ID");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "ID");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "ID");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "ID");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "ID");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesIL() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "IL");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "IL");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "IL");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "IL");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "IL");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "IL");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "IL");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "IL");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesIL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "IL");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "IL");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "IL");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "IL");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "IL");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "IL");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "IL");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "IL");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesIN() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "IN");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "IN");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "IN");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "IN");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "IN");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "IN");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "IN");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "IN");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesIN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "IN");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "IN");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "IN");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "IN");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "IN");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "IN");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "IN");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "IN");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesLA() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "LA");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "LA");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "LA");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "LA");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "LA");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "LA");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "LA");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "LA");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesLA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "LA");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "LA");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "LA");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "LA");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "LA");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "LA");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "LA");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "LA");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesMO() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "MO");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "MO");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "MO");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "MO");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "MO");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "MO");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "MO");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "MO");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesMO() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "MO");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "MO");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "MO");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "MO");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "MO");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "MO");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "MO");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "MO");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesNJ() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "NJ");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "NJ");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "NJ");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "NJ");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "NJ");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "NJ");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "NJ");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "NJ");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesNJ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "NJ");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "NJ");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "NJ");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "NJ");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "NJ");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "NJ");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "NJ");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "NJ");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesNV() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "NV");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "NV");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "NV");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "NV");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "NV");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "NV");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "NV");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "NV");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesNV() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "NV");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "NV");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "NV");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "NV");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "NV");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "NV");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "NV");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "NV");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesPA() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "PA");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "PA");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "PA");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "PA");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "PA");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "PA");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "PA");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "PA");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesPA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "PA");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "PA");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "PA");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "PA");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "PA");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "PA");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "PA");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "PA");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}

	@Override
	public List<String> finalMondayListTimesTN() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "TN");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "TN");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "TN");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "TN");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "TN");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "TN");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "TN");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "TN");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmapTREE.put("09:00", listMonday9_.size());
		hmapTREE.put("10:00", listMonday10_.size());
		hmapTREE.put("11:00", listMonday11_.size());
		hmapTREE.put("12:00", listMonday12_.size());
		hmapTREE.put("13:00", listMonday13_.size());
		hmapTREE.put("14:00", listMonday14_.size());
		hmapTREE.put("15:00", listMonday15_.size());
		hmapTREE.put("16:00", listMonday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValuesTN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenState("%09:%", "TN");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenState("%10:%", "TN");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenState("%10:%", "TN");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenState("%12:%", "TN");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenState("%13:%", "TN");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenState("%14:%", "TN");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenState("%15:%", "TN");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenState("%16:%", "TN");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}
}