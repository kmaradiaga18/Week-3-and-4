package com.labassignments;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Week3and4 {


	public static void main(String[] args) {
		
ArrayList<Integer> ages = new ArrayList<Integer>(Arrays.asList(3,9,23,64,2,8,28,93)); // We did an array list instead.
		
		System.out.println(ages.get(ages.size()-1)-ages.get(0)); //cannot use[7] use get instead.		
	ages.add(36); // added the number 36 using .add because an arraylist can grow
		
		System.out.println(ages);
		
		System.out.println(ages.get(ages.size()-1)-ages.get(0)); // repeat .get from above, we see now it takes 36-3 and prints 30
		
		
		//1c. use loop to iterate through the array and calculate the average age, then print.
		
		int sumOfAges = 0; //Storage for entire sum of ages	
		
		for (int i=0;i<ages.size()-1; i++) {
			ages.get(i); //Grab the current age of iteration ages[i], but since using an ArrayList we use ages.get(i)
			sumOfAges = sumOfAges + ages.get(i);  //We grab the current Sum (0 at first iteration) and add the age we get at current iteration (i)
			
			System.out.println(sumOfAges); //running total			
		}
		
		int average = sumOfAges / ages.size();
		System.out.println(average);
		
		// 2. Create an array of strings with following names. Use loop to iterate through array and calculate average # of letters per name and print. Use another loop
		// to iterate through array again and concatinate all names together separated by spaces and print.
		
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
			
			//3.	How do you access the last element of any array? Length - 1
			
			//4.	How do you access the first element of any array? [0]

			

			//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
			int[] nameLengths = new int [names.length]; //Create a new Array called nameLengths with the length(size) of the names array.
			for (int a = 0; a < names.length; a++) {
				System.out.println(names[a].length()); // For every name[a] in names array. I check the length.
				nameLengths[a] = names[a].length(); //for every name in names we are saving the length of that name and storing it in the new array of nameLengths (At the current iteration)
			}
			System.out.println(Arrays.toString(nameLengths)); //Turns Array to String arrays.tostring
			
			//6.Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.	
			
			int sumOfNameLengths = 0;
			for (int b : nameLengths) {
				sumOfNameLengths += b;
				System.out.println(sumOfNameLengths);
			}
			
	//7.Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	//  (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			
			String word = "Wicked";
			int n= 5;
			
			System.out.println(repeat(word, n));
					
	//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
			
			String firstName = "Danielle";
			String lastName = "Smith";
			String fullName = createFullName(firstName, lastName);
			
		
			System.out.println(fullName); 
			
	//	9.Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			
			int[] grades = new int [5];
			
			grades[0] = 12;
			grades[1] = 35;
			grades[2] = 7;
			grades[3] = 28;
			grades[4] = 62;
					
					
			System.out.println(totalSum(grades));
			
			
	//	10.Write a method that takes an array of double and returns the average of all the elements in the array.
			
			double[] dubNumbers = new double [7];
			
			dubNumbers[0] = 23.3;
			dubNumbers[1] = 47.5;
			dubNumbers[2] = 13.4;
			dubNumbers[3] = 9.1;
			dubNumbers[4] = 33.6;
			dubNumbers[5] = 3.3;
			dubNumbers[6] = 1.7;
					
			System.out.println(calculateAverage(dubNumbers));
			
			
	//	11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array
			
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
			
	//12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
			System.out.println(willBuyDrink(true, 5.00));
			

	//13. 		
				int[] randomNums = new int [8];
				randomNums[0] = 835;
				randomNums[1] = 874;
				randomNums[2] = 203;
				randomNums[3] = 473;
				randomNums[4] = 394;
				randomNums[5] = 238;
				randomNums[6] = 298;
				randomNums[7] = 630;
			
				
			System.out.println(findBiggestNum(randomNums));
			
		
			
		} // end of main domain

				
		
	//beginning of methods
		public static String repeat(String word, int n) {
			String lotsOfWords = "";
			
			// Looping here to do the multiplcation of the string
			for(int i=0; i < n; i++) {
				lotsOfWords += word; //I tried concat, but it wasn't concating
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
		
		//write a method that takes an array of int and returns the largest number in the array
		public static int findBiggestNum(int[]numbers) {
			int largest = 0;
			for (int number : numbers) {
				if (number > largest) {
					largest = number;
				}
			}
			return largest;
		}
		
		
}// end of main method
		
		

		

		
		
		
			
					
					
			
		


			 
				 

				
				 
			 
		
	
		
			


			
	
			
		

