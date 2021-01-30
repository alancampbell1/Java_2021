package StacksAndQueues;
import java.util.*;

/**
 * 
 * @author alancampbell
 * 
 * The user is given a stack data structure to work with and this stack has pop and push operations.
 * The task is to implement a queue using stacks and be able to carry out queue like operations.
 * Remember: A Stack is LAST IN FIRST OUT. A Queue is FIRST IN FIRST OUT.
 * 
 * We can implement a Queue by using two Stacks.
 * 
 * - Create a new class called 'myQueue' and create two Stack objects within it called s1 and s2.
 * - Create a method called 'insertQueue' that takes a value we want to insert into the queue, e.g. '5'.
 * -- First, if s1 is not empty, it will remove each value and insert it into s2. Then repeats this until empty.
 * Initially, it is empty so this is skipped.
 * -- The int value '5' is inserted as normal onto the stack s1.
 * -- s2 is then checked if not empty and if it has values, each value is removed and inserted back onto s1 where '5' 
 * already has been added (i.e. we are reversing s1).
 * Initially, it is also empty so this is skipped. Ending the method.
 * 
 * - A second call to insertQueue is made with the value '8' passed in.
 * -- s1 is not empty, so the value '5' is removed from s1 and inserted onto s2.
 * -- '8' is then inserted into s1 as the 'first' value in.
 * -- s2 is not empty, so the value '5' is removed from s2 and inserted onto s1 where '8' already exists, so our s1 stack
 * looks like: 8 5
 * 
 * - A third call to insertQueue is made with the value '2' passed.
 * -- s1 is not empty, so the value '5' and then '8' are removed and inserted onto s2 as 5 8
 * -- '2' is then inserted onto s1 as the first and only value at this moment.
 * -- s2 is not empty, so '8' and then '5' are removed and insert back onto s1 where '2' awaits as the initial entry.
 * -- This gives using the stack of 2 8 5
 * 
 * - To remove/print the contents of the stack as a queue we use the removeQueue() method and return each value removed.
 * - An initial check is carried out to see if the s1 stack is empty. If so, error message returned.
 * -- We assign our returned variable x, the contents of the top of the stack, which is 8 in our instance (also the first
 * value inserted).
 * -- We then call on pop() to remove this value from the stack completely
 * -- Then we return x to the Main Method.
 * Remember we have on each call to insertQueue(), reversed the stack's elements so that it behaves as FIRST IN FIRST OUT.
 * 
 * When we print the contents we get '5' (the first value inserted and now first out), then '8' and lastly '2' as the last
 * value inserted.
 * 
 * Remember: the key to this challenge is to reverse s1, so when we pop() we get first in first out actions.
 * 
 */

class myQueue {
	
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	void insertQueue(int x) {
		
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		s1.push(x);
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	int removeQueue() {
		
		if(s1.isEmpty()) {
			System.out.println("The Queue is Empty");
			return 0;
		}
		
		int x = s1.peek();
		s1.pop();
		return x;
		
	}
}

public class queueUsingStack {
	
	public static void main(String [] args) {
		
		myQueue q1 = new myQueue();
		q1.insertQueue(5);
		q1.insertQueue(8);
		q1.insertQueue(2);
		
		System.out.println(q1.removeQueue());
		System.out.println(q1.removeQueue());
		System.out.println(q1.removeQueue());
		
	}

}
