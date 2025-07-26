package com.test;

class MyCircularQ {

	private int capacity, size, last, first;
	private int queue[];

	MyCircularQ(int length) {
		capacity = length;
		last = first = size =  0;
		queue = new int[length];
	}

	boolean enQueue(int data) {

		if (size >= capacity) {
			System.out.println("Queue is full");
			return false;
		}
		queue[last] = data;
		System.out.println("enQueued "+queue[last]);

		if (last == capacity - 1)
			last = 0;
		else
			last++;

		size++;
		return true;
	}

	boolean deQueue() {
		if (size < 0) {
			System.out.println("Queue is empty");
			return false;
		}
		System.out.println("deQueued "+queue[first]);

		if (first == capacity - 1)
			first = 0;
		else
			first++;

		size--;
		return true;
	}

}

public class CircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCircularQ q = new MyCircularQ(5);
		
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(7);
		q.deQueue();
		q.enQueue(6);
		q.enQueue(7);

	}

}
