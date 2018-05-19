package dataStructures.ownImplementions;

public class StackOwnImp<T> {
	// internal class to avoid duplicte classes in same pakage
	class Node<T>{
		  public T data;
		  public Node<T> next;
		  
		  Node(T data){
			  this.data =data;
		  }	  
		}
	// End of Node Class
	
	
  private Node<T> head=null;
  
  private void push(T value){
	  Node<T> newNode = new Node<T>(value);
	  if(value != null){
		  newNode.next = head;
		  head = newNode;
	  }
  }
  
  private void pop(){
	  Node<T> temp = head;
	  if(temp != null){
		 head = temp.next;
		 temp = null;
	  }  
  }
  
  private void print(){
	  Node<T> temp = head;
	  while(temp != null){
		  System.out.print(" "+ temp.data + " , ");
		  temp = temp.next;
		  
	  }
  }
  
  public static void main(String[] agrs){
	  StackOwnImp<Integer> stk = new StackOwnImp<Integer>();
	  stk.push(1);stk.push(2);stk.push(3);stk.push(4);stk.push(5); // pushed 5 elements
	  System.out.println(" Print all values");
	  stk.print();
	  stk.pop();stk.pop(); // poped 2 elements
	  System.out.println(" \n Print after poping two elements");
	  stk.print();
	  stk.push(7);// pushed one elememt
	  System.out.println("\n Print after pushing 7 values");
	  stk.print();
  }
  
}


