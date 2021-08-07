package qufk1;

import java.util.Scanner;

public class Nto1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int sum = 0;
		
		for (int i=0; i<=a; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
