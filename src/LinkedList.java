
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
	// delete first node from linkedlist
	void deleteFirstNode() {
		Node node = head;
		
		if(node != null) {
			Node temp = node.next;
			head = temp;
		}
		
	}
	// delete element at given position
	void deleteNodeAtPosition(int position) {
		Node node = head;
		int pos = 0;
	if(position < 0) {
		System.out.println("Not a valid position. try again");
	}
	
		while(node.next != null) {
			//System.out.println(node.data);
			if(pos == position) {
				node.next = node.next.next ;
			}
			node = node.next;
			pos += 1;
		}
	}
	// Get size of list | Length of Linked List
	int getSize() {
		int size =0;
		Node node = head;
		while(node.next!= null) {
			node = node.next;
			size+=1;
		}
		return size;
		
	}
	// Search node in Linked List
	boolean searchNode(int data) {
		Node node = head;
		while(node.next != null) {
			if(node.data == data) { 
				return true;
			}
			node = node.next;
		}
		return false;
		
	}
	// Rotate the Linked List in clock-wise by k nodes
	void rotateLinkedList(int no) {
		// get size of the linkedlist 
		int size = getSize();
		Node node = head;
		int pos =0;
		Node temp = null;
		while(node.next != null) {
			if(pos == size - no) {
				temp = node.next;
				node.next = null;
				break;
			}
			node = node.next;
			pos+=1;
		}
		Node in = head;
		head = temp;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = in;
	}
	//Rotate the Linked List in Anticlock-wise by k nodes
	void rotateAntiClockWise(int k) {
		if (k == 0) 
            return; 
  
        // Let us understand the below code for example k = 4 
        // and list = 10->20->30->40->50->60. 
        Node current = head; 
  
        // current will either point to kth or NULL after this 
        // loop. current will point to node 40 in the above example 
        int count = 1; 
        while (count < k && current != null) { 
            current = current.next; 
            count++; 
        } 
  
        // If current is NULL, k is greater than or equal to count 
        // of nodes in linked list. Don't change the list in this case 
        if (current == null) 
            return; 
  
        // current points to kth node. Store it in a variable. 
        // kthNode points to node 40 in the above example 
        Node kthNode = current; 
  
        // current will point to last node after this loop 
        // current will point to node 60 in the above example 
        while (current.next != null) 
            current = current.next; 
  
        // Change next of last node to previous head 
        // Next of 60 is now changed to node 10 
  
        current.next = head; 
  
        // Change head to (k+1)th node 
        // head is now changed to node 50 
        head = kthNode.next; 
  
        // change next of kth node to null 
        kthNode.next = null; 
		
		
	}
	
	// Reverse linkedlist
	void reverseLinkedList() {
		Node node = head;
		Node prev = null;
		Node next = null;
	  /*1
		9
		2
		12
		13
		14
		15
		16
		17
		100
		*/
		while(node != null) {
			next = node.next; 
			node.next = prev;
			prev = node;
			node = next;
		}
		head = prev;
	}
	// Get the middle of the node
	void middleNode() {
		int size = getSize();
		int middle = (int) Math.floor(size/2);
		int pos = 0;
		Node node = head;
		while(node.next != null) {
			if(middle == pos) {
				System.out.println("middle node is: "+node.data);
			}pos+=1;
			node = node.next;
		}
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
		//list.insertAnyPoint(90, 3);
		//list.deleteLastNode();
//		list.deleteFirstNode();
//		list.deleteNodeAtPosition(8);
		System.out.println("size of linkedlist: "+list.getSize());
		System.out.println("Is data found: "+list.searchNode(16));
		//list.rotateLinkedList(3);
		//list.rotateAntiClockWise(2);
		//list.reverseLinkedList();
		//list.reverseLinkedList();
		list.middleNode();
		list.show();
	}
}
