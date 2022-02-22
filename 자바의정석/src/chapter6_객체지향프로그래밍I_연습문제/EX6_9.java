package chapter6_객체지향프로그래밍I_연습문제;

public class EX6_9 {

	class Marine {
		int x = 0, y = 0;
		int hp = 0;
		static int weapon = 6;
		static int armor = 0;

		static void weaponUp() {
			weapon++;
		}

		static void armorUp() {
			armor++;
		}

		void move(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}

//생성자는 객체를 초기화 할 목적으로 사용되는 것이다!! 객체를 생성하는 것은 new 연산자
// 생성자는 오버로딩 할 수 없다! 생성자도 오버로딩이 가능해서 하나의 클래스에 여러개의 생성자를 정의할수있다.
//모든 생성자의 이름은 클래스의 이름과 동일해야한다
//클래스에는 생성자가 반드시 하나이상 있어야한다
// 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다