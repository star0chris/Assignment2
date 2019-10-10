/*Author: Christopher Campanella
 * ID: 1212604508
 * Assignment 1
 * https://github.com/star0chris/Assignment2
 * This file adds or subtracts numbers to/from a total
 * and then prints the history
 */


package cse360assign2;

public class AddingMachine { //this program simulates an adding machine

	private int total;
	
	private StringBuffer h; //variable the keeps track of each change
							//and appends the change to itself
	public AddingMachine(){
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal(){ //this method gets the total and returns the value
		return total;  
	}
	
	public void add(int value){ //adds a number to the total
		total += value;
		h.append(" + " + value);
	}
	
	public void subtract(int value){ //subtracts a number from the total
		total -= value;
		h.append(" - " + value);
	}
		
	public String toString(){ //returns the string representation of the history
		return h.toString();
	}

	public void clear(){ //clears the adding machine
		total = 0;
		h.delete(0, h.length());
	}
}
