package NewHomework1.chap3;

import java.util.Arrays;
import java.util.Comparator;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData3 {
	String name;
	int height;
	double vision;

	public PhyscData3(String name, int height, double vision) {
	this.name = name;
	this.height = height;
	this.vision = vision;
	}
}
class HeightOrderComparator2 implements Comparator<PhyscData3>{
	@Override
	public int compare(PhyscData3 data1, PhyscData3 data2) {
		if (data1.height > data2.height) {
			return 1;
		} else if (data1.height < data2.height) {
			return -1;
		} else {
			return 0;
		}
	}
}
public class train실습3_8객체비교연산자 {	
	static final Comparator<PhyscData3> HEIGHT_ORDER = new HeightOrderComparator2();

	public static void main(String[] args) {
		PhyscData3[] data = {
				new PhyscData3("홍길동", 162, 0.3),
				new PhyscData3("홍동", 164, 1.3),
				new PhyscData3("홍길", 152, 0.7),
				new PhyscData3("김홍길동", 172, 0.3),
				new PhyscData3("길동", 182, 0.6),
				new PhyscData3("길동", 167, 0.2),
				new PhyscData3("길동", 167, 0.5),
		};
		showData("정렬전 객체 배열", data);
		Arrays.sort(data, HEIGHT_ORDER);
		showData("정렬후 객체 배열", data);
		
		PhyscData3 key = new PhyscData3("길동", 167, 0.2);
		int idx = Arrays.binarySearch(data, key, HEIGHT_ORDER);
		System.out.println("\nArrays.binarySearch(): result = " + idx);
	}
	private static void showData(String string, PhyscData3[] data) {
		// TODO Auto-generated method stub
		for(int i=0; i < data.length; i++) {
			System.out.println("data["+i+"]="+data[i]);
		}
	}
//	private void showData(String[] data,String PhyscData3) {
//		
//	}

}
