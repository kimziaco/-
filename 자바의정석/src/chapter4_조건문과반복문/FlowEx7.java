package chapter4_���ǹ����ݺ���;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		System.out.println("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���. >");

		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int) (Math.random() * 3) + 1;

		System.out.println("�����" + user + "�Դϴ�.");
		System.out.println("��ǻ�ʹ� " + com + "�Դϴ�.");

		switch (user - com) {
		case 1:
		case -2:
			System.out.println("����� �̰���ϴ�");
			break;
		case 2:
		case -1:
			System.out.println("����� �����ϴ�");
			break;
		default :
			System.out.println("�����ϴ�");
			break;
		}

	}

}
