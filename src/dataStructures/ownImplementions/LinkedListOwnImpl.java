package dataStructures.ownImplementions;

class Node<T> {
	public T data;
	public Node<T> next;

	Node(T data) {
		this.data = data;
	}
}

public class LinkedListOwnImpl<T> {
	private Node<T> head = null;
	private Node<T> current=null;

	// add at first
	public void addAtFirst(T value) {
		Node<T> newNode = new Node<T>(value);
		newNode.next = head;
		head = newNode;
	}

	// add at End
	public void addAtEnd(T value) {
		Node<T> newNode = new Node<T>(value);
		
		if(head ==null){
			head=newNode;
			current = newNode;			
		}else{
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			current = newNode;
		}	
	}
	// To remove Elements with value
	public void remove(T value){
		Node<T> temp = head;
		Node<T> prev = null;
		Node<T> nextEl = null;
		if(temp!= null && temp.data == value){
			head = temp.next;
			temp = null;
		}
		
		Node<T> secTemp = head; // In case we have to remove same values at 1st position and some later position.
		while(secTemp !=null && secTemp.next != null){
			prev = secTemp;
			nextEl = secTemp.next.next;
			if(secTemp.next.data == value){
				prev.next = nextEl;
			}
			secTemp = prev.next;
		}
	}
	
	// Reverse
	
	public void reverse(){
		Node<T> temp = head;
		Node<T> prev = null;
		Node<T> currEl = head;
		
		while(temp != null ){
				
				currEl = temp.next;
				temp.next = prev;
				prev= temp;
				temp = currEl; 
		}
		
		head = prev;
	}
	
	public void print(){
		Node<T> temp =head;
		while(temp!= null){
			System.out.print(temp.data +", ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListOwnImpl<Integer> glist = new LinkedListOwnImpl<Integer>();
		glist.addAtEnd(11);
		glist.addAtEnd(12);
		glist.addAtEnd(13);
		glist.addAtEnd(14);
		glist.addAtEnd(15);
		glist.print();
		//glist.remove(15);
		glist.reverse();
		System.out.println( "\n" + "-----After Removing/Revesing------");
		glist.print();

	}

}
