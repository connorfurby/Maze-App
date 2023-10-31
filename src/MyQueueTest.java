public class MyQueueTest {
    public static void main(String[] args)
    {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(0);
        queue.enqueue(0);
        System.out.println(queue.dequeue());
        queue.enqueue(2);

        while(!queue.isEmpty())
        {
            System.out.println(queue.dequeue());
        }
    }
}
