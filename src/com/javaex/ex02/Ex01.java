package com.javaex.ex02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		Writer fw = new FileWriter("\"C:\\Java_study\\file\\song.txt");
	
		String str = "학교종이 땡떙떙 어서 모이자 선생님이 우리를 기다리신다.";	
		
		fw.write(str);
		
		
		
		
		
		
		
		
		fw.close();
	
	}

}
