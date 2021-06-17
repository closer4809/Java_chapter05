package com.javaex.ex03;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;


public class PhoneApp {

    public static void main(String[] args)throws IOException {
    	
    	Reader fr = new FileReader("C:\\Java_study\\file\\PhoneDB.txt");
    	BufferedReader br = new BufferedReader(fr);
    	
    	java.util.List<Person> pList = new ArrayList<Person>();
    	
    	
    	
    	
    	String line = "";
    	
    	while(true) {
			line = br.readLine();
			
			if(line == null) {
				break;
			}	
			
			
			String[] pInfo = line.split(",");
			
			String name = pInfo[0];
			String hp = pInfo[1];
			String company = pInfo[2];
			
			Person person = new Person(name, hp, company);
			
			pList.add(person);
    	}
    	
		for(int i = 0; i<pList.size(); i++) {
			System.out.println("이름: "+ pList.get(i).getName());
			System.out.println("핸드폰: "+ pList.get(i).getHp());
			System.out.println("회사: "+ pList.get(i).getCompany());
			System.out.println("");
		}
    	
    	
			Person ppap = new Person("강사랑", "01071979554", "02433953");
			pList.add(ppap);
		
		
		
		System.out.println("정우성 정보:" + pList.get(1).getName());
    	
    	br.close();
		
	 	    	
    	
 
		
		
		
    	
    	
    	
    }

}
