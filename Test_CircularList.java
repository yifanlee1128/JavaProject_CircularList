package Assignment2;

public class Test_CircularList extends junit.framework.TestCase {
    public void test() {
        int capacity = 5;
        CircularList<Integer> cl = new CircularList<Integer>(capacity);
        // Make sure circular list correctly circles underlying array

        for (int i = 0; i < 5; i++)
            cl.addLast(i);
        for (int i = 5; i < 10; i++) {
            assertTrue(cl.removeFirst() == (i - 5));
            cl.addLast(i);
        }
        // Empty list
        cl.clear();
        // Check size and capacity
        assertTrue(cl.size() == 0);
        assertTrue(cl.capacity() == 5);
        // 1

        cl.addLast(7);
        // Check get
        assertTrue(cl.get(0) == 7);
        // Check getFirst
        assertTrue(cl.getFirst() == 7);
        // Check size
        assertTrue(cl.size() == 1);
        // 2
        cl.addLast(11);
        // 3
        cl.addLast(13);
        // 4
        cl.addLast(113);
        assertTrue(cl.getLast() == 113);
        // 5
        cl.addLast(227);
        assertTrue(cl.size() == 5);
        // 4
        assertTrue(cl.removeFirst() == 7);
        // 5

        cl.addFirst(109);
        // 6, grows to capacity 10
        cl.addLast(53);

        assertTrue(cl.capacity() == 10);
        // 5

        assertTrue(cl.removeLast() == 53);

        cl.capacity(7);
        // Re-allocate space to capacity = 7
        assertTrue(cl.capacity() == 7);
        assertTrue(cl.get(1) == 11);
        // 6
        cl.addFirst(29);
        assertTrue(cl.size() == 6);
        assertTrue(cl.getFirst() == 29);
        // Uniform sample
        int sample = cl.sampleUniform();
    }
}
