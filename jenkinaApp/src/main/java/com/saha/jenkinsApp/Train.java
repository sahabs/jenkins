package com.saha.jenkinsApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component //by default it's decapitalized class name i.e. train
@Primary  //This is the primary type of vehicle. Other vehicles are Car and Bike
public class Train implements Vehicle{

	@Override
	public void drive() {
		System.out.println("Train is coming...");
	}

}
