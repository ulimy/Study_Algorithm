package chap02;

import java.util.Arrays;
import java.util.Random;

public class c02_1 {
	
	// 난수를 사용해 배열의 요소 값 결정하여 배열의 최댓값 구하기
	public static void q1(){
		
		Random rand = new Random();
		int[] height = new int[5];
		int num,max=0;
		
		for (int i=0;i<5;i++){
			num = rand.nextInt(90)+100;
			if(num>max){ max=num; }
			height[i] = num;
		}
		
		System.out.println("배열 : "+Arrays.toString(height));
		System.out.println("최댓값 : "+max);
		
		return;
	}
	
	public static void main(String args[]){
		
		q1();
		
		return; 
	}
	
}
