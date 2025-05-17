package com.rafia.JavaCodingQ;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringRemoveDuplicates {

	/*
	 * Write a method that will remove the duplicate items/characters from 
	 * a given String
	 * 
	 * Ex:removeDup("AAABBBCCC") ==> ABC
	*/
	
	public static void main(String[] args) {
	
	System.out.println(removeDuplicates("AAABBBCCC")); 	
	System.out.println(removeDuplicates2("AAABBBCCC")); 	
	}

	//1. The method should receive a string and return a string without duplicate characters
	//2. In the method, convert the strings into char[]
	//3. Get rid of repeated characters in each array and convert back into strings
	//4. Return the composed string
	
	public static String removeDuplicates(String str) {
		
		char[] c = str.toCharArray();
		
		String noDuplicates = "";
		for (char ch: c) {
			if(noDuplicates.contains(ch + "")) {
				continue;
			}
			else {
				noDuplicates += ch;
			}
		}
		
		return noDuplicates;
	}
	
	public static String removeDuplicates2(String str) {
		
		Set<String> lhs = new LinkedHashSet<>(Arrays.asList(str.split("")));
	
		return String.join("", lhs);   //String.join("", lhs) means convert the set into a 
		                       //string with the first argument as delimiter ---> no spacing
		
	}	
	
		
		
		
		
		
		
		
		
		

}