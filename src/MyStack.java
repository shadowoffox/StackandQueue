
public class MyStack<Item extends Comparable> {

    private Item[] arr;
    private int size = 0;
    private final int DEAFULT_CAMPACITY=10;

    public MyStack(int campacity) {
        if (campacity<=0){
            throw new IllegalArgumentException("Camapacity = " + campacity);
        } else {
            arr= (Item[]) new Comparable[campacity];

        }
    }

    public MyStack() {
        arr = (Item[]) new Comparable[DEAFULT_CAMPACITY];
    }



    public Item peek(){
        if(isEmpty()){
            System.out.println("здесь рыбы нет...");
            return null;
        }
        return arr[size-1];
    }

    public void push(Item item){
        if (isFull()){
            throw new StackOverflowError("massive is full");
        }
        arr[size]=item;
        size++;
    }

    public Item pop(){
        Item temp = peek();
        size--;
        arr[size]=null;
        return temp;

    }

    public int size(){
        return size;
    }


    public boolean isEmpty(){
        return size == 0;

    }

    public boolean isFull(){
        return size==arr.length;
    }


}
