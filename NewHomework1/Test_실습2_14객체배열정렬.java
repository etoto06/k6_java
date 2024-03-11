package NewHomework1;

import java.util.Arrays;
//구글링해서 comparator, comparable 차이, 사용예시 파악
//Comparable은 자기 자신과 매개변수 객체를 비교
//Comparator는 두 매개변수 객체를 비교
//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData>{// implements Comparable<PhyscData> 
	String name;
	int height;
	double vision;

	@Override
	public String toString() {//객제들의 정보를 문자열로 반환 
		return "이름"+name+", 키"+ height + ", 시력"+vision;
	}
	@Override
	public int compareTo(PhyscData p) {
		if(this.height > p.height || this.vision > p.vision) {
			return 1;
		}
		else if(this.height == p.height|| this.vision == p.vision) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	
	public boolean equals(PhyscData p) {
	if (this == p) {
        return true;
    }
    if (p== null || getClass() != p.getClass()) {
        return false;
        
    }
    PhyscData other = (PhyscData) p;
    return height == p.height && vision == p.vision;
    }
}
	
//	public int equals(PhyscData p) {
//		if (this == p) {
//	        return true;
//	    }
//	    if (p== null || getClass() != p.getClass()) {
//	        return false;
//	    }
//	    PhyscData other = (PhyscData) p;
//	    return height == p.height && vision == p.vision;
//		
//	}
//}
public class Test_실습2_14객체배열정렬 {
	
	static void swap(PhyscData[] arr, int ind1, int ind2) {
		PhyscData t = arr[ind1]; 
		arr[ind1]  = arr[ind2];
		arr[ind2]  = t;
	}

	static void sortData(PhyscData []arr) {
		for( int i =0; i <arr.length-1 ; i++) {
			for(int j = 0; j< arr.length-1 -i ; j++) {
				if (arr[j].compareTo(arr[j+1]) > 0 )
					swap(arr,i,j+1);
			}
		}
	}
	public static void main(String[] args) {
		PhyscData[] data = {
				new PhyscData("홍길동", 162, 0.3),
				new PhyscData("홍동", 164, 1.3),
				new PhyscData("홍길", 152, 0.7),
				new PhyscData("김홍길동", 172, 0.3),
				new PhyscData("이길동", 182, 0.6),
				new PhyscData("박길동", 167, 0.2),
				new PhyscData("최길동", 169, 0.5),
		};
		showData(data);
		sortData(data);
		//Arrays.sort(null, null);//comparator가 필요하다 
		showData(data);
	}
	static void showData(PhyscData[]arr) {
		for (PhyscData data : arr) {
			System.out.println(data);
		}
		System.out.println();
	}
}