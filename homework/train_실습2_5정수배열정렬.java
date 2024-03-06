package homework;

import java.util.Arrays;
import java.util.Collections;
//교재 67 - 실습 2-5
//2번 실습
import java.util.Random;
public class train_실습2_5정수배열정렬 {

	public static void main(String[] args) {
		int []data = new int[10];
		inputData(data);
		showData(data);
		
		sortData(data);
		showData(data);
		
		reverse(data);//역순으로 재배치 - 정렬 아님 
		showData(data);

		reverseSort(data);//역순으로 재배치 - 정렬 아님 
		showData(data);
	}
	static void showData(int[]data) {
	for (int i=0; i<data.length; i++) {
		System.out.println("showData"+i+"="+data[i]);
	}
	}
	static void inputData(int []data) { //난수 생성해서 데이터 입력 
		Random rand= new Random();
		for(int i=0; i< data.length; i++) {
			data[i] = rand.nextInt(100);
		}
	}
	static void swap(int[]arr, int ind1, int ind2) {//교재 67페이지
		//배열에서 두 요소 위치 교환
		int t = arr[ind1]; 
		arr[ind1]=arr[ind2];
		arr[ind1]=t;
	}
	static void sortData(int []arr) { 
		//올림차순 정렬
		Arrays.sort(arr);
	}
	static void reverse(int[] a) {//교재 67페이지
		//배열을 역순으로 재배열
		for(int i=0; i<a.length; i++) {
			swap(a,i,a.length -i -1);
		}//배열의 i번째 요소와 마지막에서 i번째 요소 위치 바꾸기
		//예시 i가 0일때
		// a , 0 , 10 -0 -1   => a , 0 , 9 (첫번째와 마지막 10번째 배열이 바뀜)
	}
	static void reverseSort(int []arr) {
		//내림차순 정렬 
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			swap(arr,i,arr.length -i -1);
		}
		//다른방법도 있지만 int에서는 오름차순에서 다시 배열 요소 바꿔서 구헀음
	}

}
