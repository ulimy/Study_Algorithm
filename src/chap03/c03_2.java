package chap03;

public class c03_2 {

	/*
	 선형검색 (Linear Search)
	  : 직선모양으로 늘어선 배열에서 원하는 키값을 갖는 요소를 만날때까지 순차적으로 검색
	  
	 선형 검색의 종료조건
	  -1. 검색하는 값을 발견한 경우 (검색 성공)
	  -2. 검색하는 값을 발견하지 못한 채 배열의 끝을 지나간 경우 (검색 실패)
	  
	  보초법(Sentinel Method)
	  : 선형검색에서 배열의 끝을 지나가는 경우를 종료조건 중 하나로 삼는 것 보다 더 빠르게 연산할 수 있는 방법이 있음
	    -> 검색하고자 하는 값을 배열 맨 뒤에 추가하기! (이를 보초값이라 함)
	 */
	
	// 선형검색
	public static int LinearSearch(){
		
		// 배열 arr에 3이 들어있는 인덱스 반환하기
		int[] arr = {1,2,3,4,5};
		for(int i=0;i<5;i++){
			if (arr[i]==3){ return i; }
		}
		return -1;
	}
	
	//보초법
	public static int SentinelMethod(){
		// 배열 arr에 3이 들어있는 인덱스 반환하기
		int[] arr = {1,2,4,5,0};
		arr[arr.length-1]=3;
		int i=0;
		
		for (i=0;i<5;i++){
			if (arr[i]==3){ break; }
		}
		
		if(i==arr.length-1){
			return -1;
		}else{
			return i;
		}
		
	}
	
	
	public static void main(String args[]){
		
		System.out.println("Linear Search : "+LinearSearch());
		System.out.println("Sentinel Method : "+SentinelMethod());
		return;
	}
}
