
public class ForExample04 {

	public static void main(String[] args) {
		// 반복문 구구단 2단만 출력
		for(int m = 2 ; m<=9 ; m++) {
			System.out.printf("\n### %d단 ###\n",m);
			for(int n = 1 ; n<=9 ; n++) {
			System.out.printf("%d * %d = %d\n",m,n,m*n);
			}
	
		}

	}

}
