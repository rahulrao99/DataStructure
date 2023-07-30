package com.sunbeam;

public class SinglyLinearListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinearList list = new SinglyLinearList();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addLast(40);
		list.addLast(50);
		//30-20-10-40-50
		//list.delFirst();
		//20-10-40-50
		list.delLast();
		//30-20-10-40
		list.displayList();
		list.delAll();
	}

}
