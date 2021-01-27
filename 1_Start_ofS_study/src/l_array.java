
public class l_array {

	public static void main(String[] args) {
		
		/*
		 * 	�迭 (array) : ������ ������ �׷��� �ϴµ� ����ϴ� ������ Ÿ��
		 * 	�������� �ϳ��� �����͸� �����ϱ� ���ؼ���� �迭�� ���� ���� �����͸� �����ϱ� ���� ��
		 * 
		 * ����:
		 * Ÿ��[] ���� = {__,___,___,__};
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		String[] classGroup = {"������","������","���ؿ�"};
		//						�ȿ� �ִ� �͵��� ����(element)��� �Ѵ�.
		
		/*
		 * ���� �迭�� ������ �迭�ȿ� Ư�� �����͸� ������ ���� ����� �˾ƺ���.
		 * 
		 * 
		 */
		
		System.out.println(classGroup[0]);
		// [0]�� 1��°element�� �����ĸ� ȣ���Ѵ� -> [_] �ȿ� ���ڸ� index��� �Ѵ�
		//										�� index 0 = ������, index 1 = ������...
		
		System.out.println(classGroup.length);
		// �� 3
		// .length�� �迭 �ȿ� ��� ���Ұ� �� �ִ��� �����ش� : �迭�� ũ��.
		
		
		/*
		 * �迭�� �����ϴ� ��� 2.
		 * 
		 */
		String[] newGroup = new String[4];
		//					�� ���⼭ index�� [3]������.. ũ�Ⱑ 4 �̱� ������ (0,1,2,3)
		
		//					4���� ���Ұ� �ִ� newGroup��� �迭�� �������.
		//					new�� ���� ����� �ʾ��� : â��Ÿ���� ���鶧 ���
		
		newGroup[0] = "������";
		newGroup[2] = "���ؿ�";
		// newGroup ù �ڸ��� ���� "������"�� �����ߴ�.
	
		System.out.println(newGroup.length);
		//���Ҹ� �����ߵ� ���ߵ� ���̴� ������ 4
		System.out.println(newGroup[2]);
		
		
		
		/*
		 * �迭�� Ȱ��
		 */
		
		String[] members = {"������", "���ؿ�", "���ȣ"};
		
		for(int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "�� ��� �ް� �ֽ��ϴ�..");
		}
		
		//�ݺ����� �迭�� ������ �κ�.
			
		
		/*
		 * for-each�� : �迭�� for���� ����Ҷ� �� ���ϰ� ����ϱ� ���� for-each�� �������.
		 * 				�� �ణ while�� ������ for���� ����ϴ� ����� ����. 
		 *
		 * ����: 
		 * for(String _ : _�迭��_){
		 * 
		 * }
		 *
		 *
		 */
		
		String[] classmates = {"dani", "aaron", "tomoya", "garrett"};
		
		for(String e : classmates){
			// ":" �ڿ� �ִ� �迭 ���� ���ҵ��� ���������� ����ϰ� �Ǿ�����.
			// �� �̷� ������ ����ٴ°���... �ݺ����� �迭�� ���� �׻� ���� ����ϱ� ������..
			
				System.out.println( e +  "�� ��� �޾ҽ��ϴ�.");
			}	
		
		
		
		
		
		
		
	}

}
