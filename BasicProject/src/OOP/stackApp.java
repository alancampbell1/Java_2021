package OOP;

/**
 * 
 * @author alancampbell
 * 
 * From book - Data Structures & Algorithms
 * 
 * Why use a Stack or a Queue over an Array or ArrayList?
 * Arrays are most suited to the types of data you would find in database application. This data typically can be 
 * personnel records, inventories, financial data etc. Basically real-world objects and Arrays (even Linked Lists,
 * trees) make it easier to insert, delete and search for these data items.
 * 
 * Stacks and Queues are more commonly used as a Programmer's tool. They are used as aids for a programmer instead of a
 * complete data storage device. Their lifetime is much shorter and they are used primarily to complete a task during an
 * operation. Once complete they are discarded.
 * 
 * A Stack allows access to one data item at a time, the last item inserted to the Stack. If you remove this item, you can
 * then access the next 'last item added' to the Stack.
 * Microprocessors commonly use a stack-based architecture.
 * 
 * The following is the code breakdown for a Stack.
 * 
 */

/** The following class contains all the methods used to create and work with a Stack object	**/
class stack {
	
	private int maxSize;
	private String[] stackArray;
	private int top;
	
	public stack(int s) {
		maxSize = s;
		stackArray = new String[maxSize];
		top = -1;
	}
	
	public void push(String i) {		
		stackArray[++top] = i;
	}
	
	public String pop() {
		return stackArray[top--];
	}
	
	public String peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize -1);
	}
	
}

public class stackApp {
	
	public static void main(String [] args) {
		
		stack myStack = new stack(5);	//Creating a Stack with 5 elements
		
		/**
		 * 	We push values on individually. The last item we push on will be the first one we can access
		 **/
		myStack.push("5");
		myStack.push("3");
		myStack.push("8");
		myStack.push("1");
		myStack.push("9");
		
		/**
		 * To loop through a Stack, we use a while loop statement that exits when the loop is empty
		 */
		
		String stackValue;
		
		while(!myStack.isEmpty()) {
			
			stackValue = myStack.pop();
			
			System.out.println("Removing: " + stackValue);
			
		}
		
		/**
		 * You can expand the error handling here, incase a user tries to push a value onto a stack that is full.
		 * By calling on isFull(), we ensure our error message returned not the computers
		 */
		
		if(!myStack.isFull()) {
			
			myStack.push("2");
			
		} else
			System.out.println("The Stack is full, you cannot add anymore items");
		
	
		/**
		 * A basic use of a Stack is to reverse a String. This is normally used to see if a word is a palindrome, 
		 */
		
		String reversedWord;
		
		reversedWord = reverseString("Ireland");
		
		System.out.println("The word reversed is " + reversedWord);
		
		
		/** The other use of Stacks is to ensure a String has an equal number of delimiter symbols:
		 	Example:
		 				c[d]		- correct
		 				a{b[c]d}e	- correct
		 				a{b(c]d}e	- not correct
		 **/
		checkDelimiter("c[d]");
		checkDelimiter("a{b[c]d}e");
		checkDelimiter("a{b(c]d}e");
		
		
	}
	
	public static String reverseString(String userWord) {
		
		String reversedWord = "";
		
		/**Step 1: Create a Stack object that is the same length as the number of characters in the String	**/
		stack userStack = new stack(userWord.length());
		
		/**Step 2: Loop through the characters in the word and push it to the Stack	**/
		for(int i = 0; i < userWord.length(); i++) {
			
			char x = userWord.charAt(i);
			
			userStack.push(Character.toString(x));
			
		}
		
		/** Step 3: Loop through the stack and concatenate onto local variable, reversing word	**/
		while(!userStack.isEmpty()) {
			
			reversedWord = reversedWord + userStack.pop();
			
		}
		return reversedWord;
		
	}
	
	public static void checkDelimiter(String word) {
		
		/** Step 1: Create a Stack of the same length as the incoming variable	**/
		int stackSize = word.length();
		stack myStack = new stack(stackSize);
		String ch;
		
		/** Step 2: Loop through the String passed in	**/
		for(int x = 0; x < word.length(); x++) {
			
			 ch = Character.toString(word.charAt(x));
			
			/** Step 3: Take each character and if it equals an opening delimiter, push it to the stack	**/
			switch(ch) {
			
				case "{":
				case "[":
				case "(":

					myStack.push(ch);
					break;
				
				/** Step 4: If a closing delimiter is found, ensure the stack is not empty and pop off
				 *  the first character on the stack, it should correctly be a opening delimiter	**/
				case "}":
				case "]":
				case ")":
					
					if(!myStack.isEmpty()) {
						
						String chx = myStack.pop();
						System.out.println("Comparing " + ch + " and " + chx);
						/** Step 5: Compare the current Character to the one just popped off in chx, if they do not
						 *  match, an error has been found. **/

						if( (ch == "}" && chx != "{") ||
						    (ch == "]" && chx != "[") ||
							(ch == ")" && chx != "(") ) {
								System.out.println("1 Error " + ch + " at line: " + x);
						}							
					}
					else
						System.out.println("2 Error " + ch + " at line: " + x);
					break;
				/** If not a delimiter, move onto the next character	**/	
				default:
					break;
			}
			
		}
		if(!myStack.isEmpty()) {
			System.out.println("Error: missing right delimiter");
		}
	}
}





