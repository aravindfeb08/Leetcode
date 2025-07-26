package com.test;
class MyQueue {

	private int size;
	private int pFront;
	private int pStart = 0;
	private int queue[];

	MyQueue(int size) {
		this.queue = new int[size];
		this.size = size;
	}

	public boolean enQueue(int value) {
		if (pStart < size) {
			queue[pStart] = value;
			System.out.println("enQueue: " + queue[pStart]);
			pStart++;
			return true;
		}
		return false;
	}

	public boolean deQueue() {
		if (pFront <= pStart) {
			System.out.println("deQueue: " + queue[pFront]);
			pFront++;
		}

		return false;
	}

	public boolean isEmpty() {
		if (pStart == size) {
			System.out.println("queue is full");
			return true;
		}

		return false;
	}

}

public class QueueOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueue q = new MyQueue(5);
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.isEmpty();
		q.deQueue();
		q.enQueue(6);

		// java.util.Queue<E>

	}

}
