package com.basic.programs;

import java.util.Set;
import java.util.TreeSet;

public class DuplicateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  [] arr = {"one","two","one","four","four","one"};
		Set<String> arrDup = new TreeSet<String>();
		///boolean isDistinct = false;
		for(String arrValue:arr) {
			if((!arrDup.add(arrValue))) {
				System.out.println(arrValue);
				
			}
		}
		
		

	}

}
