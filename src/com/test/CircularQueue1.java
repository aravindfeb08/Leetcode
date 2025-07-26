package com.test;
class MyCircularQueue {

	private int head, tail, size, occupied;
	private int queue[];

	public MyCircularQueue(int k) {
		head = tail = occupied = 0;
		size = k;
		queue = new int[k];
	}

	public boolean enQueue(int value) {
		if (!isFull()) {
			if (isEmpty())
				queue[tail] = value;
			else if (tail == size - 1)

				queue[0] = value;
			else
				queue[++tail] = value;

			occupied++;
			return true;
		}

		return false;
	}

	public boolean deQueue() {
		if (!isEmpty()) {
			queue[head] = 0;

			if (head == size - 1)
				head = 0;
			else
				head++;

			occupied--;
			return true;
		}

		return false;
	}

	public int Front() {
		if (queue[head] == 0)
			return -1;

		return queue[head];

	}

	public int Rear() {
		if (queue[tail] == 0)
			return -1;

		return queue[tail];
	}

	public boolean isEmpty() {
		if (occupied == 0)
			return true;

		return false;
	}

	public boolean isFull() {
		if ((occupied == size))
			return true;

		return false;
	}

	public void printQueue() {
		System.out.print("[ ");
		for (int value : queue) {
			System.out.print(value + " ");
		}
		System.out.print("]");
	}

	public void printHeadTail() {
		System.out.println("head = " + head + ", tail = " + tail + ", occupied= " + occupied + ", size= " + size);
	}

	public void print(String operation) {
		System.out.println("Printing ----- " + operation);
		printQueue();
		printHeadTail();
		System.out.println("");
		System.out.println("");
	}
}

public class CircularQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyCircularQueue obj = new MyCircularQueue(k);
//		boolean param_1 = obj.enQueue(value);
//		boolean param_2 = obj.deQueue();
//		int param_3 = obj.Front();
//		int param_4 = obj.Rear();
//		boolean param_5 = obj.isEmpty();
//		boolean param_6 = obj.isFull();

//		MyCircularQueue q = new MyCircularQueue(5);
//		q.print("Init");
//		q.enQueue(1);
//		q.print("Enqueue");
//		q.enQueue(2);
//		q.print("Enqueue");
//		q.enQueue(3);
//		q.print("Enqueue");
//		q.enQueue(4);
//		q.print("Enqueue");
//		q.enQueue(5);
//		q.print("Enqueue");
//		q.enQueue(6);
//		q.print("Enqueue");
//		q.enQueue(7);
//		q.print("Enqueue");
//		q.deQueue();
//		q.print("Dequeue");
//		q.enQueue(6);
//		q.print("Enqueue");
//		q.enQueue(7);
//		q.print("Enqueue");
		
		MyCircularQueue q = new MyCircularQueue(5);
		System.out.print("[");
		System.out.print(q.enQueue(1));
		System.out.print(", ");
		System.out.print(q.enQueue(2));
		System.out.print(", ");
		System.out.print(q.enQueue(3));
		System.out.print(", ");
		System.out.print(q.enQueue(4));
		System.out.print(", ");
		System.out.print(q.enQueue(5));
		System.out.print(", ");
		System.out.print(q.enQueue(6));
		System.out.print(", ");
		System.out.print(q.enQueue(7));
		System.out.print(", ");
		System.out.print(q.deQueue());
		System.out.print(", ");
		System.out.print(q.enQueue(6));
		System.out.print(", ");
		System.out.print(q.enQueue(7));
		System.out.print("]");

	}

}
