package com.sapient.trg.pl;


import java.util.Calendar;
import java.util.Date;

/**
 * This is java doc style comment
 * @author Srini
 * This is s demo class
 *
 */
public class HelloWorld {
	/**
	 * 
	 * @param args
	 * This is main() method
	 */
	public static void main(String[] args) {
		// This is single line comment		
		/*
		 * This is
		 * multi-line
		 * comment
		 */		
		System.out.println("Hello World!");
		System.out.println("Today is: "+ new Date());
		System.out.println("Today: "+ Calendar.getInstance());

	}

}
