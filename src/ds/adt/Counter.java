package ds.adt;

public class Counter {

    private int count = 0;
    private String instanceName = null;

    public Counter(String str){

        this.instanceName = str;

    }

    // Increments the value of the Counter by 1 each time the method is invoked.
    public void increment(){

        count++;

    }

    // Returns the current value of the Counter as an integer value.
    public int getCurrentValue(){

        return count;

    }

    //Returns the name of the instance + the current value of the Counter as a String.
    public String toString(){

        return instanceName + ": + count";

    }
}
