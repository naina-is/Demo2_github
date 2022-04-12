package basic;

import java.util.Scanner;

public class HelloWorld2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("What is your favorite food?");
		
		String favoriteFood = stdin.next();
		
		System.out.println("Your favorite food is " + favoriteFood);
	}
	
}
