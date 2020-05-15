package com.saha.jenkinsApp;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vehicle{
	private String make;
	@Autowired
	private Tyre tyre;


	public Car() {
		super();
	}
	
	

	public Car(String make) {
		super();
		this.make = make;
	}



	@Override
	public String toString() {
		return "Car [make=" + make + ", tyre=" + tyre + "]";
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}



	public Tyre getTyre() {
		return tyre;
	}



	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	@Override
	public void drive() {
		System.out.println("Car is running...");
		
	}
	
	

}
