
public class g_run_configuration {

	public static void main(String[] args) {
		
		//변수& 비교연산자 그리고 조건문을 활용한 예제
		String id = args[0];
					//args = arguments
		
		if(id.equals("egoing")){
			System.out.println("u were able to login");
		}else {
			System.out.println("entered id was incorrect");
		}

		
		/*
		 * 입력값을 활용하면서 출력하는법 (in eclipse)
		 * 1.run configuration
		 * 2.new launch configuration 
		 * 3.arguments에 기입할 값 기입.
		 * 
		 * 
		 */
		
		
		String id1 = args[1];
		String Pass1 = args[2];
		
		if(id1.equals("9907daniel")) {
			if(Pass1.equals("shin9907")) {
				System.out.println("u were able to login");
				
			}else {
				System.out.println("password was incorrect");
				
				//if-else 안에 if-else (아이디&비번 둘다 맞아야지 login)
			}
			
		}else {
			System.out.println("id was incorrect");
		}
	
	}
}
