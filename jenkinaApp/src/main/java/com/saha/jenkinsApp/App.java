package com.saha.jenkinsApp;

import java.net.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Hello World!");
		System.out.println("Tightly coupled RAW vehicle!");
		Vehicle v = new Car();
		v.drive();
		
		System.out.println("Loosely coupled Spring vehicle (Bike.class)!");
		ApplicationContext factory = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		v = (Vehicle) factory.getBean(Bike.class);
		v.drive();	
		
		System.out.println("Loosely coupled PRIMARY Spring vehicle (Vehicle.class)!");
		v = (Vehicle) factory.getBean(Vehicle.class);
		v.drive();		
		
		System.out.println("Loosely coupled Spring vehicle (xml config)!");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		Vehicle v1 = (Vehicle) appContext.getBean("vehicle");
		v1.drive();
		System.out.println(v1);
		
		System.out.println("Loosely coupled Spring vehicle(annotation config)!");
		Vehicle v2 = (Vehicle) appContext.getBean("train");
		v2.drive();
		
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
		} catch (UnknownHostException ex) {
			System.out.println("Could not find this computer's address.");
		}
	}
}
