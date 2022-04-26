package com.bl.userRegistration;

import java.util.Scanner;

public class UserReg {

	public static void main(String[] args) {
		System.out.println("Enter a user name");
		Scanner sc = new Scanner(System.in);
		boolean resultFirst = FirstName(sc.nextLine());
		boolean resultLast = LastName(sc.nextLine());
		if(resultFirst) {
			System.out.println("User registration is valid");
		}
		else {
			System.out.println("User registration is invalid");
		}
		if(resultLast) {
			System.out.println("User registration is valid");
		}
		else {
			System.out.println("User registration is invalid");
		}
		}
	public static boolean FirstName(String firstName) {
		
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
	public static boolean LastName(String lastName) {
		
		return lastName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
}
