package chapter5_�迭_��������;

import java.util.Scanner;

public class EX5_12 {

	public static void main(String[] args) {

		String[][] words = { { "chair", "����" }, { "computer", "��ǻ��" }, { "integer", "����" } };
		int count =0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i + 1, words[i][0]);

			String tmp = scanner.nextLine();
			if (tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�. %n%n");
				count++;
			} else
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�. %n%n", words[i][1]);
		}
		System.out.printf("��ü %d���� �� %d���� ���߼̽��ϴ�.",words.length,count);
		

	}

}
