import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Maze {

    private Square[][] maze;
    int numRows, numCols;
    private Square start, finish;
    public Maze()
    {

    }

    boolean loadMaze(String fname)
    {
        int rowcnt = 0;
        Scanner scan;
        try {
            File textfile = new File(fname);
            scan = new Scanner(textfile);
        }
        catch (FileNotFoundException e) {
            return false;
        }
        this.maze = new Square[numRows][numCols];
        numRows = 0;
        numCols = 0;
        for (int row=0; row < numRows; row++) 
        {
            for (int col=0; col < numCols; col++)
            {
                maze[row][col] = null;
                numCols++;
            }
            numRows++;
        }
        while (scan.hasNext())
        {
            String currLine = scan.nextLine();
            Scanner linescan = new Scanner(currLine);
            int colcnt = 0;
            while(linescan.hasNext())
            {
                int currType = linescan.nextInt();
                maze[rowcnt][colcnt] = new Square(rowcnt, colcnt, currType);
                if (currType == 2)
                    start = maze[rowcnt][colcnt];
                if (currType == 3)
                    finish = maze[rowcnt][colcnt];
                colcnt++;
            }
            rowcnt++;
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
            neighbors.add(maze[currRow][currCol + 1]);
        if (currCol - 1 >= 0)
            neighbors.add(maze[currRow][currCol + 1]);
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

    }

    public String toString()
    {

    }
}
