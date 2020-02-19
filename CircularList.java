package Assignment2;

import java.util.Random;

// it is circular, so we use modular operation in all methods

public class CircularList<T> {
    private Object[] _data; // I use array to memory the data
    private int _first=0;   // use this integer as the head pointer, it points to a value
    private int _last=-1;   // use this integer as the tail pointer, it also points to a value, two pointers point to same value when there is only one value in the list
    private int _capacity;
    private boolean _empty=true;// decide whether the list is empty
    public CircularList(int capacity) {
        _capacity = capacity;
        _data = new Object[capacity];
        //fheiu8
    }
    public void addLast(T value){
        if((((_first+_capacity)%_capacity)==((_last+1)%_capacity))&&(!_empty)){ // when list is full
            Object[] tempdata=new Object[_capacity*2];
            for(int i=0;i<_capacity;i++){
                tempdata[i]=_data[(_first+i)%_capacity];
            }
            _first=0;
            _last=_capacity-1;
            _capacity=2*_capacity;
            tempdata[++_last]=value;
            _data=tempdata;
        }
        else if(_empty) {  //when list is empty
            _empty = false;
            _last = (_last + 1) % _capacity;
            _data[_last] = value;
        }
        else{
            _last = (_last + 1) % _capacity;
            _data[_last] = value;
        }
        //zniu33
    }
    public void addFirst(T value){
        if((((_first+_capacity)%_capacity)==((_last+1)%_capacity))&&(_empty==false)){
            Object[] tempdata=new Object[_capacity*2];
            for(int i=0;i<_capacity;i++){
                tempdata[i+1]=_data[(_first+i)%_capacity];
            }
            _first=0;
            _last=_capacity;
            _capacity=2*_capacity;
            tempdata[0]=value;
            _data=tempdata;
        }
        else if(_empty) {
            _empty=false;
            _last=(_last+1)%_capacity;
            _data[_last]=value;
        }
        else{
            _first=(_first-1+_capacity)%_capacity;
            _data[_first]=value;
        }
        //opier99
    }
    public T removeFirst() throws RuntimeException{
        if(_empty) throw new RuntimeException("List is empty"); // when the list is empty, we can't remove element
        if(_first==_last) _empty=true; //if there is only one element in the list, then the list will be empty
        Object temp=_data[_first];
        _first=(_first+1)%_capacity;
        return (T)temp;
        //uwere8
    }
    public T removeLast()throws RuntimeException{
        if(_empty) throw new RuntimeException("List is empty");
        if(_first==_last) _empty=true;
        Object temp=_data[_last];
        _last=(_last-1+_capacity)%_capacity;
        return (T)temp;
        //eruewr10
    }
    public int capacity(){
        return _capacity;
    }//ieiu89w
    public void capacity(int newCapacity)throws RuntimeException{
        if(newCapacity<this.size()) throw new RuntimeException("Data Loss!");
        Object[] tempdata=new Object[newCapacity];
        for(int i=0;i<this.size();i++){
            tempdata[i]=_data[(_first+i)%_capacity];
        }
        _first=0;
        _last=this.size()-1;
        _capacity=newCapacity;
        //7w8er
    }

    public void clear(){
        _empty=true;
        _first=0;
        _last=-1;
        //8weur
    }
    public int size(){
        if(_empty) return 0;
        else if (_last>=_first) return(_last-_first+1);
        else return (_last+_capacity-_first+1);
        //w7ef8
    }
    public T get(int index) throws RuntimeException{  // the index should be smaller than the size
        if((index+1)>this.size()) throw  new RuntimeException("index too large!");
        else return (T)_data[(_first+index)%_capacity];
        //i9ew9
    }
    public T getFirst() throws RuntimeException{ // if the list is empty, we cannot get element from the list
        if(_empty) throw new RuntimeException("Empty!");
        else return (T)_data[_first];
        //fus78
    }
    public T getLast() throws RuntimeException{
        if(_empty) throw new RuntimeException("Empty!");
        else return (T)_data[_last];
        //768wf
    }
    public T sampleUniform() throws RuntimeException{
        if(_empty) throw  new RuntimeException("Empty!");
        int ranomNumber=new Random().nextInt(this.size());
        return (T)_data[(_first+ranomNumber)%_capacity];
    }
}
