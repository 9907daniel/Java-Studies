
public class e_boolean {

	public static void main(String[] args) {

		//Boolean : true/false (기본 타입에 포함된다)

		System.out.println(1==2);
		// False
		System.out.println("one" != "two");
		// True
		
		// *** .equals : "문자열" 비교할때 사용되는 메소드
		
		String c = "what up";
		String d = new String("what up");
		
		System.out.println( c ==d );
		//false
		System.out.println(c.equals(d));
		//true
		
		// 결론 : 문자와 문자의 비교는 == 말고 .equals를 사용하자! 
	}

}
