
public class c_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* �⺻ Ÿ�� : ��� �� ���п��� ����ϴ� �����Ͱ����� �� �� ��ü\
		 * ����
		 * boolean 	: true / false
		 * int		: ����
		 * double	: �Ǽ� (�Ҽ��� ����)
		 * char		: ���� (�� ����)
		 * string	: ���ڿ� (���� ����)
		 * 
		 * *�������� �� ���� Ÿ���̴�.
		*/
		
		/*
		 * <1.Data type>
		 * 
		 * : smallest size in a computer is bit. : �������� 0 & 1�� �ٷ� bit�̴�
		 * 
		 * 8 bit = 1 byte 
		 * 1024 byte 		= 1 kilobyte
		 * 1024 kilobyte 	= 1 megabyte
		 * 1024 megabyte	= 1 gigabyte
		 * 
		 * ......
		 *
		 */
		
		
		/*
		 * 1) Data type ������
		 * 
		 * TYPE		SIZE	RANGE
		 * 
		 * byte		1byte	-128~127
		 * short	2byte	-32,878~ 32,767
		 * int		4byte	-+ 2,000,000,000 ����
		 * long		8byte	-+ 9,000,000,000,000,000,000 ����
		 * 
		 * 
		 * *�������� �ַ� int�� ����Ѵ�
		 * �� long�� ������� �ʴ� ������ ������ ����� �� ũ�⶧����
		 *   ������ ž���� ����ϴµ� int���� �� 2���� �ð��� �ɸ���
		 * ���� used more for precision
		 * 
		 */
		
		long a = 1L;
		System.out.println(a);
		// long�� ����Ҷ���  ���ڿ� l �ƴϸ� L �� ������Ѵ�
		
				
		/* 2) Data Type �Ǽ���
		 * 
		 * 
		 * float 	4byte
		 * double 	8byte
		 * 
		 * *�ַ� double�� �������
		 * * float�� long�� ���� �� �ڿ� f �ƴϸ� F�� �ٿ�����Ѵ�.
		 * 
		 */
		float b = 2.23323f;
			
		
//---------------------------------------------------------------------------
		
		
		// <���� ��ȯ>
		
		double c = 3.0F;
		// ���� Ÿ�� -> ū Ÿ�� : �ڵ� �� ��ȯ�� �ȴ�. (�� ū�Ŵ� �����ͺ��� �� ���� ���� ǥ���� �� �ֱ� ������)
		// �� ���� Ÿ���� ������ ū Ÿ���� ���� ���̱� ������
	
		//�ݴ�� ū Ÿ�� -> ���� Ÿ���� ������ �߻��� ���� �ٲ��־���Ѵ�.
		//ũ�� byte < short = char < int < long < float < double
		
		// <ū Ÿ�� -> ���� Ÿ�� ���� �ٲ��ֱ� : explicit conversion(����� ����ȯ)>
		/*
		 * float a = 100.0;
		 * int b = 100.0F;
		 * �� ����� ��ȭ Ȱ���ؼ� �ٲپ��
		 * 
		 */
		
		float g = (float)100.0;
		int h = (int)100.0F;
		
		// ���� : �ٲٰ����Ÿ�� = (�ٲٰ����Ÿ��)�����Ͱ�;
		
		System.out.println(h);
		// 100.0 -> 100 (�Ǽ� -> ����)

	}

}
