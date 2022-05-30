package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptoms implements IWriteSymptoms{
	
	/*
	 * @param Sorted map of symptoms
	 */
	private Map <String,Integer> writer;
	
	/*
	 * Constructor of WriteSymptoms
	 */
	public WriteSymptoms(Map<String,Integer> writer) {
		this.writer = writer;
	}
	
	/*
	 * The method writeSymptoms() allows to write the sorted map in filepath "result.out"
	 */
	public void writeSymptoms() throws IOException {
		
		File file = new File ("Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\result.out");
		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter(file));
			for(Map.Entry<String, Integer>entry : writer.entrySet()) {
				bf.write(entry.getKey() + "=" + entry.getValue());
				bf.newLine();
			}
			bf.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
