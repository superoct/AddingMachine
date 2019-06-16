package cse360assign2;

/**
 * 
 * @author Octavio Gonzalez
 * Assignment # 2
 * This class will add and subtract numbers and print the order of the operation.
 *
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
	 * The getTotal function returns the current total
	 * @return the total of the adding machine
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * The add function will the value will the total
	 * @param value the number that it will add
	 */
	public void add (int value) 
	{
		total = total + value;
	}
	
	/**
	 * The subtract function will subtract the value from the total
	 * @param value the number that it will subtract
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
