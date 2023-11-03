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
        return true;
    }

    public void add(Square sq)
    {
        stack.push(sq);
    }
    public Square next()
    {
        return new Square(1, 2, 3);
    }

}
