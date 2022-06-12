import java.util.*;
public class doubleLinkedList900<gnn> {

	private Node head;
	private Node tail;
	private int size;

	public doubleLinkedList900() {
		size = 0;
	}

	private	class Node {
	gnn element;
	Node next;
	Node prev;

	public Node(gnn element, Node next, Node prev) {
	this.element = element;
	this.next = next;
	this.prev = prev;
		}
	}

	public int size() { return size; }


	public boolean isEmpty() { return size == 0; }

	public void addFirst(gnn element)
	{
		Node tmp = new Node(element, head, null);
		if(head != null )
		{
			head.prev = tmp;
		}
		head = tmp;
		if(tail == null)
		{
			tail = tmp;
		}
		size++;
		System.out.println("("+element+")");
	}

	public void addLast(gnn element)
	{

		Node tmp = new Node(element, null, tail);
		if(tail != null)
		{
			tail.next = tmp;
		}
		tail = tmp;
		if(head == null)
		{
			head = tmp;
		}
		size++;
		System.out.println("("+element+")");
	}

	public void iterateForward()
	{

		System.out.println("\nHead -> Tail:");
		Node tmp = head;
		while(tmp != null)
		{
			System.out.print("("+tmp.element+")");
			tmp = tmp.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public void iterateBackward()
	{
		System.out.println("\nTail -> Head:");
		Node tmp = tail;
		System.out.print("null");
		while(tmp != null)
		{
			System.out.print("("+tmp.element+")");
			tmp = tmp.prev;
		}
		System.out.println();
	}

	public gnn removeFirst()
	{
		if (size == 0) throw new NoSuchElementException();
		Node tmp = head;
		head = head.next;
		head.prev = null;
		size--;
		System.out.println("\nData yang dihapus (First)");
		System.out.println("Hapus: "+tmp.element);
		return tmp.element;
	}

	public gnn removeLast()
	{
		if (size == 0) throw new NoSuchElementException();
		Node tmp = tail;
		tail = tail.prev;
		tail.next = null;
		size--;
		System.out.println("\nData yang dihapus (Last)");
		System.out.println("Hapus: "+tmp.element);
		return tmp.element;
	}

	public static void main(String []gnovregi)
	{
		doubleLinkedList900<Integer> wow = new doubleLinkedList900<Integer>();
		System.out.println("Data yang dimasukkan: ");
		wow.addFirst(21);
		wow.addFirst(41);
		wow.addLast(65);
		wow.addLast(99);
		wow.iterateForward();
		wow.removeFirst();
		wow.removeLast();
		wow.iterateBackward();
	}
}