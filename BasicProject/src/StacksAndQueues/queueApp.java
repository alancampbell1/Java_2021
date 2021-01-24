package StacksAndQueues;

/**
 * 
 * @author alancampbell
 * 
 * From book: A queue is a data structure that is similar to a Stack but in a queue, the first item inserted is the
 * first to be removed. So, if you have a queue with 5 elements and add a 6th, you will have to remove all 5 elements
 * before you can remove the 6th.
 * 
 * Similar to Stacks, a queue is not really appropriate as a data storage unit, like LinkedLists or Binary Trees. It's
 * main benefit is as a Programmer's tool in solving a particular problem. It's lifecycle is generally short lived once the
 * goal of the programmer's issue is solved.
 * 
 * Unlike a Stack, when defining a queue class with follow the front and rear of the queue.
 * 
 */

class queue{
	
	private int maxSize;
	private String[] queueArray;
	private int front;
	private int rear;
	
	/* Constructor	*/
	public queue(int s) {
		maxSize = s + 1;					//Remember, an Array is begins at zero
		queueArray = new String[maxSize];
		front = 0;
		rear = -1;
	}
	/**
	 * If the rear has reached the (maxSize - 1) then it has reached the front of the queue
	 * so put it back to the beginning.
	 * Then assign where rear is in the queue + 1 as the value in x.
	 */
	public void insert(String x) {
		if (rear == maxSize - 1) 
			rear = -1;
		
		queueArray[++rear] = x;
		
	}
	/**
	 * Get the value at the front of the queue into temp
	 * If front equals the maxSize, i.e. filled all elements with values, default front back to zero.
	 * Return temp to the user.
	 */
	public String remove() {
		String temp = queueArray[front++];
		if (front == maxSize)
			front = 0;
		return temp;
	}
	
	public String peek() {
		return queueArray[front];
	}
	
	public boolean isEmpty() {
		return (rear + 1 == front || (front + maxSize - 1 == rear));
	}
	
	public boolean isFull() {
		return (rear + 2 == front || (front + maxSize - 2 == rear));
	}
	
	public int getSize() {
		if (rear >= front)
			return rear-front + 1;
		else
			return (maxSize-front) + (rear + 1);
	}
	
}

public class queueApp {

	public static void main(String [] args) {
		
	}
}
