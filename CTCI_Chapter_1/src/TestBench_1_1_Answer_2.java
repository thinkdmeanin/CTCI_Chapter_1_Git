public class TestBench_1_1_Answer_2 {
	public static boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); ++i) {
			int val = str.charAt(i) - 'a';	// use 32bit int as an array
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}
	
	public static void main (String[] args) {
		String testStr = "abcae";
		System.out.printf("Is String \"%s\" composed of unique chars? %b\n", testStr, isUniqueChars(testStr));
	}
}
