
public class SwitchTest02 {

	public static void main(String[] args) {
		int time = (int)(Math.random() * 5) + 8;  //8~12������ ������ ����
		//system.out.println(time);
		switch(time) {
		case 8:
			System.out.println("����� �մϴ�");
		case 9: 
			System.out.println("ȸ�Ǹ� �մϴ�");
		case 10: 
			System.out.println("������ ���ϴ�");
		case 11: 
			System.out.println("�ܱ��� �����ϴ�");
		case 12:
			System.out.println("������ �Խ��ϴ�");
		}

	}

}
