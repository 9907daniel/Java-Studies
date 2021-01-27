
public class h_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if문이 switch문보다 많아 서용되며 서로가 대체가 가능한 관계다
		
		switch(1) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		/*
		 * switch() 안에 1이 있기 때문에 case1이 뽑힌다
		 * **그러나 case1이 출력되면 순차적으로 밑에 있는 case들도 다 뽑힌다
		 * 
		 * 
		 * 결과 : one
		 * 		two
		 * 		three
		 */
		
		//실행되는거 뒤에 있는것들을 실행 않하게 하는법
		
		switch(1) {
		case 1:
			System.out.println("\none");
			break;
		case 2:
			System.out.println("\ntwo");
			break;		
		case 3:
			System.out.println("\nthree");
			break;
		}
			
		// switch가 break; 를 만나면 즉시 중지된다.
		
		
		
		
		
		
		
	}

}
