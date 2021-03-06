public class TestBench_1_6_Answer {
	public static void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n/2; ++layer) {
			int first = layer;
			int last = n-1-layer;
			for (int i = first; i < last; ++i) {
				int offset = i - first;
					// me: offset sounds better than shift
				int top = matrix[first][i]; // save top	
					// me: use top instead of tmp is better
				// left -> top
					// me: show which rotation for each assignment
				matrix[first][i] = matrix[last-offset][first];
				// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset];
				// right -> bottom
				matrix[last][last-offset] = matrix[i][last];
				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
	}
}
