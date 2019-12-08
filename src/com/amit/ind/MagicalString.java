package com.amit.ind;

public class MagicalString {

	  private static void swap(final char[] input, int start, int end) {
	    char[] temp = {input[start], input[start + 1]};
	    for (int i = start + 2; i <= end; i++) {
	      input[i - 2] = input[i];
	    }
	    input[end - 1] = temp[0];
	    input[end] = temp[1];
	  }
	  
	  private static int getNextMS(final char[] input, int start) {
	    for (int i = start, numZero = 0, numOne = 0; i < input.length; i++) {
	      System.out.println("i = " + i);
	      if (i < start + 2 && input[i] != '1') return -1;
	      if (input[i] == '1') numOne++;
	      else numZero++;
	      if (numZero == numOne) return i;
	    }
	    return -1;
	  }
	  
	  private static String largestMagical(final String binString) {
	    char[] input = binString.toCharArray();
	    
	    for (int i = 1; i < input.length - 1; i++) {
	      if (input[i] == '0') {
	        int nextMS = getNextMS(input, i + 1);
	        if (nextMS != -1) swap(input, i - 1, nextMS);
	      }
	    }
	    return String.copyValueOf(input);
	  }

	  public static void main(String[] args) {
	    String binString = "11011000";
	    System.out.println(largestMagical(binString));
	  }
	}
