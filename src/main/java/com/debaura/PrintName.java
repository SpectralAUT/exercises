package com.debaura;

import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter your name ::::");
		String name = scr.next();
		System.out.println(name);
		String lastLetters = name.substring(name.length() - 3);
		System.out.println("The last 3 letters are:: " + lastLetters);

	}

}
