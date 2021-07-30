package qufk1;

import java.util.Scanner;

public class a_0730 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		int a = scanner.nextInt();
		System.out.println(" ");
		int b = scanner.nextInt();
		System.out.println(" ");
		int c = scanner.nextInt();
		
		int A = (a+b)%c;
		int B = ((a%c)+(b%c))%c;
		int C = (a*b)%c;
		int D = ((a%c)*(b%c))%c;
		
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		}
	
}
