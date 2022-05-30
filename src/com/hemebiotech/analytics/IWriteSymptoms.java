package com.hemebiotech.analytics;

import java.io.IOException;
/**
 * 
 * The return value from the operation, which is a conversion of a list to a map of strings as a key and number of iterations as a value,
 * No duplications
 * 
 * The implementation need to order the map
 * 
 */
public interface IWriteSymptoms {
	/*
	 * 
	 * generate a filepath "result.out" with the sorted map of symptoms and the number 
	 * of iteration for each symptom
	 */
	public void writeSymptoms() throws IOException;
	
}
