package com.sapient.trg.pl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
	
	private App app=null;

//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//		
//		System.out.println("before all hello");
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//		System.out.println("after all hello");
//	}

	@BeforeEach
	void setUp() throws Exception {
		app=new App();
		//System.out.println("before each hello");
	}

	@AfterEach
	void tearDown() throws Exception {
		app=null;
		//System.out.println("after each hello");
	}

	@Test
	void testIsPerfectNumberForSuccess() {
		assertEquals(25,app.isPerfectNumber(5));
		//System.out.println("hello");
		//fail("Not yet implemented");
	}
	@Test
	void testIsPerfectNumberForFailure() {
		assertNotEquals(24,app.isPerfectNumber(5));
		//System.out.println("hello");
		//fail("Not yet implemented");
	}
	@Test
	void testCubeForSuccess() {
		assertEquals(125,app.cube(5));
		//System.out.println("hello");
		//fail("Not yet implemented");
	}
	@Test
	void testCubeForFailure() {
		assertNotEquals(24,app.cube(5));
		//System.out.println("hello");
		//fail("Not yet implemented");
	}
	@Test
	void testisPerfectNumberForSuccess() {
		assertEquals(true,app.isPerfectNumber(6));
	}
	@Test
	void testisPerfectNumberForFailure() {
		assertNotEquals(true,app.isPerfectNumber(5));
	}
	@Test
	void testFactorialForSuccess() {
		assertEquals(125,app.factorial(5));
	}
	@Test
	void testFactorialForFailure() {
		assertNotEquals(124,app.factorial(5));
	}
	@Test
	void testIsPrimeForSuccess() {
		assertEquals(true,app.isPrime(5));
	}
	@Test
	void testIsPrimeForFailure() {
		assertNotEquals(false,app.isPrime(5));
	}
	@Test
	void testsumOfPrimesForSuccess() {
		assertEquals(25,app.sumOfPrimes(5));
	}
	@Test
	void testsumOfPrimesForFailure() {
		assertNotEquals(24,app.sumOfPrimes(5));
	}
	@Test
	void testisArmstrongNumberForSuccess() {
		assertEquals(true,app.isArmstrongNumber(153));
	}
	@Test
	void testisArmstrongNumberForFailure() {
		assertNotEquals(true,app.isArmstrongNumber(121));
	}
	@Test
	void testreverseNumberForSuccess() {
		assertEquals(52,app.reverseNumber(25));
	}
	@Test
	void testreverseNumberForFailure() {
		assertNotEquals(24,app.reverseNumber(25));
	}
	@Test
	void testdecimalToBinaryForSuccess() {
		assertEquals(101,app.decimalToBinary(5));
	}
	@Test
	void testdecimalToBinaryForFailure() {
		assertNotEquals(101,app.decimalToBinary(6));
	}
	@Test
	void testbinaryToDecimalForSuccess() {
		assertEquals(5,app.binaryToDecimal(101));
	}
	@Test
	void testbinaryToDecimalForFailure() {
		assertNotEquals(24,app.binaryToDecimal(101));
	}
	@Test
	void testgetSumOfNfibosForSuccess() {
		assertEquals(6,app.getSumOfNfibos(6));
	}
	@Test
	void testgetSumOfNfibosForFailure() {
		assertNotEquals(15,app.getSumOfNfibos(6));
	}
	@Test
	void testisPalindromeNumberForSuccess() {
		assertEquals(true,app.isPalindromeNumber(1221));
	}
	@Test
	void testisPalindromeNumberForFailure() {
		assertNotEquals(true,app.isPalindromeNumber(523));
	}
	

}
