public class TestBench_1_8_Answer {
	public static boolean isRotation(String s1, String s2) {
					// isRotation sounds much better than isRotateStr ?
		int len = s1.length();
		/*check that s1 and s2 are equal length and not empty */
		if (len == s2.length() && len > 0) {
				// avoid two if condition
			/* concatenate s1 and s1 within new buffer */
			String s1s1 = s1 + s1;	// + is way easier than StringBuffer.append!!!
			return isSubstring(s1s1, s2);
		}
		return false;
	}
}
