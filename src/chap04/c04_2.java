package chap04;

public class c04_2 {
	
	/*
	 큐
	 선입선출(FIFO)
	 
	 enqueue() : 데이터 추가
	 dequeue() : 데이터 꺼냄
	 rear : 데이터를 넣는 쪽
	 front : 데이터를 꺼내는 쪽
	 
	 링 버퍼로 큐 만들기 : 배열의 처음과 끝이 연결되어있어 배열요소를 앞 쪽으로 옮길 필요 없어짐
	 
	 */

	private int max=10; //큐의 용량
	private int num = 0; // 현재 데이터 수
	private int rear=0; //넣는 쪽
	private int front=0; // 꺼내는 쪽
	private int[] que = new int[10]; //큐
	
	//enqueue
	public int enqueue(int x) throws OverflowIntQueueException {
		if(num==max){ throw new OverflowIntQueueException(); } // 가득 찼는데 enqueue하려 함
		else{
			que[rear++]=x;
			num++;
			if(rear==max) {rear=0;} //링 형태를 유지하기 위해 max에 도달하면 0으로 바꿔줌
		}
		return x;
	}
	
	//dequeue
	public int dequeue() throws EmptyIntQueueException{
		if(num==0){throw new EmptyIntQueueException(); } //비어있는데 dequeue하려 함
		int x = que[front++];
		num--;
		if(front==max) {front=0;} // 링 형태를 유지하기 위해 max 도달하면 0으로 바꿔줌 
		return x;
	}
	
	//peek
	public int peek() throws EmptyIntQueueException{
		if(num==0){throw new EmptyIntQueueException(); } //비어있는데 peek하려 함
		return que[front];
	}
	
	//indexOf
	public int IndexOf(int x){
		for (int i=0;i<num;i++){ //num만큼 반복
			int idx = (i+front)%max; // 링 버퍼 형태를 검색하기 위해 max보다 크다면 나머지값으로
			if(que[idx]==x){return idx;}
		}
		return -1;
	}
	
	//clear
	public void clear(){
		num=front=rear=0;
		return; // 굳이 모든 값을 0으로 바꿀 필요 없음. num,front,rear만 0으로 바꾸면 비워진 것.
	}
	
	//size
	public int size(){
		return num;
	}
	
	//capacity
	public int capacity(){
		return max;
	}
	
	//isEmpty
	public boolean isEmpty(){
		return num==0;
	}
	
	//isFull
	public boolean isFull(){
		return num==max;
	}
	
	//dump
	public void dump(){
		if(num==0){System.out.println("큐가 비어있습니다");}
		else{
			for (int i=0;i<num;i++){ //front부터 rear 순서대로 출력
				int idx = (i+front)%max;
				System.out.print(que[idx]+" ");
			}
		}
		System.out.println();
	}
	
	// 큐가 비어있을 경우 발생 할 예외
  	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException(){}
	}
	
	// 큐가 가득  차있을 경우 발생 할 예외
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException(){}
	}
	
	public static void main(String[] args) {
		c04_2 queue = new c04_2();
		System.out.println(queue.enqueue(3)+"을 enqueue");
		System.out.println(queue.enqueue(5)+"을 enqueue");
		System.out.println(queue.enqueue(7)+"을 enqueue");
		System.out.print("큐의 들어있는 데이터 출력 : ");
		queue.dump();
		System.out.println("dequeue : "+queue.dequeue());
		System.out.println("3의 위치 확인 : "+queue.IndexOf(3));
		System.out.println("7의 위치 확인 : "+queue.IndexOf(7));
		System.out.println("front 엿보기 : "+queue.peek());
		System.out.println("큐 비우기");
		queue.clear();
		System.out.println("들어있는 데이터 수 : "+queue.size());
		System.out.println("큐의 용량  : "+queue.capacity());
		System.out.println("큐가 비어있는지 검사 : "+queue.isEmpty());
		System.out.println("큐가 가득 차 있는지 검사 : "+queue.isFull());
		return;
	}

}
