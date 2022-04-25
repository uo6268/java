
public class IfTest3 {

	public static void main(String[] args) {
		// 조건문 - if  { }
		int score =65;
		
		//printf    %d  %s   %f
		
		if(score >=90) {
			System.out.printf("점수는 %d점 입니다\n", score);
			System.out.println("등급이 A입니다");
		} else if(score >=80){
			System.out.printf("점수는 %d점 입니다\n", score);
			System.out.println("등급이 B입니다");
		} else if(score >=70){
			System.out.printf("점수는 %d점 입니다\n", score);
			System.out.println("등급이 C입니다");
		} else if(score >=60){
			System.out.printf("점수는 %d점 입니다\n", score);
			System.out.println("등급이 D입니다");
		} else {
			System.out.printf("점수는 %d점 입니다\n", score);
			System.out.println("등급이 F입니다");
		} 
	}

}
