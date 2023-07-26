package com.queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue q=new Queue(5);
		
		System.out.println(q.insert(10));
		System.out.println(q.insert(20));
		System.out.println(q.insert(30));
		System.out.println(q.insert(40));
		//System.out.println(q.insert(50));

		System.out.println(q.delete());
		System.out.println(q.delete());

			
		CircularQueue q1=new CircularQueue(5);
		
		System.out.println(q1.insert(10));
		System.out.println(q1.insert(20));
		System.out.println(q1.insert(30));
		System.out.println(q1.insert(40));
	System.out.println(q1.insert(50));
	//	System.out.println(q1.insert(60));

		
		System.out.println(q1.delete());
		System.out.println(q1.delete());


	}
	
}
