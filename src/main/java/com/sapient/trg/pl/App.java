package com.sapient.trg.pl;

public class App {
	
	public static boolean isPalindromeNumber(int n) {
		if(reverseNumber(n)==n) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int getSumOfNfibos(int n) {
		int sum=0;
		int n1=0;
		int n2=1;
		int n3,i;
		for(i=2;i<n;++i)   
		 {    
		  n3=n1+n2;    
		  sum+=n3;   
		  n1=n2;    
		  n2=n3;    
		 } 
		return sum;
	}
	public static int binaryToDecimal(int n) {
		String binary=""+n;
        int value = 0,power = 0;
        for(int i = binary.length() - 1; i >= 0;i--) {
            if(binary.charAt(i) == '1') {
                value += Math.pow(2, power);
            }
            power++;
        }
        return value;
    }
	public static int decimalToBinary(int n) {
		String st="";
		while(n>0) {
			int x=n%2;
			st=st+x;
			n=n/2;
		}
		int y=Integer.parseInt(st);
		return reverseNumber(y);
	}
	public static int reverseNumber(int n) {
		int rev=0;
		while(n>0) {
			int x=n%10;
			rev=rev*10+x;
			n=n/10;
		}
		return rev;
	}
	public static boolean isArmstrongNumber(int n) {
		int x=n;
		int cube=0;
		while(n>0) {
			int z=n%10;
			cube+=z*z*z;
			n=n/10;
		}
		if(cube==x) {
			return true;
		}
		else {
			return false;
		}
	}
	public static long sumOfPrimes(int n) {
		long sum=0;
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				sum+=i;
			}
		}
		return sum;
	}
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static long factorial(int n) {
		long fact=1;
		for(long i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	
		public static boolean isPerfectNumber(int n) {
			int sum=0;
			if(n<1) {
				return false;
			}
			else {
				for(int i=1;i<n;i++) {
					if(n%i==0) {
						sum+=i;
					}
				}
				if(sum==n) {
					return true;
				}
				else {
					return false;
				}
			}
		}

		public int square(int n) {
			return n*n;
		}
		public static int cube(int n) {
			return n*n*n;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.out.println(cube(5));
	App app=new App();
	System.out.println(app.square(5));
	System.out.println("isprefect=" +isPerfectNumber(6));
	System.out.println(factorial(5));
	System.out.println(isPrime(5));
	System.out.println(" "+sumOfPrimes(5));
	System.out.println("Armstrong="+isArmstrongNumber(121));
	System.out.println(reverseNumber(1231));
	System.out.println(decimalToBinary(5));
	System.out.println(binaryToDecimal(1011));
	System.out.println(getSumOfNfibos(5));
	System.out.println("palindrome="+isPalindromeNumber(1221));
	
	

	}

}
