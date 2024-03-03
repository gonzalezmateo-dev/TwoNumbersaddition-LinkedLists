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
    	ValidateInput valI = new ValidateInput();
    	int aux = 0;
    	String num1 = null;
    	String num2 = null;
    	
    	System.out.println("2-numbers addition ");
    	do {
    		System.out.println("Insert [0-9]* : ");
    		
    		if(aux == 0) {
    			num1 = scanner.nextLine();
    			
    			if(valI.IsNumber(num1.trim())) {
    				aux++;
    				continue;
    			}
    			else {
    				System.out.println(num1 + " Is not a number.");
    				continue;
    			}
    			
    		}
    		else {
    			num2 = scanner.nextLine();
    			if(valI.IsNumber(num2.trim())) {
    				aux++;
    				break;
    			}
    			else {
    				System.out.println(num2 + " Is not a number.");
    				continue;
    			}
    			
    		}
    	} while(true);
    	
    	
    	TwoNumbersAddition add = new TwoNumbersAddition(num1,num2);
    	System.out.print("Result : ");
    	add.listResult().printList();
    	
    }
}