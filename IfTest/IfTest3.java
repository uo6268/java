
public class IfTest3 {

	public static void main(String[] args) {
		// ���ǹ� - if  { }
		int score =65;
		
		//printf    %d  %s   %f
		
		if(score >=90) {
			System.out.printf("������ %d�� �Դϴ�\n", score);
			System.out.println("����� A�Դϴ�");
		} else if(score >=80){
			System.out.printf("������ %d�� �Դϴ�\n", score);
			System.out.println("����� B�Դϴ�");
		} else if(score >=70){
			System.out.printf("������ %d�� �Դϴ�\n", score);
			System.out.println("����� C�Դϴ�");
		} else if(score >=60){
			System.out.printf("������ %d�� �Դϴ�\n", score);
			System.out.println("����� D�Դϴ�");
		} else {
			System.out.printf("������ %d�� �Դϴ�\n", score);
			System.out.println("����� F�Դϴ�");
		} 
	}

}
