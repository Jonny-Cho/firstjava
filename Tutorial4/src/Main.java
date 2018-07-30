
public class Main {
	
	final static int SECOND = 1000;
	
	public static void main(String[] args) {
		// 초를 입력받아 몇분몇초 형태로 나타내기
		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute + "분" + second + "초");
		
		//++ -- 이해하기
		int a = 10;
		System.out.println("현재의 a는" + a + "입니다.");
		a++;
		System.out.println("현재의 a는" + a + "입니다.");
		//++a 는 a에 1을 더한 뒤 출력한다
		System.out.println("현재의 a는" + ++a + "입니다.");
		//a++은 출력이 끝난 후 a에 1을 더한다
		System.out.println("현재의 a는" + a++ + "입니다.");
		System.out.println("현재의 a는" + a + "입니다.");
		
		//논리 연산자 == < > && || ! 이해하기
		int m = 50;
		int n = 50;
		System.out.println("m이 n가 같은가요? " + (m == n));
		System.out.println("m이 n보다 큰가요? " + (m > n));
		System.out.println("m이 n보다 작가요? " + (m < n));
		System.out.println("m이 n과 같으면서 m이 30보다 큰가요? " + ((m == n) && (m > 30)));
		System.out.println("m이 50이 아닌가요? " + !(m == 50));
		
		//조건 ? 참 : 거짓 연산 형태 숙지하기
		int x = 50;
		int y = 60;
		
		System.out.println("최댓값은 " + max(x, y)+ "입니다.");
		
		// pow()함수 이용한 거듭제곱
		double q = Math.pow(3.0,  20.0);
		System.out.println("3의 20제곱은" + (int) q + "입니다.");
		
	}
	
	//조건 ? 참 : 거짓 연산 형태 숙지하기
	//반환형, 함수 이름, 매개 변수
	static int max(int o, int p) {
		int result = (o > p) ? o : p;
		return result;
	}
	
	
}
