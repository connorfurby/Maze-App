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
        Node newNode = new Node();
        newNode.data = element;

        if(this.isEmpty())
        {
            this.first = newNode;
            //this.last = newNode;
        }
        else
            this.last.next = newNode;
            
        this.last = newNode;
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
