package com.labassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Week3and4 {

	private static Scanner scan;
	public static void main(String[] args) {
		
ArrayList<Integer> ages = new ArrayList<Integer>(Arrays.asList(3,9,23,64,2,8,28,93));
		
		System.out.println(ages.get(ages.size()-1)-ages.get(0));
		
	ages.add(36);
		
		System.out.println(ages);
		
		System.out.println(ages.get(ages.size()-1)-ages.get(0)); // repeat .get from above, we see now it takes 36-3 and prints 30
		
		
		
		int sumOfAges = 0;
				
		
		for (int i=0;i<ages.size()-1; i++) {
			ages.get(i);
			sumOfAges = sumOfAges + ages.get(i);
			
			System.out.println(sumOfAges);
			
			int average = sumOfAges / ages.size();
			System.out.println(average);
			
		}
			
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
			
			int sumOfLetters = 0;
			for (String name : names) {
				sumOfLetters += name.length();
				
			int averageTwo = sumOfLetters / name.length(); 
				System.out.println(averageTwo);
			}
				
			String concatNames = "";// two quotes is an empty string to store 
			for ( String person : names) {
				concatNames += person + " ";// takes whatever original string is and were adding the persons name + a space
			}
			System.out.println(concatNames); 
			//Moved outside of forloop so we have the concatNames string print once instead of every time the loop iterates
			//If the print is inside the for loop, it'll print every time a name gets added

			//	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
			int[] nameLengths = new int [names.length];
			for (int a = 0; a < names.length; a++) {	
				// names[a] is where we insert the position of what "a" is at the current iteration of the loop
				// first position is 0, and 0 is "Sam" in the names array.
				// we then grab the length of sam. The code looks like this "Sam".length()
				System.out.println(names[a].length());
				nameLengths[a] = names[a].length();
			}
			System.out.println(Arrays.toString(nameLengths)); //Turns Array to String arrays.tostring
			
			//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.	
			
			int sumOfNameLengths = 0;
			for (int b : nameLengths) {
				sumOfNameLengths += b;
				System.out.println(sumOfNameLengths);
			}
			
			
			String word = "Wicked";
			int n= 5;
			
			System.out.println(repeat(word, n));
					
			
			
			String firstName = "Danielle";
			String lastName = "Smith";
			String fullName = createFullName(firstName, lastName);
			
		
			System.out.println(fullName); 
			
			//	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			
	
			//ArrayList<Integer> numArray = new ArrayList<Integer>(Arrays.asList(12, 35, 7, 28, 62));
			int[] grades = new int [5];
			
			grades[0] = 12;
			grades[1] = 35;
			grades[2] = 7;
			grades[3] = 28;
			grades[4] = 62;
					
					
			System.out.println(totalSum(grades));
			
			
			//	Write a method that takes an array of double and returns the average of all the elements in the array.
			
			double[] dubNumbers = new double [7];
			
			dubNumbers[0] = 23.3;
			dubNumbers[1] = 47.5;
			dubNumbers[2] = 13.4;
			dubNumbers[3] = 9.1;
			dubNumbers[4] = 33.6;
			dubNumbers[5] = 3.3;
			dubNumbers[6] = 1.7;
					
			System.out.println(calculateAverage(dubNumbers));
			
			
		//	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array
			
			double[] classOneGrades = new double [6];
			
			classOneGrades[0] = 87.4;
			classOneGrades[1] = 80.7;
			classOneGrades[2] = 75.8;
			classOneGrades[3] = 89.9;
			classOneGrades[4] = 93.5;
			classOneGrades[5] = 98.2;
			
			double[] classTwoGrades = new double [6];
			
			classTwoGrades[0] = 77.1;
			classTwoGrades[1] = 85.8;
			classTwoGrades[2] = 97.3;
			classTwoGrades[3] = 90.6;
			classTwoGrades[4] = 73.4;
			classTwoGrades[5] = 82.7;
			
			System.out.println(isAverageOneBiggerThanTwo(classOneGrades, classTwoGrades));
			
			//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
			System.out.println(willBuyDrink(true, 5.00));
			
			
			Scanner scan = new Scanner(System.in);
				System.out.println("Please Enter A Month:");
				String month = scan.next();
				
				System.out.println("This" + month + "has" );

				
						
			
			
		} // end of main domain
				
		
	//beginning of methods
		public static String repeat(String word, int n) {
			String lotsOfWords = "";
			
			// Looping here to do the multiplcation of the string
			for(int i=0; i < n; i++) {
				lotsOfWords += word; //We tried concat, but it wasn't concating
			}
			return lotsOfWords; 
		}
	
		public static String createFullName(String x, String y) { //string x represent firstNAme, string y represents lastName
			String fullName = x + " " + y;
			return fullName; 
		}
	
	public static boolean totalSum (int[]numbers){
		int total = 0;
		int d = 100;
		
		for (int number : numbers) {
			total += number;
		}
		
		if (total > d){
			return true;
		} else
			return false;
	}
		
			
		
		public static double calculateAverage(double[]numbers){ // numbers is a new variable for the method
			double sum = 0;
			for (double number : numbers) {
				sum += number;
				}
			return sum;
			}
		
		
		public static boolean isAverageOneBiggerThanTwo (double[]x,double[]y) {
			
			double sumOfOne = 0;
			for (double number : x) {
			sumOfOne += number;
			}
		
			double sumOfTwo = 0;
			for (double num : y) {
				sumOfTwo += num;
			}
			
			if (sumOfOne/x.length > sumOfTwo/y.length) {
				return true;
			} else 
				return false;
		}
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPockets) {
			
			if (moneyInPockets > 10.50 && isHotOutside) {
				return true;
			} else
				return false;
		}
}// end of main method
		
		
		
		

		
		
		
			
					
					
			
		


			 
				 

				
				 
			 
		
	
		
			


			
	
			
		

