package iterator.sample2;

public class MyArrayList<E> implements MyCollection<E> {
	private Object[] value;
	private int size;
	private int index = 0;
	
	public MyArrayList(int size) {
		this.size = size;
		value = new Object[size];
	}
	public MyArrayList() {
		this(5);
	}
	public int size() {
		return size;
	}
	private void expand() {
		Object [] newValue = new Object[2*size];
		System.arraycopy(value, 0, newValue, 0, value.length);
		this.value = newValue;
		this.size = 2*size;
	}
	public void add(E e) {
		if(index >= size-1) {
			expand();
		}
		value[index++] = e;
	}
	
	public E get(int index) {
		return (E)value[index];
	}
	public void print() {
		System.out.print("[");
		for (int i = 0; i < index; i++) {
			System.out.print(value[i]+(i == index-1 ? "]\r\n":","));
		}
	}
	@Override
	public MyIterator<E> iterator() {
		return new MyIterator<E>() {
			int ptr = 0;
			public E next() {
				if(hasNext())
					return (E) value[ptr++];
				return null;
			}
			public boolean hasNext() {
				return ptr < index ;
			}
			public E remove() {
				E t = null;
				if(ptr >= 1) {
					t = (E) value[--ptr];
					value[ptr] = null;
				}
				return t;	
			}
		};
	}
}

