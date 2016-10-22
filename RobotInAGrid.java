import java.util.*;

class Cell
{

	int top;
	int left;
	int right;
	int bottom;
	int cellNumber;

	public Cell(int cellNumber)
	{

		cellNumber = cellNumber;
		top = left = right = bottom = 0;
	}
}

public class RobotInAGrid
{
	public static void main(String args[])
	{

		Cell cells[][] = new Cell[5][5];
		Cell presentCell = cells[0][0];
		moveRobotInGrid(cells, presentCell, 0, 0);
	}

	private static void moveRobotInGrid(Cell[][] cells, Cell presentCell, int row, int column)
	{

		if (row == 5 && column == 5) return;
		if (presentCell.right == 0 && presentCell.bottom == 0) return;

		if (presentCell.right == 1)	column ++;
		else row ++;

		presentCell = cells[row][column];
		moveRobotInGrid(cells, presentCell, row, column);
	}
}