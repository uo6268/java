
public class SwitchTest {

	public static void main(String[] args) {
		// ���ǹ� - switch
		int dice_Number = (int)(Math.random() * 6) + 1;
		//System.out.println(dice_Number);
		switch(dice_Number) {
			case 1:
				System.out.println("�ֻ��� ���� 1�Դϴ�");
				break;
			case 2:
				System.out.println("�ֻ��� ���� 2�Դϴ�");
				break;
			case 3:
				System.out.println("�ֻ��� ���� 3�Դϴ�");
				break;
			case 4:
				System.out.println("�ֻ��� ���� 4�Դϴ�");
				break;
			case 5:
				System.out.println("�ֻ��� ���� 5�Դϴ�");
				break;
			case 6:
				System.out.println("�ֻ��� ���� 6�Դϴ�");
		}
	}
}
