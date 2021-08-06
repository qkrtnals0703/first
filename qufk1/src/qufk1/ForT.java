package qufk1;

import java.util.Scanner;

public class ForT {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int arr[] = new int[T];
		
		int i;
		for(i=0; i<T; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			arr[i] = a+b;
		}
		
		for(int k : arr) {
			System.out.println(k);
		}
	}

}
