package qufk1;

import java.util.Scanner;

public class ForT2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		int i;
		for(i=1; i<=T; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.println("Case #" + i +": "+(a+b));
		}
		
	}

}
