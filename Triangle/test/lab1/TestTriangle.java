package lab1;

import static org.junit.Assert.*;

import org.junit.Before;

import lab1.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class TestTriangle {
	
	Triangle tri;
	String result;
	@Before
	public void setup()
	{
		tri = new Triangle();
	}
	String r1="equilateral";
	String r2="isosceles";
	String r3="scalene";
	String r4="No";
	
	
	
	@Test
	public void test1() {
		result = tri.triangle(1, 2, 3);
		assertEquals(r4, result);
	}
	
	@Test
	public void test2() {
		result = tri.triangle(3, 4, 5);
		assertEquals(r3, result);
	}
	
	@Test
	public void test3() {
		result = tri.triangle(6, 6, 6);
		assertEquals(r1, result);
	}
	
	@Test
	public void test4() {
		result = tri.triangle(4, 4, 5);
		assertEquals(r2, result);
	}

}
