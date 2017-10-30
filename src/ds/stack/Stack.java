package ds.stack;

public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size){
       this.maxSize = size;
       this.stackArray = new long[maxSize];
       this.top = -1;
    }

    public void push(long j){
        try {
            top++;
            stackArray[top] = j;
        } catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }

    public long pop(){
        int oldTop = top;
        top--;
        return stackArray[oldTop];
    }

    public long peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize -1 == top);
    }
}
