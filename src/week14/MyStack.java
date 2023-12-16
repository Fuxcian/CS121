package week14;

import java.util.ArrayList;

public class MyStack {
    //Use ArrayList:
    private ArrayList<Integer> myStackList;

    //initialize:
    public MyStack(){
        myStackList = new ArrayList<>();
    }
    //void push(int element):
    public void push(int element) {
        myStackList.add(element);
    }

    //int pop():
    public int pop(int i){
        if (myStackList.isEmpty()){
            //Throw exception (???)
            System.out.println("This stack is empty");
            return -1;
        } else {
            //return myStackList.size()-1; //Bottom-Top, therefore last object.
            return myStackList.remove(myStackList.size()-1); //Bottom-Top, therefore last object.
        }

    }
    //int peek():
    public int peek(){
        if (myStackList.isEmpty()){
            //Throw exception:
            System.out.println("This stack is empty");
            return 0;

        } else {
            return myStackList.get(0);
        }

    }
    //booleon isEmpty();
    public boolean isEmpty(){
        return myStackList.isEmpty();
    }
    public void printStack(){

            System.out.println("Each element: " + myStackList);

    }
}