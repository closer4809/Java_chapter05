package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStream in = new FileInputStream("C:\\Java_study\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\Java_study\\file\\byteBufferImg.jpg");
		
		int data;
		byte[] buff = new byte[1024]; 
		System.out.println("복사시작");
		while(true) {
			data = in.read(buff);
			if(data == -1) {
				System.out.println("복사끝 :" + data);
				break;
			}
				out.write(buff);
		}
		
		
	}

}
