package Number_Series;

public class Fibonacchi {

	public static void main(String[] args) {
//		int num1=0, num2=1;
//		System.out.print(""+num2+",");
//		for(int i=0;i<=9;i++)
//		{
//			int num3 = num1+num2;
//			System.out.print(num3+",");
//			num1=num2;
//			num2=num3;
//		} 
// 
		int n=9;
		 System.out.println(
		            n + "th Fibonacci Number: " + fib(n));
	}
	
	 static int fib(int n)
	    {
	        if (n <= 1)
	            return n;
	        return fib(n - 1) + fib(n - 2);
	    }

}
