package Number_Series;

public class Palindrome {

	public static void main(String[] args) {
		int num=1234559321;
		int revNumber = checkPalindrome(num);
		if(revNumber == num) {
			System.out.println("Yes, Palindrome");
		}
		else {
			System.out.println("Nope, Not a Palindrome");
		}
		

	}
	public static int checkPalindrome(int num1) {
		int revNum=0;
		for(int i=0; num1!=0; i++) {
			revNum = revNum*10 + num1 %10;
			num1=num1/10;
		}
		
		return revNum;
	}

}
