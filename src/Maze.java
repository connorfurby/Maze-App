import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Maze {

    private Square[][] maze;
    int numRows, numCols;
    private Square start, finish;
    public Maze()
    {
        numRows = 0;
        numCols = 0;
    }



    boolean loadMaze(String fname)
    {
        Scanner scan;
        try 
        {
            File textfile = new File(fname);
            scan = new Scanner(textfile);
            
        }
        catch (FileNotFoundException e) 
        {
            return false;
        }
        numRows = scan.nextInt();
        numCols = scan.nextInt();
        maze = new Square[numRows][numCols];

        for (int row=0; row < numRows; row++) 
        {
            for (int col=0; col < numCols; col++)
            {
                int currType = scan.nextInt();
                maze[row][col] = new Square(row, col, currType);
                if (currType == 2)
                    start = maze[row][col];
                if (currType == 3)
                    finish = maze[row][col];
            }
        }
        scan.close();
        return true;
    }
    
    


    public ArrayList<Square> getNeighbors(Square sq)
    {
        int currRow = sq.getRow();
        int currCol = sq.getCol();
        ArrayList<Square> neighbors = new ArrayList<>();

        if (maze[currRow - 1][currCol] != null && currRow - 1 >= 0 )
            neighbors.add(maze[currRow - 1][currCol]);
        if (maze[currRow][currCol + 1] != null && currCol + 1 < numRows)
            neighbors.add(maze[currRow][currCol + 1]);
        if (maze[currRow + 1][currCol] != null && currRow + 1 < numCols)
            neighbors.add(maze[currRow + 1][currCol]);
        if (maze[currRow][currCol - 1] != null && currCol - 1 >= 0)
            neighbors.add(maze[currRow][currCol - 1]);
        return neighbors;
    }



    public Square getStart()
    {
        return start;
    }

    public Square getFinish()
    {
        return finish;
    }



    public void reset()
    {
        for (int i = 0; i < numRows; i++)
        {
            for (int k = 0; k < numCols; k++)
            {
                maze[i][k].reset();
            }
           
        }
    }



    public String toString()
    {
        String mazeString = "";

        for (int i = 0; i < maze.length; i++)
        {
            for (int k = 0; k < maze[i].length; k++)
            {
                mazeString = mazeString + maze[i][k];
            }
            mazeString = mazeString + "\n";
        }

        return mazeString;
    }
}
