import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
       /* MyStack<Integer> myStack = new MyStack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);

        for (int i = 0; i <8 ; i++) {
            System.out.println(myStack.pop());
        }*/

       MyQueue<Integer> myQueue = new MyQueue<>();

       myQueue.insert(1);
       myQueue.insert(2);
       myQueue.insert(3);
       myQueue.insert(4);
       myQueue.insert(5);
       myQueue.insert(6);
       myQueue.insert(7);
       myQueue.insert(8);
        System.out.println(myQueue);
    }
}
