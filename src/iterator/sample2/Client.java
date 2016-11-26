package iterator.sample2;

public class Client {
	public static void main(String[] args) {
		MyCollection<Integer> arrayList = new MyArrayList<>();
		for(int i = 0 ; i < 20; ++i){
			arrayList.add(i);
		}
		traverseCollection(arrayList.iterator());
		
		MyCollection<Integer> linkedList = new MyLinkedList<>();
		for(int i = 19 ; i >= 0; --i){
			linkedList.add(i);
		}
		traverseCollection(linkedList.iterator());
		
	}
	
	public static void traverseCollection(MyIterator<?> iterator){
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}
}
