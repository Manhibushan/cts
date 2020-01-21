package com.example.Airlines.Springdemo;

public class BaseBallcoach implements Coach{
	Fortuneservice fortuneservice=null;
	

	public BaseBallcoach(com.example.Airlines.Springdemo.Fortuneservice fortuneservice) {
		
		super();
		this.fortuneservice = fortuneservice;
		
	}

	@Override
	public String getDailyWorkout() {
		
		return "practice baseball volleyball today;";
		
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getDailyFortune();
	}
	

}
