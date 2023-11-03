import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Maze {

    private Square[][] maze;
    int numRows, numCols;
    private Square start, finish;
    public Maze()
    {
        System.out.print("");
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

        this.maze = new Square[numRows][numCols];

        for (int row=0; row < numRows; row++) 
        {
            for (int col=0; col < numCols; col++)
            {
                maze[row][col] = null;
            }
        }

        int colcnt = 0;
        int rowcnt = 0;
        while (scan.hasNext())
        {
            int currType = scan.nextInt();
            maze[rowcnt][colcnt] = new Square(rowcnt, colcnt, currType);
            if (currType == 2)
                    start = maze[rowcnt][colcnt];
            if (currType == 3)
                    finish = maze[rowcnt][colcnt];
            colcnt++;
            if (colcnt >= numCols)
            {
                rowcnt++;
                colcnt = 0;
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

        if (currRow - 1 >= 0)
            neighbors.add(maze[currRow - 1][currCol]);
        if (currCol + 1 < numRows)
            neighbors.add(maze[currRow][currCol + 1]);
        if (currRow + 1 < numCols)
            neighbors.add(maze[currRow + 1][currCol]);
        if (currCol - 1 >= 0)
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
        for (int i = 0; i < maze.length; i++)
        {
            for (int k = 0; k < maze[i].length; k++)
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
