//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		count = (int) (Math.log10(number) + 1); 
		return count;
	}

	public static int[] getSortedDigitArray(int number) {
		int[] sorted = new int[getNumDigits(number)];
		for (int i = 0; i < sorted.length; i++) {
		    sorted[i] = number % 10;
		    number = number / 10;
		  }
		
		while (tester(sorted)) {
		for (int j = 0; j < sorted.length-1; j++) {
		    if (sorted[j] > sorted[j+1]) {
		        int test = sorted[j];
		        sorted[j] = sorted[j+1];
		        sorted[j+1] = test;
		      }
		  }
}
		    
		return sorted;	    
}
	
	public static boolean tester(int[] test) {
	    for (int i = 0; i < test.length-1; i++) {
	        if (test[i] > test[i+1]) {
	            return true;
	           }
	        
	       }
	       return false;
	   }


}