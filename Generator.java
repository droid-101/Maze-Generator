class GeneratorTest
{
	public static void main(String [] arg)
	{
		// Stack stack = new Stack();
		// stack.print();
		// stack.push(new Cell(4, 6));
		// stack.push(new Cell(7, 6));
		// stack.push(new Cell(2, 9));
		// stack.print();
		// Cell last = stack.pop();
		// System.out.println(last.row);
		// System.out.println(last.column);
		// stack.pop();
		// stack.pop();
		// stack.print();
		// stack.print();

		int [][] maze = Generator.generateMaze(16, 16);
	}
}

class Generator
{
	public static int [][] generateMaze(int rows, int columns)
	{
		int [][] maze = generateBlankMaze(rows, columns);
		Stack stack = new Stack();

		int row = 1;
		int column = 1;
		int direction = 0;
		Cell lastCell = null;

		for (int i = 0; i < 10000; i++)
		{
			if (validDirection(maze, row, column))
			{
				maze[row][column] = 1;
				Maze.print(maze);
			}
			else
			{
				lastCell = stack.pop();
				row = lastCell.row;
				column = lastCell.column;
			}

			stack.push(new Cell(row, column));
			direction = chooseRandomDirection();
			printDirection(direction);

			row = applyDirectionRow(direction, row);
			column = applyDirectionColumn(direction, column);
		}

		return maze;
	}

	private static boolean validDirection(int [][] maze, int row, int column)
	{
		if (outsideBorder(maze, row, column))
		{
			System.out.println("OUTSIDE BORDER");
			return false;
		}

		// if (alreadyVisited(maze, row, column))
		// {
		// 	System.out.println("ALREADY VISITED");
		// 	return false;
		// }

		if (isDestructive(maze, row, column))
		{
			System.out.println("IS DESTRUCTIVE");
			return false;
		}

		return true;
	}

	private static void printDirection(int direction)
	{
		switch (direction)
		{
			case 0:
				System.out.println("RIGHT");
				break;
			case 1:
				System.out.println("DOWN");
				break;
			case 2:
				System.out.println("LEFT");
				break;
			case 3:
				System.out.println("UP");
				break;
		}
	}

	private static int applyDirectionRow(int direction, int row)
	{
		if (direction == 1)
		{
			return row + 1;
		}

		if (direction == 3)
		{
			return row - 1;
		}

		return row;
	}

	private static int applyDirectionColumn(int direction, int column)
	{
		if (direction == 0)
		{
			return column + 1;
		}
		else if (direction == 2)
		{
			return column - 1;
		}

		return column;
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

	private static boolean alreadyVisited(int [][] maze, int row, int column)
	{
		if (maze[row][column] != 0)
		{
			return true;
		}

		return false;
	}

	private static boolean isDestructive(int [][] maze, int row, int column)
	{
		if (maze[row][column] == 1)
		{
			return false;
		}

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

	private static int chooseRandomDirection()
	{
		int random = 0;

		do
		{
			random = (int)(Math.abs(100 * Math.random()));
		}
		while (random > 3);

		return random;
	}
}

class Cell
{
	public int row;
	public int column;
	public Cell previous;

	Cell(int row, int column)
	{
		this.row = row;
		this.column = column;
		this.previous = null;
	}
}

class Stack
{
	private Cell top;
	private int size;

	Stack()
	{
		top = null;
		size = 0;
	}

	public void push(Cell nextCell)
	{
		nextCell.previous = top;
		top = nextCell;
		size++;
	}

	public Cell pop()
	{
		Cell nextCell = top;
		top = nextCell.previous;
		nextCell.previous = null;
		size--;
		return nextCell;
	}

	public void print()
	{
		if (top == null)
		{
			System.out.println("EMPTY STACK");
			return;
		}

		Cell iterator = top;

		while (iterator != null)
		{
			System.out.printf("Row: %d, Column %d\n", iterator.row, iterator.column);
			iterator = iterator.previous;
		}
	}
}
