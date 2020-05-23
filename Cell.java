class Cell
{
	public int row;
	public int column;
	public Cell previous;
	public boolean [] next;

	Cell(int row, int column, int from)
	{
		this.row = row;
		this.column = column;
		this.previous = null;
		this.next = new boolean[4];

		for (int i = 0; i < next.length; i++)
		{
			next[i] = false;
		}

		next[from] = true;
	}
}
