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
	
	//입력된 양의 정수의 자릿수 구하기
	public static void q11(int num){
		
		int sum=0;
		
		if(num<=0){
			System.out.println("양의 정수를 입력하세요!");
			return;
		}else{
			
			while(num>0){
				sum++;
				num/=10;
			}
			System.out.println("그 수는 "+sum+"자리입니다.");
			return;
		}
		
	}
	
	//곱셈 표 출력하기
	public static void q12(){
		
		System.out.print("    |");
		for (int i=1;i<10;i++){
			System.out.printf("%3d",i);
		}
		System.out.println("\n---+------------------------------");
		
		for(int j=1;j<10;j++){
			System.out.printf("%2d  | ",j);
			for (int k=1;k<10;k++){
				System.out.printf("%2d ",(j*k));
			}
			System.out.println();
		}
		return;
	}
	
	//덧셈 표 출력하기
	public static void q13(){
		
		System.out.print("   |");
		for (int i=1;i<10;i++){
			System.out.printf("%3d",i);
		}
		System.out.println("\n---+-----------------------------");
		
		for (int j=1;j<10;j++){
			System.out.printf("%2d | ",j);
			for (int k=1;k<10;k++){
				System.out.printf("%2d ",j+k);
			}
			System.out.println();
		}
		return;
	}
	
	//정사각형 출력하기
	public static void q14(int num){
		
		for (int i=0;i<num;i++){
			for (int j=0;j<num;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		return;
	}
	
	//직각 이등변 삼각형 출력하기
	public static void q15(int num){
		
		int i,j=0;
		
		//왼쪽 아래가 직각
		System.out.println("\n왼쪽 아래가 직각인 직각 이등변 삼각형");
		for (i=0;i<num;i++){
			for (j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//왼쪽 위가 직각
		System.out.println("\n왼쪽 위가 직각인 직각 이등변 삼각형");
		for (i=0;i<num;i++){
			for(j=num;j>i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//오른쪽 아래가 직각
		System.out.println("\n오른쪽 아래가 직각인 직각 이등변 삼각형");
		for (i=0;i<num;i++){
			for(j=num;j>i+1;j--){
				System.out.print(" ");
			}
			for(j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//오른쪽 위가 직각
		System.out.println("\n오른쪽 위가 직각인 직각 이등변 삼각형");
		for (i=0;i<num;i++){
			for(j=0;j<i;j++){
				System.out.print(" ");
			}
			for(j=0;j<num-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		return;
		
	}
	
	//피라미드 출력하기
	public static void q16(int num){
		int i,j=0;
		
		System.out.println();
		for(i=0;i<num;i++){
			for (j=0;j<num-i;j++){
				System.out.print(" ");
			}
			for (j=0;j<i*2+1;j++){
				System.out.print("*");
			}
			for (j=0;j<num-i;j++){
				System.out.print(" ");
			}
			System.out.println();
		}
		
		return;
	}
	
	//숫자 피라미드 출력하기
	public static void q17(int num){
		int i,j = 0;
		
		System.out.println();
		for (i=1;i<=num;i++){
			for (j=0;j<num-i;j++){
				System.out.print(" ");
			}
			for (j=0;j<i*2-1;j++){
				System.out.print(i);
			}
			System.out.println();
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
		
		//q11
		System.out.print("양의 정수: ");
		int num = sc.nextInt();
		q11(num);
		
		//q12
		q12();
		
		//q13
		q13();
		
		//q14
		System.out.print("정수: ");
		int num2 = sc.nextInt();
		q14(num2);
		
		//q15
		System.out.print("정수: ");
		int num3 = sc.nextInt();
		q15(num3);
		
		//q16
		System.out.print("양의 정수: ");
		int num4 = sc.nextInt();
		q16(num4);
		
		//q17
		System.out.print("양의 정수: ");
		int num5 = sc.nextInt();
		q17(num5);
		
		sc.close();
		
	}
}
