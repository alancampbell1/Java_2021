package OOP;

/**
 * 
 * @author alancampbell
 * 
 * A HashMap stores items in key/value pairs. From which you can access by an index of another type.
 * 
 * One object is used as a key (the index) to another object (the value). 
 * You can store the following using HashMaps:
 * String keys and Integer values
 * String keys and String values
 * 
 */

import java.util.HashMap;

public class OOP_Hashmaps {
	
	public static void main(String [] args) {
		
		//The following example creates a HashMap that stores String Keys to String Values
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		//To add an Item to a HashMap we use the .put() method
		capitalCities.put("Ireland", "Dublin");
		capitalCities.put("England","London");
		capitalCities.put("France", "Paris");
		
		//To access a specific value we use the .get() method with the key value
		System.out.println(capitalCities.get("Ireland"));
		
		//To remove an item we use the remove() method with the key value
		capitalCities.remove("France");
		
		System.out.println(capitalCities);
		
		//Use .size() to get the length of the HashMap
		System.out.println(capitalCities.size());
		
		//To loop through a HashMap you must use a for-each loop and the .keySet() method to print the keys. 
		for(String i : capitalCities.keySet()) {
			System.out.println(i);
		}
		
		//To print the values, use the .values() method
		for(String i : capitalCities.values()) {
			System.out.println(i);
		}
		//Alternatively, use the keySet() method with the .get() method inside each iteration
		for(String i : capitalCities.keySet()) {
			System.out.println(capitalCities.get(i));
		}
		
		//The following HashMap is an example of a String Integer HashMap. The Strings represent the keys and Integers represent the values
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		people.put("Alan", 29);
		people.put("Niall", 26);
		
		
	}

}
