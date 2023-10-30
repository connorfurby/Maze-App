public class Square {
   
    private int row, col, inttype;
    private char chartype;
    // types
    // 0 = empty space
    // 1 = wall
    // 2 = start
    // 3 = end

    public Square(int r, int c, int t)
    {
        row = r;
        col = c; 
        inttype = t;
        if (inttype == 0)
            chartype = '_';
            // if tree for 
            // o - is on the solver work list
            // . - has been explored
            // x - is on the final path to the exit

        else if (inttype == 1)
            chartype = '#';
        else if (inttype == 2)
            chartype = 'S';
        else
            chartype = 'E';
    }
    public int getRow()
    {
        return row;
    }
    public int getCol()
    {
        return col;
    }
    public int getType()
    {
        return inttype;
    }

    public String toString()
    {
        String strtype = "" + chartype;
        return strtype;
    }

    public void reset()
    {
        if (inttype == 0)
            chartype = '_';
        else if (inttype == 1)
            chartype = '#';
        else if (inttype == 2)
            chartype = 'S';
        else
            chartype = 'E';
    }
}
