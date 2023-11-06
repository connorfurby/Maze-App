//import java.util.*;

public class queueSolver extends MazeSolver{
    
    public MyQueue <Square> queue = new MyQueue<>();
    //static Maze maze  = new Maze();

    public queueSolver(Maze maze) 
    {
        super(maze);
    }

    public void makeEmpty()
    {
        while(!(queue.isEmpty()))
            queue.dequeue();
    }

    public boolean isEmpty()
    {
        if(queue.isEmpty())
            return true;
        
        return false;
    }

    public void add(Square sq)
    {
        queue.enqueue(sq);
    }

    public Square next()
    {
        //return super.step();
        return (Square)queue.front();
    }
}
