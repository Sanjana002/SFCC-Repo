package com.sapient.trg.util;

public class MyMath {

	public static boolean isperfect(int n) {
		int sum = 1;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i == 0)
			{
				sum+= i;
			}
		}
		if(sum == n)
			return true;
		else
			return false;
	}
	public static long factorial(int n) {
		if(n==0) {
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
	public static boolean isPrime(int n) {
		if (n <= 1)
            return false;
        if (n <= 3)
            return true;
  
        if (n % 2 == 0 || n % 3 == 0)
            return false;
  
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
  
        return true;
	}
	public static long sumofPrimes(int n) {
		long sum = 0;
		for(int i=2; i<=n; i++)
		{
			if(MyMath.isPrime(i)) {
				sum+= i;
			}
		}
		return sum;
	}
	public static int power(int x, long y)
    {
        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        return x * power(x, y / 2) * power(x, y / 2);
    }
  
    /* Function to calculate order of the number */
	public static int order(int x)
    {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }
  
    // Function to check whether the given number is
    // Armstrong number or not
    public static boolean isArmstrongNumber(int x)
    {
        // Calling order function
        int n = order(x);
        int temp = x, sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, n);
            temp = temp / 10;
        }
  
        // If satisfies Armstrong condition
        return (sum == x);
    }
//	public static boolean isArmstrongNumber(int n) {
//		int m = n;
//		int sum = 0, r;
//		while(n>0)
//		{
//			r = n%10;
//			sum+= (r*r*r);
//			n = n/10;
//		}
//		if(sum == m)
//			return true;
//		else
//			return false;
//	}
	public static int reverseNumber(int n) {
		int rev = 0, b;
		while(n>0)
		{
			b = n%10;
			rev = rev*10 + b;
			n = n/10;
		}
		return rev;
	}
	public static void decimaltoBibary(int n) {
		int[] binary = new int[100];
		int i=0;
		while(n>0)
		{
			binary[i] = n%2;
			n = n/2;
			i++;
		}
		for(int j=i-1; j>=0; j--)
		{
			System.out.print(binary[j]);
		}
	}
	public static int binaryToDecimal(int n) {
		int dec=0, r, mul = 1;
		while(n>0)
		{
			r = n%10;
			dec+= r*mul;
			n = n/10;
			mul*= 2;
		}
		return dec;
	}
	public static int getSumOfNFibos(int n) {
		int sum = 1, a=0, b=1, c;
		for(int i=3; i<=n; i++)
		{
			c = a+b;
			sum += c;
			a = b;
			b = c;
		}
		return sum;
	}
	public static boolean isPalindrome(int n) {
		int m = MyMath.reverseNumber(n);
		if(m == n)
			return true;
		else
			return false;
	}
	

}
