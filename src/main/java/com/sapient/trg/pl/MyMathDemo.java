package com.sapient.trg.pl;

import com.sapient.trg.util.MyMath;

public class MyMathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("6 is Perfect Number : " + MyMath.isperfect(6));
		System.out.println("10 is Perfect Number : " + MyMath.isperfect(10));
		System.out.println("20 is Perfect Number : " + MyMath.isperfect(20));
		System.out.println();
		
		System.out.println("factorial of 5 is : " + MyMath.factorial(5));
		System.out.println("factorial of 8 is : " + MyMath.factorial(8));
		System.out.println("factorial of 10 is : " + MyMath.factorial(10));
		System.out.println();
		
		System.out.println("13 is Prime Number : " + MyMath.isPrime(13));
		System.out.println("15 is Prime Number : " + MyMath.isPrime(15));
		System.out.println("19 is Prime Number : " + MyMath.isPrime(19));
		System.out.println();
		
		System.out.println("Sum of Prime Numbers Upto 10 : " + MyMath.sumofPrimes(10));
		System.out.println("Sum of Prime Numbers Upto 2 : " + MyMath.sumofPrimes(2));
		System.out.println("Sum of Prime Numbers Upto 20 : " + MyMath.sumofPrimes(20));
		System.out.println();
		
		System.out.println("153 is Armstrong Number : " + MyMath.isArmstrongNumber(153));
		System.out.println("130 is Armstrong Number : " + MyMath.isArmstrongNumber(130));
		System.out.println("1634 is Armstrong Number : " + MyMath.isArmstrongNumber(1634));
		System.out.println();
		
		System.out.println("Reverse of 366 is : " + MyMath.reverseNumber(366));
		System.out.println("Reverse of 90 is : " + MyMath.reverseNumber(90));
		System.out.println("Reverse of 405 is : " + MyMath.reverseNumber(405));
		System.out.println();
		
		System.out.print("Binary form of 11 : ");
		MyMath.decimaltoBibary(11);
		System.out.println();
		
		System.out.print("Binary form of 10 : ");
		MyMath.decimaltoBibary(10);
		System.out.println();
		
		System.out.print("Binary form of 17 : ");
		MyMath.decimaltoBibary(17);
		System.out.println();
		System.out.println();
		
		System.out.println("Decimal Form of 1010 : " + MyMath.binaryToDecimal(1010));
		System.out.println("Decimal Form of 101 : " + MyMath.binaryToDecimal(101));
		System.out.println("Decimal Form of 111 : " + MyMath.binaryToDecimal(111));
		System.out.println();
		
		System.out.println("Sum of Fibonacci series upto 5 terms : " + MyMath.getSumOfNFibos(5));
		System.out.println("Sum of Fibonacci series upto 10 terms : " + MyMath.getSumOfNFibos(10));
		System.out.println("Sum of Fibonacci series upto 15 terms : " + MyMath.getSumOfNFibos(15));
		System.out.println();
		
		System.out.println("363 is Palindrome Number : " + MyMath.isPalindrome(363));
		System.out.println("369 is Palindrome Number : " + MyMath.isPalindrome(369));
		System.out.println("630 is Palindrome Number : " + MyMath.isPalindrome(630));
	}

}
