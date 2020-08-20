package com.anirudh.java.passwordcheckwithmethod;

import java.util.Scanner;

/*
- password has to be at least 8 characters long
- it should contain at least 3 digits, 2 alphabets
- the password must contain at least 2 special characters

*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a password");
		String password = in.nextLine();
		boolean valid = passwordcheck(password);
		
		if(valid == true) {
			System.out.println("The password is valid");
		}
		else {
			System.out.println("The password is invalid");
		}

	}
	static boolean passwordcheck (String password) {
		int numberOfDigits = 0;
		int numberOfalphabet = 0;
		int numberOfspecialcharecters = 0;
		
		int length = password.length();
		
		if(length < 8) {
			return false;
		}
		
		for(int i = 0; i < length; i++) {
			char ch = password.charAt(i);
			
			if((ch >= '0') && (ch <= '9')) {
				numberOfDigits++;
			}
			
			if(((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z'))) {
				numberOfalphabet++;
			}
			
			if(!(((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z')) || ((ch >= '0') && (ch <= '9')))) {
				numberOfspecialcharecters++;
			}
			
			
			
		}
		
		if((numberOfDigits < 3) || (numberOfalphabet < 2) || (numberOfspecialcharecters < 2)){
			return false;
		}
		
		
		return true;
		
		
		
		
		
		
		
	}

}
