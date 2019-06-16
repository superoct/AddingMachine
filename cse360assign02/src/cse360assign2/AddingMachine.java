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
	}
	
	/**
	 * 
	 * @param value
	 */
	public void subtract (int value) 
	{
		total = total - value;
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
