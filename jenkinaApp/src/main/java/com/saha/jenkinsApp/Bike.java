package com.saha.jenkinsApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	@Autowired
	private BikeTyre tyre;

	public BikeTyre getTyre() {
		return tyre;
	}

	public void setTyre(BikeTyre tyre) {
		this.tyre = tyre;
	}

	@Override
	public void drive() {
		System.out.println("Bike is moving...");
		System.out.println("Bike tyre condition is " + this.getTyre().getCondition());

	}	

}
