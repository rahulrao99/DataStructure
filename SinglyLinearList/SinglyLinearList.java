package com.sunbeam;

public class SinglyLinearList {
	static class Node{
		private int data;
		private Node next;
		public Node() {
			data = 0;
			next = null;
		}
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	
	public SinglyLinearList() {
		head = null;
	}
	// return true if list is empty
	public boolean isEmpty() {
		return head == null;
	}
	// Add First
	public void addFirst(int value) {
		//1. create node with given data
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty())
			// add newnode into head
			head = newnode;
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into head
			head = newnode;
		}
	}
	
	public void displayList() {
		//1. Create trav and start from head
		Node trav = head;
		System.out.println("Linked List");
		while(trav != null) {
			//2. visit current node(trav.data)
			System.out.println(trav.data);
			//3. go on next node(trav.next)
			trav = trav.next;
		}//4. repeat step 2 and 3 till last node
	}
	
	public void addLast(int value) {
		//1. create node with given data
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty())
			// add newnode into head
			head = newnode;
		//3. if list is not empty
		else {
			//a. traverse till last node
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			/*
			Node trav;
			for(trav = head ; trav.next != null ; trav = trav.next);
			*/
			//b. add newnode into next of last node
			trav.next = newnode;
		}
	}
	
	public void delFirst() {
		//1. if list is empty
		if(isEmpty())
			// do nothing
			return;
		//2. if list is not empty(sinlge node/multiple)
		else
			// move head on second node
			head = head.next;
	}
	
	public void delLast() {
		//1. if list is empty
		if(isEmpty())
			// do nothing
			return;
		//2. if list has single node
		else if (head.next == null)
			// make head equal to null
			head = null;
		//3. if list has multiple nodes
		else {
			//a. traverse till second last node
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			//b. make next of second last node equal to null
			trav.next = null;
		}
	}
	public void delAll() {
		head = null;
		// GC will take care of deleting all the nodes
	}

}











