package JavaLab;


@SuppressWarnings("unchecked")

class Stack<T>{
	int max=1000;
	int top;
	Object a[];
	
	Stack(){ 
		a = (T[]) new Object[max];
		top=-1;
	}
	
	Boolean isEmpty() {
		return top==-1;
	}
	
	void push(T e) {
		if(top == max-1) increaseStackSize();
		a[++top] = e;
	}
	
	T pop() {
		if(isEmpty()) return null;
		return (T) a[top--];
	}
	
	T peek() {
		if(isEmpty()) return null;
		return (T) a[top];
	}
	
	void display() {
		if(isEmpty()) return;
		for(int i=top;i>=0;i--) System.out.print(a[i]+" ");
		System.out.println();
	}
	
	int length() {
		return top;
	}
	
	void increaseStackSize() { 
		Object b[] = (T[]) new Object[max*2];
		for(int i=0;i<=top;i++) b[i] = a[i];
		a=b;
		max=max*2; 
	}
}

@SuppressWarnings("unchecked")

class Queue<T>{
	Object[] a;
	int max;
	int front,last;
	
	Queue(){
		max=1000;
		a = (T[]) new Object[max];
		front = last = -1;
	}
	
	Boolean isEmpty() {
		return front == -1 || front > last;
	}
	
	Boolean isFull() {
		return last == max-1;
	}
	
	void enqueue(T e) {
		if(isFull()) increaseQueueSize();
		
		
		if(front == -1) front = 0;
		a[++last] = e;
	}
	
	T dequeue() {
		if(isEmpty()) return null;
		return (T) a[front++];
	}
	
	int length() {
		if(isEmpty()) return 0;
		return last - front+1;
	}
	
	void display() {
		if(isEmpty()) return;
		for(int i=front;i<=last;i++) System.out.print(a[i]+ " ");
		System.out.println();
	}
	
	void increaseQueueSize() { 
		Object b[] = (T[]) new Object[max*2];
		for(int i=front;i<=last;i++) b[i] = a[i];
		a=b;
		max=max*2;  
	}
}

public class lab1 {

	public static void main(String[] args) {
//		System.out.println("Stack implementation");
//		Stack<Integer> st = new Stack<Integer>();
//		for(int i=1;i<=10;i++) st.push(i);
//		st.display();
//		System.out.println("Popped element "+st.pop());
//		System.out.println("Peeked element "+st.peek()+"\nLength - "+st.length());
		
//		Stack<String> st = new Stack<String>();
//		for(int i=1;i<1015;i++) st.push(String.valueOf(i));
//		st.display();
//		st.pop();
//		System.out.println(st.peek()+"\tLength- "+st.length());
		System.out.println("Queue implementation");
		Queue<Integer> q = new Queue<Integer>();
		for(int i=1;i<=10;i++) q.enqueue(i);
		q.display();
		System.out.println("Dequeue element "+q.dequeue()+"\nlength-"+q.length());
	}
} 