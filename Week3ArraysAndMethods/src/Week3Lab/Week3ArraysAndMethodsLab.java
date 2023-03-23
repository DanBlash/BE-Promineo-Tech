package Week3Lab;

import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

public class Week3ArraysAndMethodsLab {

	public static void main(String[] args) {

		//
		// Arrays:
		//

		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] intArray = { 1, 5, 2, 8, 13, 6 };

		// 2. Print out the first element in the array
		System.out.println(intArray[0]);

		// 3. Print out the last element in the array without using the number 5
		System.out.println(intArray[intArray.length - 1]);

		// 4. Print out the element in the array at position 6, what happens?

		// System.out.println(intArray[6]);

		// Printing out element 6 in the array returns an error, because there is no
		// element in position 6

		// 5. Print out the element in the array at position -1, what happens?

		// System.out.println(intArray[-1]);

		// This shows the same error as problem 4 because there is no element in the
		// array in position -1. It is "out of bounds" for the length

		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		// 7. Write an enhanced for loop that prints out each element in the array
		for (int number : intArray) {
			System.out.println(number);
		}

		// 8. Create a new variable called sum, write a loop that adds
		// each element in the array to the sum
		int sum = 0;
		for (int number : intArray) {
			sum += number;
		}
		System.out.println(sum);

		// 9. Create a new variable called average and assign the average value of the
		// array to it
		int average = sum / intArray.length;

		// 10. Write an enhanced for loop that prints out each number in the array
		// only if the number is odd
		for (int number : intArray) {
			if (number % 2 == 1) {
				System.out.println(number);
			}
		}

		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and
		// "Robert"
		String[] names = { "Sam", "Sally", "Thomas", "Robert" };

		// 12. Calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		//
		// Methods:
		//

		// 13. Write and test a method that takes a String name and prints out a
		// greeting.
		// This method returns nothing.
		printedGreeting("Ben");

		// 14. Write and test a method that takes a String name and
		// returns a greeting. Do not print in the method.
		System.out.println(returnedGreeting("Ben"));

		// Compare method 13 and method 14:
		// a. Analyze the difference between these two methods.
		// b. What do you find?
		// c. How are they different?

		// The only difference between these two methods is the print to console does
		// not happen inside the method. One is passable into a print method.

		// 15. Write and test a method that takes a String and an int and
		// returns true if the number of letters in the string is greater than the int
		System.out.println(trueOrNot("Promineo", 5));

		// 16. Write and test a method that takes an array of string and a string and
		// returns true if the string passed in exists in the array
		String[] s1 = { "Mary", "John", "Steve" };
		System.out.println(arrayTrue(s1, "Mary"));
		// 17. Write and test a method that takes an array of int and
		// returns the smallest number in the array
		int[] lowestInt = { 18, 6, 11, 2, 12, 3 };
		System.out.println(smallestInt(lowestInt));

		// 18. Write and test a method that takes an array of double and
		// returns the average
		double[] averageDouble = { 7.3, 6.2, 3.2, 1.6, 8.4 };
		System.out.println(doubleavg(averageDouble));

		// 19. Write and test a method that takes an array of Strings and
		// returns an array of int where each element
		// matches the length of the string at that position
		String[] array1 = { "Eagle", "Buffalo", "Duck", "Bird", "Deer", "Fish"};
		System.out.println(extractStringLengths(array1));

		// 20. Write and test a method that takes an array of strings and
		// returns true if the sum of letters for all strings with an even amount of
		// letters
		// is greater than the sum of those with an odd amount of letters.
		System.out.println(evenOddStrings(array1));

		// 21. Write and test a method that takes a string and
		// returns true if the string is a palindrome

	}

	// Method 13:
	public static void printedGreeting(String name) {
		System.out.println("Hello, " + name + "!");
	}

	// Method 14:
	public static String returnedGreeting(String name) {
		return ("Hi, " + name + "!");
	}

	// Method 15:
	public static Boolean trueOrNot(String x, int num) {
		if (x.length() > num)
			return true;
		return false;
	}

	// Method 16:
	public static Boolean arrayTrue(String[] s1, String string1) {
		for (String exist : s1) {
			if (string1 == exist) {
				return true;
			}
		}
		return false;
	}

	// Method 17:
	public static int smallestInt(int[] lowestInt) {
		int num = lowestInt[0];
		for (int number : lowestInt) {
			if (num > number) {
				num = number;
			}
		}
		return num;
	}

	// Method 18:
	public static double doubleavg(double[] averageDouble) {
		double sum = 0;
		double average = 0;
		for (double num : averageDouble) {
			sum += num;
		}
		average = sum / averageDouble.length;
		return average;
	}

	// Method 19:
	public static int[] extractStringLengths(String[] array1) {
		int[] results = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			results[i] = array1[i].length();
		}
		return results;
	}

	// Method 20:
	public static Boolean evenOddStrings(String[] array1) {
		int oddSum = 0;
		int evenSum = 0;
		for (String strings : array1) {
			if (strings.length() % 2 == 0) {
				evenSum += strings.length();
			} else {
				oddSum += strings.length();
			}
			if (evenSum > oddSum) {
				return true;
			}
		}
		return false;
	}

	// Method 21:

}
