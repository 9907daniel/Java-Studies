
public class i_conditional_operator {

	public static void main(String[] args) {
		
		/* condtional operator(논리 연산자)
		 * : 크게 나눠서  and, or
		 * 
		 * 1. and (&&) : a and b -> 둘다 참이여야 참. 
		 * 
		 * 2. or (||) : a and b -> 하나라도 참이면 참
		 * 
		 * 3. not (!) : Boolean의 값을 역전시키는 역할. 
		 * ex ) !true = false (not true)
		 * 
		 * 
		 */
		
		// 1 : and (&&)
		
		if(true && true) {
			System.out.println("This");
		}if(true && false) {
			System.out.println("This?");
		}	
		
		
		//예제 
		String id = args[0];
		String Pass = args[1];
		
		if(id.equals("9907daniel") && Pass.equals("shin9907")) {
			System.out.println("login was successful");
		}else {
			System.out.println("Either id or password was incorrect, try again.");
		}
		
		
		
		// 2 : or (||)
		
		//예제 1
		if(id.equals("9907daniel") || Pass.equals("shin9907")) {
			if( id.equals("9907daniel") && Pass.equals("shin9907")){
				System.out.println("both id and password was correct");
			}else {
				if(id.equals("9907daniel")) {
					System.out.println("only id was correct");
				}else {
					System.out.println("only password was correct");
				}
			}		
		}else {
			System.out.println("both id and password was incorrect");
		}
		
		
		
		//예제 2
		if(true || false) {
			System.out.println("one true one false is true in or");
		}
		
		
		// 3.not(!)
		
		if(!true) {
			System.out.println("This will never print");
		}if(!false) {
			System.out.println("false of false is true!");
		}
		
		
				
	}

}
