package NewHomework1;

public class Test_실습2_14스트링배열정렬 {
	public class 실습2_14스트링배열정렬 {
		public static void main(String[] args) {
			String[] data = { "apple", "grape", "persimmon", "pear", "blueberry", "strawberry", "melon",
					"oriental melon" };

			showData(data);
			sortData(data);
			showData(data);
		}

		static void showData(String[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}

		static void swap(String[] arr, int ind1, int ind2) {
			String t = arr[ind1];
			arr[ind1] = arr[ind2];
			arr[ind1] = String t;
		}
	}

	static void sortData(String []arr) {
		for (int i =0;)
			for(int j = i+1){
				if (arr[i]> arr[j])//compareTo()사용하는
				swap(arr,i,j);
			}
	}

}
