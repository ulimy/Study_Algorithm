package chap01;

import java.util.Scanner;

public class c01_1 {
	
	//Q1 네 값의 최댓값 구하기
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
	
	
	//Q2 세 값의 최소값 구하기
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
	
	//Q3 네 값의 최소값 구하기
	public static int q3(int a, int b, int c, int d){
		int result = a;
		if(result>b){
			result = b;
		}
		if(result>c){
			result = c;
		}
		if(result>d){
			result = d;
		}
		return result;
	}
	
	//Q4 세 값의 중앙값 구하기
	public static int q4(int a, int b, int c){
		
		if(a>b){
			if(b>c) return b;
			else if(a<c) return a;
			else return c;
		}
		//여기서부터 a는 b보다 작다는게 이미 밝혀짐
		else if(a>c) return a;
		// 여기서부터는 a는 b와 c보다 작다는게 밝혀짐
		else if(b>c) return c;
		else return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//q1
		System.out.println("네 값의 최댓값을 구하기 위해 네개의 정수를 입력헤주세요.");
		System.out.println("최댓값 = "+ q1(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
		
		//q2
		System.out.println("세 값의 최솟값을 구하기 위해 세개의 정수를 입력해주세요.");
		System.out.println("최솟값 = " + q2(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		
		//q3
		System.out.println("네 값의 최솟값을 구하기 위해 네개의 정수를 입력해주세요.");
		System.out.println("최솟값 = "+ q3(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
		
		//q4
		System.out.println("세 값의 중앙값을 구하기 위해 세개의 정수를 입력해주세요.");
		System.out.println("중앙값 = " + q4(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		
		sc.close();
	}

}
