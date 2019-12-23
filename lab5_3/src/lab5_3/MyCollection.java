package lab5_3;

import java.util.Collection;

public interface MyCollection {
	int size();
	void add(Object e);
	void setSize(int size);
	boolean isEmpty();
	boolean removeElement(Object e);
	boolean removeAll(Collection c);
	void setElementAt(Object e, int i);
}
