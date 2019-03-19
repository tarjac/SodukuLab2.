package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;



public class Sudoku extends LatinSquare {
	

		private int size;
		private int sqrtSize;
		

		public Sudoku(int iSize) throws Exception {
			super();
			double dbSqrtSize;
			size = iSize;
			dbSqrtSize = Math.sqrt(iSize);
			if(Math.floor(sqrtSize) == sqrtSize){
				sqrtSize = (int) dbSqrtSize;
			}
			else {
				throw new Exception("sqrtSize is not valid.");
			}
	}

	public Sudoku(int[][] latinsquare) throws Exception{
		super(latinsquare);
		double dbSqrtSize;
		size = getLatinSquare().length;
		dbSqrtSize = Math.sqrt(size);
		if(Math.floor(sqrtSize) == sqrtSize) {
			sqrtSize = (int) dbSqrtSize;
		}
		else {
			throw new Exception("sqrtSize is not valid.");
		}
	}
	
	protected int[][] getPuzzle()
	{
		return super.getLatinSquare();
	}
		
	protected int[] getRegion(int r) throws Exception
	{
		int[] myRegion = new int[this.getLatinSquare().length];
		int idx = 0;
		int iSize = this.getLatinSquare().length;
		int iSizeSqrt = (int) Math.sqrt(iSize);
		
		if ((r+1) > iSize)
			throw new Exception("Bad Region Call");
		
		for (int iRow = (r/iSizeSqrt * iSizeSqrt); iRow < ((r / iSizeSqrt)* iSizeSqrt)+ iSizeSqrt; iRow++){
			for(int iCol = (r % iSizeSqrt) * iSizeSqrt; iCol < ((r % iSizeSqrt) * iSizeSqrt) + iSizeSqrt; iCol++)
					myRegion[idx++] = super.getLatinSquare()[iRow][iCol];
		
		}
		return myRegion;		
		}

	protected int[] getRegion(int iCol, int iRow) throws Exception {
	{
		int iSize = getLatinSquare().length;
		int iSizeSqrt = (int) Math.sqrt(iSize);
		
		int i = (iCol / iSizeSqrt) + ((iRow / iSizeSqrt)* iSizeSqrt);
		
		return getRegion(i);
		}
	}
	
	protected boolean isSudoku() {

		if (hasDuplicates())
			return false;
		
		if (!super.isLatinSquare())
			return false;
		
		for (int i = 1; i < super.getLatinSquare().length; i++) {

			if (!hasAllValues(getRow(0), getRegion(i))) {
				return false;
			}
		}

		if (ContainsZero()) {
			return false;
		}

		return true;
	}

	protected boolean isPartialSudoku() {

		if (hasDuplicates()) {
			return false;
		}
		if (!ContainsZero()) {
			return false;
		}

	}
public boolean isValidValue(int iCol, int iRow, int iValue) {
		
		if (doesElementExist(super.getRow(iRow),iValue))
		{
			return false;
		}
		if (doesElementExist(super.getColumn(iCol),iValue))
		{
			return false;
		}
		if (doesElementExist(this.getRegion(iCol, iRow),iValue))
		{
			return false;
		}
		
		return true;
	}
}