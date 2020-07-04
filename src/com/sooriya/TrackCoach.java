package com.sooriya;

import org.springframework.stereotype.Component;

// bean id = myCoach 
@Component("myCoach")
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run hard 5k";
	}

}
