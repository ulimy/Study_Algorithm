package chap06;

import java.util.Arrays;

public class c06_3 {
	/*단순삽입정렬
	 배열의 가장 작은 요소를 선택해 알맞은 위치로 이동
	 
	 단순선택정렬과 다른점? 
	 단순선택은 알맞은 위치를 찾아 swap만,
	 단순삽입은 알맞은 위치를 찾아 그 자리에 집어넣고 나머지는 한칸씩 뒤로 미룸 
	 */
	
	static int[] arr = {5,7,2,4,0,1};
	
	static void InsertionSort(){
		
		//비교하여 삽입 할 값
		int temp;
		// 삽입 할 위치
		int j;
		
		// 첫번째 요소는 삽입할 필요 없음 두번째부터!
		for (int i=1;i<arr.length;i++){
			temp=arr[i];
			//배열 첫 요소를 향하며 삽입 할 위치를 찾을 때 까지 반복
			//삽입 하려는 곳의 값이 삽입할 값보다 크다면 바로 그 위치임!
			for (j=i;j>0&&arr[j-1]>temp;j--){
				// 한칸씩 뒤로 밀기
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}
		return;
	}

	public static void main(String[] args) {
		InsertionSort();
		System.out.println(Arrays.toString(arr));
		return;
	}

}
