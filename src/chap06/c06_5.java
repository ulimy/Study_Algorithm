package chap06;

import java.util.Arrays;

public class c06_5 {
	/*퀵정렬
	 Divide&Conquer
	 
	 기준이 될 pivot 선택.
	배열을 계속 쪼개서 정렬 --> 재귀호출 이용!
	 
	 */
	
	static int[] arr = {5,7,2,4,0,1};
	
	static void swap(int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return;
	}
	
	static void QuickSort(int left,int right){
		int pl=left;
		int pr = right;
		int x = arr[(pl+pr)/2]; //가운데 값을 pivot으로 지정
		
		do{
			// pivot 기준으로 배열 나누기
			while(arr[pl]<x) pl++;
			while(arr[pr]>x) pr--;
			if(pl<=pr) swap(pl++,pr--);
		}while(pl<=pr);
		
		//재취호출을 통해 반복
		if(left<pr) QuickSort(left,pr);
		if(right>pl) QuickSort(pl,right);
		
		return;
	}

	public static void main(String[] args) {
		QuickSort(0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		return;
	}

}
