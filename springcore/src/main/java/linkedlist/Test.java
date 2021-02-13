package linkedlist;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list = new SinglyLinkedList();
		list.addFirst(1);
		for (int i = 0; i < 20; i++) {
			list.addLast(i);
			
		}
		list.displayList();
		
	}

	public static <T> int listLength(Node<T> n) {
		int c = 0;
		Node<T> currentNode = n;
		while(currentNode != null) {
			c++;
			currentNode = currentNode.getNext();
			
		}
		
		return c;
	}
	
	
	
}
