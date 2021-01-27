
public class f_if {

	public static void main(String[] args) {
		
		/*
		 * 조건문 : if, switch , 삼항현산자 (?:)
		 * 
		 * 
		 * ***<1 : 조건문 if>*** 
		 * 조건문 : 주어진 조건에 따라 어플이 다르게 동작하도록..
		 * 
		 * if(if절){
		 * 		then절
		 * }
		 * 
		 * ------>if절이 true면 then절이 실행.
		 * 
		 */
		
		
		int a = 1;
		int b = 2;
		
		if(a==b) {
			System.out.println("True1");
		}
		//출력 X
		
		a = ++a;
		if(a==b) {
			System.out.println("True2");
		}
		//출력 O
		
		String KK = "my name is danny";
		String DD = "my name is danny";
		if(KK.equals(DD)) {
			System.out.println("his name is danny");
		}
		
		//**** 문자열은 == 사용을하지말고 .equals() 을사용하자.
		
		
		
		
		/*
		 * ***<2 : 조건문 else>*** 
		 * 
		 * if절 을 사용해 복잡한 상황을 처리하는데 제한이 있다. -> if-else절 사용
		 * 
		 * if(true/false){
		 * 
		 * }else{
		 * 
		 * }
		 * 
		 */
		
		int c = 1;
		int d = 2;
		if (c==d) {
			System.out.println("statment is true");
		}else {
			System.out.println("statment is false");
		}
		//조건이 거짓이기 떄문에 if문실행 안되고 대신 else문이 실행된다
		
		
		/*
		 * ***<3 : 조건문 else-if>***
		 * else if를 활용하여 조건문을 더 자유롭게 제어할 수있다. : else가 여러게 주어진다고 생각하면됨.
		 * 
		 * if( ) {
		 * 
		 * }else if() {
		 * 
		 * }else if() {
		 * 
		 * }else{
		 * 
		 * }
		 * 
		 * **else는 생략이 가능하다.
		 */
		
		
		
		
		
		
		
		//if else 조건문 삼항연산으로 표현하기 
		int samhang = 100;
		samhang = (samhang % 2 ==1) ? samhang +1:samhang -1;
		System.out.println(samhang);
		// 100 % 2 는 0 이기떄문에 거짓 -> 뒤에있는 조건으로 적용.
		
		
		
		
		

	}

}
