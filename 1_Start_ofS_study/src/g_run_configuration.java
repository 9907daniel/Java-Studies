
public class g_run_configuration {

	public static void main(String[] args) {
		
		//����& �񱳿����� �׸��� ���ǹ��� Ȱ���� ����
		String id = args[0];
					//args = arguments
		
		if(id.equals("egoing")){
			System.out.println("u were able to login");
		}else {
			System.out.println("entered id was incorrect");
		}

		
		/*
		 * �Է°��� Ȱ���ϸ鼭 ����ϴ¹� (in eclipse)
		 * 1.run configuration
		 * 2.new launch configuration 
		 * 3.arguments�� ������ �� ����.
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
				
				//if-else �ȿ� if-else (���̵�&��� �Ѵ� �¾ƾ��� login)
			}
			
		}else {
			System.out.println("id was incorrect");
		}
	
	}
}
