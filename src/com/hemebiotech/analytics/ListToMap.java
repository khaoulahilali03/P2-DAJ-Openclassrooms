package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ListToMap implements IListToMap{
	
	/*
	 * @param The list of symptoms
	 */
	private List <String> symptomsList;
	
	/*
	 * Constructor of ListToMap
	 */
	public  ListToMap(List<String>symptomsList) {
		symptomsList = this.symptomsList;
	}
	
	/*
	 * Method symptomsMap() allows to convert the list of symptoms to a sorted map 
	 * with the number of iterations for each symptom 
	 */
	@Override
	public Map<String,Integer> symptomsMap(){
		ReadSymptomDataFromFile symptoms = new ReadSymptomDataFromFile ("symptoms.txt");
		ArrayList <String> listSymp = new ArrayList<>();
		
		for (String symp:symptoms.getSymptoms()) {
			listSymp.add(symp);
		}
		
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		for (String symptom: listSymp) {
			treeMap.putIfAbsent(symptom, 0);
			treeMap.put(symptom, treeMap.get(symptom)+1);
			
		}
		
		return treeMap;
		
		
	}
	
	
	

}
