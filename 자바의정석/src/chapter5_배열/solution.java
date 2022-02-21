package chapter5_¹è¿­;

public class solution {

	public static void main(String[] args) {
		int[] arr = { 1, 52, 125, 10, 25, 201, 244, 192, 128, 23, 203, 98, 154, 255 };
		int[] arr2 = new int[256];
		int[] Threshold = new int[256];

		for (int i = 0; i < arr2.length; i++)
			arr2[i] = i;

		for (int i = 0; i < arr2.length; i++) {
			int big = 0, small = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] >= arr2[i])
					big++;
				else if (arr[j] < arr2[i])
					small++;
				Threshold[i] = (Math.abs(big - small));
			}
		}
		
		int min = Threshold[0];
		int minIndex = 0;

		for (int i = 0; i < Threshold.length; i++) {
			if (Threshold[i] < min) {
				min = Threshold[i];
				minIndex = i;
			}
		}
		System.out.println(minIndex);
	}

}
