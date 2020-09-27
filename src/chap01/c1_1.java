package chap01;

import java.util.Scanner;

public class c1_1 {
	
	// 네 값의 최댓값 구하기
	public static int q1(int a,int b,int c,int d){
		int result = a;
		if (result<b){
			result = b;
		}
		if(result<c){
			result = c;
		}
		if(result<d){
			result = d;
		}
		return result;
	}
	
	
	// 세 값의 최소값 구하기
	public static int q2(int a,int b,int c){
		int result = a;
		if(result>b){
			result = b;
		}
		if(result>c){
			result = c;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//q1
		System.out.println("네 값의 최댓값을 구하기 위해 네개의 정수를 입력헤주세요.");
		System.out.println("최댓값 = "+ q1(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
		
		//q2
		System.out.println("세 값의 최소값을 구하기 위해 세개의 정수를 입력해주세요.");
		System.out.println("최솟값 = " + q2(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		
		sc.close();
	}

}
