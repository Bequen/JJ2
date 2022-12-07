import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import seminare.seminar07.collections.UPLikedList;

public class UPLinkedListTests {

    UPLikedList list;

    @BeforeEach
    public void PrepareConstants() {
        list = new UPLikedList();
    }

    @Test
    public void listTest() {
        list.insert(1);
        assert(list.size() == 1);
        list.insert(2);
        assert(list.size() == 2);

        list.delete(0);
        assert(list.size() == 2);
        list.delete(1);
        assert(list.size() == 1);
    }
}
