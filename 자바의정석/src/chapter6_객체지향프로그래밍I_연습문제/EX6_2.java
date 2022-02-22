package chapter6_객체지향프로그래밍I_연습문제;

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);

	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() {
		return num + (isKwang ? "K" : "");
	}
}

public class EX6_2 {

	public static void main(String[] args) {

		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

		System.out.println(card1.info());
		System.out.println(card2.info());

	}

}
