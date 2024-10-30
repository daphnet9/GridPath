public class Location
{
    private int theRow;
    private int theCol;

    public Location(int r, int c)
    {
        theRow = r;
        theCol = c;
    }

    // public int getRow()
    
    // public int getCol()

    public String toString()
    {
        return theRow + ", " + theCol;
    }
}