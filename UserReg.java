package com.bl.userRegistration;

import java.util.Scanner;

public class UserReg {

	public static void main(String[] args) {
		System.out.println("Enter a user name");
		Scanner sc = new Scanner(System.in);
		boolean result = Email(sc.nextLine());
		if(result) {
			System.out.println("User registration is valid");
		}
		else {
			System.out.println("User registration is invalid");
		}
		}
	public static boolean FirstName(String firstName) {
		
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
	public static boolean Email(String eMail) {
		return eMail.matches("^[a-z]{3}[A-Za-z0-9+_.-]*@[a-z]{2}[.]{1}[a-z]{2}[.]*[a-z]*$");
	}

}
