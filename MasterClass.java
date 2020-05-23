class MasterClass
{
    public static void main(String [] arg)
    {
        int [][] maze = Generator.generateMaze(9, 9, false);

        for (int i = 0; i < Maze.numColumns(maze); i++)
        {
            if (maze[Maze.numRows(maze) - 2][i] != 0)
            {
                maze[Maze.numRows(maze) - 1][i] = 1;
                i = Maze.numColumns(maze);
            }
        }

        Solver.check(maze);
        Maze.print(maze);
    }
}