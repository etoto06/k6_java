package NewHomework1.chap3;

//comparator 구현 실습
/*
* 교재 121 실습 3-6 
* 함수(메소드)에 parameter 전달 방식을 표현하는 능력의 숙달 훈련
* 함수(메소드) 전체를 작성하는 훈련 
*/
import java.util.Arrays;
public class train_실습3_6_0스트링배열정렬이진탐색 {


	static void reverse(String[] a) {//교재 67페이지
		for (int i = 0; i < a.length / 2; i++) {
            String temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
	}
	
	static void showData(String message, String[] data) {
		for (int i=0; i<data.length; i++) {
			System.out.println("data["+i+"]="+data[i]);		
		}
	}
	
	static void sortData(String[] data) {
	    Arrays.sort(data);
	}

	static int linearSearch(String key,String[] data) {
		for(int i=0; i< data.length; i++) {
			if(data[i]==key)
				return i;
		}
		return -1;
	}
	
//	static int binarySearch(String key,String[] data) {
//		int left =0;
//		int right = data.length -1;
//		
//		while(left <= right) {
//			int mid = (left+right)/2;
//			if(data[mid] < key){  //compare to 사용 
//				left = mid+1;
//			}
//			else if (data[mid]>key) {
//				right = mid-1;
//			}
//			else
//				return mid;
//		}
//		return -1;
//	}
	public static void main(String[] args) {
		String []data = {"사과","포도","복숭아", "감", "산딸기", "블루베리", "대추", "수박", "참외"};//홍봉희 재배 과수

		showData("정렬전", data);
		sortData(data);
		showData("정렬후", data);
		reverse(data);//역순으로 재배치
		showData("역순 재배치후", data);
		Arrays.sort(data);//Arrays.sort(Object[] a);
		showData("Arrays.sort()로 정렬후",data);
      
		String key = "포도";
		int resultIndex = linearSearch(key, data);
		System.out.println("\nlinearSearch(포도): result = " + resultIndex);

		key = "배";
		/*
		 * 교재 109~113
		 */
//		resultIndex = binarySearch( key,data);
//		System.out.println("\nbinarySearch(배): result = " + resultIndex);
//		key = "산딸기";
		/*
		 * 교재 115 Arrays.binarySearch에 의한 검색
		 */
		resultIndex = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(산딸기): result = " + resultIndex);
			
	}
}
