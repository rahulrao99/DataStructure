package com.queue;

public class Queue {
		private int rare,front;
		private int size;
		private int[] arr;
		
		public Queue(int size) {
			
			this.size = size;
			arr = new int[size];
			front=rare=-1;
			
		}
		
		public boolean isEmpty() {
			return ((front==-1 && rare==-1) || front>rare);
		}
		
		public boolean isFull() {
			return front==size-1; 
		}
		
		public boolean insert(int data) {
			if(isFull()) {
				return false;
			}
			
			arr[++rare]=data;
			if(front==-1) {
				front=0;
			}
			return true;
		}
		
		public int delete() {
			if(isEmpty()) {
				return -1;
			}
			
			return  arr[front ++];
		}

		public int[] getArr() {
			return arr;
		}

		public void setArr(int[] arr) {
			this.arr = arr;
		}
		
	
	

			
		
		
		
}
