public class MyDeck<Item> {

    private Item[] arr;
    private int size = 0;
    private final int DEAFULT_CAMPACITY=10;
    private int start=0;
    private int end=0;

    public MyDeck(int campacity) {
        if (campacity<=0){
            throw new IllegalArgumentException("Camapacity = " + campacity);
        } else {
            arr= (Item[]) new Comparable[campacity];

        }
    }

    public MyDeck() {
        arr = (Item[]) new Comparable[DEAFULT_CAMPACITY];
    }



    public void push_front(Item e){
        if (isFull()){
            throw new StackOverflowError("massive is full");
        }
        else if (size==0)
        {
            end = start;
            arr[start] = e;
            size++;
        }
        else
        {
            start++;
            if (start>=arr.length)
                start = 0;
            arr[start] = e;
            size++;
        }
    }

    public void push_end(Item e){
        if (isFull()){
            throw new StackOverflowError("massive is full");
        }
        else if (size==0)
        {
            start = end;
            arr[end] = e;
            size++;
        }
        else
        {
            end--;
            if (end<0)
                end = arr.length-1;
            arr[end] = e;
            size++;
        }
    }
    public boolean pop_end()
    {
        if (!isEmpty())
        {
            Item tmp = arr[end];
            arr[end]=null;
            end++;
            if (end>=arr.length)
                end = 0;
            arr[end]=tmp;
            size --;
            return true;
        }
        else
            return false;
    }

    public boolean pop_front()
    {
        if (!isEmpty())
        {
            Item tmp = arr[start];
            arr[start]=null;
            start--;
            if (start<0)
                start = arr.length - 1;
            arr[start]=tmp;
            size --;
            return true;
        }
        else
            return false;
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
