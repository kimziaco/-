package chapter5_배열_연습문제;

public class EX5_3 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		System.out.printf("sum = %d", sum);

	}

}
