package com.hemebiotech.analytics;

import java.util.Map;
/**
 * 
 * The return value from the operation, which is a conversion of a list to a map of strings as a key and number of iterations as a value,
 * No duplications
 * 
 * The implementation need to order the map
 * 
 */
public interface IListToMap {
	/*
	 * @return a sorted map of each symptom and his number 
	 * of iteration from the retrieved list
	 */
	public Map<String,Integer> symptomsMap(); 
}
