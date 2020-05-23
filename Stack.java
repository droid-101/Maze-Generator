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

	public int size()
	{
		return size;
	}

	public Cell peek()
	{
		return top;
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
