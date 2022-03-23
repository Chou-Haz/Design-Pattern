import java.util.Iterator;

public class NullIterator implements Iterator {

	public Object next() {
		return null;
	}

	public boolean next() {
		return false;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}