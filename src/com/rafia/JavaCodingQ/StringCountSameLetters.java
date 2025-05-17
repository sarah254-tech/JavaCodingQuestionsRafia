package com.rafia.JavaCodingQ;

import java.util.HashMap;
import java.util.Map;

public class StringCountSameLetters {

	//Create a method that calculates the number of repetition
	//for each character in a string and display the character
	//with its frequency count
	//Ex: "AAABBBCCC" --> {A=2, B=3, C=4}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(CountSameLetters("AABBBCCCC"));
		
	}

	//1. The method should receive a string and return a map
	//2. Calculate the frequency of each character and update
	//    its key-value entry in the map
	
	public static Map<Character, Integer> CountSameLetters(String str){
		
		Map<Character, Integer> result = new HashMap<>();
		for(int i = 0; i < str.length(); i++) 
		{
			char letter = str .charAt(i);
		
		if(result.containsKey(letter))
		{
			int currentCount = result.get(letter);
		
		result.put(letter, currentCount + 1);
			
		}
		
		else
		{
			result.put(letter, 1);
		}
		
	}
		
		
		
		return result;
	}
	
	
}
