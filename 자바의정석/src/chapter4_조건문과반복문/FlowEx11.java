package chapter4_조건문과반복문;

import java.util.Scanner;

public class FlowEx11 {

	public static void main(String[] args) {
		System.out.println("당신의 주민번호를 입력하셔유 > 010201-1102000");

		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(8);

		switch (gender) {
		case '1':
		case '3':
			switch (gender) {
			case '1':
				System.out.println("2000년 이전 출생한 남자에요");
				break;
			case '3':
				System.out.println("2000년 이후에 출생한 남자에요");
				break;
			}
			break; //switch 중첩문 안에 break 꼭 넣어줘야함
		case '2':
		case '4':
			switch (gender) {
			case '2':
				System.out.println("2000년 이전 출생한 여자에요");
				break;
			case '4':
				System.out.println("2000년 이후에 출생한 여자에요");
				break;
			}
			break; //switch 중첩문 안에 break 꼭 넣어줘야함
		default:
			System.out.println("유효하지 않은 주민등록번호입니다");
		}
	}

}
