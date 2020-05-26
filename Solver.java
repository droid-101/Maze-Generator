class SolverTest
{
    public static void main(String [] arg)
    {
        int [][] maze = {
			{0, 1, 0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0, 1, 0},
			{0, 0, 0, 1, 0, 0, 1, 1, 0},
			{0, 1, 1, 1, 0, 1, 1, 1, 0},
			{0, 1, 0, 0, 1, 1, 0, 1, 0},
			{0, 1, 1, 1, 1, 0, 1, 1, 0},
			{0, 1, 0, 1, 1, 0, 1, 0, 0},
			{0, 1, 1, 1, 0, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 1, 0, 0, 0},
		};

        Maze.print(maze);
        System.out.println(" ");
        Solver.check(maze);
        Maze.print(maze);
    }
}

class Solver
{
    public static void check(int [][] maze)
    {
        int row = 0;
        int col = Maze.numColumns(maze) / 2 - 1;
        int [] currentBlock = new int[2];
        boolean end = false;

        while (!end)
        {
            if (row == Maze.numRows(maze) - 1 || col == Maze.numColumns(maze))
            {
                end = true;
                maze[row][col] = 2;
            }
            else
            {
                currentBlock[0] = row;
                currentBlock[1] = col;

                if (maze[currentBlock[0] + 1][currentBlock[1]] == 1)
                {
                    maze[row][col] = 2;
                    row++;
                }
                else if (maze[currentBlock[0] - 1][currentBlock[1]] == 1)
                {
                    maze[row][col] = 2;
                    row--;
                }
                else if (maze[currentBlock[0]][currentBlock[1] + 1] == 1)
                {
                    maze[row][col] = 2;
                    col++;
                }
                else if (maze[currentBlock[0]][currentBlock[1] - 1] == 1)
                {
                    maze[row][col] = 2;
                    col--;
                }
                else
                {
                    if (maze[currentBlock[0] + 1][currentBlock[1]] == 2)
                    {
                        maze[row][col] = 3;
                        row++;
                    }
                    else if (maze[currentBlock[0] - 1][currentBlock[1]] == 2)
                    {
                        maze[row][col] = 3;
                        row--;
                    }
                    else if (maze[currentBlock[0]][currentBlock[1] + 1] == 2)
                    {
                        maze[row][col] = 3;
                        col++;
                    }
                    else if (maze[currentBlock[0]][currentBlock[1] - 1] == 2)
                    {
                        maze[row][col] = 3;
                        col--;
                    }
                }
            }
        }
    }
}
