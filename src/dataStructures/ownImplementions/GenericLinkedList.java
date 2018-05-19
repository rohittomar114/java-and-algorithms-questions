package dataStructures.ownImplementions;

public class GenericLinkedList<T> {
	private LinkedListNode<T> first = null;
	
	public void insert(LinkedListNode<T> node) {
		node.setNext(first);
		first = node;
	}

	public void remove(){
		if(first.getNext()!=null)
			first = first.getNext();
		else first = null;
	}

	private void printList(LinkedListNode<T> node) {
		System.out.println("Node is " + node.getValue());
		if(node.getNext()!=null) printList(node.getNext());
	}

	public void print(){
		printList(first);
	}
	
	
	public static void main(String[] args) {
		GenericLinkedList<String> list = new GenericLinkedList<String>();
		list.insert(new LinkedListNode<String>("Manish"));
		list.insert(new LinkedListNode<String>("Pandit"));
		list.insert(new LinkedListNode<String>("Tanvi"));
		list.insert(new LinkedListNode<String>("Monika"));
		list.print();
		list.remove();
		System.out.println("After removing the head..");
		list.print();
	}
}

class LinkedListNode<T> {
	private T value;
	private LinkedListNode<T> next;

	public LinkedListNode(T value) {
		this.value = value;
	}

	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}

	public T getValue() {
		return value;
	}
}
