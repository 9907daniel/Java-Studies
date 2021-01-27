
public class a_numbers_letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ****<1. 숫자>****
		
		System.out.println(1+2);		 // 정수
		System.out.println(1.2+2.3);	 // 실수
		// 출력시 따음표가 없는것들은 다 숫자로 인식한다
		
		System.out.println(2*5); //곱하기
		System.out.println(6/2); //나누기		
		
		// ****<2.문자&문자열>****
		
		System.out.println('신'); // 문자 {char} : 한 글자를 의미 : 작은따음표로 감싸야 함
		System.out.println("신정후"); // 문자열 {string} : 여러 개의 문자가 결합 : "큰따음표로 감싸야 함
		// **문자열은 기본 타입이 아니라 참조 타입이지만
		// 'new'를 사용하지 않고 기본 타입처럼 사용한다
		
		//tip : 문자열(String) 안에 큰따음표를 넣고 싶으면     \"     를 활용하자
		System.out.println(" \"Quotes inside Quotes\" ");
		
		
		
		//**출력을 할때 줄을 넘기고 싶다면     \n     을 사용한다 
		System.out.println(" go to\n next line");
	}

}
