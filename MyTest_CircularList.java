package Assignment2;

public class MyTest_CircularList extends junit.framework.TestCase {
    public void test_fheiu8(){
        int capacity=4;
        CircularList<Integer> cl = new CircularList<Integer>(capacity);
        assertEquals(cl.capacity(),capacity);
    }
    public void test_zniu33(){
        int capacity=4;
        CircularList<Integer> cl = new CircularList<Integer>(capacity);
        for(int i=0;i<20;i=2*i+1){
            cl.addLast(i);
            assertTrue(cl.getLast()==i);
        }
    }
    public void test_opier99(){
        int capacity=4;
        CircularList<Integer> cl = new CircularList<Integer>(capacity);
        for(int i=0;i<20;i=2*i+1){
            cl.addFirst(i);
            assertTrue(cl.getFirst()==i);
        }
    }
    public void test_uwere8(){
        int capacity=4;
        CircularList<Integer> cl = new CircularList<Integer>(capacity);
        cl.addFirst(6);
        cl.addFirst(7);
        assertTrue(cl.removeFirst()==7);
    }
    public void test_eruewr10(){
        int capacity=4;
        CircularList<Integer> cl = new CircularList<Integer>(capacity);
        cl.addFirst(6);
        cl.addFirst(7);
        assertTrue(cl.removeLast()==6);
    }
    public void test_ieiu89w(){
        int capacity=4;
        CircularList<Integer> cl = new CircularList<Integer>(capacity);
        assertTrue(cl.capacity()==4);
    }
    public void test_7w8er(){
        int capacity=4;
        CircularList<Integer> cl = new CircularList<Integer>(capacity);
        cl.capacity(8);
        assertTrue(cl.capacity()==8);
    }
    public void test_8weur(){
        int capacity=4;
        CircularList<Integer> cl = new CircularList<Integer>(capacity);
        cl.addFirst(6);
        cl.addFirst(7);
        cl.clear();
        assertTrue(cl.size()==0);
    }
    public void test_w7ef8(){
        int capacity=4;
        CircularList<Integer> cl = new CircularList<Integer>(capacity);
        cl.addFirst(6);
        assertTrue(cl.size()==1);
    }
    public void test_i9ew9(){
        int capacity=4;
        CircularList<Integer> cl = new CircularList<Integer>(capacity);
        cl.addFirst(7);
        cl.addFirst(8);
        assertTrue(cl.get(1)==7);

    }
    public void test_fus78(){
        int capacity=4;
        CircularList<Integer> cl = new CircularList<Integer>(capacity);
        cl.addLast(7);
        cl.addFirst(8);
        assertTrue(cl.getFirst()==8);
    }
    public void test_768wf(){
        int capacity=4;
        CircularList<Integer> cl = new CircularList<Integer>(capacity);
        cl.addLast(7);
        cl.addFirst(8);
        assertTrue(cl.getLast()==7);
    }
}
