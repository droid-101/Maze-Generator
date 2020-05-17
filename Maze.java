class MazeTest
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

		System.out.printf("Rows: %d\n", Maze.numRows(maze));
		System.out.printf("Columns: %d\n", Maze.numColumns(maze));
		Maze.print(maze);
	}
}

class Maze
{
	public static int numRows(int [][] maze)
	{
		return maze.length;
	}

	public static int numColumns(int [][] maze)
	{
		return maze[0].length;
	}

	public static void print(int [][] maze)
	{
		for (int row = 0; row < numRows(maze); row++)
		{
			for (int column = 0; column < numColumns(maze); column++)
			{
				System.out.printf("%d", maze[row][column]);

				if (column != numColumns(maze) - 1)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.println();
				}
			}
		}
	}
}
