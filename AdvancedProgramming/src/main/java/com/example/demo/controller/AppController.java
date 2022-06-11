package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Business;
import com.example.demo.model.BusinessStars;
import com.example.demo.model.BusinessStarsStateConnection;
import com.example.demo.model.BusinessState;
import com.example.demo.model.User;
import com.example.demo.repository.BusinessRepository;
import com.example.demo.repository.BusinessStarsRepository;
import com.example.demo.repository.BusinessStarsStateConnectionRepository;
import com.example.demo.repository.BusinessStateRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.BusinessCategoryService;
import com.example.demo.service.BusinessWeekdayServiceMO;
import com.example.demo.service.BusinessWeekdayServiceTUE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class AppController {

	private static final Logger log = LoggerFactory.getLogger(AppController.class);

	private BusinessWeekdayServiceMO businessWeekdayService;
	private BusinessWeekdayServiceTUE businessWeekdayServiceTUE;
	private BusinessCategoryService businessCategoryService;


	@Autowired
	public AppController(BusinessWeekdayServiceMO businessWeekdayService,
			BusinessWeekdayServiceTUE businessWeekdayServiceTUE, BusinessCategoryService businessCategoryService) {
		this.businessWeekdayService = businessWeekdayService;
		this.businessWeekdayServiceTUE = businessWeekdayServiceTUE;
		this.businessCategoryService = businessCategoryService;

	}

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private BusinessStarsRepository businessStarsRepository;

	@Autowired
	private BusinessStateRepository businessStateRepository;

	@Autowired
	private BusinessRepository businessRepository;

	@Autowired
	private BusinessStarsStateConnectionRepository businessStarsStateConnectionRepository;

	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());

		return "signup_form";
	}

	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);

		userRepo.save(user);

		return "register_success";
	}

//Change userstest to users
	@GetMapping("/usersTest")
	public String listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		// List<BusinessStars> listTest = businessStarsRepository.findAll();
		// model.addAttribute("listTest", listTest);
		return "users";
	}
	
	// TEST
	@GetMapping("/users")
	public String listUsersTest(Model model) {
		
		List<BusinessState> listTestState = businessStateRepository.findAll();
		model.addAttribute("listTestState", listTestState);
		
		model.addAttribute("finalListAll", businessCategoryService.businessCategoryAll());
		model.addAttribute("finalListAB", businessCategoryService.businessCategoryAB());
		model.addAttribute("finalListAZ", businessCategoryService.businessCategoryAZ());
		model.addAttribute("finalListCA", businessCategoryService.businessCategoryCA());
		model.addAttribute("finalListDE", businessCategoryService.businessCategoryDE());
		model.addAttribute("finalListFL", businessCategoryService.businessCategoryFL());
		model.addAttribute("finalListID", businessCategoryService.businessCategoryID());
		model.addAttribute("finalListIN", businessCategoryService.businessCategoryIN());
		model.addAttribute("finalListIL", businessCategoryService.businessCategoryIL());
		
		model.addAttribute("finalListLA", businessCategoryService.businessCategoryLA());
		model.addAttribute("finalListMO", businessCategoryService.businessCategoryMO());
		model.addAttribute("finalListNJ", businessCategoryService.businessCategoryNJ());
		model.addAttribute("finalListNV", businessCategoryService.businessCategoryNV());
		model.addAttribute("finalListPA", businessCategoryService.businessCategoryPA());
		model.addAttribute("finalListTN", businessCategoryService.businessCategoryTN());
		

	
		return "categories";
	}
	
	/*
	@GetMapping("/users")
	public String listUsersTest(Model model) {
		// List<User> listUsers = userRepo.findAll();
		// model.addAttribute("listUsers", listUsers);
		log.debug("businessWeekdayService...");

		model.addAttribute("finalMondayListTimes", businessWeekdayService.finalMondayListTimes());
		model.addAttribute("finalMondayListValues", businessWeekdayService.finalMondayListValues());

		model.addAttribute("finalMondayListTimesAB", businessWeekdayService.finalMondayListTimesAB());
		model.addAttribute("finalMondayListValuesAB", businessWeekdayService.finalMondayListValuesAB());

		model.addAttribute("finalMondayListTimesAZ", businessWeekdayService.finalMondayListTimesAZ());
		model.addAttribute("finalMondayListValuesAZ", businessWeekdayService.finalMondayListValuesAZ());

		model.addAttribute("finalMondayListTimesCA", businessWeekdayService.finalMondayListTimesCA());
		model.addAttribute("finalMondayListValuesCA", businessWeekdayService.finalMondayListValuesCA());

		model.addAttribute("finalMondayListTimesDE", businessWeekdayService.finalMondayListTimesDE());
		model.addAttribute("finalMondayListValuesDE", businessWeekdayService.finalMondayListValuesDE());

		model.addAttribute("finalMondayListTimesFL", businessWeekdayService.finalMondayListTimesFL());
		model.addAttribute("finalMondayListValuesFL", businessWeekdayService.finalMondayListValuesFL());

		model.addAttribute("finalMondayListTimesID", businessWeekdayService.finalMondayListTimesID());
		model.addAttribute("finalMondayListValuesID", businessWeekdayService.finalMondayListValuesID());

		model.addAttribute("finalMondayListTimesIL", businessWeekdayService.finalMondayListTimesIL());
		model.addAttribute("finalMondayListValuesIL", businessWeekdayService.finalMondayListValuesIL());

		model.addAttribute("finalMondayListTimesIN", businessWeekdayService.finalMondayListTimesIN());
		model.addAttribute("finalMondayListValuesIN", businessWeekdayService.finalMondayListValuesIN());

		model.addAttribute("finalMondayListTimesLA", businessWeekdayService.finalMondayListTimesLA());
		model.addAttribute("finalMondayListValuesLA", businessWeekdayService.finalMondayListValuesLA());

		model.addAttribute("finalMondayListTimesMO", businessWeekdayService.finalMondayListTimesMO());
		model.addAttribute("finalMondayListValuesMO", businessWeekdayService.finalMondayListValuesMO());

		model.addAttribute("finalMondayListTimesNJ", businessWeekdayService.finalMondayListTimesNJ());
		model.addAttribute("finalMondayListValuesNJ", businessWeekdayService.finalMondayListValuesNJ());

		model.addAttribute("finalMondayListTimesNV", businessWeekdayService.finalMondayListTimesNV());
		model.addAttribute("finalMondayListValuesNV", businessWeekdayService.finalMondayListValuesNV());

		model.addAttribute("finalMondayListTimesPA", businessWeekdayService.finalMondayListTimesPA());
		model.addAttribute("finalMondayListValuesPA", businessWeekdayService.finalMondayListValuesPA());

		model.addAttribute("finalMondayListTimesTN", businessWeekdayService.finalMondayListTimesTN());
		model.addAttribute("finalMondayListValuesTN", businessWeekdayService.finalMondayListValuesTN());

		model.addAttribute("finalTuesdayListTimes", businessWeekdayServiceTUE.finalTuesdayListTimes());
		model.addAttribute("finalTuesdayListValues", businessWeekdayServiceTUE.finalTuesdayListValues());

		model.addAttribute("finalTuesdayListTimesAB", businessWeekdayServiceTUE.finalTuesdayListTimesAB());
		model.addAttribute("finalTuesdayListValuesAB", businessWeekdayServiceTUE.finalTuesdayListValuesAB());

		model.addAttribute("finalTuesdayListTimesAZ", businessWeekdayServiceTUE.finalTuesdayListTimesAZ());
		model.addAttribute("finalTuesdayListValuesAZ", businessWeekdayServiceTUE.finalTuesdayListValuesAZ());

		model.addAttribute("finalTuesdayListTimesCA", businessWeekdayServiceTUE.finalTuesdayListTimesCA());
		model.addAttribute("finalTuesdayListValuesCA", businessWeekdayServiceTUE.finalTuesdayListValuesCA());

		model.addAttribute("finalTuesdayListTimesDE", businessWeekdayServiceTUE.finalTuesdayListTimesDE());
		model.addAttribute("finalTuesdayListValuesDE", businessWeekdayServiceTUE.finalTuesdayListValuesDE());

		model.addAttribute("finalTuesdayListTimesFL", businessWeekdayServiceTUE.finalTuesdayListTimesFL());
		model.addAttribute("finalTuesdayListValuesFL", businessWeekdayServiceTUE.finalTuesdayListValuesFL());

		model.addAttribute("finalTuesdayListTimesID", businessWeekdayServiceTUE.finalTuesdayListTimesID());
		model.addAttribute("finalTuesdayListValuesID", businessWeekdayServiceTUE.finalTuesdayListValuesID());
		model.addAttribute("finalTuesdayListTimesIL", businessWeekdayServiceTUE.finalTuesdayListTimesIL());
		model.addAttribute("finalTuesdayListValuesIL", businessWeekdayServiceTUE.finalTuesdayListValuesIL());
		model.addAttribute("finalTuesdayListTimesIN", businessWeekdayServiceTUE.finalTuesdayListTimesIN());
		model.addAttribute("finalTuesdayListValuesIN", businessWeekdayServiceTUE.finalTuesdayListValuesIN());
		model.addAttribute("finalTuesdayListTimesLA", businessWeekdayServiceTUE.finalTuesdayListTimesLA());
		model.addAttribute("finalTuesdayListValuesLA", businessWeekdayServiceTUE.finalTuesdayListValuesLA());
		model.addAttribute("finalTuesdayListTimesMO", businessWeekdayServiceTUE.finalTuesdayListTimesMO());
		model.addAttribute("finalTuesdayListValuesMO", businessWeekdayServiceTUE.finalTuesdayListValuesMO());

		model.addAttribute("finalTuesdayListTimesNJ", businessWeekdayServiceTUE.finalTuesdayListTimesNJ());
		model.addAttribute("finalTuesdayListValuesNJ", businessWeekdayServiceTUE.finalTuesdayListValuesNJ());
		model.addAttribute("finalTuesdayListTimesNV", businessWeekdayServiceTUE.finalTuesdayListTimesNV());
		model.addAttribute("finalTuesdayListValuesNV", businessWeekdayServiceTUE.finalTuesdayListValuesNV());
		model.addAttribute("finalTuesdayListTimesPA", businessWeekdayServiceTUE.finalTuesdayListTimesPA());
		model.addAttribute("finalTuesdayListValuesPA", businessWeekdayServiceTUE.finalTuesdayListValuesPA());
		model.addAttribute("finalTuesdayListTimesTN", businessWeekdayServiceTUE.finalTuesdayListTimesTN());
		model.addAttribute("finalTuesdayListValuesTN", businessWeekdayServiceTUE.finalTuesdayListValuesTN());

		List<BusinessStars> listTest = businessStarsRepository.findAll();
		model.addAttribute("listTest", listTest);
		List<BusinessState> listTestState = businessStateRepository.findAll();
		model.addAttribute("listTestState", listTestState);
		List<BusinessStarsStateConnection> listTestStateAll = businessStarsStateConnectionRepository.findAll();
		model.addAttribute("listTestStateAll", listTestStateAll);

		return "test";
	}



*/
	
	@RequestMapping(value = "/businessStars")
	public String businessStars(Model model) {
		log.debug("/businessStars --> ");
		List<BusinessStars> listTest = businessStarsRepository.findAll();
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStars";
	}

	@RequestMapping(value = "/businessOpenClose")
	String businessOpenClose(Model model) {
		log.debug("/businessOpenClose --> ");
		List<Business> listTest = businessRepository.findAll();
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessOpenClose";
	}

	@RequestMapping(value = "/businessOpen")
	public String businessOpen(Model model) {
		log.debug("/businessOpen --> ");
		List<Business> listTest = businessRepository.findByIs_open(1);
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessOpen";
	}

	@RequestMapping(value = "/businessClose")
	public String businessClose(Model model) {
		log.debug("/businessClose --> ");
		List<Business> listTest = businessRepository.findByIs_open(0);
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessClose";
	}

	@RequestMapping(value = "/businessStars1_0")
	public String businessStars1_0(Model model) {
		log.debug("/businessStars --> ");
		List<Business> listTest = businessRepository.findByStars("1.0");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStars1_0";
	}

	@RequestMapping(value = "/businessStars1_5")
	public String businessStars1_5(Model model) {
		log.debug("/businessStars --> ");
		List<Business> listTest = businessRepository.findByStars("1,50");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStars1_5";
	}

	@RequestMapping(value = "/businessStars2_0")
	public String businessStars2_0(Model model) {
		log.debug("/businessStars --> ");
		List<Business> listTest = businessRepository.findByStars("2,00");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStars2_0";
	}

	@RequestMapping(value = "/businessStars2_5")
	public String businessStars2_5(Model model) {
		log.debug("/businessStars --> ");
		List<Business> listTest = businessRepository.findByStars("2,50");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStars2_5";
	}

	@RequestMapping(value = "/businessStar3_0")
	public String businessStars3_0(Model model) {
		log.debug("/businessStars --> ");
		List<Business> listTest = businessRepository.findByStars("3,00");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStars3_0";
	}

	@RequestMapping(value = "/businessStars3_5")
	public String businessStars3_5(Model model) {
		log.debug("/businessStars --> ");
		List<Business> listTest = businessRepository.findByStars("3,50");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStars3_5";
	}

	@RequestMapping(value = "/businessStars4_0")
	public String businessStars4_0(Model model) {
		log.debug("/businessStars --> ");
		List<Business> listTest = businessRepository.findByStars("4,00");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStars4_0";
	}

	@RequestMapping(value = "/businessStars4_5")
	public String businessStars4_5(Model model) {
		log.debug("/businessStars --> ");
		List<Business> listTest = businessRepository.findByStars("4,50");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStars4_5";
	}

	@RequestMapping(value = "/businessStars5_0")
	public String businessStars5_0(Model model) {
		log.debug("/businessStars --> ");
		List<Business> listTest = businessRepository.findByStars("5,00");
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStars5_0";
	}
}