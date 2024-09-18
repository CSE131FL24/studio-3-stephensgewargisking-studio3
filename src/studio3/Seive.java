package studio3;

import java.util.Scanner;

public class Seive {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
		System.out.print("What is the last number?");
		int n = in.nextInt();
		
		int[] numbers = new int[n+1];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 2+i;
		}
		
		for (int i = 2; i < numbers.length; i++) {
			for (int j = 2; i < numbers.length; j+=i) {
				numbers[j-i] = 0;
			}
		}
		for (int i : numbers) {
			System.out.println(i + " ");
		}
	}

}
