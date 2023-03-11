package ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFile {
	public static void main(String[] args) throws IOException {
		System.out.println("entered main ");
		String data = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		FileWriter writer = new FileWriter("myfile.txt");
		System.out.println("Enter some text");
		data = reader.readLine();
		
		while(!data.equals("quit")) {
			//System.out.println("you have entered ..."+data);
			writer.write(data);
			data = reader.readLine();
	}
		writer.flush();
		writer.close();
		System.out.println("main exited");
	}

}