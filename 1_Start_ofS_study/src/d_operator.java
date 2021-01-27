
public class d_operator {

	public static void main(String[] args) {
		/*
		 * operator(연산자) : 특정 작업을 하기 위해 사용하는 기호
		 * ex) 산술 연산자, 대입 연산자, 비교 연산자, 논리 연산자...
		 * 
		 */
		
		// 1.산술 연산자 : 수학적인 계산에 사용되는 연산자
		
		/*
		 * +
		 * -
		 * *
		 * / 
		 * % (나머지)
		 * 
		 */
		
		// + 연산자는 문자열을 합하는데도 사용
		
		String Stringa = "hi";
		String Stringb = " bye";
		String Stringc = Stringa + Stringb;
		System.out.println(Stringc);
		
		
		//실수와 정수간의 연산
		int a = 33;
		double b = 3.1;
		System.out.println(a/b);
		//형의 자동 변환이 일어나 실수가 된다.
		
		/*
		 *  <단항 연산자>
		 *  
		 *  increment : ++ (하나 증가)
		 *  decrement : -- (하나 감소)
		 */
		
		double d = 3.003;
		System.out.println(d++ + d);
		// 앞/뒤의 차이는 출력후 더하냐 더하고난 후 출력되냐.
		
		

	}

}
