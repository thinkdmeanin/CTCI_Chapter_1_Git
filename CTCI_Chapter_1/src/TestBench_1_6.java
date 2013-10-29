public class TestBench_1_6 {
	public static void rotate90 (int[][] mat, int outDim, int rotDim) {
			// I don't know how to pass a reference of partial matrix in Java,
			// so I pass a reference to whole matrix and provide outer and target dimension range
		if ((mat == null) || (rotDim < 2) || (outDim < rotDim)) return;
			// if empty, if no need to rotate, if wrong arg => return
		TestBench_1_6.rotate90(mat, outDim, rotDim-2);
			// Otherwise, pass the inner matrix for rotation
		int tmp;	// tmp for value swap
		int shift = (outDim-rotDim)/2;	// start diff, the dimension of top-left corner  
			// X O O		shift is the dimension of X         e.g. 1
			// O Y O		rotDim is that of Y (rotate target) e.g. 1
			// O O O		outDim is that of the whole mat     e.g. 3
		
		for (int i = 0; i < rotDim-1; ++i) {	
				// rotate the four sides of outermost circle together
				// At each step, rotate four elements in four sides  
				// 1 major mistake here is mass up +/- shift
				// should always +shift because index is calculated from top-left
			tmp = mat[shift][shift+i];
			mat[shift][shift+i] = mat[shift+i][shift+rotDim-1];
			mat[shift+i][shift+rotDim-1] = mat[shift+rotDim-1][shift+rotDim-1-i];
			mat[shift+rotDim-1][shift+rotDim-1-i] = mat[shift+rotDim-1-i][shift];
			mat[shift+rotDim-1-i][shift] = tmp;
		}
		return;
	}
	
	public static void printMat (int[][] mat) {
		if (mat == null) return;
		for (int[] row : mat) {
			for (int element : row) {
				System.out.printf("%d\t", element);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	public static void main (String[] args) {
		int[][] mat = {{1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7}};
		System.out.println("The Original Matrix:");
		TestBench_1_6.printMat(mat);
		
		TestBench_1_6.rotate90(mat, 7, 6);	// rotate partial mat to test
		System.out.println("After rotate90(mat, 7, 6); The Rotated Matrix:");
		TestBench_1_6.printMat(mat);
		
		TestBench_1_6.rotate90(mat, 7, 5);	// rotate partial mat to test
		System.out.println("After rotate90(mat, 7, 5); The Rotated Matrix:");
		TestBench_1_6.printMat(mat);
	}
}
