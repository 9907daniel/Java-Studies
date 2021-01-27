
public class l_array {

	public static void main(String[] args) {
		
		/*
		 * 	배열 (array) : 연관된 정보를 그루핑 하는데 사용하는 데이터 타입
		 * 	ㄴ변수가 하나의 데이터를 저장하기 위해서라면 배열은 여러 개의 데이터를 저장하기 위한 것
		 * 
		 * 형태:
		 * 타입[] 변수 = {__,___,___,__};
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		String[] classGroup = {"신정후","임현수","나준영"};
		//						안에 있는 것들을 원소(element)라고 한다.
		
		/*
		 * 이제 배열을 생성후 배열안에 특정 데이터를 가지고 오는 방법을 알아보자.
		 * 
		 * 
		 */
		
		System.out.println(classGroup[0]);
		// [0]은 1번째element인 신정후를 호출한다 -> [_] 안에 숫자를 index라고 한다
		//										ㄴ index 0 = 신정후, index 1 = 임현수...
		
		System.out.println(classGroup.length);
		// ㄴ 3
		// .length는 배열 안에 몇개의 원소가 들어가 있는지 보여준다 : 배열의 크기.
		
		
		/*
		 * 배열을 생성하는 방법 2.
		 * 
		 */
		String[] newGroup = new String[4];
		//					ㄴ 여기서 index는 [3]까지만.. 크기가 4 이기 떄문에 (0,1,2,3)
		
		//					4개의 원소가 있는 newGroup라는 배열을 만들었다.
		//					new는 아직 배우지 않았음 : 창조타입을 만들때 사용
		
		newGroup[0] = "신정후";
		newGroup[2] = "나준영";
		// newGroup 첫 자리에 원소 "신정후"를 지정했다.
	
		System.out.println(newGroup.length);
		//원소를 지정했든 안했든 길이는 언제나 4
		System.out.println(newGroup[2]);
		
		
		
		/*
		 * 배열의 활용
		 */
		
		String[] members = {"신정후", "나준영", "노순호"};
		
		for(int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담 받고 있습니다..");
		}
		
		//반복문과 배열을 결합한 부분.
			
		
		/*
		 * for-each문 : 배열과 for문을 사용할때 더 편리하게 사용하기 위해 for-each를 만들었다.
		 * 				ㄴ 약간 while이 불편해 for문을 사용하는 개념과 같다. 
		 *
		 * 형식: 
		 * for(String _ : _배열명_){
		 * 
		 * }
		 *
		 *
		 */
		
		String[] classmates = {"dani", "aaron", "tomoya", "garrett"};
		
		for(String e : classmates){
			// ":" 뒤에 있는 배열 안의 원소들을 순차적으로 사용하게 되어있음.
			// ㄴ 이런 문법이 생겼다는것은... 반복문과 배열은 거의 항상 같이 사용하기 때문에..
			
				System.out.println( e +  "이 상담 받았습니다.");
			}	
		
		
		
		
		
		
		
	}

}
