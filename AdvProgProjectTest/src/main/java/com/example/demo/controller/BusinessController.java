package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.AmountOfBusinessState;
import com.example.demo.model.Business;
import com.example.demo.model.BusinessIsOpen;
import com.example.demo.model.BusinessReview;
import com.example.demo.model.BusinessStars;
import com.example.demo.model.FridayUntil23;
import com.example.demo.repository.AmountOfBusinessStateRepository;
import com.example.demo.repository.BusinessIsOpenRepository;
import com.example.demo.repository.BusinessRepository;
import com.example.demo.repository.BusinessReviewRepository;
import com.example.demo.repository.BusinessStarsRepository;
import com.example.demo.repository.FridayUntil23Repository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class BusinessController {

	private static final Logger log = LoggerFactory.getLogger(BusinessController.class);

	@Autowired
	private BusinessRepository businessRepository;

	@Autowired
	private FridayUntil23Repository fridayUntil23Repository;

	@Autowired
	private AmountOfBusinessStateRepository amountOfBusinessStateRepository;
	
	@Autowired
	private BusinessStarsRepository businessStarsRepository;

	@Autowired
	private BusinessReviewRepository businessReviewRepository;
	
	@Autowired
	private BusinessIsOpenRepository businessIsOpenRepository;
	
	@RequestMapping(value = "/all")
	public String all(Model model) {
		log.debug("/all --> ");
		List<Business> listTest = businessRepository.findAll();
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "business";
	}

	@RequestMapping(value = "/fridayUntil23")
	public String fridayUntil23(Model model) {
		log.debug("/fridayUntil23 --> ");
		List<FridayUntil23> listTest = fridayUntil23Repository.findAll();
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "test";
	}
	
	@RequestMapping(value = "/amountOfBusinessState")
	public String amountOfBusinessState(Model model) {
		log.debug("/amountOfBusinessState --> ");
		List<AmountOfBusinessState> listTest = amountOfBusinessStateRepository.findAll();
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "amountOfBusinessState";
	}
	
	@RequestMapping(value = "/businessStars")
	public String businessStars(Model model) {
		log.debug("/businessStars --> ");
		List<BusinessStars> listTest = businessStarsRepository.findAll();
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStars";
	}
	
	@RequestMapping(value = "/businessReview")
	public String businessReview(Model model) {
		log.debug("/businessReview --> ");
		List<BusinessReview> listTest = businessReviewRepository.findAll();
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessReview";
	}
	
	@RequestMapping(value = "/businessIsOpen")
	public String businessIsOpen(Model model) {
		log.debug("/businessIsOpen --> ");
		List<BusinessIsOpen> listTest = businessIsOpenRepository.findAll();
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessIsOpen";
	}
}