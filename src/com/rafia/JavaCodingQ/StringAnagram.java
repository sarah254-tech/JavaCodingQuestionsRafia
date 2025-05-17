package com.rafia.JavaCodingQ;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class StringAnagram {

	/*
	 * Write a method that checks if a string is built out of the same letters as
	 * another string. Ex: isSame(""abc", "cab");--> true isSame ("abc", "abb");->
	 * false:
	 * 
	 * Anagram- Strings made up of the same chars
	 */
	
	
	public static void main(String[] args) {
		
	System.out.println(isAnagram2("aaaabcccc", "cab"));
	
	}
	
	

	//1. Create a method that receives two strings and returns boolean --> isAnagram()
	//2. The method should convert the strings into char[]
	//3. Use Arrays class to sort the char arrays
	//4. Get rid of repeated characters in each array and convert them into strings
	//5. Compare the two string if they equal or not
	
	public static boolean isAnagram(String str1, String str2) {
		
	char[] c1 = str1.toCharArray();	
	char[] c2 = str2.toCharArray();
	
	//sort the arrays
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	//Iterate over c1 to drop all repeated characters and keep not repeated characters
	String s1 = "";
	for(char c: c1) {
		if(!s1.contains(c + "") ) //c + "" means convert the char c into a string
		{
			s1 += c; 
		}
		
	}
	
	//Iterate over c2 to drop all repeated characters and keep not repeated characters
		String s2 = "";
		for(char c: c2) {
			if(!s2.contains(Character.toString(c)) ) //Character.toString(c) convert c into a string
			{
				s2 += c; 
			}
			
		}
		
	return s1.equals(s2);	
	}
	
	public static boolean isAnagram2(String str1, String str2) {
	
		str1.split("");// --> ["a", "a", "a", "a", "b", "c", "c", "c", "c"]
		
		
		Set<String>	ts1 = new TreeSet<>(Arrays.asList(str1.split("")));
	//	System.out.println(ts1);
		
		Set<String>	ts2 = new TreeSet<>(Arrays.asList(str2.split("")));
	//     System.out.println(ts2);
		
	     return ts1.equals(ts2);
	}
	
	
	
	
	
}
