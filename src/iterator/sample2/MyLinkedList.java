package iterator.sample2;

public class MyLinkedList<E> implements MyCollection<E>{
	private Node head;
	private Node tail;
	private int size;
	public MyLinkedList() {
	}
	public int size() {
		return size;
	}
	public void add(E e ) {
		if(head == null) {
			head = new Node(e,tail);
			tail = head;
		}else {
			Node node = new Node(e,null);
			tail.next = node;
			tail  = node;
		}
		size++;
	}	
	public E get() {
		return tail.value;
	}
	@Override
	public void print() {
		Node node = head;
		System.out.print("[");
		while(node != null) {
			System.out.print(node.value);
			if(node.next == null) {
				System.out.println("]");
			}else {
				System.out.print(",");
			}
			node = node.next;
		}
	}
	
	class Node{
		E value;
		Node next;
		public Node(E value, MyLinkedList<E>.Node next) {
			super();
			this.value = value;
			this.next = next;
		}
		public E getValue() {
			return value;
		}
		public void setValue(E value) {
			this.value = value;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}

	@Override
	public MyIterator<E> iterator() {
		return new MyIterator() {
			Node node = head;
			@Override
			public E next() {
				if(hasNext()) {
					E e =  node.value;
					node = node.next;
					return e;
				}
				return null;
			}

			@Override
			public boolean hasNext() {
				return node != null;
			}

			@Override
			public E remove() {
				return null;
			}
		};
	}
}

