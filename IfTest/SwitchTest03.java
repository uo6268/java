
public class SwitchTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position = "부장";
		
		switch(position) {
		case "사장":
			System.out.println("월급은 천만원");
			break;
		case "부장":
			System.out.println("월급은 700만원");
			break;
		case "과장":
			System.out.println("월급은 500만원");
			break;
		case "대리":
			System.out.println("월급은 400만원");
			break;
		}

	}

}
