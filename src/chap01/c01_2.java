package chap01;

import java.util.Scanner;

public class c01_2 {

	
	//while문이 종료될 때 i값 확인하기
	public static void q6(int n){
		
		int sum=0;
		int i=1;
		
		while(i<=n){
			sum+=i;
			i++;
		}
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		System.out.println("i의 값은 "+i+"입니다.");
		
		return;
		
	}
	
	//for 반복문 이용하기
	public static void q7(int n){
		
		int sum=0;
		
		for(int i=1;i<=n;i++){
			if (i<n)
				System.out.print(i+" + ");
			else
				System.out.print(i);			
			sum+=i;
		}
		
		System.out.print(" = "+sum);
		
		return;
		
	}
	
	//가우스의 덧셈
	public static void q8(int n){
		int sum = (1+n)*(n/2)+(n%2==0?0:n/2+1);
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		return;
	}
	
	//a와 b사이의 모든 정수의 합
	public static void q9(int a,int b){
		int sum=0;
		
		if (a>b){
			System.out.println("a가 b보다 작아 합을 구할 수 없습니다.");
			return;
		}
		else{
			for (int i=a;i<=b;i++)
				sum+=i;
		}
		System.out.println(a+"부터 "+b+"까지의 합은 "+sum+"입니다.");
		
		return;
			
	}
	
	//b가 a보다 크다면 b-a구하기
	public static void q10(int a,int b){
		
		if(b<a){
			System.out.println("a보다 큰 값을 입력하세요!");
		}else{
			System.out.println("b-a는 "+(b-a)+"입니다.");
		}
		
		return;
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//q6
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값: ");
		q6(sc.nextInt());
		
		//q7
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값: ");
		q7(sc.nextInt());
		
		//q8
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값: ");
		q8(sc.nextInt());
		
		//q9
		System.out.println("a와 b를 포함하여 a부터 b까지의 합을 구합니다.");
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		System.out.print("b의 값: ");
		int b = sc.nextInt();
		q9(a,b);
		
		//q10
		System.out.print("a의 값: ");
		int c = sc.nextInt();
		System.out.print("b의 값: ");
		int d = sc.nextInt();
		q10(c,d);
		
		sc.close();
		
	}
}
