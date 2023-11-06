public class MazeSolverStack extends MazeSolver 
{
    public MyStack<Square> stack = new MyStack<>();
    static Maze maze = new Maze();

    public MazeSolverStack()
    {
        super(maze);
    }
    
    public void makeEmpty()
    {
        System.out.print("");
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public void add(Square sq)
    {
        stack.push(sq);
    }
    public Square next()
    {
        return ((Square) stack.top());
    }

}
