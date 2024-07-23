package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VisitersApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisitersApplication.class, args);

		VisitorNumberSinglton visitor1 = VisitorNumberSinglton.getInstance();
		visitor1.counter++;
		System.out.println("first visitor: " + visitor1.counter);

		VisitorNumberSinglton visitor2 = VisitorNumberSinglton.getInstance();
		visitor2.counter++;
		System.out.println("second visitor: " + visitor2.counter);// it will print 2 not 1 because it adds to the
																	// counter of the same object.

		visitor1.getVisitorsNumber(visitor2.counter); // this will print 2 as the same object's counter gets incremented
		visitor2.getVisitorsNumber(visitor1.counter); // this will print 2 as the same object's counter gets incremented

	}

}

/*
 * The reason of using singleton design pattern for this class: With the use of
 * singleton, this system will calculate the visitor number to the application
 * by incrementing the counter of the same object by one every single time the
 * application gets visited. Thus, if we do not use singleton, we cannot
 * calculate the overall visitors to the application as the counter would start
 * incrementing from 0 every single time a visitor visits the application since
 * in this case the counter of different object references gets incremented
 */
