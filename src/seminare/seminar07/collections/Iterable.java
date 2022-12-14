package seminare.seminar07.collections;

public interface Iterable {

    /**
     * Check if a sequence has another value.
     * @return True if next value is available.
     */
    boolean hasNext();

    /**
     * Get next value in a sequence
     * @return Next value
     */
    int next();
}
