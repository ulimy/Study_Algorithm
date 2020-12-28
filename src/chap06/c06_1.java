package chap06;

import java.util.Arrays;

public class c06_1 {
	/*버블정렬
	 맨 앞 혹은 맨 뒤 에세부터 하나씩 이웃한 요소를 비교, 교환
	  */
	
	static int[] arr = {5,7,2,4,0,1};
	
	static void swap(int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return;
	}
	
	static void BubbleSort(){
		for (int i=0;i<arr.length;i++){
			int exchg=0; // 반복 끝났는데 교횐 횟수 0이라면 이후 교환은 할 필요 X
			for (int j=arr.length-1;j>i;j--){
				if(arr[j]<arr[j-1]){
					swap(j,j-1);
					exchg++;
				}
			}
			if (exchg==0) {break;}
		}
		return;
	}

	public static void main(String[] args) {
		BubbleSort();
		System.out.println(Arrays.toString(arr));
		return;
	}

}
