package Problem1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        System.out.println(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        queue.enqueue(6);
        System.out.println(queue.size());
    }
}
