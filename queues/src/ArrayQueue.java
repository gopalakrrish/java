import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int count;

    public ArrayQueue(int capacity) {
        queue = new int[capacity];
    }

    public void enqueue(int item) {
        if(count==queue.length)
            throw new IllegalStateException();

        queue[rear] = item;
        rear = (rear+1) % queue.length;
        count++;
    }

    public int dequeue() {
        var item = queue[front];
        queue[front] = 0;
        front = (front+1) % queue.length;
        count--;
        return item;
    }

//    public int peek() {
//    }

//    public boolean isEmpty() {
//    }

//    public boolean isFull() {
//    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }

}
