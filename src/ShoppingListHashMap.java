/*
 * Student: Eduardo Aguirre
 * Session 6
 * Assignment 2
 * Java Programs that allows to enter Shopping Category and the system displays the List of Items in the matching HashMap
 * Uses an Iterator to go through the List and Print the items on the HashMap 
 */


import java.util.Scanner;  //Imports the Scanner Class from Java API Library, to allows User's Input
import java.util.HashSet;  //Imports the HashMap Class from Java API Library, to Store values in a HashMap
import java.util.Iterator; //Imports the Iterator Class from Java API Library, to iterate through the HashMap
import java.util.Set; //Imports the Set Class from Java API Library, to iterate through the HashMap

public class ShoppingListHashMap {

	public static void main(String[] args) { //Main Method to run the Program
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in); //Initiates the Scanner Instance
		String choice = "Y"; //Variable to store user's selection to question want to continue
		
		
		//Executes code below as long as the user's choice variable =Yes or Y
		while (choice.equalsIgnoreCase("Yes")|| choice.equalsIgnoreCase("Y"))
		{
			System.out.println("Shopping Categories :" +"\n"+ //Prints out the Shopping Categories
					           "> Dairy" +"\n"+
					           "> Meat"  +"\n"+
					           "> Produce"+"\n"+
					           "> Care");
			System.out.print("Enter the Shopping Category: "); //Prompts the user to enter the Category of the grocery list
			
			String shoppingCategory =sc.next();
			
			if(shoppingCategory.equalsIgnoreCase("Dairy"))
			{
				Set <String> shopingListD = new HashSet<String>();  //Create the HashSet and store in variable shoppingListD
				shopingListD.add("Cheese Strings");
				shopingListD.add("Almond Milk");
				shopingListD.add("Cottage Cheese");
				shopingListD.add("Greek Yougurt");
				
				Iterator <String> items = shopingListD.iterator(); //Creates an instance of the Iterator Class for shoppingListD
				System.out.println("==================================");
				System.out.println("+++++++ Dairy Products +++++++++");
				System.out.println("==================================");
				
				while (items.hasNext()) //Execute code while there is a next element on the HashSet 
				{
					System.out.println(items.next());  //Prints out the list
				}
				System.out.println("==================================");
			}	
				else if(shoppingCategory.equalsIgnoreCase("Meat"))
				{
					Set <String> shopingListM = new HashSet<String>();  //Create the HashSet and store in variable shoppingListM
					shopingListM.add("T-Bone");
					shopingListM.add("Pork Ribs");
					shopingListM.add("Lamb");
					shopingListM.add("Chicken Legs");
					
					Iterator <String> items = shopingListM.iterator(); //Creates an instance of the Iterator Class for shoppingListD
					
					System.out.println("+++++++ Meat Products +++++++++");
					System.out.println("==================================");
					
					while (items.hasNext()) //Execute code while there is a next element on the HashSet 
					{
						System.out.println(items.next());  //Prints out the list
					}
					System.out.println("==================================");
				
		       }
		       			
				else if(shoppingCategory.equalsIgnoreCase("Produce"))
				{
					Set <String> shopingListP = new HashSet<String>();  //Create the HashSet and store in variable shoppingListP
					shopingListP.add("Carrots");
					shopingListP.add("Lettuce");
					shopingListP.add("Spinach");
					shopingListP.add("Tomatoes");
					
					Iterator <String> items = shopingListP.iterator(); //Creates an instance of the Iterator Class for shoppingListP
					
					System.out.println("+++++++ Produce Products +++++++++");
					System.out.println("==================================");
					
					while (items.hasNext()) //Execute code while there is a next element on the HashSet 
					{
						System.out.println(items.next());  //Prints out the list
					}
					System.out.println("==================================");
				
		       }
			
				else if(shoppingCategory.equalsIgnoreCase("Care"))
				{
					Set <String> shopingListC = new HashSet<String>();  //Create the HashSet and store in variable shoppingListC
					shopingListC.add("Tooth Paste");
					shopingListC.add("Tooth Brush");
					shopingListC.add("Shaving Foam");
					shopingListC.add("Deodorant");
					
					Iterator <String> items = shopingListC.iterator(); //Creates an instance of the Iterator Class for shoppingListP
					
					System.out.println("+++++++ Personal Care Products +++++++++");
					System.out.println("==================================");
					
					while (items.hasNext()) //Execute code while there is a next element on the HashSet 
					{
						System.out.println(items.next());  //Prints out the list
					}
					System.out.println("==================================");
			   }
			   
				else
				{
					System.out.println("Not matching category"); //Default Category when the Category is not matched
				}
			
			      System.out.println("==================================");
		          System.out.print("Do you want to try again ? Y| N: "); //Prompts the user to enter another category
		          choice=sc.next();
	    }
				  System.out.println("Thanks for trying the shopping list app"); //Good bye message

	}
}
