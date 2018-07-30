
public class Main {
	
	//상수 정의
	final static double PI = 3.141592;
	
	//오버플로우
	final static int INT_MAX = 2147483647;

	public static void main(String[] args) {
		// 변수 활용
		int intType = 100;
		double doubleType = 150.5;
		String stringType = "조준희";
		
		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);
		
		// 상수활용
		int r = 30;
		System.out.println(r * r * PI);
		
		int max = INT_MAX;
		System.out.println(max);
		//int가 가지는 최대값을 넘으면 오류 (최소값이 출력)
		System.out.println(max + 1);
		
		// 사칙연산
		int a = 1;
		int b = 2;
		
		System.out.println("a + b =" + (a + b));
		System.out.println("a - b =" + (a - b));
		System.out.println("a * b =" + (a * b));
		System.out.println("a / b =" + (a / b));
		
		
		// 실수 값을 반올림 하기
		// 변수에 0.5를 더한 뒤에 정수형으로 형변환
		double m = 0.5; 
		int n = (int) (m + 0.5);
		System.out.println(n);
	}

}
