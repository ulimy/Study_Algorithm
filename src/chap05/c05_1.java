package chap05;

public class c05_1 {
	
	//재귀함수를 이용하여 유클리드 호제법으로 최대 공약수 구하기
	
	static int gcd(int x, int y){
		if(y==0){
			return x;
		}else{
			return gcd(y,x%y);
		}
	}
	
	public static void main(String args[]){
		System.out.println("22과 8의 최대 공약수는 "+gcd(22,8)+"입니다.");
	}

}
