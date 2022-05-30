package com.hemebiotech.analytics;

import java.util.Map;

public class AnalyticsCounter {
			
	
	public static void main(String args[]) throws Exception {

		/*
		 * Call  the ReadSymptomsDatafromFile class in the Main function 
		 * And displaying the contents of the symptoms.txt file as a list
		 */
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile ("symptoms.txt");
		System.out.println(reader.getSymptoms());
		
		/*
		 * Call the ListToMap class in the main function 
		 * Display the map of symptoms with the number of iteration for each symptom
		 */
		ListToMap convertedList = new ListToMap(reader.getSymptoms());
		System.out.println(convertedList.symptomsMap());
		
		/*
		 * Call the WriteSymptom class in the main function to generate 
		 * a filepath "result.out" with the sorted map 
		 */
		Map<String,Integer> symptomsMap = convertedList.symptomsMap();
		IWriteSymptoms symptomWriter = new WriteSymptoms(symptomsMap);
		symptomWriter.writeSymptoms();
		
		
	}
}
