package week14;

import java.util.LinkedList;

public class MyQueue {
    //Used an arrayList to implement a stack:
    private final LinkedList<Integer> myQueueList;

    //initialize:
    public MyQueue(){
        myQueueList = new LinkedList<>();
    }

    //void push(int element):
    public void enqueue(int element) {
        myQueueList.addLast(element);
    }

    //int pop():
    public int dequeue(){
        if (myQueueList.isEmpty()){
            //Throw exception (???)
            System.out.println("This queue is empty");
            return -1;
        } else {
            //return myStackList.size()-1; //Bottom-Top, therefore last object.
            return myQueueList.removeFirst(); //Bottom-Top, therefore last object.
        }

    }
    //int peek():
    public int peek(){
        if (myQueueList.isEmpty()){
            //Throw exception:
            System.out.println("This queue is empty");
            return 0;

        } else {
            return myQueueList.getFirst();
        }

    }
    //booleon isEmpty();
    public boolean isEmpty(){
        return myQueueList.isEmpty();
    }
    public void printQueue(){

        System.out.println("Each element: " + myQueueList);

    }
}