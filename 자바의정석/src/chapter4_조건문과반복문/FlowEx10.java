package chapter4_조건문과반복문;

import java.util.Scanner;

public class FlowEx10 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';

		System.out.println("당신의 점수를 입력하세요. (1~100) > ");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		score = Integer.parseInt(tmp);

		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';
		}
		System.out.print("당식의 학점은" + grade + "입니다\n");
		System.out.printf("당신의 학점은 %c입니다. \n", grade);
		System.out.println("당신의 학점은" + grade + "입니다.");
		

	}

}
