public class TestBench_1_7_Answer {
	public static void setZeros (int[][] matrix) {
		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];
			// me: good way to read out 1st and 2nd dimension of a 2D matrix
			// I think there's no row/column defined in 2D mat
			// there's only 1st/2nd dimension in 2D mat
			// so how you define and use it determines which dimension is row/column
		// store the row and column index with value 0
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}
		
		// Set arr[i][j] to 0 if either row i or column j has a 0
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if ((row[i] == 1 || column[j] == 1)) {
					matrix[i][j] = 0;
				}
			}
		}
	}
}
