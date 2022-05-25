package com.hemebiotech.analytics;



public class AnalyticsCounter {
			
	
	public static void main(String args[]) throws Exception {
		/*
		 * Call  the ReadSymptomsDatafromFile class in the Main function 
		 * And displaying the contents of the symptoms.txt file as a list
		 */
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile ("symptoms.txt");
		System.out.println(reader.getSymptoms());
		
		ListToMap convertedList = new ListToMap(reader.getSymptoms());
		System.out.println(convertedList.symptomsMap());
		
	}
}
