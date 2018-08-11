 
public class Main {

	// 4. for를 위한 상수
	final static int N = 5;
	final static int P = 15;
	
	public static void main(String[] args) {
		// 1. 점수에따라 학점 출력하기
		
		int score = 78;
		
		if(score >=90)
		{
			System.out.println("A+입니다.");
		}
		else if(score >= 80)
		{
			System.out.println("B+입니다.");
		}
		else if(score >= 70)
		{
			System.out.println("C+입니다.");
		}
		else
		{
			System.out.println("F입니다.");
		}
		
		// 2. 문자열과 정수형을 조건문을 이용해 활용
		
		String a = "Man";
		int b = 0;
		
		// String 비교 equal()
		// String은 다른 자료형과 다른 문자열 자료형이기 때문
		
		if(a.equals("Man"))
		{
			System.out.println("남자입니다.");
		}
		else
		{
			System.out.println("남자가 아닙니다.");
		}
		
		if(b == 3)
		{
			System.out.println("b는 3입니다.");
		}
		else
		{
			System.out.println("b는 3이 아닙니다.");
		}
		
		if(a.equalsIgnoreCase("man") && b == 0)
		{
			System.out.println("참입니다.");
		}
		
		// 3. While문을 사용하여 1부터 1000까지 합 구하기
		
		int i = 1, sum = 0;
		while(i <= 1000)
		{
			sum += i++;
		}
		System.out.println("1부터 1000까지의 합은 " + sum + "입니다.");
		
		
		// 4. for문을 사용하여 삼각형 출력하기
		// 상수 N = 30 설정되어 있다.
		
		// for문: 초기화 부분, 조건 부분, 연산 부분
		for(int j = N; j > 0; j--)
		{
			for(int k = j; k > 0; k--)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		
		// 5. for문을 사용하여 원 출력하기
		// 상수 P = 15 가 설정되어 있다.
		// x^2 + y^2 = r^2
		
		for(int m = -P; m <= P; m++)
		{
			for(int n = -P; n <= P; n++)
			{
				if(m * m + n * n <= P * P)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
