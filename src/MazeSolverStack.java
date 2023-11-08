public class MazeSolverStack extends MazeSolver 
{
    static MyStack<Square> worklist;

    public MazeSolverStack(Maze maze)
    {
        super(maze);
        makeEmpty();
        maze.getStart().setPrevious(null);
        add(maze.getStart());
    }
    
    public void makeEmpty()
    {
       worklist = new MyStack<>();
    }

    public boolean isEmpty()
    {
        return worklist.isEmpty();
    }

    public void add(Square sq)
    {
        worklist.push(sq);
    }
    public Square next()
    {
        return ((Square) worklist.pop());
    }

    public Square top()
    {
        return ((Square) worklist.top());
    }

    public Object getWorklist()
    {
        return worklist;
    }

}
