package chapter4_���ǹ����ݺ���;

import java.util.Scanner;

public class FlowEx11 {

	public static void main(String[] args) {
		System.out.println("����� �ֹι�ȣ�� �Է��ϼ��� > 010201-1102000");

		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(8);

		switch (gender) {
		case '1':
		case '3':
			switch (gender) {
			case '1':
				System.out.println("2000�� ���� ����� ���ڿ���");
				break;
			case '3':
				System.out.println("2000�� ���Ŀ� ����� ���ڿ���");
				break;
			}
			break; //switch ��ø�� �ȿ� break �� �־������
		case '2':
		case '4':
			switch (gender) {
			case '2':
				System.out.println("2000�� ���� ����� ���ڿ���");
				break;
			case '4':
				System.out.println("2000�� ���Ŀ� ����� ���ڿ���");
				break;
			}
			break; //switch ��ø�� �ȿ� break �� �־������
		default:
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�");
		}
	}

}
