import java.util.NoSuchElementException;

public class MyQueue implements QueueADT{
    private Node first;
    private Node last;
    private int size;
    
    public MyQueue()
    {
        first = null;
        last = null;
    }

    public boolean isEmpty() 
    {
        return first == null;
    }

    public void enqueue(Object element)
    {
        if(this.isEmpty())
        {
            Node newNode = new Node();
            newNode.data = element;
            this.first = newNode;
            this.last = newNode;
        }
        else
        {
            Node newNode = new Node();
            newNode.data = element;
            this.last.next = newNode;
        }
        this.size++;  
    }

    public Object dequeue()
    {
        if (this.isEmpty())
        {
            throw new NoSuchElementException();
        }
        else
        {
            Object element = this.first.data;
            this.first = this.first.next;
            size--;
            return element;
        }
        
    }
    
    public void clear()
    {
        while(!this.isEmpty())
        {
            this.dequeue();
        }

    }

    public Object front()
    {
        return this.first.data;
    }

    public int size(){
        return size;
    }


    static class Node{
        public Object data;
        public Node next;
    }
}
