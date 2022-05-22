package com.example.demo.controller;

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
import com.example.demo.model.User;
import com.example.demo.repository.BusinessRepository;
import com.example.demo.repository.BusinessStarsRepository;
import com.example.demo.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class AppController {

	private static final Logger log = LoggerFactory.getLogger(AppController.class);

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private BusinessStarsRepository businessStarsRepository;

	@Autowired
	private BusinessRepository businessRepository;
	
	
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

	@GetMapping("/users")
	public String listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);

		return "users";
	}

	@RequestMapping(value = "/businessStars")
	public String businessStars(Model model) {
		log.debug("/businessStars --> ");
		List<BusinessStars> listTest = businessStarsRepository.findAll();
		model.addAttribute("listTest", listTest);
		log.debug("listTest --> " + listTest);

		return "businessStars";
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