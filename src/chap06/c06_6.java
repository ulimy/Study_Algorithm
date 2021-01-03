package chap06;

import java.util.Arrays;

public class c06_6 {
	/*병합정렬
	 정렬된 두 배열을 앞에서부터 비교해가며 더 작은 값 넣음으로써 병합해감. -> 재귀호출이용
	 */
	
	static int[] arr; // 작업을 위한 배열
	
	static void __mergeSort(int[] a,int left, int right){
		if (left<right){
			int i;
			int center=(left+right)/2; //반으로 나누기
			int p=0;
			int j=0;
			int k=left;
			
			// 왼쪽부터 center까지 정렬
			__mergeSort(a,left,center);
			// center부터 오른쪽까지 정렬
			__mergeSort(a,center+1,right);
			
			for(i=left;i<=center;i++){
				arr[p++] = a[i];
			}
			
			while (i<=right&&j<p){
				a[k++]=(arr[j]<=a[i])?arr[j++]:a[i++];
			}
			
			while(j<p){
				a[k++] = arr[j++];
			}
				
		}
	}
	
	static void MergeSort(int[] a){
		
		//작업용 배열 정렬할 배열의 크기만큼 생성
		arr = new int[a.length];
		
		__mergeSort(a,0,a.length-1);
		
		//작업용 배열 초기화
		arr=null;
	}

	public static void main(String[] args) {
		int[] a = {5,7,2,4,0,1};
		MergeSort(a);
		System.out.println(Arrays.toString(a));
		return;
	}

}
