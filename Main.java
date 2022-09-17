package com.ultron.javaapp;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Tax Calculator App");
		System.out.println("-----WELCOME-----\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total person count:");
		int personCount = scan.nextInt();
		System.out.println("");
		scan.nextLine();
		String[] names = new String[personCount];
		long[] incomes = new long[personCount];
		for(int i =1; i<=personCount;i++) {
			System.out.println("Enter name " + i + ":");
			names[i-1] = scan.nextLine();
		    System.out.println("Enter " + names[i-1] + "'s Annual Income:");
			incomes[i-1] = scan.nextLong();
			scan.nextLine();
			System.out.println("");
		}
		System.out.println("Names with liable taxes \n-----------------------");
		for(int i = 0;i<personCount;i++) {
			calculateTax(names[i],incomes[i]);
		}

	}
	public static void calculateTax(String name,long income) {
		long tax = 0L;
		if(income>=300000) {
			tax = income/5;
		}else if(income>=100000) {
			tax = income/10;
		}else if(income<100000) {
			tax = 0;
		}else {
			System.out.println("Enter Valid Income");
		}
		System.out.println(name + ":\u20B9" + tax );
	}
	
	

}
