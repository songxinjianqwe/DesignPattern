package iterator.sample1.iterators;

import java.util.ArrayList;

import iterator.sample1.MenuItem;

public class ArrayListIterator implements Iterator {
	ArrayList<MenuItem> items;
	int position = 0;

	public ArrayListIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	public Object next() {
		Object object = items.get(position);
		position = position + 1;
		return object;
	}

	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}
