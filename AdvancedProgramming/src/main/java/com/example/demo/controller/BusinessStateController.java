package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Business;
import com.example.demo.model.BusinessStars;
import com.example.demo.repository.BusinessRepository;
import com.example.demo.repository.BusinessStarsRepository;
import com.example.demo.repository.UserRepository;

@Controller
public class BusinessStateController {

	private static final Logger log = LoggerFactory.getLogger(AppController.class);

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private BusinessStarsRepository businessStarsRepository;

	@Autowired
	private BusinessRepository businessRepository;

	@RequestMapping(value = "/businessState")
	public String businessStars(Model model) {
		log.debug("/businessStars --> ");

		return "businessState";
	}

	@RequestMapping(value = "/businessStateAB")
	public String businessStateAB(Model model) {
		log.debug("/businessStateAB --> ");
		List<Business> listTest = businessRepository.findByState("AB");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStateAB";
	}

	@RequestMapping(value = "/businessStateAZ")
	public String businessStateAZ(Model model) {
		log.debug("/businessStateAB --> ");
		List<Business> listTest = businessRepository.findByState("AZ");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStateAZ";
	}

	@RequestMapping(value = "/businessStateCA")
	public String businessStateCA(Model model) {
		log.debug("/businessStateCA --> ");
		List<Business> listTest = businessRepository.findByState("CA");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStateCA";
	}

	@RequestMapping(value = "/businessStateDE")
	public String businessStateDE(Model model) {
		log.debug("/businessStateDE --> ");
		List<Business> listTest = businessRepository.findByState("DE");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStateDE";
	}

	@RequestMapping(value = "/businessStateFL")
	public String businessStateFL(Model model) {
		log.debug("/businessStateFL --> ");
		List<Business> listTest = businessRepository.findByState("FL");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStateFL";
	}
}
