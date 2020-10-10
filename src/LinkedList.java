
class Node{
	int data;
	Node next;
}

class Linked{
	Node head;
	void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}else {
			Node n = head;
			while(n.next != null) {
				n = n.next; // till it not find any null value, go to next node everytime
			}
			n.next = node; // once it found the null then it assign the node value
		}
	}
	void show() {
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	// insert element at the beginning/ Front
	void insertFront(int data) {
		//get data form main and check if head is null or not if null then insert into head and 
		//assign as head node
		Node node = new Node();
		node.data = data;
		
		if(head == null) {
			head = node;
		}else {
			node.next = head;
			head = node;
		}
	}
	// insert at the end
	void insertEnd(int data) {
		// First check if head is null ot not of null then insert of not then
		// iterate till last node then add it
		Node node = new Node();
		node.data = data;
		node.next = null;
		 if(head == null) {
			 head = node;
		 }else {
			 Node nod = head;
			 while(nod.next != null) {
				 nod = nod.next;
			 }
			 nod.next = node;
		 }
	}
	// insert element at any given position
	void insertAnyPoint(int data, int position) {// position = 2
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node n = head;
		int pos =0;
		while(n.next != null) {
			if(position == 0) {
				insertFront(data);
				break;
			}
			else if(pos == position) {
				Node temp = n.next;
				
				n.next = node;
				node.next = temp;
				
				break;
			}
			pos+=1;
		}
		
	}
	// delete last node 
	void deleteLastNode() {
		
		Node node = head;
		while(node.next.next != null) {
			//System.out.println(node.data);
			
			node = node.next ;
			
		}
		
			node.next = null;
			
		
		
	}
}
public class LinkedList {
	public static void main(String[] args) {
		Linked list = new Linked();
		list.insert(12);
		list.insert(13);
		list.insert(14);
		list.insert(15);
		list.insert(16);
		list.insert(17);
		list.insertFront(2);
		list.insertFront(1);
		list.insertEnd(100);
		list.insertAnyPoint(9, 2);
		list.insertAnyPoint(90, 3);
		list.deleteLastNode();
		list.show();
	}
}
