package arrayex;

public class Lotto {

	public static void main(String[] args) {
		// �ζǹ�ȣ ������
		int temp, j;
		int[] lotto = new int[45];
		for(int i = 0; i<45; i++) {
			lotto[i]=i+1;
	}
	//�ζǹ�ȣ ���� swap�˰���
	for(int i = 0; i<100; i++) {
		j = (int)(Math.random()*45);
		temp= lotto[0];
		lotto[0] = lotto[j];
		lotto[j] = temp;
	}
	//�ζǹ�ȣ 6�� ���
	for(int i = 0; i<6; i++) {
		j = (int)(Math.random()*45);
		System.out.println(lotto[j]);
	}
	
	}

  }
	

