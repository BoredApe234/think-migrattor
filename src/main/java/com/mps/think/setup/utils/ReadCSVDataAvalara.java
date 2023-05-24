package com.mps.think.setup.utils;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class ReadCSVDataAvalara {
//	private static final String CSV_FILE_PATH = "F:\\Think-2\\tax_avalara.csv";
//
//	public static void main(String[] args) {
//
//		System.out.println("Read Data Line by Line With Header \n");
//		readDataLineByLine(CSV_FILE_PATH);
//		System.out.println("_______________________________________________");
//	}

	public static void readDataLineByLine(String file) throws IOException {

		

			// Create an object of filereader class
			// with CSV file as a parameter.
			FileReader filereader = new FileReader(file);

			try (// create csvReader object passing
					// Flirter as parameter
					CSVReader csvReader = new CSVReader(filereader)) {
				String[] nextRecord;

				// we are going to read data line by line
				while ((nextRecord = csvReader.readNext()) != null) {
					for (String cell : nextRecord) {
						System.out.print(cell + "\t");
					}
					System.out.println();
				}
				csvReader.close();
			}
			finally {
				
				filereader.close();
				
				
			}
		} 

}
