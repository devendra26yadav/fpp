package Practice.Final.MyStack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStackUsingArray {
   private Integer[] data;
    private int top=-1;
    public MyStackUsingArray(){
        data=new Integer[31];
    }
    public void push(Integer element){
        if(element==null) throw new NullPointerException("Null Value Not Allowed");
        if(size()==data.length)resize();
        data[++top]=element;
    }
    public Integer pop(){
        if(isEmpty()) throw new EmptyStackException();
        Integer val = data[top];
        data[top--]=null;
        return val;
    }
    public Integer peek(){
        if(isEmpty()) return null;
        return data[top];
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public int size(){
        return top+1;
    }
    private void resize(){
        int newLength = data.length*2;
        data=Arrays.copyOf(data,newLength);
    }
//    public void printStack(){
//        System.out.println(Arrays.toString(data));
//    }
    @Override
    public String toString(){
        if(top==-1) return "[]";
        StringBuilder builder = new StringBuilder("[");
        for(int i=0;i<size()-1;i++){
            builder.append(data[i]).append(", ");
        }
        builder.append(data[size()-1]).append("]");
        return builder.toString();
    }
}
