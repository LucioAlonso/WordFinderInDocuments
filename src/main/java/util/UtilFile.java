package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class UtilFile {

	public static Vector<String> readFile(String fileName) {
		Vector<String> configItemsNames = new Vector<>();
		FileReader reader = null;
		BufferedReader buffer = null;

		try {
			reader = new FileReader(fileName);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		try {
			String row;
			buffer = new BufferedReader(reader);

			while ((row = buffer.readLine()) != null) {
				configItemsNames.add(row);
				System.out.println(row);
			}
		} catch (IOException e) {
			e.printStackTrace();

		}

		if (buffer != null) {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return configItemsNames;

	}

	public static boolean createXMLFile(String configItemsXML, String pathOut) throws IOException {
		FileWriter writer = new FileWriter(pathOut);
		try (BufferedWriter buffer = new BufferedWriter(writer)) {
			buffer.append(configItemsXML);
		}
		writer.close();
		return true;

	}
}
