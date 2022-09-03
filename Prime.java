package week1.day1;

public class Prime {

	public static void main(String[] args) {
		System.out.println("Finbonacci series");
		int num=19;
		// To find the number of factors, initialize the count as 1
		int count=0; 
		for(int i=1;i<=num;i++)
		{
			if(num%i == 0)
			{
				count++;
			}						
		}
		if(count==2)
		{
		//If number of factors are just 2, it is a prime number	
		System.out.println("Number  " + num +  " is a Prime");
		}
		else
		{
		//If number of factors are more or less, it is not a prime
		System.out.println("Number  " + num + "  is NOT a prime");
		}

	}

}
