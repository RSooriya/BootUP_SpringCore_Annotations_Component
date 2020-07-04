package com.sooriya;

import org.springframework.stereotype.Component;

// bean id = baseballCoach (default id ) since no bean id is specified explicitly
@Component
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice batting for daily 30 mins";
	}

}
