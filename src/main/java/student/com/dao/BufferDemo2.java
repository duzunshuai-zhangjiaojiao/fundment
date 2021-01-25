package student.com.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
		
		String line;
		while((line=br.readLine())!=null) {
			  bw.write(line);
		     bw.newLine();
		}
	 bw.close();
	 br.close();
	}
     
}
