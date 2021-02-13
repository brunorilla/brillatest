package linkedlist;

public class SinglyLinkedList {
	private Node first;
	
	SinglyLinkedList(){
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	
	
	
	public void addFirst(int data) {
		Node n = new Node();
		n.setData(data);
		n.setNext(first);
		first = n;
	}
	
	public Node removeFirst() {
		Node temp = this.first;
		first = first.getNext();
		return temp;
	}
	
	public void displayList() {
		System.out.println("From first to last");
		Node current = first;
		int counter = 1;
		while(current != null) {
			System.out.println("Element n°"+counter+" "+current.getData());
			current = current.getNext();
			counter++;
		}
		
	}
	
	
	public void addLast(int data) {
		Node current = first;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		Node n = new Node(data, null);
		current.setNext(n);
		
	}
	
}
