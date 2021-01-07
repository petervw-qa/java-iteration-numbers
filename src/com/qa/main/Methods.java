package com.qa.main;

import java.lang.Integer;

public class Methods {
	
	String one = "one";
	String two = "two";
	String three = "three";
	String four = "four";
	String five = "five";
	String six = "six";
	String seven = "seven";
	String eight = "eight";
	String nine = "nine";
	String ten = "ten";
	String eleven = "eleven";
	String twelve = "twelve";
	String thirteen = "thirteen";
	String fourteen = "fourteen";
	String fifteen = "fifteen";
	String sixteen = "sixteen";
	String seventeen = "seventeen";
	String eighteen = "eighteen";
	String nineteen = "nineteen";
	String twenty = "twenty";
	String thirty = "thirty";
	String fourty = "fourty";
	String fifty = "fifty";
	String sixty = "sixty";
	String seventy = "seventy";
	String eighty = "eighty";
	String ninety = "ninety";
			
	public int addition(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public String convertNumberToString(int num1, int num2) {
		String resultString = "";
		String returnString = "";
		int result = addition(num1, num2);
		resultString = Integer.toString(result);
		
		if (result < 20) {
			if (result == 1) {
				returnString = one;
			} else if (result == 2) {
				returnString =two;
			} else if (result == 3) {
				returnString = three;
			} else if (result == 4) {
				returnString = four;
			} else if (result == 5) {
				returnString = five;
			} else if (result == 6) {
				returnString = six;
			} else if (result == 7) {
				returnString = seven;
			} else if (result == 8) {
				returnString = eight;
			} else if (result == 9) {
				returnString = nine;
			} else if (result == 10) {
				returnString = ten;
			} else if (result == 11) {
				returnString = eleven;
			} else if (result == 12) {
				returnString = twelve;
			} else if (result == 13) {
				returnString = thirteen;
			} else if (result == 14) {
				returnString = fourteen;
			} else if (result == 15) {
				returnString = fifteen;
			} else if (result == 16) {
				returnString = sixteen;
			} else if (result == 17) {
				returnString = seventeen;
			} else if (result == 18) {
				returnString = eighteen;
			} else if (result == 19) {
				returnString = nineteen;
			}
		}
		
		if (result > 20) {
			int count = 0;
			while (count < resultString.length()) {
				if (count == 0) {
					if (resultString.charAt(count) == '2') {
						returnString += twenty + "-";
					}
					if (resultString.charAt(count) == '3') {
						returnString += thirty + "-";
					}
					if (resultString.charAt(count) == '4') {
						returnString += fourty + "-";
					}
					if (resultString.charAt(count) == '5') {
						returnString += fifty + "-";
					}
					if (resultString.charAt(count) == '6') {
						returnString += sixty + "-";
					}
					if (resultString.charAt(count) == '7') {
						returnString += seventy + "-";
					}
					if (resultString.charAt(count) == '8') {
						returnString += eighty + "-";
					}
					if (resultString.charAt(count) == '9') {
						returnString += ninety + "-";
					}
					
				}
				else if (count == 1) {
					if (resultString.charAt(count) == '1') {
						returnString += one;
					}
					if (resultString.charAt(count) == '2') {
						returnString += two;
					}
					if (resultString.charAt(count) == '3') {
						returnString += three;
					}
					if (resultString.charAt(count) == '4') {
						returnString += four;
					}
					if (resultString.charAt(count) == '5') {
						returnString += five;
					}
					if (resultString.charAt(count) == '6') {
						returnString += six;
					}
					if (resultString.charAt(count) == '7') {
						returnString += seven;
					}
					if (resultString.charAt(count) == '8') {
						returnString += eight;
					}
					if (resultString.charAt(count) == '9') {
						returnString += nine;
					}
				
			}
			count++;
			
		}
		
	}
	return returnString;

	}
	

}
