package ds.queue;

public class Queue {

    private int maxSize; //Init a set number of slots
    private long[] queArray;
    private int front; //Index of first item in que.
    private int rear; //Index of last item in que.
    private int nItems; //Counter for number of items in the que.

    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(long n){
        try {
            rear++;
            queArray[rear] = n;
            nItems++;
        } catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("Que is full!");
        }
    }

    //Remove item from the front of the queue.
    public long remove(){
        try {
            long temp = queArray[front];
            front++;
            if (front == maxSize) { //Creates a circular queue;
                front = 0; //Resets front index
            }
            nItems--;

            return temp;
        } catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("Que is empty!");
        }

        return 0;
    }

    public long peakFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems ==0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view(){
        System.out.print("[ ");
        for(int i = 0; i <queArray.length; i++){
            System.out.print(queArray[i] + " ");
        }
        System.out.print("]");
    }
}
