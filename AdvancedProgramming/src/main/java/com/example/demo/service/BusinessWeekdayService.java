package com.example.demo.service;

import java.util.List;

public interface BusinessWeekdayService {

	//monday -> all the states
	List<String> finalMondayListTimes();
	List<Integer> finalMondayListValues();
	
	//monday -> AB
	List<String> finalMondayListTimesAB();
	List<Integer> finalMondayListValuesAB();
	
}
