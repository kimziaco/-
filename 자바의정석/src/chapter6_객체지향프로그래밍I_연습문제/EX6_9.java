package chapter6_��ü�������α׷���I_��������;

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

//�����ڴ� ��ü�� �ʱ�ȭ �� �������� ���Ǵ� ���̴�!! ��ü�� �����ϴ� ���� new ������
// �����ڴ� �����ε� �� �� ����! �����ڵ� �����ε��� �����ؼ� �ϳ��� Ŭ������ �������� �����ڸ� �����Ҽ��ִ�.
//��� �������� �̸��� Ŭ������ �̸��� �����ؾ��Ѵ�
//Ŭ�������� �����ڰ� �ݵ�� �ϳ��̻� �־���Ѵ�
// �����ڰ� ���� Ŭ������ �����Ϸ��� �⺻ �����ڸ� �߰��Ѵ�