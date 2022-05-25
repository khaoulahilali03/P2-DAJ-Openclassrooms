package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptoms implements IWriteSymptoms{
	
	private Map <String,Integer> writer;
	
	public WriteSymptoms(Map<String,Integer> writer) {
		this.writer = writer;
	}
	
	public void writeSymptoms() throws IOException {
		
		File file = new File ("result.out");
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
