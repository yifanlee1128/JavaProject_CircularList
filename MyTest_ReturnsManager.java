package Assignment2;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Iterator;

public class MyTest_ReturnsManager extends junit.framework.TestCase {
    public void test_845hut4(){
        ReturnsManager rm=new ReturnsManager(20);
        rm.add(4.5d);
        assertTrue(Math.abs(rm.getLast()-4.5d)<1e-8);
    }
    public void test_yr9832(){
        ReturnsManager rm=new ReturnsManager(20);
        double test=4.6d;
        for(int i=0;i<30;i++){
            rm.add(test+i);
            assertTrue(Math.abs(rm.getLast()-(test+i))<1e-8);
        }
    }
    public void test_OSe89s(){
        ReturnsManager rm=new ReturnsManager(20);
        rm.add(4.5d);
        assertTrue(Math.abs(rm.getLast()-4.5d)<1e-8);
    }
    public void test_df98se(){
        double signal=-1.d;
        double base=4.8d;
        ReturnsManager rm=new ReturnsManager(20);
        for(int i=0;i<10;i++){
            double multiple=Math.pow(signal,i);
            double number=multiple*(base+i);
            rm.add(number);
            rm.add(number);
        }
        ArrayList<Double> al=rm.getLower(4.9d,20);
        Iterator<Double> iterator=al.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---");
        ArrayList<Double> al2=rm.getLower(4.9d,7);
        Iterator<Double> iterator1=al2.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("--------------------");
    }
    public void test_hufi8f(){
        double signal=-1.d;
        double base=4.8d;
        ReturnsManager rm=new ReturnsManager(20);
        for(int i=0;i<10;i++){
            double multiple=Math.pow(signal,i);
            double number=multiple*(base+i);
            rm.add(number);
            rm.add(number);
        }
        ArrayList<Double> al=rm.getHigher(4.9d,10);
        Iterator<Double> iterator=al.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---");
        ArrayList<Double> al2=rm.getHigher(4.9d,7);
        Iterator<Double> iterator1=al2.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
