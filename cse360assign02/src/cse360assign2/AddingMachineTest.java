package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void testAddingMachine() 
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		
		assertEquals(7, myCalculator.getTotal());
	}
	
	@Test
	void testToString()
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		String output = "0 + 4 - 2 + 5";
		
		assertEquals(output, myCalculator.toString());
	}
	
	@Test
	void test1()
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(8);
		myCalculator.add(3);
		myCalculator.add(11);
		myCalculator.subtract(10);
		String output = "0 + 8 + 3 + 11 - 10";
		
		assertEquals(output, myCalculator.toString());
	}
	
	@Test
	void test2()
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(8);
		myCalculator.add(3);
		myCalculator.add(11);
		myCalculator.subtract(10);
		int output = 12;
		
		assertEquals(output, myCalculator.getTotal());
	}
	
	@Test
	void test3()
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(5);
		myCalculator.subtract(2);
		myCalculator.add(5);
		String output = "0 + 5 - 2 + 5";
		
		assertEquals(output, myCalculator.toString());
	}
	
	@Test
	void testClear()
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(8);
		myCalculator.clear();
		myCalculator.add(10);
		myCalculator.subtract(9);
		myCalculator.add(5);
		myCalculator.subtract(3);
		int output = 3;
		
		assertEquals(output, myCalculator.getTotal());
	}
	
	@Test
	void testClear2()
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(8);
		myCalculator.clear();
		myCalculator.add(10);
		myCalculator.subtract(9);
		myCalculator.add(5);
		myCalculator.subtract(3);
		String output = "0 + 10 - 9 + 5 - 3";
		
		assertEquals(output, myCalculator.toString());
	}

}
