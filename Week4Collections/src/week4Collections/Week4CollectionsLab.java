package week4Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Week4CollectionsLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// a. Instantiate a new StringBuilder
		// b. Append the characters 0 through 9 to it separated by dashes
		// Note: make sure no dash appears at the end of the StringBuilder
		StringBuilder count = new StringBuilder();
		for (int i = 0; i <= 9; i++) {
			if (i == 9) {
				count.append(9);
			} else {
				count.append(i + " - ");
			}
		}
		 System.out.println(count);

		// 2. List of String:
		// a. Create a list of Strings
		// b. Add 5 Strings to it, each with a different length
		List<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jacob");
		names.add("Benjamin");
		names.add("Daniel");
		names.add("Sam");
		names.add("Joe");
		// 3. Write and test a method that takes a list of strings
		// and returns the indexOfShortest string
		System.out.println(findShortestString(names));

		// 4. Write and test a method that takes a list of strings
		// and returns the list with the first and last element switched
		System.out.println(switchLastElement(names));

		// 5. Write and test a method that takes a list of strings
		// and returns a string with all the list elements concatenated to each other,
		// separated by a comma
		System.out.println(concatenatedList(names));

		// 6. Write and test a method that takes a list of strings and a string
		// and returns a new list with all strings from the original list
		// containing the second string parameter (i.e. like a query method)

		System.out.println(search(names, "e"));

		// 7. Write and test a method that takes a list of integers
		// and returns a List<List<Integer>> with the following conditions specified
		// for the return value:
		// a. The first List in the returned value contains any number from the input
		// list
		// that is divisible by 2
		// b. The second List contains values from the input list that are divisible by
		// 3
		// c. The third containing values divisible by 5, and
		// d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(92);
		numbers.add(85);
		numbers.add(18);
		numbers.add(56);
		numbers.add(23);
		numbers.add(33);
		System.out.println(divisibleList(numbers));

		// 8. Write and test a method that takes a list of strings
		// and returns a list of integers that contains the length of each string
		System.out.println(stringLength(names));

		// 9. Create a set of strings and add 5 values
		Set<String> cars = new HashSet<String>();
		cars.add("BMW");
		cars.add("Mercedes Benz");
		cars.add("Lexus");
		cars.add("Maserati");
		cars.add("Audi");

		// 10. Write and test a method that takes a set of strings and a character
		// and returns a set of strings consisting of all the strings in the
		// input set that start with the character parameter.

		System.out.println(startsWith(cars, 'M'));

		// 11. Write and test a method that takes a set of strings
		// and returns a list of the same strings
		System.out.println(setToListConvertor(cars));

		List<String> convertedList = new ArrayList<String>(setToListConvertor(cars));
		System.out.println(convertedList.get(0));

		// 12. Write and test a method that takes a set of integers
		// and returns a new set of integers containing only even numbers
		// from the original set
		Set<Integer> ages = new HashSet<Integer>();
		ages.add(23);
		ages.add(28);
		ages.add(32);
		ages.add(44);
		ages.add(25);
		ages.add(30);

		System.out.println(evenAges(ages));

		// 13. Create a map of string and string and add 3 items to it where the key of
		// each
		// is a word and the value is the definition of the word
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Bright", "giving out or reflecting a lot of light; shining.");
		dictionary.put("Emotions",
				"a natural instinctive state of mind deriving from one's circumstances, mood, or relationships with others.");
		dictionary.put("Torch",
				"a portable means of illumination such as a piece of wood or cloth soaked in tallow or an oil lamp on a pole, sometimes carried ceremonially.");

		// 14. Write and test a method that takes a Map<String, String> and a string
		// and returns the value for a key in the map that matches the
		// string parameter (i.e. like a language dictionary lookup)
		Scanner sc = new Scanner(System.in);
		String wordSearch = sc.next();
		System.out.println(dictionarySearch(dictionary, wordSearch));
		
		// 15. Write and test a method that takes a List<String>
		// and returns a Map<Character, Integer> containing a count of
		// all the strings that start with a given character
		System.out.println(stringCount(names));
		
		
		
	}

	// Method 3:
	public static String findShortestString(List<String> names) {
		int indexOfShortest = 0;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(indexOfShortest).length() > names.get(i).length()) {
				indexOfShortest = i;
			}
		}
		return names.get(indexOfShortest);
	}

	// Method 4:
	public static List<String> switchLastElement(List<String> names) {
		int lastElement = names.size() - 1;
		String lastElementString = names.get(lastElement);
		names.set(lastElement, names.get(0));
		names.set(0, lastElementString);
		return names;
	}

	// Method 5:
	public static String concatenatedList(List<String> names) {
		String concatenatedNames = "";
		for (String name : names) {
			concatenatedNames += (name + ", ");
		}
		return concatenatedNames;
	}

	// Method 6:
	public static List<String> search(List<String> names, String query) {
		List<String> results = new ArrayList<String>();
		for (String string : names) {
			if (string.contains(query)) {
				results.add(string);
			}
		}
		return results;
	}

	// Method 7:
	public static List<List<Integer>> divisibleList(List<Integer> numbers) {
		List<List<Integer>> listOfDivisibles = new ArrayList<List<Integer>>();
		listOfDivisibles.add(new ArrayList<Integer>());
		listOfDivisibles.add(new ArrayList<Integer>());
		listOfDivisibles.add(new ArrayList<Integer>());
		listOfDivisibles.add(new ArrayList<Integer>());

		for (Integer num : numbers) {
			if (num % 2 == 0) {
				listOfDivisibles.get(0).add(num);
			}
			if (num % 3 == 0) {
				listOfDivisibles.get(1).add(num);
			}
			if (num % 5 == 0) {
				listOfDivisibles.get(2).add(num);
			}
			if ((num % 2 != 0) && (num % 3 != 0) && (num % 5 != 0)) {
				listOfDivisibles.get(3).add(num);
			}
		}
		// List <Integer> divisbleby2 = new ArrayList <Integer>();
		// List <Integer> divisbleby3 = new ArrayList <Integer>();
		// List <Integer> divisbleby5 = new ArrayList <Integer>();
		// List <Integer> notdivisbleby235 = new ArrayList <Integer>();
		// listOfDivisibles.add(divisbleby2);
		// listOfDivisibles.add(divisbleby3);
		// listOfDivisibles.add(divisbleby5);
		// listOfDivisibles.add(notdivisbleby235);

		// for (Integer num : numbers) {
		// if (num % 2 == 0) {
		// divisbleby2.add(num);
		// } if (num % 3 == 0) {
		// divisbleby3.add(num);
		// } if (num % 5 == 0) {
		// divisbleby5.add(num);
		// } if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
		// notdivisbleby235.add(num);
		// }
		// }

		return listOfDivisibles;

	}

	// Method 8:
	public static List<Integer> stringLength(List<String> names) {
		List<Integer> lengthOfString = new ArrayList<Integer>();
		for (String name : names) {
			lengthOfString.add(name.length());
		}
		return lengthOfString;
	}

	// Method 10:
	public static Set<String> startsWith(Set<String> cars, Character letter) {
		Set<String> results = new HashSet<String>();
		for (String car : cars) {
			if (car.charAt(0) == Character.toUpperCase(letter)) {
				results.add(car);
			}
		}
		return results;
	}

	// Method 11:
	public static List<String> setToListConvertor(Set<String> cars) {
		List<String> results = new ArrayList<String>(cars);
		return results;
	}

	// Method 12:
	public static Set<Integer> evenAges(Set<Integer> ages) {
		Set<Integer> results = new HashSet<Integer>();
		for (Integer age : ages) {
			if (age % 2 == 0) {
				results.add(age);
			}
		}
		return results;
	}

	// Method 14:
	public static String dictionarySearch (Map<String, String> dictionary, String query) {
		String results = "";
		if (dictionary.containsKey(query)) {
			results = dictionary.get(query);
		}	return results;
	
	}
	
	// Method 15:
	public static Map<Character, Integer> stringCount (List<String> names) {
		Map <Character, Integer> results = new HashMap<Character, Integer>();
		
		for (String name : names) {
			char c = name.charAt(0);
		if (results.get(c) == null) {
			results.put(c, 1);
		}	else {
			results.put(c, results.get(c) + 1);
			}
		
		} return results;
	
	}
	
	
}
