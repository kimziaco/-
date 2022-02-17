package chapter5_배열_연습문제;

public class EX5_6 {

	public static void main(String[] args) {

		int[] coinUnit = { 500, 100, 50, 10 };

		int money = 2680;
		System.out.println("money = " + money);

		for (int i = 0; i < coinUnit.length; i++) {
//			int change[] = new int[coinUnit.length];
//			change[i] = money / coinUnit[i];
//			money %= coinUnit[i];
//			System.out.println(coinUnit[i] + "원 : " + change[i]);
			
			
			System.out.println(coinUnit[i] + "원: " + money / coinUnit[i]);
			money %= coinUnit[i];

		}
	}
}
