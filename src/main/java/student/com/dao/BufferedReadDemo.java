package student.com.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReadDemo {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		
		String line;
		
		while((line =br.readLine())!=null) {
			System.out.println(line);
		}
		
		br.close();
		
	}

}
