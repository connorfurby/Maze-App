public class Square {
   
    private int row, col, inttype;
    private char chartype;
    private Square previous;
    private boolean explored;
    // types
    // 0 = empty space
    // 1 = wall
    // 2 = start
    // 3 = end

    public Square(int r, int c, int t)
    {
        this.row = r;
        this.col = c; 
        this.inttype = t;
        this.explored = false;
        if (inttype == 0)
            chartype = '_';
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

    public boolean isExplored()
    {
        return explored;
    }

    public void setExplored()
    {
        explored = true;
    }

    public void setPrevious(Square sq) 
    {
        previous = sq;
    }

    public Square getPrevious() 
    {
        return previous;
    }

    public String toString()
    {
        String strtype = "" + chartype;
        return strtype;
    }
    
    public void setCharType(char c)
    {
        chartype = c;
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
        explored = false;
        previous = null;
    }
}
