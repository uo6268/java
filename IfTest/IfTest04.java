
public class IfTest04 {

	public static void main(String[] args) {
		// �ֻ��� ������ (1~6)
		//double dice_Number = Math.random()  0.0~0.999
		//double dice_Number = Math.random() * 6 ; // 0.0�̻� ~ 5.999�̸� ������ �Ǽ�
		int dice_Number = (int)(Math.random() * 6) + 1 ; //1~6������ ������ ����
		//System.out.println(dice_Number);
		
		if(dice_Number == 1) {
			System.out.println("1���� ���Խ��ϴ�");
		} else if(dice_Number == 2) {
			System.out.println("2���� ���Խ��ϴ�");
		}else if(dice_Number == 3) {
			System.out.println("3���� ���Խ��ϴ�");
		}else if(dice_Number == 4) {
			System.out.println("4���� ���Խ��ϴ�");
		}else if(dice_Number == 5) {
			System.out.println("5���� ���Խ��ϴ�");
		} else {
			System.out.println("6���� ���Խ��ϴ�");
		}

	}

}
