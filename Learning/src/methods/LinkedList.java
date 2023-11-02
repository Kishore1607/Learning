package methods;

import CoustomExceptions.ElementNotInArrayException;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	Node head;

	LinkedList() {
		this.head = null;
	}

	void insertAtBegin(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		return;

	}

	void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public void insertation(int data, int insert) throws ElementNotInArrayException {
		Node newNode = new Node(insert);
		Node current = head;
		while (current != null && current.data != data) {
			current = current.next;
		}
		if (current == null) {
			throw new ElementNotInArrayException("Node with data " + data + " not found in the list.");
		} else {
			Node temp = current.next;
			current.next = newNode;
			newNode.next = temp;
		}
	}

	public void delete(int data) throws ElementNotInArrayException {
		if (head == null) {
			return;
		}
		if (head.data == data) {
			head = head.next;
			return;
		}

		Node current = head;
		while (current.next != null && current.next.data != data) {
			current = current.next;
		}

		if (current.next != null) {
			current.next = current.next.next;
		}else {
			throw new ElementNotInArrayException("Node with data " + data + " not found in the list.");
		}
	}
}
