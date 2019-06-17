package cse360assign2;
/**
 * 
 * @author Octavio Gonzalez
 * Assignment 2
 * This class is a machine that adds and subtracts numbers
 */

public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * 
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * 
	 * @param value
	 */
	public void add (int value) 
	{
		total = total + value;
		history = history + " + " + Integer.toString(value);
	}
	
	/**
	 * 
	 * @param value
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history = history + " - " + Integer.toString(value);
	}
		
	/**
	 * 
	 * @return
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * 
	 */
	public void clear() {
	
	}
}
