package chap06;

import java.util.Arrays;

public class c06_7 {
	/*힙정렬
	 가장 큰 값이 루트에 오도록 하는 트리
	 */

	
	static void swap(int[] arr,int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return;
	}
	
	
	// 힙으로 만들기
	static void downHeap(int a[],int left,int right){
		int temp=a[left];
		int child; //자식노드
		int parent; //부모노드
		
		for(parent=left;parent<(right+1)/2;parent=child){
			int cl=parent*2+1;
			int cr=cl+1;
			child=(cr<=right&&a[cr]>a[cl])?cr:cl;
			if(temp>=a[child]) break;
			a[parent]=a[child];
		}
		a[parent]=temp;
	}
	
	static void HeapSort(int[] a){
		//i부터 length-1까지 힙으로 만들기
		for (int i=(a.length-1)/2;i>=0;i--){
			downHeap(a,i,a.length-1);
		}
		
		for(int i=a.length-1;i>0;i--){
			swap(a,0,i);
			downHeap(a,0,i-1);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {5,7,2,4,0,1};
		HeapSort(a);
		System.out.println(Arrays.toString(a));
		return;
	}

}
