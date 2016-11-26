package iterator.sample2;

public interface MyCollection<E> {
	public void add(E e);
	public int size();
	public void print();
	public MyIterator<E> iterator() ;
}
