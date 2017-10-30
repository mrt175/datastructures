package ds.stack;

public class Stack {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(String st){
        this.maxSize = st.length();
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char ch){
        try {
            top++;
            stackArray[top] = ch;
        } catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("Stack is full!");
        }
    }

    public char pop(){
        try {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        } catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("No more items in the stack!");
        }

        return 'x';
    }

    public char peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize -1 == top);
    }
}
