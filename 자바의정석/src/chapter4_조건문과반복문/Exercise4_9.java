package chapter4_조건문과반복문;

public class Exercise4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i) - '0';
			//문자를 숫자로 바꾸는 과정에서는 '0' 값을 빼줘야함그
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
