package seminare.seminar08;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Set<T extends Number> implements Iterable<T>, Comparable<Set<T>> {
    public int count() {
        Set.Node current = root;
        int result = 0;
        while(current != null) {
            result++;
            current = current.getNext();
        }
        return result;
    }

    /**
     * Compares to other list, must have same values
     * @param t
     * @return
     */
    @Override
    public int compareTo(Set<T> t) {
        int size = count();
        if(size > t.count())
            return 1;
        else if(size < t.count())
            return -1;

        Node<T> a = t.root;
        Node<T> b = root;
        for(int i = 0; i < size; i++) {
            if(a.getValue() != b.getValue()) {
                return 1;
            }

            a = a.getNext();
            b = b.getNext();
        }

        return 0;
    }

    /**
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        return new SetIterator(this);
    }

    private class SetIterator implements Iterator<T> {
        private Node<T> current;
        private Node<T> root;
        private Node<T> prev;

        public SetIterator(Set<T> list) {
            current = list.root;
            root = list.root;
            prev = null;
        }

        /**
         * @return if there is at least one more value next
         */
        @Override
        public boolean hasNext() {
            return current.getNext() != null;
        }

        /**
         * moves cursor and returns new value
         * @return next value
         */
        @Override
        public T next() {
            prev = current;
            current = current.getNext();
            return current.getValue();
        }

        /**
         *
         */
        @Override
        public void remove() {
            if(prev != null) {
                prev.setNext(current.getNext());
            } else {
                root = current.getNext();
            }
        }
    }

    /**
     * Class represents item in LinkedList
     */
    private class Node<T> {
        /**
         * Node value
         */
        private T value;

        /**
         * Pointer to the next node in the list.
         * If NULL this node is the last one.
         */
        private Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    /**
     * List first value.
     * If NULL, then the list is empty
     */
    private Node root;
    private Node current = root;

    public Set() { }

    public Set(T value) {
        insert(value);
    }

    public Boolean contains(T value) {
        for(T i : this) {
            if(i == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Insert new value to the list
     * @param value Value to be inserted
     */
    public void insert(T value) {
        if(contains(value)) {
            return;
        }

        if (root == null) {
            root = new Node(value);
            current = root;
            return;
        }
        Node current = root;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.next = new Node(value);
    }


    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("[");

        Node current = root;

        while (current.getNext() != null) {
            description.append(current.getValue());
            description.append(", ");
            current = current.getNext();
        }

        description.append(current.getValue());
        description.append("]");

        return description.toString();
    }
}
