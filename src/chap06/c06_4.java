package chap06;

import java.util.Arrays;

public class c06_4 {
	/*셸정렬
	 
	 그룹으로 나눠 정렬한 후 그룹을 합쳐나감
	 
	 why? 단순삽입정렬을 그냥 하게되면 바꿔야 할 요소가 멀리 떨어져있을수록 많은 swap이 이루어져 비효율적임. 
	              정렬 상태에 가깝도록 만든 뒤 단순삽입정렬 수행
	     
	 4-정렬 : 4칸만큼 떨어진 요소와 비교하여 swap
	 2-정렬 : 2칸만큼 떨어진 요소와 비교하여 swap
	              
	 */
	
	static int[] arr = {5,7,2,4,0,1};
	
	static void ShellSort(){
		// h를 반으로 줄여가며 h-정렬 수행. h가 1이 되면 종료 => 단순삽입정렬과 동일하게 됨 
		for (int h=arr.length/2;h>0;h/=2){
			for (int i=h;i<arr.length;i++){
				//비교하여 삽입 할 값
				int temp=arr[i];
				// 삽입 할 위치
				int j;
				for (j=i-h;j>=0&&arr[j]>temp;j-=h){
					arr[j+h]=arr[j];
				}
				arr[j+h]=temp;
			}
		}
		return;
	}

	public static void main(String[] args) {
		ShellSort();
		System.out.println(Arrays.toString(arr));
		return;
	}

}
