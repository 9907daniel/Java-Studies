
public class i_conditional_operator {

	public static void main(String[] args) {
		
		/* condtional operator(�� ������)
		 * : ũ�� ������  and, or
		 * 
		 * 1. and (&&) : a and b -> �Ѵ� ���̿��� ��. 
		 * 
		 * 2. or (||) : a and b -> �ϳ��� ���̸� ��
		 * 
		 * 3. not (!) : Boolean�� ���� ������Ű�� ����. 
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
		
		
		//���� 
		String id = args[0];
		String Pass = args[1];
		
		if(id.equals("9907daniel") && Pass.equals("shin9907")) {
			System.out.println("login was successful");
		}else {
			System.out.println("Either id or password was incorrect, try again.");
		}
		
		
		
		// 2 : or (||)
		
		//���� 1
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
		
		
		
		//���� 2
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
