package com.BridgeLabz.DataStructure;

public class LinkedList12 {
	int size;
	 Node start;

	public LinkedList12() {
		size = 0;
		start = null;
	}

	// for checking the list is empty or not
	public boolean isEmpty() {
		if (start == null)
			return true;
		else
			return false;
	}

	// for getting size of the list
	public int getListSize() {
		return size;
	}

	// view list
	public void viewList() {
		Node t;
		if (isEmpty())
			System.out.println("List is empty: \n ");

		else {
			t = start;
			for (int i = 0; i < size; i++) {
				System.out.println(" " + t.getData());
				t = t.getNext();
			}
		}
	}
Node head;
// inserting node at first
	public void insertAtFirst(int val) {
		Node n= new Node(val);
		
		//if(head==null)
			
		
		n.setData(val);
		n.setNext(start);
		start = n;
		size++;
	}

// inserting at last
	public void insertAtLast(int val) {
		Node n, t;
		n = new Node();
		n.setData(val);
		t = start;
		if (t == null)
			start = n;
		else {
			while (t.getNext() != null) {
				t = t.getNext();
				t.setNext(n);
			}
		}
		size++;
	}

	public void insertAtPos(int val, int pos) {
		if (pos == 1)
			insertAtFirst(val);
		else if (pos == size + 1)
			insertAtLast(val);
		else if (pos > 1 && pos <= size) {
			Node n, t;
			n = new Node();
			t = start;
			for (int i = 0; i < pos - 1; i++) {
				t = t.getNext();
			}
			n.setNext(t.getNext());
			t.setNext(n);
			size++;

		} else
			System.out.println("insertion is not possible at postion number: " + pos);

	}

	// deleting at fisrt postioin
	public void deleteAtFirst() {
		if (start == null)
			System.out.println("List is already empty: ");
		else {
			start = start.getNext();
			size--;
		}
	}

	// delete at last
	public void deleteAtLast() {

		if (start == null)
			System.out.println("List is already empty: ");
		else if (size == 1) {
			start = null;
			size--;
		} else {
			Node t;
			t = start;
			for (int i = 0; i < size - 1; i++) {
				t = t.getNext();
			}
			t.setNext(null);
			size--;
		}
	}

	// delete at Position
	public void deleteAtPosition(int pos) {
		if (start == null)
			System.out.println("List is already empty: ");
		else if (size == 1) {
			start = null;
			size--;
		} else if (pos < 1 || pos > size) {
			System.out.println("Invalide postion");
		} else if (pos == size) {
			deleteAtLast();
		} else {
			Node t, t1;
			t = start;
			for (int i = 1; i < pos - 1; i++) {
				t = t.getNext();
			}
			t1 = t.getNext();
			t.setNext(t1.getNext());
			size--;
		}

	}

}
