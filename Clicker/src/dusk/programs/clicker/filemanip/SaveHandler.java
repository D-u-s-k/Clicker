package dusk.programs.clicker.filemanip;

import java.io.BufferedReader;
import java.io.FileReader;

public class SaveHandler {
	
	public static String saveData;
	
	public static void init() {
		try (BufferedReader br = new BufferedReader(new FileReader("resources/saves/save.dat"))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			
			while (line != null) {
				sb.append(line);
				line=br.readLine();
			}
			saveData = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
