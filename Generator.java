class GeneratorTest
{
	public static void main(String [] arg)
	{
		Stack stack = new Stack();
		stack.print();
		stack.push(new Cell(1, 2));
		stack.print();
		stack.push(new Cell(4, 6));
		stack.push(new Cell(7, 6));
		stack.push(new Cell(2, 9));
		stack.print();

		int [][] maze = generateBlankMaze(10, 10);
		Maze.print(maze);
	}

	public static int [][] generateBlankMaze(int rows, int columns)
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
