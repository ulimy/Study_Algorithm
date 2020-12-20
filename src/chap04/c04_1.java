package chap04;

public class c04_1 {
	
	/*
	 스택
	 선입선출(FIFO)
	 
	push() : 데이터를 집어 넣음
	pop() : 데이터를 꺼냄
	peek() : 데이터를 꺼내지는 않고 조회만 함
	indexOf() : 특정한 데이터가 포함되어있는지, 그렇다면 어디에 있는지 조회
	clear() : 데이터 전체 삭제
	capacity() : 용량 확인 (max값)
	size() : 현재 스택에 들어있는 데이터 수 반환 (ptr값)
	IsEmpty() : 스택이 비어있는지 확인
	IsFull(): 스택이 가득 차있는지 확인
	dump() : 스택 안의 모든 데이터 확인
	top : push,pop이 일어나는 꼭대기
	bottom : 스택의 가장 아래 부분
	 
	 */
	
	private int max=10; //스택의 용량
	private int ptr=0; // 스택의 포인터 비어있는 경우 0
	private int[] stk = new int[10]; //스택
	
	//push
	public int push(int x) throws OverflowIntStackException {
		// 스택이 꽉  차있는데 push하려 한다면 예외 발생
		if (ptr==max){ throw new OverflowIntStackException(); }
		return stk[ptr++]=x;
	}
	
	//pop
	public int pop() throws EmptyIntStackException {
		// 스택이 비어있는데 pop하려 한다면 예외 발생
		if(ptr==0) { throw new EmptyIntStackException(); }
		return stk[--ptr]; // 배열의 인덱스는 0부터 시작하므로 --ptr
	}
	
	//peek
	public int peek() throws EmptyIntStackException{
		// 스택이 비어있는데 pop하려 한다면 예외 발생
		if(ptr==0) { throw new EmptyIntStackException(); }
		return stk[ptr-1];
	}
	
	//indexOf
	public int IndexOf(int x){
		for (int i=ptr-1;i>=0;i--){ //top에서부터 탐색 시작
			if (stk[i]==x){ return i; } //탐색성공
		}
		return -1; //탐색실패
	}
	
	//clear
	public void clear(){
		ptr=0;
		return; // 굳이 모든 값을 0으로 바꿀 필요 없음. ptr만 0으로 바꾸면 스택이 비워진 것.
	}
	
	//size
	public int size(){
		return ptr;
	}
	
	//capacity
	public int capacity(){
		return max;
	}
	
	//isEmpty
	public boolean isEmpty(){
		return ptr==0;
	}
	
	//isFull
	public boolean isFull(){
		return ptr==max;
	}
	
	//dump
	public void dump(){
		if(ptr==0){System.out.println("스택이 비어있습니다");}
		else{
			for (int i=0;i<ptr;i++){ //bottom부터 top으로 출력
				System.out.print(stk[i]+" ");
			}
		}
		System.out.println();
	}
	
	// 스택이 비어있을 경우 발생 할 예외
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException(){}
	}
	
	// 스택이 가득  차있을 경우 발생 할 예외
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException(){}
	}

	public static void main(String[] args) {
		c04_1 stack = new c04_1();
		System.out.println(stack.push(5)+"를 push");
		System.out.println(stack.push(3)+"를 push");
		System.out.println(stack.push(7)+"를 push");
		System.out.print("스택의 들어있는 데이터 출력 : ");
		stack.dump();
		System.out.println("pop : "+stack.pop());
		System.out.println("3의 위치 확인 : "+stack.IndexOf(3));
		System.out.println("7의 위치 확인 : "+stack.IndexOf(7));
		System.out.println("top 엿보기 : "+stack.peek());
		System.out.println("스택 비우기");
		stack.clear();
		System.out.println("들어있는 데이터 수 : "+stack.size());
		System.out.println("스택의 용량  : "+stack.capacity());
		System.out.println("스택이 비어있는지 검사 : "+stack.isEmpty());
		System.out.println("스택이 가득 차 있는지 검사 : "+stack.isFull());
		return;
	}

}
