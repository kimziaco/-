package chapter4_조건문과반복문;

import java.util.Scanner;

public class FlowEx8 {

	public static void main(String[] args) {
		System.out.println("당신의 주민등록번호를 입력하세요. >011112-1122000 ");

		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(7); // regNo의 8번째 글자

		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다");

		}

	}

}
