package chap03;

import java.util.Arrays;

public class c03_3 {
	/*
	 이진검색(BinarySearch)
	 
	 요소가 오름차순 혹은 내림차순으로 정렬 되어있는 경우!
	 
	 중앙인덱스와 키값 비교하여 키값이 더 작다면 왼쪽만 키값이 더 크다면 오른쪽만 검색 -> 찾을때까지 반복
	 ---> 한단계씩 진행될 때 마다 검색 범위가 반으로 좁혀짐
	 
	 O(logn)
	 검색 성공 : logn -1
	 검색 실패: logn +1
	 
	 
	 */
	
	public static int BinarySearch(){
		//배열 arr에서 3 찾기
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int pl = 0; //검색 범위의 첫 인덱스
		int pr = arr.length-1; //검색 범위의 마지막 인덱스
		
		do{
			int i = (pl+pr)/2; //중앙값 
			
			if(arr[i]==3){
				return i; //검색 성공!
			}else if(arr[i]>3){
				// 검색실패! 검색 범위를 앞쪽 절반으로
				pr = i-1;
			}else{
				// 검색 실패! 검색 범위를 뒤쪽 절반으로
				pl = i+1;
			}
		}while(pl<=pr);
		
		return -1;
		
	}
	
	
	/*
	 Arrays.binarySearch 
	  : 자바에서 이진검색을 표준 라이브러리로 제공
	  
	  검색성공 : 인덱스 반환 ( 여러개라면? 그 중 무작위로 반환 )
	  검색실패 : -삽입포인트-1 반환
	  
	  Arrays.binarySearch(배열이름, 키값);
	  
	 */
	
	public static void BinarySearch_API(){
		
		int[] arr = {1,2,3,4,6,7,8,9,10};
		
		// 배열 arr에서 3 찾기
		System.out.println("3의 위치 : "+Arrays.binarySearch(arr, 3));
		// 배열 arr에서 5의 삽입포인트 찾기
		System.out.println("5의 -삽입 포인트-1 : "+Arrays.binarySearch(arr, 5));
		
		return;
	}
	
	public static void main(String args[]){
		System.out.println("Binary Search : "+BinarySearch());
		System.out.println("Binary Search with API");
		BinarySearch_API();
		return;
	}
}
