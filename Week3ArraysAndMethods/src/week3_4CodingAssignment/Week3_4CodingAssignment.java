package week3_4CodingAssignment;

public class Week3_4CodingAssignment {

	public static void main(String[] args) {

		// # 1
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 96};
		 int sum = 0;
		 int average = 0;

		 System.out.println(ages[ages.length - 1] - ages[0]);

		 for (int number : ages) {
		 sum += number;
		 average = sum / ages.length;
		 }
		 System.out.println(average);

		// # 2
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		 int stringSum = 0;
		 int stringAverage = 0;
		 String concatenatedNames = "";
		 	for (String number : names) {
		 		stringSum += number.length();
		 		stringAverage = stringSum / names.length;
		 	}
		 System.out.println(stringAverage);

		 	for (int i = 0; i < names.length; i++) {
		 		concatenatedNames += (names[i] + " ");
		 	}
		 System.out.println(concatenatedNames);
		 

		// # 3 There are multiple ways to access the last element in an array but the two most common are using the index of the last element (arg[i])
		// and the other is (arg.length - 1). 

		// # 4 The most commonly used method of finding the first element in an array is (arg[0]).
 
		// # 5 
		int[] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();	
			}
			
		// # 6 
		int nameLengthsSum = 0;
			for (int num : nameLengths) {
				nameLengthsSum += num;
			} System.out.println(nameLengthsSum);
				
		// # 7 
		String word = "Hello";
		int n = 3;
		System.out.println(concatenatedWord(word, n));
		
		// # 8 
		String firstName = "John";
		String lastName = "Smith";
		System.out.println(fullName(firstName, lastName));
		
		// # 9 
		System.out.println(moreThan100(ages));
		
		// # 10
		double[] averageDouble = {7.2, 6.4, 7.8, 1.2, 13.8};
		System.out.println(doubleAverage(averageDouble));
		
		// # 11
		double[] averageDouble2 = {1.8, 4.5, 1.4, 1.2, 4.8}; 
		System.out.println(averageGreaterThan(averageDouble, averageDouble2));
		
		// # 12
		boolean isHotOutside = true;
		double moneyInPocket = 11.50;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		// # 13
		// The method "monthlyBudget" is used to calculate the total expenses you have and determine what is left over after deducting those.
		// This was created to simplify the math needed to figure out your ability to save money or what you have to spend left over. 
		int monthlyIncome = 2000;
		double[] monthlyExpense = {19.95, 50.00, 93.48, 352.18, 1100.00, 124.52};
		monthlyBudget(monthlyIncome, monthlyExpense);
		
		
			
	}
	public static String concatenatedWord(String word, int n) {
		String concatenated = "";
		for (int i = 0; i < n; i++) {
			concatenated += (word);
		} return concatenated;
	}
	
	public static String fullName(String firstName, String lastName) {
		String fullName = (firstName + " " + lastName);
		return fullName;		
	}
	
	public static Boolean moreThan100(int[] ages) {
		int sum = 0;
		for (int num : ages) {
			sum += num;
		}	if(sum > 100) {
			return true;
			}
		return false;
	}
	
	public static double doubleAverage(double[] averageDouble) {
		double sum = 0;
		double average = 0;
			for (double num : averageDouble) {
				sum += num;
				average = (sum / averageDouble.length);
			} return average;
	}
	
	public static Boolean averageGreaterThan(double[] averageDouble, double[] averageDouble2) {
		double sum1 = 0; 
		double sum2 = 0;
		double average1 = 0;
		double average2 = 0;
		for (double num : averageDouble) {
			sum1 += num;
			average1 = (sum1 / averageDouble.length);
		}
		for (double num : averageDouble2) {
			sum2 += num;
			average2 = (sum2 / averageDouble2.length);
		}
		if (average1 > average2) {
			return true;
		} 
		return false;
	}
	
	public static Boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}return false;
	}
	
	public static void monthlyBudget(int monthlyIncome, double[] monthlyExpense) {
		double sum = 0;
		double monthlyBudget = 0;
		for (double num : monthlyExpense) {
			sum += num;
		}
		monthlyBudget = (monthlyIncome - sum);
		System.out.println("Your total monthly expenses are $" + sum + ". This leaves $" + String.format("%.2f", monthlyBudget) + " to either save or spend!");
	}
	
	
	
	
	
	
	
}
