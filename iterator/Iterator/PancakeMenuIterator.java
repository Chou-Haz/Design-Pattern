import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {
	ArrayList<MenuItem> items;
	int position = 0;

	public PancakeMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	public Object next() {
		Object item = items.get(position);
		position++;
		return item;
	}

	public boolean hasNext() {
		if(position >= items.size()) {
			return false;
		}
		else {
			return true;
		}
	}
}