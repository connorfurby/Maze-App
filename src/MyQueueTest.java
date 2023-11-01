public class MyQueueTest {
    public static void main(String[] args)
    {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(2);
        System.out.println(queue.dequeue());
        queue.enqueue(2);
        System.out.println(queue.size());

        while(!queue.isEmpty())
        {
            System.out.println(queue.dequeue());
        }
        queue.clear();
        System.out.println(queue.size());


    }
}
