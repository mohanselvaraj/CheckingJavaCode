package com.basic.programs;

import java.util.Set;
import java.util.TreeSet;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str [] = {"two","one","four","two","three","two","four"};
		Set<String> dup = new TreeSet<String>();
		for(String str1:str){
			
			if(!dup.add(str1)){
				System.out.println("Duplicate Entry is: "+str1);	
			}
			
		
		}
	}

}
