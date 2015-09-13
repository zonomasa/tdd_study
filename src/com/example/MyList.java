package com.example;

public class MyList {
    private MyItem head;
    
    public MyList(){
        
    }
    public void addToHead(Object obj){
        MyItem insert =  new MyItem();
        insert.item = obj;
        insert.next = head;
        head = insert;
    }
    
    public Object removeFromHead(){
        if(head == null)
            return null;
        MyItem ret = head;
        head = head.next;
        return ret.item;
    }
    
    public int countItem(){
        if(head == null)
            return 0;
        int ret = 1;
        for (MyItem ite=head;ite.next != null;ite = ite.next){
            ret++;
        }
        return ret;
    }
    
}
class MyItem{
    MyItem next;
    Object item; 
}