package com.hemebiotech.analytics;



public class AnalyticsCounter {
			
	
	public static void main(String args[]) throws Exception {
		
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile ("symptoms.txt");
		System.out.println(reader.getSymptoms());

	}
}
