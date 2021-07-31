package qufk1;

import java.util.Scanner;

public class if_1 {public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	
	if(a>b) System.out.printf(">");
	
	else if(a<b) System.out.printf("<");
	
	else System.out.printf("==");
	
	}
}
