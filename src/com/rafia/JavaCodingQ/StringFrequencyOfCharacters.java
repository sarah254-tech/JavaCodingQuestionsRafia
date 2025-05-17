package com.rafia.JavaCodingQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class StringFrequencyOfCharacters {

	/*
	* Write a method that can find the frequency of characters in a String.
	* 
	* Ex: "AAABBCDDD" ==> A3B2C1D3
	*/
	
	public static void main(String[] args) {
		System.out.println(characterFrequency("AAABBCDDD"));
		System.out.println(characterFrequency2("AAABBCDDD"));
		
	
	}

	//1. The method should receive a string and return a string
	//2. Create  map that will hold  the  letter->key and the frequency->value     
	//3. Update the value by iterating over the whole string and checking if the
	//    the letter exists
	//4. Create an empty String and concatenate the map's entries
	//   key-value to it content
	
	
	public static String characterFrequency(String str) {
		

		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) 
		{
			char letter = str .charAt(i);
		
		   if (map.containsKey(letter))
		     {
			int currentCount =map.get(letter);
		
		map.put(letter, currentCount + 1);
			
		}
		
		else{
			map.put(letter, 1);
			}
	   }
		String resultString = "";
		for(Entry<Character, Integer> letter : map.entrySet())
		{
			resultString += letter.getKey().toString() + letter.getValue().toString();
			
		}
			
		return resultString;
	  
	   }
	
		
		public static String characterFrequency2(String str) {
	
		Set<String> ts1 = new TreeSet<>(Arrays.asList(str.split("")));
		
		
		String resultString = "";
		
		for (String letter : ts1)
		{
			int count = 0;
		
		
		//Loop on the original string -> str to count the frequency of letters
		for(int i = 0; i < str.length(); i++) {
			
			
			if (letter .equals(str.charAt(i) + "")) {
				
				count++;
			}
	//		else {
	//			continue;
//			}
		}
		resultString += letter + count;
	}
	
	
	return resultString;
	
	
	}
}
	
	
	
	

