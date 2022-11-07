package Day5;

public class Stack {
	
	int Stack[] = new int[5];
	int top=0;
	
	public void push(int data) {
		if(top==5) {
			System.out.println("Stack is full");
		}else {
		
		Stack[top]=data;
		top++;
		}
	}
	
	public int pop() {
		int data;
		top--;
		data = Stack[top];
		return Stack[top]=0;
	}
	public int peek() {
		int data;
		
		data = Stack[top-1];
		return data;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	
	public void show() {
		for(int n:Stack) {
			System.out.println(n + " ");
		}
	}
	

}
