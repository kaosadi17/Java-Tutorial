import java.util.Scanner;

public class UserInput {
	
	public static void main(String args[]){
		System.out.println("Enter Your Name");
		Scanner scan =  new Scanner(System.in);
		System.out.println(scan.nextLine());
		
		int num1,num2,num3;
		System.out.println("Enter the first number");
		num1 = scan.nextInt();
		System.out.println("Enter the second number");
		num2 = scan.nextInt();
		num3 = num1 + num2;
		System.out.println(num3);
		
	}

	
}
