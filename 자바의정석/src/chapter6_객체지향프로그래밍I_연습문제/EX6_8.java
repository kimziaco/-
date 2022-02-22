package chapter6_객체지향프로그래밍I_연습문제;

public class EX6_8 {

	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1, 1);
	}

}

class PlayingCard {
	int kind;
	int num;

	static int width;
	static int height;

	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}
}
