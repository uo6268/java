
public class ForExample01 {

	public static void main(String[] args) {
		// for 반복문-1부터 100까지 합을 구하는 반복문
		int sum = 0;
		int i=1;
		
		for(i = 1; i<=100 ; i++) {
			sum += i;
			
		}
		System.out.println("1부터 100까지의 합 : " +sum);

	}

}
