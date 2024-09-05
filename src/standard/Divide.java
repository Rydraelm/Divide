package standard;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a, b;
		System.out.println("Enter the number to divide: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		float divide = a/b;
		
		System.out.printf("The result is: " + divide);
		
		sc.close();
	}
}
