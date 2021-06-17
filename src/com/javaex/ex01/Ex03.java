package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		InputStream in = new FileInputStream("C:\\Java_study\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
	
		
		OutputStream out = new FileOutputStream("C:\\Java_study\\file\\bufferimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		
		int data;
		System.out.println("복사시작");
		while(true) {
			data = bin.read();
			if(data == -1) {
				System.out.println("복사 끝"+data);
				break;
			}
	
			bout.write(data);;
		}
	
	
		bout.close();
		bin.close();
	
	}	

}
