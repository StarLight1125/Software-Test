package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import main.*;
public class testprime {

	String t1="2 3 5 ";
	String t2="2 3 5 7 11 ";
	String t3="2 3 5 7 11 13 17 ";
	String t4="2 ";
	@Test
	public void test1() {
		assertEquals(t1, test.printPrimes(3));
	}
	
	@Test
	public void test2() {
		assertEquals(t2, test.printPrimes(5));
	}
	
	@Test
	public void test3() {
		assertEquals(t3, test.printPrimes(7));
	}
	
	@Test
	public void test4() {
		assertEquals(t4, test.printPrimes(0));
	}
	
}
