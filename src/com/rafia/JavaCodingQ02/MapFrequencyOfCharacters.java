package com.rafia.JavaCodingQ02;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyOfCharacters {


	/*
	* Write a method that can find the frequency of characters in a String.
	* 
	* Ex: "AAABBCDDD" ---> map matching the character and number of times it shows in the string
	*/
	
	public static void main(String[] args) {
		
		
		frequencyofcharacters("AAABBCDDD");
		
		System.out.println("===================");
		Map<Character, Integer> m = frequencyofcharacters2("AAABBCDDD");
		System.out.println(m);
		
		//or in one line
		//System.out.println( frequencyofcharacters2("AAABBCDDD"));
		
	}

	// Input: String ---> "AAABBCDDD"
	//Output: {A=3, B=2, C=1, D=3}
	//1st way: no return (void) ---> just display the map of characters with their frequencies
	
public static void frequencyofcharacters(String str) {
	
	Map<Character, Integer> map = new LinkedHashMap<>();
	
	char[] chars = str.toCharArray();
	for (char c : chars)
	{
		//there two possibilities:
	       //(1): either the character exists in the map -> just increment its value by one
	      //(2): or the character does not exists in the map -> insert it as key-value with value = 1 
	if (map.containsKey(c))
	{
		map.put(c, map.get(c) + 1);
	}
	else
	{
		map.put(c, 1);
	   }
	
	}
		
	System.out.println(map);
	
	
}
	
//2st way: return a map of characters with their frequencies
	
public static Map<Character, Integer> frequencyofcharacters2(String str) {
	
	Map<Character, Integer> map = new LinkedHashMap<>();
	
	char[] chars = str.toCharArray();
	for (char c : chars)
	{
	
	//there two possibilities:
    //(1): either the character exists in the map -> just increment its value by one
   //(2): or the character does not exists in the map -> insert it as key-value with value = 1 
if (map.containsKey(c))
{
	map.put(c, map.get(c) + 1);
}
else
{
	map.put(c, 1);
     }

   }
		
	return map;
 }



}
