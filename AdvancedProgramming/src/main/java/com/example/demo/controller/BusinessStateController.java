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

	@RequestMapping(value = "/businessStateID")
	public String businessStateID(Model model) {
		log.debug("/businessStateID --> ");
		List<Business> listTest = businessRepository.findByState("ID");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStateID";
	}

	@RequestMapping(value = "/businessStateIL")
	public String businessStateIL(Model model) {
		log.debug("/businessStateIL --> ");
		List<Business> listTest = businessRepository.findByState("IL");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStateIL";
	}

	@RequestMapping(value = "/businessStateLA")
	public String businessStateLA(Model model) {
		log.debug("/businessStateLA --> ");
		List<Business> listTest = businessRepository.findByState("LA");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStateLA";
	}

	@RequestMapping(value = "/businessStateMO")
	public String businessStateMO(Model model) {
		log.debug("/businessStateMO --> ");
		List<Business> listTest = businessRepository.findByState("MO");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStateMO";
	}

	@RequestMapping(value = "/businessStateNJ")
	public String businessStateNJ(Model model) {
		log.debug("/businessStateNJ --> ");
		List<Business> listTest = businessRepository.findByState("NJ");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStateNJ";
	}

	@RequestMapping(value = "/businessStateNV")
	public String businessStateNV(Model model) {
		log.debug("/businessStateNV --> ");
		List<Business> listTest = businessRepository.findByState("NV");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStateNV";
	}

	@RequestMapping(value = "/businessStatePA")
	public String businessStatePA(Model model) {
		log.debug("/businessStatePA --> ");
		List<Business> listTest = businessRepository.findByState("PA");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStatePA";
	}

	@RequestMapping(value = "/businessStateTN")
	public String businessStateTN(Model model) {
		log.debug("/businessStateTN --> ");
		List<Business> listTest = businessRepository.findByState("TN");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStateTN";
	}

	@RequestMapping(value = "/businessStateIN")
	public String businessStateIN(Model model) {
		log.debug("/businessStateIN --> ");
		List<Business> listTest = businessRepository.findByState("IN");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStateIN";
	}
}
