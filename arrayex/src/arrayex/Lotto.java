package arrayex;

public class Lotto {

	public static void main(String[] args) {
		// 로또번호 생선기
		int temp, j;
		int[] lotto = new int[45];
		for(int i = 0; i<45; i++) {
			lotto[i]=i+1;
	}
	//로또번호 섞기 swap알고리즘
	for(int i = 0; i<100; i++) {
		j = (int)(Math.random()*45);
		temp= lotto[0];
		lotto[0] = lotto[j];
		lotto[j] = temp;
	}
	//로또번호 6개 출력
	for(int i = 0; i<6; i++) {
		j = (int)(Math.random()*45);
		System.out.println(lotto[j]);
	}
	
	}

  }
	

