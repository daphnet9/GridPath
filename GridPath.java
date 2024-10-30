public class GridPath
{
    private int [][] grid;

    public Location getNextLoc(int row, int col)
    {
        int below = Integer.MAX_VALUE;
        if(row < grid.length - 1) below = grid[row + 1][col];
        int right = Integer.MAX_VALUE;
        if(col < grid[0].length - 1) right = grid[row][col + 1];
    }
    
    public int sumPath(int row, int col)
    {
        return 0;
    }

    public GridPath(int [][] values)
    {
        grid = values;
    }

    public String toString()
    {
        String s = "";
        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid[0].length; col ++)
            {
                s += grid[row][col] + " ";
            }
            s += "\n";
        }
        return s;
    }
}