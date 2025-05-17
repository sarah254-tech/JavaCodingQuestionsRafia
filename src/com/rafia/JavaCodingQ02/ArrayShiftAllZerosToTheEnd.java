package com.rafia.JavaCodingQ02;

import java.util.Arrays;

public class ArrayShiftAllZerosToTheEnd {

	/*
	  * Write a method that shifts all zeros to the end of the array.
	  * input: {0, 0, 0, 4, 5, 0, 7, 0, 6, 7}
	  * output: {4, 5, 7, 6, 7, 0, 0, 0, 0, 0}
	
	*/
	
	public static void main(String[] args) {
		
		int[] input = {0, 0, 0, 4, 5, 0, 7, 0, 6, 7};
		
		shiftZerosToTheEnd(input);
		
		System.out.println("=========================");
		
		System.out.println(Arrays.toString(shiftZerosToTheEnd3(input)));
		
	}

	//The logic is follows:
	//1. create an empty int[] with the same size as input array
	//2. Loop through the input array and check if the element is non-zero, 
	//     assign it to its relevant index ---> initiate an index variable at 0
	//3. Increment the index variable with each non-zero element that we find and move to next
	//    iteration
	//4. Display the array
	
	public static void shiftZerosToTheEnd(int [] intArray) 
	{
		System.out.println(Arrays.toString(intArray));
	
	int [] result = new int[intArray.length];
		
	int nonZeroIndex = 0;
	for(int num : intArray)
	{
		//num here is either 0 or non-zero 
	     if (num != 0)
	     {
	    	 result[nonZeroIndex] = num;
	    	 nonZeroIndex++;
	     //OR
	    //	 result[nonZeroIndex++] = num;
	     
	     }
	
	}
		
	System.out.println("output array ---> " + Arrays.toString(result));
	
	}
	
	//Receive intArray and update it then return it to the method call
	public static int[] shiftZerosToTheEnd2(int [] intArray) 
	{
		System.out.println(Arrays.toString(intArray));
	
	int [] result = new int[intArray.length];
		
	int nonZeroIndex = 0;
	for(int num : intArray)
	{
		//num here is either 0 or non-zero 
	     if (num != 0)
	     {
	    	 result[nonZeroIndex] = num;
	    	 nonZeroIndex++;
	     //OR
	    //	 result[nonZeroIndex++] = num;
	     
	     }
	
	}
	return result;
	
	}
	public static int[] shiftZerosToTheEnd3(int [] intArray) 
	{
		int nonZeroIndex = 0;
		for(int i = 0; i < intArray.length; i++)
		{
		//if the current element is non-zero, swap it with the first occurrence of a zero element
			if (intArray[i] != 0)
			{
				intArray[nonZeroIndex] = intArray[i];
				intArray[i] = 0;
			
			//move to the next index element
				nonZeroIndex++;
			}
		}
		
		return intArray;
	}

}
