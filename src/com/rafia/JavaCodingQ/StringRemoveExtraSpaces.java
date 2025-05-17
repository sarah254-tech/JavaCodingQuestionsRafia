package com.rafia.JavaCodingQ;

public class StringRemoveExtraSpaces {

	/*
	 * Remove all extra spaces in a string
	 * Input: "     Hello world                     LOVE Java
	 * output: "Hello world I LOVE Java
	
	*/
	public static void main(String[] args) {
		
		System.out.println(removeExtraSpaces("        Hello word          I         LOVE Java        "));
	

	
	}


	//1.This method should receive a string and return a String
	//2. According to the spaces available, we have space + tabs
	//   we will remove the white spaces based on these two type
	//   --> this main disadvantage here is the method will not be
	//    applicable if we have enters --> we should add them too
	
	public static String removeExtraSpaces(String str) {
		
		String[] words = str.trim().split(" ");
		String result = "";
		
		for(String word: words) {
			if (!word.isEmpty() && word.charAt(0) != '\t') {
				result += word + " ";
			}
			
		}
		
		return result.trim();
		
		
	}

public static String removeExtraSpaces2(String str) 
{
		
		String[] words = str.trim().split("\\s+");
		
		String result = "";
		
		for(String word: words)
		{
			if (!word.isEmpty())
			{
				result += word + " ";
		}
	}
  return result.trim();
		
    }
public static String removeExtraSpaces3(String str) 
{
	return str.replaceAll("\\s+", " ");
}


   }

