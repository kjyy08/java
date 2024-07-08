package javaEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ex0614_16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<String>();		
		BufferedReader inputStream = null;
		String fileName = "sample.txt";
		try {
			inputStream = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		String buf;
		try {
			while ((buf = inputStream.readLine()) != null) {
				result.add(buf);	
			}
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("result size : " + result.size());
		Object[] conv = result.toArray();
		System.out.println("conv size : " + conv.length);
	}

}
