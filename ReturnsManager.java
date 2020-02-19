package Assignment2;

import java.util.*;


public class ReturnsManager {
    private int _qsize;
    private int _count=0;
    private TreeMap<Double,Integer> _returnData;
    private CircularList<Double> _listData;
    public ReturnsManager(int qSize){
        _qsize=qSize;
        //use treemap to save the data, key is result value, value is the number of occurrences of the value
        _returnData=new TreeMap<>();
        //use curcularlist to memory the order of value
        _listData=new CircularList<>(qSize);
        //845hut4
    }
    public void add(Double x){
        if(_count==_qsize){           //condition 1: when the tree map is full
            double tempX=_listData.removeFirst();
            int number=_returnData.get(tempX);
            if(number>1){           //if the value have duplicates
                _returnData.put(tempX,number-1);
            }
            else {                  //if the value don't have duplicates
                _returnData.remove(tempX);
            }
            boolean exist=_returnData.containsKey(x);
            if(exist){
                _returnData.put(x,_returnData.get(x)+1);
                _listData.addLast(x);
            }
            else{
                _returnData.put(x,1);
                _listData.addLast(x);
            }
        }
        else{               //condition 2: when the treemap is not full
            _count++;
            boolean exist=_returnData.containsKey(x);
            if(exist){
                _returnData.put(x,_returnData.get(x)+1);
                _listData.addLast(x);
            }
            else {
                _returnData.put(x, 1);
                _listData.addLast(x);
            }
        }
        //yr9832
    }
    public double getLast(){
            return _listData.getLast();
            //OSe89s
        }

    public ArrayList<Double> getLower(Double referenceReturn,int numberReturns){
        ArrayList<Double> lower= new ArrayList<>(numberReturns);
        int count=0;
        Collection<Double> c=_returnData.keySet();
        Iterator<Double> iterator=c.iterator();
        while(iterator.hasNext()){   //if we can get more than required, we return first "numberReturns" of values
            double tempX=iterator.next();
            if(tempX>=referenceReturn) continue; //we don't consider the value higher than the standard
            int tempNumber=_returnData.get(tempX); // how much duplicates the value has
            if(count==numberReturns) return lower;// we already get enough number, return the result
            else if((count+tempNumber)<numberReturns){  // we don't get enough values, continues
                int i=0;
                while (i<tempNumber){lower.add(tempX);i++;count++;}
            }
            else{
                while(count<numberReturns) {lower.add(tempX);count++;} //we will get enough value after adding this value to the list, then return the result
                return lower;
            }
        }
        return lower; // if we cannot find enough values, return as many as we can get
        //df98se
    }
    public ArrayList<Double> getHigher(Double referenceReturn,int numberReturns){
        ArrayList<Double> higher= new ArrayList<>(numberReturns);
        int count=0;
        Collection<Double> c=_returnData.keySet();
        Iterator<Double> iterator=c.iterator();
        while(iterator.hasNext()){
            double tempX=iterator.next();
            if(tempX<=referenceReturn) continue;
            int tempNumber=_returnData.get(tempX);
            if(count==numberReturns) return higher;
            else if((count+tempNumber)<numberReturns){
                int i=0;
                while (i<tempNumber){higher.add(tempX);i++;count++;}
            }
            else{
                while(count<numberReturns) {higher.add(tempX);count++;}
                return higher;
            }
        }
        return higher;
        //hufi8f
    }

}
