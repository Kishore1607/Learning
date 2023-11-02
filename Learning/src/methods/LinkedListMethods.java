package methods;

import CoustomExceptions.ElementNotInArrayException;

public class LinkedListMethods {
	public static void main(String[] args) throws ElementNotInArrayException {
		
		LinkedList list = new LinkedList();
		list.insertAtBegin(0);
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		
		list.printList();
		
		list.insertation(3, 5);
		
		list.printList();
		
		list.delete(5);
		
		list.printList();
	}
}