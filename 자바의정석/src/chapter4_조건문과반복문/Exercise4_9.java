package chapter4_���ǹ����ݺ���;

public class Exercise4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i) - '0';
			//���ڸ� ���ڷ� �ٲٴ� ���������� '0' ���� ������Ա�
 		}
System.out.println(sum);
		
		
		/*
		int num = Integer.parseInt(str);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
*/
	}
}
