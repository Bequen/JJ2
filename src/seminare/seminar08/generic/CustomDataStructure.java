package seminare.seminar08.generic;

import java.util.Iterator;

class CustomDataStructure<T> implements Iterable<T> {

    // code for data structure
    public Iterator<T> iterator() {
        return new CustomIterator<>(this);
    }
}
class CustomIterator<T> implements Iterator<T> {

    // constructor
    CustomIterator(CustomDataStructure<T> obj) {
        // initialize cursor
    }

    // Checks if the next element exists
    public boolean hasNext() {
        return false;
    }

    // moves the cursor/iterator to next element
    public T next() {
        return null;
    }

    // Used to remove an element. Implement only if needed
    public void remove() {
        // Default throws UnsupportedOperationException.
    }
}
