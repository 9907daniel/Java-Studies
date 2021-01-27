
public class c_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 기본 타입 : 산수 및 수학에서 사용하는 데이터값이자 값 그 자체\
		 * 종류
		 * boolean 	: true / false
		 * int		: 정수
		 * double	: 실수 (소수값 포함)
		 * char		: 문자 (한 글자)
		 * string	: 문자열 (여러 문자)
		 * 
		 * *나머지는 다 참조 타입이다.
		*/
		
		/*
		 * <1.Data type>
		 * 
		 * : smallest size in a computer is bit. : 이진법의 0 & 1이 바로 bit이다
		 * 
		 * 8 bit = 1 byte 
		 * 1024 byte 		= 1 kilobyte
		 * 1024 kilobyte 	= 1 megabyte
		 * 1024 megabyte	= 1 gigabyte
		 * 
		 * ......
		 *
		 */
		
		
		/*
		 * 1) Data type 정수형
		 * 
		 * TYPE		SIZE	RANGE
		 * 
		 * byte		1byte	-128~127
		 * short	2byte	-32,878~ 32,767
		 * int		4byte	-+ 2,000,000,000 정도
		 * long		8byte	-+ 9,000,000,000,000,000,000 정도
		 * 
		 * 
		 * *정수형은 주로 int를 사용한다
		 * ㄴ long를 사용하지 않는 이유는 데이터 사이즈가 더 크기때문에
		 *   데이터 탑입을 출력하는데 int보다 약 2배의 시간이 걸린다
		 * ㄴㄴ used more for precision
		 * 
		 */
		
		long a = 1L;
		System.out.println(a);
		// long을 출력할때는  값뒤에 l 아니면 L 을 적어야한다
		
				
		/* 2) Data Type 실수형
		 * 
		 * 
		 * float 	4byte
		 * double 	8byte
		 * 
		 * *주로 double을 사용하자
		 * * float는 long와 같이 값 뒤에 f 아니면 F를 붙여줘야한다.
		 * 
		 */
		float b = 2.23323f;
			
		
//---------------------------------------------------------------------------
		
		
		// <형의 변환>
		
		double c = 3.0F;
		// 작은 타입 -> 큰 타입 : 자동 형 변환이 된다. (더 큰거는 작은것보다 더 많은 수를 표현할 수 있기 때문에)
		// 즉 작은 타입의 범위는 큰 타입의 범위 안이기 때문에
	
		//반대로 큰 타입 -> 작은 타입은 오류가 발생해 직접 바꿔주어야한다.
		//크기 byte < short = char < int < long < float < double
		
		// <큰 타입 -> 작은 타입 직접 바꿔주기 : explicit conversion(명시적 형변환)>
		/*
		 * float a = 100.0;
		 * int b = 100.0F;
		 * 을 명시적 변화 활용해서 바꾸어보자
		 * 
		 */
		
		float g = (float)100.0;
		int h = (int)100.0F;
		
		// 공식 : 바꾸고싶은타입 = (바꾸고싶은타입)데이터값;
		
		System.out.println(h);
		// 100.0 -> 100 (실수 -> 정수)

	}

}
