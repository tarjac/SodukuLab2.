
public class SodukuTest {



@Test
public void getRegion_test1() {

	int [][] arr1 = {{1,2,3},{3,1,2},{2,3,1}};
		int[] bExpected = {1,3,2};

		assertEquals(bExpected, LatinSquare.getRegion(0));

		}

@Test
public void getRegion_test2() {
		int [][] arr2 = {{4,5,6},{6,4,5},{5,6,4}};
		int[] bExpected = {4,6,5};

		assertEquals(bExpected, LatinSquare.getRegion(0));

		}
	
	
	
}
@Test
public void isSudoku_test1() {
	
	int[][] arr1= {{11,2,13},{5,6,7},{10,11,0}};
	boolean bExpected = false;
	boolean bActual = Soduku.isSoduku(arr1);
	assertEquals(bExpected, bActual);
	
}
@Test
public void isSudoku_test2() {
	int[][] arr1= {{1,2,3},{2,3,1},{3,1,2}};
	boolean bExpected = true;
	boolean bActual = Soduku.isSoduku(arr1);
	assertEquals(bExpected, bActual);
	}
	
	
	
@Test
public void isPartialSoduku_test1() {

	int[][] arr1= {{1,12,3},{5,10,7},{10,11,0}};
	boolean bExpected = false;
	boolean bActual = Soduku.isPartialSoduku(arr1);
	assertEquals(bExpected, bActual);
	
}

@Test
public void isPartialSoduku_test2() {
	int[][] arr1= {{1,2,3},{2,3,1},{3,1,2}};
	boolean bExpected = true;
	boolean bActual = Soduku.isPartialSoduku(arr1);
	assertEquals(bExpected, bActual);
	}
	


@Test
public void isValueValid_test() {

	int [] arr1 = {1,2,3,4,5};
	int [] arr2 = {1,2,3,4,5};

	boolean bExpected = true;
	boolean bActual = Soduku.isValueValid(arr1,arr2);


	assertEquals(bExpected, bActual);
	assertEquals(0, Arrays.compare(arr1, arr2));
}
	
@Test
public void isValueValid_test() {	

	int [] arr1 = {1,2,3,4,6};
	int [] arr2 = {1,2,3,4,5};

	boolean bExpected = false;
	boolean bActual = Soduku.isValueValid(arr1,arr2);


	assertEquals(bExpected, bActual);
	assertEquals(0, Arrays.compare(arr1, arr2));
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
