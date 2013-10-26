public class TestBench_1_1_Answer {
	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];	// boolean is better than int, avoid risk of misRd/Wr
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);	// implicit casting char 16 bit int 32 bit
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	public static void main(String[] args) {
		String testStr = "aabcd0";
		System.out.printf("String \"%s\" has only unique chars? %b\n", testStr, isUniqueChars2(testStr));
		testStr = null;		// answer is not bug free, if the str is empty it stuck on nullPointer exception
		System.out.printf("String \"%s\" has only unique chars? %b\n", testStr, isUniqueChars2(testStr));
	}
}
