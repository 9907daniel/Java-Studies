
public class e_boolean {

	public static void main(String[] args) {

		//Boolean : true/false (�⺻ Ÿ�Կ� ���Եȴ�)

		System.out.println(1==2);
		// False
		System.out.println("one" != "two");
		// True
		
		// *** .equals : "���ڿ�" ���Ҷ� ���Ǵ� �޼ҵ�
		
		String c = "what up";
		String d = new String("what up");
		
		System.out.println( c ==d );
		//false
		System.out.println(c.equals(d));
		//true
		
		// ��� : ���ڿ� ������ �񱳴� == ���� .equals�� �������! 
	}

}
