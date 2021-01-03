package chap06;

import java.util.Arrays;

public class c06_2 {
	/*단순선택정렬
	 배열의 가장 작은 요소를 선택하여 알맞은 위치로 이동시킴
	*/

	static int[] arr = {5,7,2,4,0,1};
	
	static void swap(int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return;
	}
	
	static void SelectionSort(){
		// 마지막 요소는 굳이 정렬하지 않아도 되므로 배열 길이-1 만큼만 반복하면 됨.
		for(int i=0;i<arr.length-1;i++){
			// 가장 작은 요소 찾기
			int min=i;
			int j;
			for(j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]) min=j;
			}
			//가장 작은 요소 제일 앞으로
			swap(i,min);
		}
	}
	
	public static void main(String[] args) {
		SelectionSort();
		System.out.println(Arrays.toString(arr));
		return;
	}

}
