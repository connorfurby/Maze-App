//import java.util.*;

public class MazeSolverQueue extends MazeSolver{
    
    static MyQueue<Square> worklist;

    public MazeSolverQueue(Maze maze) 
    {
        super(maze);
        makeEmpty();
        maze.getStart().setPrevious(null);
        add(maze.getStart());
    }

    public void makeEmpty()
    {
        worklist = new MyQueue<>();
    }

    public boolean isEmpty()
    {
        return worklist.isEmpty();
    }

    public void add(Square sq)
    {
        worklist.enqueue(sq);
    }

    public Square next()
    {
        return ((Square) worklist.dequeue());
    }
}
