package seminare.seminar07.collections;

/**
 * LinkedList implementation for integers
 */
public class UPLikedList implements Iterable, Sequence {

    @Override
    public boolean hasNext() {
        return current.getNext() != null;
    }



    /**
     * Class represents item in LinkedList
     */
    private class Node {
        /**
         * Node value
         */
        private int value;

        /**
         * Pointer to the next node in the list.
         * If NULL this node is the last one.
         */
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    @Override
    public int next() {
        current = current.getNext();
        return current.getValue();
    }

    /**
     * List first value.
     * If NULL, then the list is empty
     */
    private Node root;
    private Node current = root;

    public UPLikedList() { }

    public UPLikedList(int value) {
        insert(value);
    }

    @Override
    public int size() {
        int size = 0;
        Node cur = root;
        while(cur != null) {
            cur = cur.getNext();
            size++;
        }
        return size;
    }

    /**
     * Insert new value to the list
     * @param value Value to be inserted
     */
    public void insert(int value) {
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
    public boolean contains(int value) {
        Node cur = root;
        while(cur != null) {
            if(cur.getValue() == value) {
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }

    @Override
    public boolean delete(int value) {
        Node cur = root;
        Node prev = null;
        while(cur != null) {
            if(cur.getValue() == value) {
                if(prev != null) {
                    prev.setNext(cur.getNext());
                } else {
                    root = cur.getNext();
                }
                return true;
            }
            prev = cur;
            cur = cur.getNext();
        }
        return false;
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
