package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.BusinessCategories;
import com.example.demo.model.BusinessMap;
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
import com.example.demo.repository.BusinessMapRepository;
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
//
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

	@Autowired
	private BusinessMapRepository businessMapRepository;

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
	public String showMap1(Model model) {

		return "map";
	}

	@GetMapping("/mapCA")
	public String showMapCA(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listCALTude = businessMapRepository.findByState("CA");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listCALTude);

		log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapCA";
	}

	@GetMapping("/mapAZ")
	public String showMapAZ(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listAZLTude = businessMapRepository.findByState("AZ");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listAZLTude);

		// log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapAZ";
	}

	@GetMapping("/mapDE")
	public String showMapDE(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listDELTude = businessMapRepository.findByState("DE");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listDELTude);

		// log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapDE";
	}

	@GetMapping("/mapFL")
	public String showMapFL(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listFLLTude = businessMapRepository.findByState("FL");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listFLLTude);

		// log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapFL";
	}

	@GetMapping("/mapID")
	public String showMapID(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listIDLTude = businessMapRepository.findByState("ID");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listIDLTude);

		// log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapID";
	}

	@GetMapping("/mapIL")
	public String showMapIL(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listILLTude = businessMapRepository.findByState("IL");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listILLTude);

		// log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapIL";
	}

	@GetMapping("/mapIN")
	public String showMapIN(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listINLTude = businessMapRepository.findByState("IN");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listINLTude);

		// log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapIN";
	}

	@GetMapping("/mapLA")
	public String showMapLA(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listLALTude = businessMapRepository.findByState("LA");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listLALTude);

		// log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapLA";
	}

	@GetMapping("/mapMO")
	public String showMapMO(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listMOLTude = businessMapRepository.findByState("MO");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listMOLTude);

		// log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapMO";
	}

	@GetMapping("/mapNJ")
	public String showMapNJ(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listNJLTude = businessMapRepository.findByState("NJ");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listNJLTude);

		// log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapNJ";
	}

	@GetMapping("/mapNV")
	public String showMapNV(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listNVLTude = businessMapRepository.findByState("NV");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listNVLTude);

		// log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapNV";
	}

	@GetMapping("/mapPA")
	public String showMapPA(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listPALTude = businessMapRepository.findByState("PA");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listPALTude);

		// log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapPA";
	}

	@GetMapping("/mapTN")
	public String showMapTN(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listTNLTude = businessMapRepository.findByState("TN");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listTNLTude);

		// log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapTN";
	}

	@GetMapping("/mapAB")
	public String showMap(Model model) {
		// List<BusinessMap> listLTude = businessMapRepository.findAll();
		List<BusinessMap> listABLTude = businessMapRepository.findByState("AB");

		List<BusinessMap> listLTude = new ArrayList<BusinessMap>();
		listLTude.addAll(listABLTude);

		// log.debug("listLTude --> " + listLTude);

		model.addAttribute("listLTude", listLTude);

		return "mapAB";
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