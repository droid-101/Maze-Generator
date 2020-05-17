class Maze
{
	private static final String RESET = "\u001B[0m";
	private static final String RED = "\u001B[31m";  // 3
	private static final String GREEN = "\u001B[32m";  // 2
	private static final String BLUE = "\u001B[34m";  // 1

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
				switch (maze[row][column])
				{
					case 1:
						System.out.print(BLUE);
						break;
					case 2:
						System.out.print(GREEN);
						break;
					case 3:
						System.out.print(RED);
						break;
					default:
						System.out.print(RESET);
						break;
				}

				System.out.printf("%d", maze[row][column]);
				System.out.print(RESET);

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

		System.out.printf("mRows: %d\n", Maze.numRows(maze));
		System.out.printf("Columns: %d\n", Maze.numColumns(maze));
		Maze.print(maze);
	}
}
