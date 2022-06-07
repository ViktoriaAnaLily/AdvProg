package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.BusinessRepository;

@Service
public class BusinessWeekdayServiceImpl implements BusinessWeekdayService {

	private static final Logger log = LoggerFactory.getLogger(BusinessWeekdayServiceImpl.class);

	private BusinessRepository businessRepository;

	@Autowired
	public BusinessWeekdayServiceImpl(BusinessRepository businessRepository) {
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

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalMondayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalMondayListTimes.add(time);

		}
		log.debug("finalMondayListTimes -> " + finalMondayListTimes);

		return finalMondayListTimes;
	}

	@Override
	public List<Integer> finalMondayListValues() {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

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

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap);

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

		List<String> listMonday9_ = businessRepository.findByMondayopenAB("%09:%", "AB");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenAB("%10:%", "AB");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenAB("%10:%", "AB");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenAB("%12:%", "AB");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenAB("%13:%", "AB");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenAB("%14:%", "AB");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenAB("%15:%", "AB");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenAB("%16:%", "AB");
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
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		List<String> listMonday9_ = businessRepository.findByMondayopenAB("%09:%", "AB");
		log.debug("listMonday9_ --> " + listMonday9_.size());

		List<String> listMonday10_ = businessRepository.findByMondayopenAB("%10:%", "AB");
		log.debug("listMonday10_ --> " + listMonday10_.size());

		List<String> listMonday11_ = businessRepository.findByMondayopenAB("%10:%", "AB");
		log.debug("listMonday11_ --> " + listMonday11_.size());

		List<String> listMonday12_ = businessRepository.findByMondayopenAB("%12:%", "AB");
		log.debug("listMonday12_ --> " + listMonday12_.size());

		List<String> listMonday13_ = businessRepository.findByMondayopenAB("%13:%", "AB");
		log.debug("listMonday13_ --> " + listMonday13_.size());

		List<String> listMonday14_ = businessRepository.findByMondayopenAB("%14:%", "AB");
		log.debug("listMonday14_ --> " + listMonday14_.size());

		List<String> listMonday15_ = businessRepository.findByMondayopenAB("%15:%", "AB");
		log.debug("listMonday15_ --> " + listMonday15_.size());

		List<String> listMonday16_ = businessRepository.findByMondayopenAB("%16:%", "AB");
		log.debug("listMonday16_ --> " + listMonday16_.size());

		hmap.put("09:00", listMonday9_.size());
		hmap.put("10:00", listMonday10_.size());
		hmap.put("11:00", listMonday11_.size());
		hmap.put("12:00", listMonday12_.size());
		hmap.put("13:00", listMonday13_.size());
		hmap.put("14:00", listMonday14_.size());
		hmap.put("15:00", listMonday15_.size());
		hmap.put("16:00", listMonday16_.size());
		log.debug("hmap -> " + hmap);

		List<Integer> finalMondayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalMondayListValues.add(value);

		}
		log.debug("finalMondayListValues -> " + finalMondayListValues);

		return finalMondayListValues;
	}
}
