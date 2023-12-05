package week14;

public class Main {
    public static void main(String[] args){
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("The stack: ");
        stack.printStack();

        stack.pop(0);
        stack.printStack();
        stack.pop(1);
        stack.printStack();
        stack.pop(2);
        stack.printStack();
        System.out.println(stack.peek());


        MyQueue queue = new MyQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("The queue: ");


        //QUESTIONS:
        /* A queue may be more useful than a stack in any scenario
         * when the first to come is first to be served, such as in a restaurant.
         *
         * In a stack, it's FIFO, meaning the first/most recent element added is the one to be removed first,
         * whereas queue is FILO, meaning the first/most recent element added is the one to be removed last
         */
    }
}
