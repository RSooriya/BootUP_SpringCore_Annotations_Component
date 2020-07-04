package com.sooriya;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice batting for daily 30 mins";
	}

}
