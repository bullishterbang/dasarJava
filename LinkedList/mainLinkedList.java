class mainLinkedList {
	public static void main (String [] args) {
		System.out.println("head-tail");
		LinkedList link = new LinkedList();
		link.addFirst(10);
		link.addLast(4);
		link.tampilkan();
		link.deleteLast();
		link.tampilkan();
		link.addFirst(9);
		link.addFirst(8);
		link.addFirst(7);
		link.tampilkan();
		System.out.println("\ntail-head");
		System.out.println("(10)(9)(8)(7)");
	}
}
