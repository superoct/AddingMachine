package cse360assign2;
/**
 * 
 * @author Octavio Gonzalez
 * Assignment 2
 * This class is a machine that adds and subtracts numbers and show the history of the numbers being added and subtracted.
 */

public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * The AddingMachine method is the constructor of the class. Setting the total and history to be 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * The getTotal method returns the total.
	 * @return the total of the AddingMachine class.
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * The add method adds the value to the total and record the value which was added.
	 * @param value the value from the user's input will be added.
	 */
	public void add (int value) 
	{
		total = total + value;
		history = history + " + " + Integer.toString(value);
	}
	
	/**
	 * The subtract method subtracts the value from the total and record the value which was subtracted.
	 * @param value the value from the user's input will be subtracted from the total.
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history = history + " - " + Integer.toString(value);
	}
		
	/**
	 * The toString method prints the history of the values being added and/or subtracted.
	 * @return the history of valued being added and/or subtracted from 0 to the last input.
	 */
	public String toString () 
	{
		return history;
	}
	
	/**
	 * The clear method make a clear of the elements being added.
	 */
	public void clear() {
	
	}
}
