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
		
	}
	
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//q6
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값: ");
		q6(sc.nextInt());
		
		sc.close();
		
	}
}
