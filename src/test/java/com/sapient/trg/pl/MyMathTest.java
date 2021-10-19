package com.sapient.trg.pl;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {
	 MyMath myMath=null;

	@BeforeEach
	void setUp() throws Exception {
		myMath=new MyMath();
	}

	@AfterEach
	void tearDown() throws Exception {
		myMath=null;
	}

	@Test
	void testIsPerfectNumber() {
		assertEquals(false,MyMath.isPerfectNumber(5));
	}

	@Test
	void testFactorial() {
		assertEquals(120,MyMath.factorial(5));
	}

	@Test
	void testIsPrime() {
		assertEquals(true,MyMath.isPrime(5));
	}

	@Test
	void testSumOfPrimes() {
		assertEquals(11,MyMath.sumOfPrimes(5));
	}

	@Test
	void testIsArmstrongNumber() {
		assertEquals(false,MyMath.isArmstrongNumber(15));
	}

	@Test
	void testReverseNumber() {
		assertEquals(511,MyMath.reverseNumber(115));
	}

	@Test
	void testDecimalToBinary() {
		assertEquals(101,MyMath.decimalToBinary(5));
	}

	@Test
	void testBinaryToDecimal() {
		assertEquals(5,MyMath.binaryToDecimal(101));
	}

	@Test
	void testGetSumOfNfibos() {
		assertEquals(7,MyMath.getSumOfNfibos(5));
	}

	@Test
	void testIsPalindromeNumber() {
		assertEquals(true,MyMath.isPalindromeNumber(151));
	}

}
