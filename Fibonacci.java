package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		
		int start_no=0;
		int second_no=1;
		int sum=0;
		
		System.out.println("Fibonacci Series");
		System.out.print(start_no+ "  " +second_no +  "   ");
		for( int i=2;i<11;i++)
		{
			sum=start_no + second_no;
			System.out.print(sum +  "   ");
			start_no=second_no;
			second_no=sum;
					
		}
			
	}

}
