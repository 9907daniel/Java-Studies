
public class f_if {

	public static void main(String[] args) {
		
		/*
		 * ���ǹ� : if, switch , ���������� (?:)
		 * 
		 * 
		 * ***<1 : ���ǹ� if>*** 
		 * ���ǹ� : �־��� ���ǿ� ���� ������ �ٸ��� �����ϵ���..
		 * 
		 * if(if��){
		 * 		then��
		 * }
		 * 
		 * ------>if���� true�� then���� ����.
		 * 
		 */
		
		
		int a = 1;
		int b = 2;
		
		if(a==b) {
			System.out.println("True1");
		}
		//��� X
		
		a = ++a;
		if(a==b) {
			System.out.println("True2");
		}
		//��� O
		
		String KK = "my name is danny";
		String DD = "my name is danny";
		if(KK.equals(DD)) {
			System.out.println("his name is danny");
		}
		
		//**** ���ڿ��� == ������������� .equals() ���������.
		
		
		
		
		/*
		 * ***<2 : ���ǹ� else>*** 
		 * 
		 * if�� �� ����� ������ ��Ȳ�� ó���ϴµ� ������ �ִ�. -> if-else�� ���
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
		//������ �����̱� ������ if������ �ȵǰ� ��� else���� ����ȴ�
		
		
		/*
		 * ***<3 : ���ǹ� else-if>***
		 * else if�� Ȱ���Ͽ� ���ǹ��� �� �����Ӱ� ������ ���ִ�. : else�� ������ �־����ٰ� �����ϸ��.
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
		 * **else�� ������ �����ϴ�.
		 */
		
		
		
		
		
		
		
		//if else ���ǹ� ���׿������� ǥ���ϱ� 
		int samhang = 100;
		samhang = (samhang % 2 ==1) ? samhang +1:samhang -1;
		System.out.println(samhang);
		// 100 % 2 �� 0 �̱⋚���� ���� -> �ڿ��ִ� �������� ����.
		
		
		
		
		

	}

}
