package com.example;

public class Stack {
    MyList list;
    
    public Stack(){
        list = new MyList();
    }
    
    public boolean isEmpty(){
        if (list.countItem() == 0)
            return true;
        else
            return false;
    }
    
    public void push(Object obj){
        list.addToHead(obj);
    }
    
    public Object pop(){
        return list.removeFromHead();
    }

    public int size(){
        return list.countItem();   
    }
    

}
