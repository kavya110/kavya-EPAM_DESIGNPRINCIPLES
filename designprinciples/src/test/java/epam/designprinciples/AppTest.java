package epam.designprinciples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest extends App
{
	public void test() {
		Operation cal = new Operation();

		
		
		// test the Addition function 

		int answer = cal.Add(29,20);
		assertEquals(49,answer);

		
		// test the Subtract function
		
		answer = cal.Sub(5, 2);
				
		assertEquals(3, answer);
	}
}
		
			
		// test the Multiply function

