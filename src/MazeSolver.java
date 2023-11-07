import java.util.*;

public abstract class MazeSolver {

    protected static Stack<Square> currPath; // THE PATH THE SOLVER TAKES TO THE FINISH
    protected boolean traversed = false; // BECOMES TRUE ONCE THE ENTIRE MAZE HAS BEEN TRAVERSED OR THE FINISH HAS BEEN FOUND
    protected static Maze theMaze; // MAZE THAT IS BEING SOLVED

   public MazeSolver(Maze maze)
    {
        theMaze = maze;
    }


    //ABSTRACT METHODS
    abstract void makeEmpty();
    abstract boolean isEmpty();
    abstract void add(Square sq);
    abstract Square next();


    public boolean isSolved()
    {
        return traversed;
    }

    //RETURNS A STRING WITH THE COORDINATES OF EVERY SQUARE ALONG THE PATH
    public String getPath()
    {
        String path = "";
        if (isSolved())
        {
            if (isEmpty())
                return "This maze is unsolvable.";
            else 
            {
                Square backtracked = theMaze.getFinish();
                while (!(backtracked.getRow() == theMaze.getStart().getRow() && backtracked.getCol() == theMaze.getStart().getCol() && backtracked.getType() == theMaze.getStart().getType()))
                {
                    int xcord = backtracked.getRow();
                    int ycord = backtracked.getCol();
                    path = path + "[" + xcord + "," + ycord + "], ";
                    backtracked = backtracked.getPrevious();
                }
            }
        }
        else
            return "This Maze has not been solved yet.";
        
        return path;
    }



    //MOVES FORWARD A SQUARE
    public Square step()
    {
        if (isEmpty())
        {
            traversed = true;
            return null;
        }
        else
        {
            Square move = next();
            if (move.getType() == 3)
                traversed = true;
            else 
            {
                ArrayList<Square> borders = theMaze.getNeighbors(move);
                for (int i = 0; i < borders.size(); i++)
                {
                    if (borders.get(i).getType() != 1 && !(borders.get(i).isExplored()))
                    {
                        add(borders.get(i));
                        borders.get(i).setCharType('o');
                        borders.get(i).setPrevious(move);
                        move.setCharType('.');
                    }
                }
                move.setExplored();
            }
            return move;
        }
    }


    //RUNS UNTIL IS SOLVED BECOMES TRUE
    public void solve()
    {
        while (!isSolved()) 
        {
            step();
        }
        
        while (!(isEmpty()))
        {
            next().setCharType('x');
        }
    }
}
