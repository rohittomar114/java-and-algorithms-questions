package dataStructureImplementionsInJava;

public class FirstCommonNodeOfTwoJoinedLinkedList<T> {
	
	// Node class
	class Node<T>{
		public T data;
		public Node<T> next;
		
		Node(T data){
			
			this.data = data;
		}	
	}
	
	Node<T> head = null;
	Node<T> head2 = null;
	
	public void insert( T value, boolean addTofirstList){
		Node<T> newNode = new Node<T>(value);
		
		if(addTofirstList && newNode != null){
			newNode.next = head;
			head= newNode;
		}
		else if( !addTofirstList && newNode != null && head2 == null){
			newNode.next = head;
			head2= newNode;
		}
		else if(!addTofirstList && newNode != null && head2 != null){
			newNode.next = head2;
			head2 = newNode;
		}
	}
	
	public void firstCommonNode(){
		Node<T> temp1 = head;
		Node<T> temp2 = head2;
		
		int len1 = findLength(head);
		int len2 = findLength(head2);
		int lenDiff = Math.abs(len1-len2);
		
		if(len1>len2){
			while(lenDiff >0 && temp1!=null){
				temp1 = temp1.next;
				lenDiff--;
			}
		}
		else if(len2>len1){
			while(lenDiff >0 && temp2!=null){
				temp2 = temp2.next;
				lenDiff--;
			}	
		}
		
		while(temp1!= null && temp2 != null){
			if(temp1 == temp2){
				System.out.println("common Node value:"+ temp1.data + " && Address: "+ temp1);
				break;
			}else{
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			
			if(temp1==null || temp2 == null){
				System.out.println("No Commom Node Found");
			}
		}
		
	}
	
	public int findLength( Node<T> headNode){
		int size = 0;
		while(headNode != null){
			size++;
			headNode = headNode.next;
		}
		return size;
	}
	
	public void print(Node<T> headNode){
		Node<T> temp =headNode;
		while(temp!= null){
			System.out.print(temp.data +", ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] agrs){
		
		FirstCommonNodeOfTwoJoinedLinkedList<Integer>  cn = new FirstCommonNodeOfTwoJoinedLinkedList<Integer>();
		//first branch
		cn.insert(1,true);cn.insert(2,true);cn.insert(3,true);cn.insert(4,true);
		// second branch
		cn.insert(20,false);cn.insert(21,false);cn.insert(22,false);cn.insert(23,false);
		cn.insert(24,false);cn.insert(5,false);cn.insert(26,false);cn.insert(27,false);
		// first Branch
		cn.insert(5,true);	cn.insert(6,true);
		System.out.println("first list");
		cn.print(cn.head);
		System.out.println("\n second list");
		cn.print(cn.head2);
		System.out.println("\n");
		cn.firstCommonNode();		
	}
	
}
