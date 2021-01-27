
public class j_loop {

	public static void main(String[] args) {
		/*
		 * 반복문 : 조건문과 반복문은 프로그래밍에서 제일 중요한 주 요소라고 볼 수 있다!!
		 * 		: * 반복문들은 서로 대체가 가능하다.
		 * 
		 * 1.while문 : 
		 * 
		 * 1)형태
		 * 
		 * while(조건){
		 * 		반복 실행 영역.
		 * }
		 * 
		 * **조건 : 언제까지 반복문을 실행할꺼냐를 의미한다.
		 * 
		 */
		
		//예제
		int i = 1;
		while(i<10) {
			System.out.println("this is the " + i + "th loop");
			i++;
		}
		
		
		
		/* 2.for문 : while문을 무한반복실행 안하기 위해 외부의 변수를 지정하고 실행시킨다.
		 * 			^예제처럼 i=1지정하고 while안에 i++을 지정시켰다.
		 * 			
		 * 			->이러면 코드가 복잡해지기 떄문에 이를 문법적으로 바꾼게 "for문"이다
		 * 
		 * 	**for과 while은 서로 대체가 가능하며 편한것을 사용하면 된다. 이 관계를 조건문으로
		 *    비교해보자면  while <-> for 은 if <-> else/if-else 와 비슷한관계다.
 		 * 
 		 * 
 		 * 	int i = 1;			// 초기
			while(i<10) {		// 조건
			i++;				// 실행
			}
			
			->이렇게 초기,조건,스텝이 있다면 while을 사용하는것보다 for을 사용하는게 더 바름직하다.
			
		 * 1) 형태
		 * for(초기화;조건;반복실행){
		 * 
		 * 		반복적으로 실행될 구문
		 * 		ㄴ조건이 False될때까지 실횅된다.
		 * }
		 * 
		 */
		
		//예제
		for(int f =0; f<10; f++)   //f++은 반복조건이 1회 실행된 뒤에 실행됨.
		{
			System.out.println("this is the " + f + "loop");
		}
		
		/*
		 * 3. break : 반복작업을 "중간"에 중단시키고 싶을때 사용하면 된다.
		 * 
		 */
		
		for( int b =0; b < 10; b++ ) {
			System.out.println("not broken yet #" + b);
			
			if(b >= 5) 
				break;			//5번까지만 출력됨
								//참고로 if안의 코드가 1줄이면 -> 중괄호 {} 생략해도 된다.
								// ㄴ 현재 break; 은 if문 안에 있음.
		}
		
		/*
		 * 4. continue : 실행을 즉시 중단하면서 지속하세 해준다
		 *				: ㄴ건너뛰울떄 사용한다(?)
		 * 	
		 * 	//이해하기 어려우니까 예제를 자세히 보자.
		 * 
		 */
		
		for( int b =0; b < 10; b++ ) {
			
			if(b == 5) {
			continue;
			}
			System.out.println("not broken yet #" + b);
		}		
		
		// b가 1,2,3,4 일때 진행되다가 b==5일떄 break한뒤에 바로 똑 진행(continue)된다.
		// 결과 : #1~#4 그리고 #6~#9 까짖는 실행이 되었지만 #5는 skip하고 바로 continue 됬음.
		
		
		
		// 반복문의 중첩
		int g = 0;
		int h = 0;
		
		for( g=0; g < 10; g++) {
			for( h=0; h < 10; h++) {
				
				System.out.println(g + "" + h);	
			}
		}
		//0~ 99가 출력된다.
		
			

	}

}
