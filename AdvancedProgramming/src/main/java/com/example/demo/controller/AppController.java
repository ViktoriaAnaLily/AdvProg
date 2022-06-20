package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
import com.example.demo.service.BusinessWeekdayServiceFRI;
import com.example.demo.service.BusinessWeekdayServiceMO;
import com.example.demo.service.BusinessWeekdayServiceSAT;
import com.example.demo.service.BusinessWeekdayServiceSUN;
import com.example.demo.service.BusinessWeekdayServiceTHU;
import com.example.demo.service.BusinessWeekdayServiceTUE;
import com.example.demo.service.BusinessWeekdayServiceWED;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class AppController {

	private static final Logger log = LoggerFactory.getLogger(AppController.class);

	private BusinessWeekdayServiceMO businessWeekdayService;
	private BusinessWeekdayServiceTUE businessWeekdayServiceTUE;
	private BusinessWeekdayServiceWED businessWeekdayServiceWED;
	private BusinessWeekdayServiceTHU businessWeekdayServiceTHU;
	private BusinessWeekdayServiceFRI businessWeekdayServiceFRI;
	private BusinessWeekdayServiceSAT businessWeekdayServiceSAT;
	private BusinessWeekdayServiceSUN businessWeekdayServiceSUN;

	private BusinessCategoryService businessCategoryService;

	@Autowired
	public AppController(BusinessWeekdayServiceMO businessWeekdayService,
			BusinessWeekdayServiceTUE businessWeekdayServiceTUE, BusinessCategoryService businessCategoryService,
			BusinessWeekdayServiceWED businessWeekdayServiceWED, BusinessWeekdayServiceTHU businessWeekdayServiceTHU,
			BusinessWeekdayServiceFRI businessWeekdayServiceFRI, BusinessWeekdayServiceSAT businessWeekdayServiceSAT,
			BusinessWeekdayServiceSUN businessWeekdayServiceSUN) {
		this.businessWeekdayService = businessWeekdayService;
		this.businessWeekdayServiceTUE = businessWeekdayServiceTUE;
		this.businessCategoryService = businessCategoryService;
		this.businessWeekdayServiceWED = businessWeekdayServiceWED;
		this.businessWeekdayServiceTHU = businessWeekdayServiceTHU;
		this.businessWeekdayServiceFRI = businessWeekdayServiceFRI;
		this.businessWeekdayServiceSAT = businessWeekdayServiceSAT;
		this.businessWeekdayServiceSUN = businessWeekdayServiceSUN;

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

	@GetMapping("/index")
	public String viewHomePage() {
		return "index";
	}

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());

		return "signup_form";
	}

	@GetMapping("/map")
	public String showMap(Model model) {

		return "map";
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

	/*
	 * @GetMapping("/categories") public String listUsersTest(Model model) {
	 * 
	 * List<BusinessState> listTestState = businessStateRepository.findAll();
	 * model.addAttribute("listTestState", listTestState);
	 * 
	 * model.addAttribute("finalListAll",
	 * businessCategoryService.businessCategoryAll());
	 * model.addAttribute("finalListAB",
	 * businessCategoryService.businessCategoryAB());
	 * model.addAttribute("finalListAZ",
	 * businessCategoryService.businessCategoryAZ());
	 * model.addAttribute("finalListCA",
	 * businessCategoryService.businessCategoryCA());
	 * model.addAttribute("finalListDE",
	 * businessCategoryService.businessCategoryDE());
	 * model.addAttribute("finalListFL",
	 * businessCategoryService.businessCategoryFL());
	 * model.addAttribute("finalListID",
	 * businessCategoryService.businessCategoryID());
	 * model.addAttribute("finalListIN",
	 * businessCategoryService.businessCategoryIN());
	 * model.addAttribute("finalListIL",
	 * businessCategoryService.businessCategoryIL());
	 * model.addAttribute("finalListLA",
	 * businessCategoryService.businessCategoryLA());
	 * model.addAttribute("finalListMO",
	 * businessCategoryService.businessCategoryMO());
	 * model.addAttribute("finalListNJ",
	 * businessCategoryService.businessCategoryNJ());
	 * model.addAttribute("finalListNV",
	 * businessCategoryService.businessCategoryNV());
	 * model.addAttribute("finalListPA",
	 * businessCategoryService.businessCategoryPA());
	 * model.addAttribute("finalListTN",
	 * businessCategoryService.businessCategoryTN());
	 * 
	 * model.addAttribute("finalListFood",
	 * businessCategoryService.businessCategoryFood());
	 * model.addAttribute("finalListCoffeeTea",
	 * businessCategoryService.businessCategoryCoffeeTea());
	 * model.addAttribute("finalListBakery",
	 * businessCategoryService.businessCategoryBakery());
	 * 
	 * // 7...
	 * 
	 * return "categories"; }
	 */
	@GetMapping("/charts")
	public String listUsersWeekdays(Model model) {
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

		model.addAttribute("finalWednesdayListValues", businessWeekdayServiceWED.finalWednesdayListValues());
		model.addAttribute("finalWednesdayListValuesAB", businessWeekdayServiceWED.finalWednesdayListValuesAB());
		model.addAttribute("finalWednesdayListValuesAZ", businessWeekdayServiceWED.finalWednesdayListValuesAZ());
		model.addAttribute("finalWednesdayListValuesCA", businessWeekdayServiceWED.finalWednesdayListValuesCA());
		model.addAttribute("finalWednesdayListValuesDE", businessWeekdayServiceWED.finalWednesdayListValuesDE());
		model.addAttribute("finalWednesdayListValuesFL", businessWeekdayServiceWED.finalWednesdayListValuesFL());
		model.addAttribute("finalWednesdayListValuesID", businessWeekdayServiceWED.finalWednesdayListValuesID());
		model.addAttribute("finalWednesdayListValuesIL", businessWeekdayServiceWED.finalWednesdayListValuesIL());
		model.addAttribute("finalWednesdayListValuesIN", businessWeekdayServiceWED.finalWednesdayListValuesIN());
		model.addAttribute("finalWednesdayListValuesLA", businessWeekdayServiceWED.finalWednesdayListValuesLA());
		model.addAttribute("finalWednesdayListValuesMO", businessWeekdayServiceWED.finalWednesdayListValuesMO());
		model.addAttribute("finalWednesdayListValuesNJ", businessWeekdayServiceWED.finalWednesdayListValuesNJ());
		model.addAttribute("finalWednesdayListValuesNV", businessWeekdayServiceWED.finalWednesdayListValuesNV());
		model.addAttribute("finalWednesdayListValuesPA", businessWeekdayServiceWED.finalWednesdayListValuesPA());
		model.addAttribute("finalWednesdayListValuesTN", businessWeekdayServiceWED.finalWednesdayListValuesTN());

		model.addAttribute("finalThursdayListValues", businessWeekdayServiceTHU.finalThursdayListValues());
		model.addAttribute("finalThursdayListValuesAB", businessWeekdayServiceTHU.finalThursdayListValuesAB());
		model.addAttribute("finalThursdayListValuesAZ", businessWeekdayServiceTHU.finalThursdayListValuesAZ());
		model.addAttribute("finalThursdayListValuesCA", businessWeekdayServiceTHU.finalThursdayListValuesCA());
		model.addAttribute("finalThursdayListValuesDE", businessWeekdayServiceTHU.finalThursdayListValuesDE());
		model.addAttribute("finalThursdayListValuesFL", businessWeekdayServiceTHU.finalThursdayListValuesFL());
		model.addAttribute("finalThursdayListValuesID", businessWeekdayServiceTHU.finalThursdayListValuesID());
		model.addAttribute("finalThursdayListValuesIL", businessWeekdayServiceTHU.finalThursdayListValuesIL());
		model.addAttribute("finalThursdayListValuesIN", businessWeekdayServiceTHU.finalThursdayListValuesIN());
		model.addAttribute("finalThursdayListValuesLA", businessWeekdayServiceTHU.finalThursdayListValuesLA());
		model.addAttribute("finalThursdayListValuesMO", businessWeekdayServiceTHU.finalThursdayListValuesMO());
		model.addAttribute("finalThursdayListValuesNJ", businessWeekdayServiceTHU.finalThursdayListValuesNJ());
		model.addAttribute("finalThursdayListValuesNV", businessWeekdayServiceTHU.finalThursdayListValuesNV());
		model.addAttribute("finalThursdayListValuesPA", businessWeekdayServiceTHU.finalThursdayListValuesPA());
		model.addAttribute("finalThursdayListValuesTN", businessWeekdayServiceTHU.finalThursdayListValuesTN());

		model.addAttribute("finalFridayListValues", businessWeekdayServiceFRI.finalFridayListValues());
		model.addAttribute("finalFridayListValuesAB", businessWeekdayServiceFRI.finalFridayListValuesAB());
		model.addAttribute("finalFridayListValuesAZ", businessWeekdayServiceFRI.finalFridayListValuesAZ());
		model.addAttribute("finalFridayListValuesCA", businessWeekdayServiceFRI.finalFridayListValuesCA());
		model.addAttribute("finalFridayListValuesDE", businessWeekdayServiceFRI.finalFridayListValuesDE());
		model.addAttribute("finalFridayListValuesFL", businessWeekdayServiceFRI.finalFridayListValuesFL());
		model.addAttribute("finalFridayListValuesID", businessWeekdayServiceFRI.finalFridayListValuesID());
		model.addAttribute("finalFridayListValuesIL", businessWeekdayServiceFRI.finalFridayListValuesIL());
		model.addAttribute("finalFridayListValuesIN", businessWeekdayServiceFRI.finalFridayListValuesIN());
		model.addAttribute("finalFridayListValuesLA", businessWeekdayServiceFRI.finalFridayListValuesLA());
		model.addAttribute("finalFridayListValuesMO", businessWeekdayServiceFRI.finalFridayListValuesMO());
		model.addAttribute("finalFridayListValuesNJ", businessWeekdayServiceFRI.finalFridayListValuesNJ());
		model.addAttribute("finalFridayListValuesNV", businessWeekdayServiceFRI.finalFridayListValuesNV());
		model.addAttribute("finalFridayListValuesPA", businessWeekdayServiceFRI.finalFridayListValuesPA());
		model.addAttribute("finalFridayListValuesTN", businessWeekdayServiceFRI.finalFridayListValuesTN());

		model.addAttribute("finalSaturdayListValues", businessWeekdayServiceSAT.finalSaturdayListValues());
		model.addAttribute("finalSaturdayListValuesAB", businessWeekdayServiceSAT.finalSaturdayListValuesAB());
		model.addAttribute("finalSaturdayListValuesAZ", businessWeekdayServiceSAT.finalSaturdayListValuesAZ());
		model.addAttribute("finalSaturdayListValuesCA", businessWeekdayServiceSAT.finalSaturdayListValuesCA());
		model.addAttribute("finalSaturdayListValuesDE", businessWeekdayServiceSAT.finalSaturdayListValuesDE());
		model.addAttribute("finalSaturdayListValuesFL", businessWeekdayServiceSAT.finalSaturdayListValuesFL());
		model.addAttribute("finalSaturdayListValuesID", businessWeekdayServiceSAT.finalSaturdayListValuesID());
		model.addAttribute("finalSaturdayListValuesIL", businessWeekdayServiceSAT.finalSaturdayListValuesIL());
		model.addAttribute("finalSaturdayListValuesIN", businessWeekdayServiceSAT.finalSaturdayListValuesIN());
		model.addAttribute("finalSaturdayListValuesLA", businessWeekdayServiceSAT.finalSaturdayListValuesLA());
		model.addAttribute("finalSaturdayListValuesMO", businessWeekdayServiceSAT.finalSaturdayListValuesMO());
		model.addAttribute("finalSaturdayListValuesNJ", businessWeekdayServiceSAT.finalSaturdayListValuesNJ());
		model.addAttribute("finalSaturdayListValuesNV", businessWeekdayServiceSAT.finalSaturdayListValuesNV());
		model.addAttribute("finalSaturdayListValuesPA", businessWeekdayServiceSAT.finalSaturdayListValuesPA());
		model.addAttribute("finalSaturdayListValuesTN", businessWeekdayServiceSAT.finalSaturdayListValuesTN());

		model.addAttribute("finalSundayListValues", businessWeekdayServiceSUN.finalSundayListValues());
		model.addAttribute("finalSundayListValuesAB", businessWeekdayServiceSUN.finalSundayListValuesAB());
		model.addAttribute("finalSundayListValuesAZ", businessWeekdayServiceSUN.finalSundayListValuesAZ());
		model.addAttribute("finalSundayListValuesCA", businessWeekdayServiceSUN.finalSundayListValuesCA());
		model.addAttribute("finalSundayListValuesDE", businessWeekdayServiceSUN.finalSundayListValuesDE());
		model.addAttribute("finalSundayListValuesFL", businessWeekdayServiceSUN.finalSundayListValuesFL());
		model.addAttribute("finalSundayListValuesID", businessWeekdayServiceSUN.finalSundayListValuesID());
		model.addAttribute("finalSundayListValuesIL", businessWeekdayServiceSUN.finalSundayListValuesIL());
		model.addAttribute("finalSundayListValuesIN", businessWeekdayServiceSUN.finalSundayListValuesIN());
		model.addAttribute("finalSundayListValuesLA", businessWeekdayServiceSUN.finalSundayListValuesLA());
		model.addAttribute("finalSundayListValuesMO", businessWeekdayServiceSUN.finalSundayListValuesMO());
		model.addAttribute("finalSundayListValuesNJ", businessWeekdayServiceSUN.finalSundayListValuesNJ());
		model.addAttribute("finalSundayListValuesNV", businessWeekdayServiceSUN.finalSundayListValuesNV());
		model.addAttribute("finalSundayListValuesPA", businessWeekdayServiceSUN.finalSundayListValuesPA());
		model.addAttribute("finalSundayListValuesTN", businessWeekdayServiceSUN.finalSundayListValuesTN());

		List<BusinessStars> listTest = businessStarsRepository.findAll();
		model.addAttribute("listTest", listTest);
		List<BusinessState> listTestState = businessStateRepository.findAll();
		model.addAttribute("listTestState", listTestState);
		List<BusinessStarsStateConnection> listTestStateAll = businessStarsStateConnectionRepository.findAll();
		model.addAttribute("listTestStateAll", listTestStateAll);

		List<BusinessState> listTestStateCategory = businessStateRepository.findAll();
		model.addAttribute("listTestStateCategory", listTestStateCategory);

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

		model.addAttribute("finalListFood", businessCategoryService.businessCategoryFood());
		model.addAttribute("finalListCoffeeTea", businessCategoryService.businessCategoryCoffeeTea());
		model.addAttribute("finalListBakery", businessCategoryService.businessCategoryBakery());
		model.addAttribute("finalListBars", businessCategoryService.businessCategoryBars());
		model.addAttribute("finalListHotels", businessCategoryService.businessCategoryHotels());
		model.addAttribute("finalListFood", businessCategoryService.businessCategoryArtsEntertainment());
		model.addAttribute("finalListCoffeeTea", businessCategoryService.businessCategoryHomeGarden());
		model.addAttribute("finalListBakery", businessCategoryService.businessCategoryMuseums());
		model.addAttribute("finalListBars", businessCategoryService.businessCategoryDoctors());
		model.addAttribute("finalListHotels", businessCategoryService.businessCategoryShopping());

		return "test";
	}

}