package qufk1;


import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게입입니다. 가위, 바위 보 중에서 입력하세요 ");
		System.out.println("철수 >> ");
		String rsp = scanner.next();
		System.out.print("영희 >> ");
		String rsp2 = scanner.next();
		
		if(rsp.equals("가위")) {
			if(rsp2.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}
			if(rsp2.equals("가위")) {
				System.out.println("비겼습니다.");
			}
			if(rsp2.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}
		}
		
		if(rsp.equals("보")) {
			if(rsp2.equals("보")) {
				System.out.println("비겼습니다.");
			}
			if(rsp2.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}
			if(rsp2.equals("바위")) {
				System.out.println("철수가 이겼습니다.	");
			}
		}
		
		if(rsp.equals("바위")) {
			if(rsp2.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}
			if(rsp2.equals("가위")) {
				System.out.println("철수가 이겼습니다.	");
			}
			if(rsp2.equals("바위")) {
				System.out.println("비겼습니다.");
			}
		}
		
		scanner.close();
	}

}
