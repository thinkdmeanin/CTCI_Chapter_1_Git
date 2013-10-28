public class TestBench_1_6 {
	public static void rotate90 (int[][] mat, int dim) {
		if ((mat == null) || (dim < 2)) return;
		rotate90(mat[1][1], dim-2);
		
	}
}
