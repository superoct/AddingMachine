package cse360assign2;
/**
 * 
 * @author Octavio Gonzalez
 * Assignment 2
 * This class is a machine that adds and subtracts numbers
 */

public class AddingMachine {

	private int total;
	
	/**
	 * 
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * 
	 * @param value
	 */
	public void add (int value) 
	{
		total = total + value;
	}
	
	/**
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		
	}
		
	/**
	 * 
	 */
	public String toString () {
		return "";
	}
	
	/**
	 * 
	 */
	public void clear() {
	
	}
}
