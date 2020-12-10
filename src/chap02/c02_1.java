package chap02;

import java.util.Arrays;
import java.util.Random;

public class c02_1 {
	static Random rand = new Random();
	
	// 난수를 사용해 배열의 요소 값 결정하여 배열의 최댓값 구하기
	public static void q1(){
		
		int num,max=0;
		int[] height = new int[5];
		
		for (int i=0;i<5;i++){
			num = rand.nextInt(90)+100;
			if(num>max){ max=num; }
			height[i] = num;
		}
		
		System.out.println("배열 : "+Arrays.toString(height));
		System.out.println("최댓값 : "+max);
		
		return;
	}
	
	//난수를 사용해 배열의 요소 값 결정하여 역순으로 정렬하기
	public static void q2(){
		int i,j,temp=0;
		int[] arr = new int[5];
		
		for (i=0;i<5;i++){
			arr[i] = rand.nextInt(100);
		}
		System.out.println("초기 배열 : "+Arrays.toString(arr)+"\n");
		
		for (i=0;i<arr.length/2;i++){
			j=arr.length-i-1;
			System.out.println("a["+i+"]과(와) a["+j+"]을(를) 교환합니다.");
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			System.out.println(Arrays.toString(arr)+"\n");
		}
		System.out.println("역순 정렬을 마쳤습니다.");
		System.out.println("배열 : "+Arrays.toString(arr));
		
		return;
	}
	
	// 난수를 사용해 배열의 요소 값 결정하여 모든 요소의 합계 구하기
	public static void q3(){
		
		int[] arr = new int[5];
		int sum=0,num=0;
		
		for(int i=0;i<5;i++){
			num = rand.nextInt(100);
			arr[i] = num;
			sum+=num;
		}
		
		System.out.println("배열 : "+Arrays.toString(arr));
		System.out.println("합계 : "+sum);
		
		return;
	}
	
	public static void main(String args[]){
		
		q1();
		
		q2();
		
		q3();
		
		return; 
	}
	
}
