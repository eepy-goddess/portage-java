package main.lib.portage.configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class MakeconfReader {
	private String dir;
	private String use_flags;
	public MakeconfReader(String dir) {
		this.dir = dir;
	}
	public String read() throws FileNotFoundException, IOException {
		File config = new File(dir);
		if(!config.exists()) {
			try {
				config.createNewFile();
			} catch (IOException e) {
				System.out.println("bro, create the directory");
			}
		} else {
		   Scanner reader = new Scanner(config);
		   while(reader.hasNextLine()) {
			   String data = reader.nextLine();
			   return data;
		   }
			
		}
		return null;
	}
	public String[] getUseFlags() throws IOException {
		if(read().startsWith("USE=\"")) {
			return read().substring(5, read().length() - 1).split(" ");
		}
		return null;
	}
}
