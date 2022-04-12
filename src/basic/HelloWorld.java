package basic;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner stdin = new Scanner (System.in);
		
		System.out.println("What is your age?");
		
		int age = stdin.nextInt();
		
		System.out.println("Your age is " + age);
	}
	
}
