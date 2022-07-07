package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.BusinessCategories;
import com.example.demo.model.BusinessStars;
import com.example.demo.model.BusinessStarsStateConnection;
import com.example.demo.model.BusinessState;
import com.example.demo.model.BusinessStateStarsCategories;
import com.example.demo.model.FridayOpen;
import com.example.demo.model.MondayOpen;
import com.example.demo.model.SaturdayOpen;
import com.example.demo.model.SundayOpen;
import com.example.demo.model.ThursdayOpen;
import com.example.demo.model.TuesdayOpen;
import com.example.demo.model.User;
import com.example.demo.model.WednesdayOpen;
import com.example.demo.repository.BusinessCategoriesRepository;
import com.example.demo.repository.BusinessRepository;
import com.example.demo.repository.BusinessStarsRepository;
import com.example.demo.repository.BusinessStarsStateConnectionRepository;
import com.example.demo.repository.BusinessStateRepository;
import com.example.demo.repository.BusinessStateStarsCategoriesRepository;
import com.example.demo.repository.FridayOpenRepository;
import com.example.demo.repository.MondayOpenRepository;
import com.example.demo.repository.SaturdayOpenRepository;
import com.example.demo.repository.SundayOpenRepository;
import com.example.demo.repository.ThursdayOpenRepository;
import com.example.demo.repository.TuesdayOpenRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.WednesdayOpenRepository;


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
	private BusinessStateRepository businessStateRepository;
	
	@Autowired
	private BusinessStateStarsCategoriesRepository businessStateStarsCategoriesRepository;
	
	@Autowired
	private BusinessCategoriesRepository businessCategoriesRepository;

	@Autowired
	private BusinessRepository businessRepository;

	@Autowired
	private MondayOpenRepository mondayOpenRepository;
	
	@Autowired
	private TuesdayOpenRepository tuesdayOpenRepository;
	
	@Autowired
	private WednesdayOpenRepository wednesdayOpenRepository;
	
	@Autowired
	private ThursdayOpenRepository thursdayOpenRepository;
	
	@Autowired
	private FridayOpenRepository fridayOpenRepository;
	
	@Autowired
	private SaturdayOpenRepository saturdayOpenRepository;
	
	@Autowired
	private SundayOpenRepository sundayOpenRepository;

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

	@GetMapping("/charts")
	public String listWeekday(Model model) {
		List<BusinessState> listState = businessStateRepository.findAll();
		model.addAttribute("listState", listState);
		
		List<BusinessStars> listStars = businessStarsRepository.findAll();
		model.addAttribute("listStars", listStars);
		
		List<BusinessStarsStateConnection> listStateStars = businessStarsStateConnectionRepository.findAll();
		model.addAttribute("listStateStars", listStateStars);
		
		List<BusinessCategories> listCategories = businessCategoriesRepository.findAll();
		model.addAttribute("listCategories", listCategories);
		
		List<BusinessStateStarsCategories> listStateStarsCategories = businessStateStarsCategoriesRepository.findAll();
		model.addAttribute("listStateStarsCategories", listStateStarsCategories);
		
		List<MondayOpen> listMondayOpen = mondayOpenRepository.findAll();
		model.addAttribute("listMondayOpen", listMondayOpen);
		List<TuesdayOpen> listTuesdayOpen = tuesdayOpenRepository.findAll();
		model.addAttribute("listTuesdayOpen", listTuesdayOpen);
		List<WednesdayOpen> listWednesdayOpen = wednesdayOpenRepository.findAll();
		model.addAttribute("listWednesdayOpen", listWednesdayOpen);
		List<ThursdayOpen> listThursdayOpen = thursdayOpenRepository.findAll();
		model.addAttribute("listThursdayOpen", listThursdayOpen);
		List<FridayOpen> listFridayOpen = fridayOpenRepository.findAll();
		model.addAttribute("listFridayOpen", listFridayOpen);
		List<SaturdayOpen> listSaturdayOpen = saturdayOpenRepository.findAll();
		model.addAttribute("listSaturdayOpen", listSaturdayOpen);
		List<SundayOpen> listSundayOpen = sundayOpenRepository.findAll();
		model.addAttribute("listSundayOpen", listSundayOpen);
		return "charts";
	}

	
}