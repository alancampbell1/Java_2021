package OOP;

/**
 * 
 * @author alancampbell
 * 
 * Arrays are used to store multiple values in a single variable. 
 * To declare a variable as an array you include [] after the data type, e.g. String[] cars;
 * To assign a series of values to the array, you use {} and commas between each value.
 * Array elements start at an index of 0.
 * You can use the Array index to access and change elements
 * 
 * 
 */

public class OOP_Arrays {
	
	public static void main(String [] args) {
		
		String [] cars;
		String [] carBrands = {"Volvo","Skoda","BMW","VW"};
		
		System.out.println(carBrands[0]);
		carBrands[2] = "Ford"; 
		
		//To find out the length of an Array, use the length property. NOTE: will will fail on an empty array
		System.out.println(carBrands.length);
		
		//You can loop through an Array with a for loop 
		for(int i = 0; i < carBrands.length; i++) {
			System.out.println(carBrands[i]);
		}
		
		/**
		 * Multi-dimensional arrays are arrays that contain more than one array.
		 * They are declared with two [][] after the data type declaration
		 */
		int [][] myArray = {{1,2,3,4}, {5,6,7,8}};
		
		/*
		 * To access a specific element, we specify the following indexes:
		 * - the index of the array we want
		 * - the element inside that array
		 * E.g. myArray[1][2] means the 2nd internal array and the 3rd value (Arrays start on 0)
		 */
		
		int x = myArray[1][2];
		System.out.println(x);
		
		/**	
		 * To access each element individually in a multi-dimensional array we use a for loop inside a for loop.
		 * The first loop navigates the specific array we want.
		 * The second loop navigates the elements inside that array.
		 **/
		
		for(int i =0; i < myArray.length; i++) {
			for(int j = 0; j < myArray[i].length; j++) {
				System.out.println(myArray[i][j]);
			}
		}
	}

}
