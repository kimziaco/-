package chapter6_��ü�������α׷���I;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Sqade";
		c2.number = 4;

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� " + c1.width + ", " + c1.height + "�Դϴ�.");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� " + c2.width + ", " + c2.height + "�Դϴ�.");

		c2.width = 50;
		c2.height = 80;

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� " + c1.width + ", " + c1.height + "�Դϴ�.");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� " + c2.width + ", " + c2.height + "�Դϴ�.");

	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
