package linkedlist;

public class Node<T> {
	private int data;
	private Node<T> next = null;
	
	public Node(int data, Node<T> next) {
		this.next = next;
		this.data = data;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
}
