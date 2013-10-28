public class TestBench_1_7 {
	public static void propagate0 (int[][] mat, int vert, int horz) {
		if ((mat == null) || (vert < 1) || (horz < 1)) return;
		boolean[] zeroVert = new boolean[vert];
		boolean[] zeroHorz = new boolean[horz];
		
		for (int i = 0; i < vert; ++i) {
			for (int j = 0; j < horz; ++j) {	// record zero row col
				if (mat[i][j] == 0) zeroVert[i] = zeroHorz[j] = true;
			}
		}
		for (int i = 0; i < vert; ++i) {
			for (int j = 0; j < horz; ++j) {
				if (zeroVert[i] || zeroHorz[j]) mat[i][j] = 0; 	// set 0 
			}
		}
		return;
	}
	
	public static void main (String[] args) {
		int[][] mat = {{1, 2, 3}, {2, 0, 3}, {1, 3, 0}, {1, 2, 5}};
		System.out.println("Original Matrix:");
		for (int[] row : mat) {
			for (int element : row) {
				System.out.printf("%d\t", element);  // mat[] gives a row
			}
			System.out.println();
		}
		
		propagate0(mat, 4, 3);
		System.out.println("New Matrix:");
		for (int[] row : mat) {
			for (int element : row) {
				System.out.printf("%d\t", element);
			}
			System.out.println();
		}		
	}
}
