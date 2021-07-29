package qufk1;

import java.util.Scanner;

public class a_0729 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		int a = scanner.nextInt();
		System.out.println(" ");
		int b = scanner.nextInt();	
		
		int sum = a + b;
		int sum_1 = a - b;
		int abs = a * b;
		int abs_1 = a / b;
		int abs_2 = a % b;
		
		System.out.println(sum);
		System.out.println(sum_1);
		System.out.println(abs);
		System.out.println(abs_1);
		System.out.println(abs_2);
		}

}
