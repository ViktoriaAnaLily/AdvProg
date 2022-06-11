package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demo.repository.BusinessRepository;

@Service
public class BusinessWeekdayServiceTUEImpl implements BusinessWeekdayServiceTUE {

	private static final Logger log = LoggerFactory.getLogger(BusinessWeekdayServiceTUEImpl.class);

	private BusinessRepository businessRepository;

	@Autowired
	public BusinessWeekdayServiceTUEImpl(BusinessRepository businessRepository) {
		log.debug("BusinessWeekdayService instantiated...");
		this.businessRepository = businessRepository;
	}

	@Override
	public List<String> finalTuesdayListTimes() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopen("%09:%");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopen("%10:%");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopen("%10:%");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopen("%12:%");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopen("%13:%");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopen("%14:%");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopen("%15:%");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopen("%16:%");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE.size());

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValues() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopen("%09:%");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopen("%10:%");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopen("%10:%");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopen("%12:%");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopen("%13:%");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopen("%14:%");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopen("%15:%");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopen("%16:%");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		log.debug("AB ->" + businessRepository.findByMondayopenIsNull().size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());

		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesAB() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "AB");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "AB");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "AB");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "AB");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "AB");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "AB");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "AB");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "AB");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesAB() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "AB");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "AB");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "AB");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "AB");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "AB");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "AB");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "AB");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "AB");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesAZ() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "AZ");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "AZ");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "AZ");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "AZ");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "AZ");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "AZ");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "AZ");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "AZ");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesAZ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "AZ");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "AZ");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "AZ");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "AZ");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "AZ");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "AZ");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "AZ");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "AZ");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesCA() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "CA");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "CA");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "CA");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "CA");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "CA");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "CA");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "CA");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "CA");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesCA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "CA");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "CA");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "CA");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "CA");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "CA");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "CA");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "CA");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "CA");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesDE() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "DE");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "DE");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "DE");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "DE");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "DE");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "DE");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "DE");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "DE");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesDE() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "DE");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "DE");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "DE");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "DE");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "DE");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "DE");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "DE");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "DE");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesFL() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "FL");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "FL");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "FL");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "FL");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "FL");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "FL");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "FL");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "FL");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesFL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "FL");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "FL");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "FL");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "FL");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "FL");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "FL");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "FL");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "FL");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesID() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "ID");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "ID");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "ID");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "ID");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "ID");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "ID");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "ID");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "ID");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesID() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "ID");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "ID");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "ID");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "ID");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "ID");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "ID");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "ID");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "ID");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesIL() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "IL");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "IL");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "IL");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "IL");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "IL");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "IL");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "IL");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "IL");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesIL() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "IL");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "IL");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "IL");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "IL");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "IL");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "IL");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "IL");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "IL");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesIN() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "IN");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "IN");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "IN");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "IN");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "IN");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "IN");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "IN");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "IL");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesIN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "IN");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "IN");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "IN");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "IN");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "IN");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "IN");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "IN");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "IN");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesLA() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "LA");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "LA");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "LA");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "LA");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "LA");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "LA");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "LA");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "LA");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesLA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "LA");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "LA");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "LA");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "LA");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "LA");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "LA");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "LA");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "LA");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesMO() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "MO");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "MO");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "MO");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "MO");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "MO");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "MO");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "MO");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "MO");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesMO() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "MO");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "MO");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "MO");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "MO");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "MO");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "MO");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "MO");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "MO");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesNJ() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "NJ");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "NJ");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "NJ");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "NJ");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "NJ");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "NJ");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "NJ");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "NJ");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesNJ() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "NJ");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "NJ");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "NJ");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "NJ");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "NJ");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "NJ");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "NJ");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "NJ");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesNV() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "NV");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "NV");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "NV");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "NV");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "NV");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "NV");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "NV");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "NV");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesNV() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "NV");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "NV");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "NV");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "NV");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "NV");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "NV");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "NV");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "NV");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesPA() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "PA");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "PA");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "PA");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "PA");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "PA");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "PA");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "PA");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "PA");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesPA() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "PA");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "PA");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "PA");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "PA");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "PA");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "PA");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "PA");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "PA");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

	@Override
	public List<String> finalTuesdayListTimesTN() {
		TreeMap<String, Integer> hmapTREE = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "TN");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "TN");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "TN");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "TN");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "TN");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "TN");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "TN");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "TN");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmapTREE.put("09:00", listTuesday9_.size());
		hmapTREE.put("10:00", listTuesday10_.size());
		hmapTREE.put("11:00", listTuesday11_.size());
		hmapTREE.put("12:00", listTuesday12_.size());
		hmapTREE.put("13:00", listTuesday13_.size());
		hmapTREE.put("14:00", listTuesday14_.size());
		hmapTREE.put("15:00", listTuesday15_.size());
		hmapTREE.put("16:00", listTuesday16_.size());

		log.debug("hmapTREE -> " + hmapTREE);

		List<String> finalTuesdayListTimes = new ArrayList<String>();

		for (String time : hmapTREE.keySet()) {
			finalTuesdayListTimes.add(time);

		}
		log.debug("finalTuesdayListTimes -> " + finalTuesdayListTimes);

		return finalTuesdayListTimes;
	}

	@Override
	public List<Integer> finalTuesdayListValuesTN() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();

		List<String> listTuesday9_ = businessRepository.findByTuesdayopenState("%09:%", "TN");
		log.debug("listTuesday9_ --> " + listTuesday9_.size());

		List<String> listTuesday10_ = businessRepository.findByTuesdayopenState("%10:%", "TN");
		log.debug("listTuesday10_ --> " + listTuesday10_.size());

		List<String> listTuesday11_ = businessRepository.findByTuesdayopenState("%10:%", "TN");
		log.debug("listTuesday11_ --> " + listTuesday11_.size());

		List<String> listTuesday12_ = businessRepository.findByTuesdayopenState("%12:%", "TN");
		log.debug("listTuesday12_ --> " + listTuesday12_.size());

		List<String> listTuesday13_ = businessRepository.findByTuesdayopenState("%13:%", "TN");
		log.debug("listTuesday13_ --> " + listTuesday13_.size());

		List<String> listTuesday14_ = businessRepository.findByTuesdayopenState("%14:%", "TN");
		log.debug("listTuesday14_ --> " + listTuesday14_.size());

		List<String> listTuesday15_ = businessRepository.findByTuesdayopenState("%15:%", "TN");
		log.debug("listTuesday15_ --> " + listTuesday15_.size());

		List<String> listTuesday16_ = businessRepository.findByTuesdayopenState("%16:%", "TN");
		log.debug("listTuesday16_ --> " + listTuesday16_.size());

		hmap.put("09:00", listTuesday9_.size());
		hmap.put("10:00", listTuesday10_.size());
		hmap.put("11:00", listTuesday11_.size());
		hmap.put("12:00", listTuesday12_.size());
		hmap.put("13:00", listTuesday13_.size());
		hmap.put("14:00", listTuesday14_.size());
		hmap.put("15:00", listTuesday15_.size());
		hmap.put("16:00", listTuesday16_.size());
		log.debug("hmap -> " + hmap.size());

		List<Integer> finalTuesdayListValues = new ArrayList<Integer>();

		for (Integer value : hmap.values()) {
			finalTuesdayListValues.add(value);

		}
		log.debug("finalTuesdayListValues -> " + finalTuesdayListValues);

		return finalTuesdayListValues;
	}

}
