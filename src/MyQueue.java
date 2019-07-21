public class MyQueue<Item extends Comparable> {

    private Item[] arr;
    private int size = 0;
    private final int DEAFULT_CAMPACITY=10;
    private int start=0;
    private int end=0;


    public MyQueue(int campacity) {
        if (campacity<=0){
            throw new IllegalArgumentException("Camapacity = " + campacity);
        } else {
            arr= (Item[]) new Comparable[campacity];

        }
    }

    public MyQueue() {
        arr = (Item[]) new Comparable[DEAFULT_CAMPACITY];
    }


    private int nextIndex(int index){
        return (index+1) %arr.length;

    }
    public Item peek(){
        if(isEmpty()){
            System.out.println("здесь рыбы нет...");
            return null;
        }
        return arr[start];
    }

    public void insert(Item item){
        if (isFull()){
            throw new StackOverflowError("massive is full");
        }
        size++;
        arr[end]=item;
        end=nextIndex(end);
    }

    public Item remove(){
        Item temp = peek();
        size--;
        arr[start]=null;
        start=nextIndex(start);
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


    @Override
    public String toString() {
        String s ="";
        for (int i = 0; i < arr.length; i++) {
            s+=arr[i] + " ";
        }
        return s;
    }
}
