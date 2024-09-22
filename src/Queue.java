public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("The queue is full, no more items can be added.");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = value;
            nItems++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty, there are no items to remove.");
            return -1;
        } else {
            int temp = queueArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return temp;
        }
    }

    public int peekFront() {
        if (isEmpty()) {
            System.out.println("the queue is empty, there are no items to remove.");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("one item" + queue.peekFront());

        queue.dequeue();
        System.out.println("one item after dequeue  " + queue.peekFront());
    }
}
