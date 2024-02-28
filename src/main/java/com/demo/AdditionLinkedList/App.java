package com.demo.AdditionLinkedList;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
    private static Scanner scanner;

	public static void main( String[] args )
    {
    	
    	scanner = new Scanner(System.in);
    	System.out.println("2-numbers addition ");
    	System.out.print("Insert [0-9]* : ");
    	String num1 = scanner.nextLine();
    	System.out.print("Insert [0-9]* : ");
    	String num2 = scanner.nextLine();
    	
    	TwoNumbersAddition add = new TwoNumbersAddition(num1,num2);
    	System.out.print("Result : ");
    	add.listResult().printList();
    	
    }
}