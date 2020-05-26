import java.util.Scanner;

class GeneratorTest
{
	public static void main(String [] arg)
	{
		int [][] maze = Generator.generateMaze(10, 10, false);
		Maze.print(maze);
	}
}

class Generator
{
	private static final int NORTH = 0;
	private static final int EAST = 1;
	private static final int SOUTH = 2;
	private static final int WEST = 3;
	private static final int DONE = -1;

	private static final String [] directionNames = {"NORTH", "EAST", "SOUTH", "WEST"};

	public static int [][] generateMaze(int rows, int columns, boolean step)
	{
		int [][] maze = generateBlankMaze(rows, columns);
		Stack stack = new Stack();
		int row = 1;
		int column = 1;
		int direction = NORTH;
		int returnDirection = NORTH;

		Scanner wait = new Scanner(System.in);

		stack.push(new Cell(row, column, NORTH));
		maze[row][column] = 1;

		while (stack.size() > 0)
		{
			row = stack.peek().row;
			column = stack.peek().column;
			direction = chooseRandomDirection(stack.peek().next);
			maze[row][column] = 2;

			if (direction == DONE)
			{
				stack.pop();
				maze[row][column] = 1;
				continue;
			}

			switch (direction)
			{
				case NORTH:
					row -= 1;
					returnDirection = SOUTH;
					break;

				case EAST:
					column += 1;
					returnDirection = WEST;
					break;

				case SOUTH:
					row += 1;
					returnDirection = NORTH;
					break;

				case WEST:
					column -= 1;
					returnDirection = EAST;
					break;
			}

			if (!validDirection(maze, row, column))
			{
				row = stack.peek().row;
				column = stack.peek().column;
				stack.peek().next[direction] = true;
				continue;
			}

			stack.peek().next[direction] = true;
			stack.push(new Cell(row, column, returnDirection));

			if (step)
			{
				Maze.print(maze);
				wait.nextLine();
				// System.out.printf("(%d, %d) Stack: %d, NORTH: %b, EAST: %b, SOUTH: %b, WEST: %b\n", stack.peek().row, stack.peek().column, stack.size(), stack.peek().next[NORTH], stack.peek().next[EAST], stack.peek().next[SOUTH], stack.peek().next[WEST]);
			}

			maze[row][column] = 1;
		}

		return maze;
	}

	private static boolean validDirection(int [][] maze, int row, int column)
	{
		if (outsideBorder(maze, row, column))
		{
			// System.out.println("OUTSIDE BORDER");
			return false;
		}

		if (isDestructive(maze, row, column))
		{
			// System.out.println("IS DESTRUCTIVE");
			return false;
		}

		return true;
	}

	private static boolean outsideBorder(int [][] maze, int row, int column)
	{
		if (row < 1 || row > Maze.numRows(maze) - 2)
		{
			return true;
		}

		if (column < 1 || column > Maze.numColumns(maze) - 2)
		{
			return true;
		}

		return false;
	}

	private static boolean isDestructive(int [][] maze, int row, int column)
	{
		int count = 0;

		if (maze[row + 1][column] != 0)
		{
			count++;
		}

		if (maze[row - 1][column] != 0)
		{
			count++;
		}

		if (maze[row][column + 1] != 0)
		{
			count++;
		}

		if (maze[row][column - 1] != 0)
		{
			count++;
		}

		return (count > 1);
	}

	private static int [][] generateBlankMaze(int rows, int columns)
	{
		if (rows <= 0 || columns <= 0)
		{
			System.out.printf("ERROR: Invalid maze dimensions [%d, %d]", rows, columns);
			return null;
		}

		int [][] maze = new int[rows][columns];

		// initialize maze with zeros
		for (int row = 0; row < Maze.numRows(maze); row++)
		{
			for (int column = 0; column < Maze.numColumns(maze); column++)
			{
				maze[row][column] = 0;
			}
		}

		return maze;
	}

	private static int chooseRandomDirection(boolean [] next)
	{
		int visited = 0;

		for (int i = 0; i < next.length; i++)
		{
			if (next[i] == true)
			{
				visited++;
			}
		}

		if (visited == next.length)
		{
			return -1;
		}

		int random = 0;

		do
		{
			random = (int)(Math.abs(10 * Math.random()));
		}
		while (random > 3 || next[random] == true);

		return random;
	}
}
