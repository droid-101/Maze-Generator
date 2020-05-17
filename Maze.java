class MazeTest
{
	public static void main(String [] arg)
	{
		int [][] maze = {
			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
		};

		Maze.print(maze);
	}
}

class Maze
{
	public static void print(int [][] maze)
	{
		for (int y = 0; y < maze.length; y++)
		{
			for (int x = 0; x < maze[0].length; x++)
			{
				System.out.printf(" %d", maze[y][x]);

				if (x != maze[0].length - 1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.println();
				}
			}
		}
	}
}