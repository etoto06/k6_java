package NewHomework1.chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class train_3_1스트링리스트정렬 {
	//현제배열에서 중복 제거하려고 코드가 길어진다
	//배열을 리스트변환 > list.remove();
	//삭제된 리스트를 배열로 변환하여 리턴
	
	
//	 public static List<String> removeElement1(String[] arr, String item) {
//	    	List<String> newarrList = new ArrayList<>();
//	    	for (int i=0; i< arr.length -1; i++) {
//	    		if (!arr[i].equals(arr[i+1])) {
//	    			newarrList.add(arr[i]);
//	    		}
//	    	}
//	    	System.out.println("테스트"+newarrList);
//			return ;
//	    }
	    public static String[] removeElement1(String[] arr, String item) {
	    	
	    	
			return arr;
	    }
	    
	    static void getList(List<String> list) {
			list.add("서울");	list.add("북경");
			list.add("상해");	list.add("서울");
			list.add("도쿄");	list.add("뉴욕");
			list.add("런던");	list.add("로마");
			list.add("방콕");	list.add("북경");
			list.add("도쿄");	list.add("서울");
			list.add(1, "LA");
	    }
	    static void showList(String topic, List<String> list) {
	    	System.out.println(topic + ": " + list);
	    }
	    static void sortList(List<String> list) {
	    	Collections.sort(list);
	    	//방법1 list.sort(null)
	    	//방법2 list를 배열로 전환 
	    }
	    
	    static List<String> removeDuplicateList(List<String> list) {
		    String cities[] = new String[0]; 
		    cities = list.toArray(cities);
		    //1.리스트를 배열로 바꾸고
		    //2.이 배열의 사이즈를 측정해서 사이즈 부족하면 공간할당 
		    List<String> newarrList = new ArrayList<>();
		    for (int i=0; i< cities.length -1; i++) {
	    		if (!cities[i].equals(cities[i+1])) {
	    			newarrList.add(cities[i]);
	    		}
		    }
		    System.out.println(newarrList);
		    return newarrList;
	    }
	    
	    
	    
		public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<>();
			getList(list);
			showList("입력후", list);
			  List<String> newList = list.stream().distinct().collect(Collectors.toList());
		
			//sort - 오름차순으로 정렬, 내림차순으로 정렬, 중복 제거하는 코딩

//		    Collections.sort(list);

//배열의 정렬
			sortList(list);
		    System.out.println();
		    showList("정렬후", list);
// 배열에서 중복제거
		    System.out.println();
		    System.out.println("중복제거::");
		  
		    String[] cities = removeDuplicateList(list);
	        ArrayList<String> lst = new ArrayList<>(Arrays.asList(cities));
		    showList("중복제거후", newList );
		}
	}

