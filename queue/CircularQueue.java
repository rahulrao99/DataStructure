package com.queue;

public class CircularQueue {

	private int[] arr;
	private int rare,front;
	private int size;
	
	
	public CircularQueue(int size) {
		this.size=size;
		front=rare=-1;
		arr=new int[size];
	}
	
	public boolean isEmpty() {
		return ((front==-1 && rare==-1)|| front>rare);
	}
	
	public boolean isFull() {
		return rare==size-1;
	}
	
	public boolean insert(int data) {
		if(isFull()) {
			return false;
		}
		
		rare=(rare+1)%size;
		arr[rare]=data;
		return true;
	}
	
	public int delete() {
		if(isEmpty()) {
			return -1;
		}
		
		front=(front+1)%size;
		return arr[front];
	}
	
}
