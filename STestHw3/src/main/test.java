package main;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=printPrimes(0);
		System.out.println(a);
		String ac=printPrimes(5);
		System.out.println(ac);
		
	}
	public static String printPrimes(int n)
	{
		int curPrime;
		int numPrime;
		boolean isPrime;
		if(n<=0)
			n=1;
		int []primes =new int [n];
		primes[0]=2;
		numPrime=1;
		curPrime=2;
		while(numPrime<n)
		{
			curPrime++;
			isPrime=true;
			for(int i=0;i<=numPrime-1;i++)
			{
				if(curPrime%primes[i]==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				primes[numPrime]=curPrime;
				numPrime++;
			}
		}
		String result="";
		for(int i=0;i<=numPrime-1;i++)
		{
			result+=primes[i];
			result+=" ";
			System.out.println("Prime:"+primes[i]);
		}
		return result;
		
	}

}
