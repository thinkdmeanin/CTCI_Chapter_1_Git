public class TestBench_1_4 {
	public static boolean isAnagram (String s1, String s2) {
		if (s1 == null) return false;
		if (s2 == null) return false;
		int len = s1.length();
		if (len != s2.length()) return false;
		int[] freq = new int[256]; // int[256] is so powerful!!
		
		for (int i = 0; i < len; ++i) {
			freq[ ((int) s1.charAt(i)) ]++;		// String1 check-in
		}
		
		for (int i = 0; i < len; ++i) {
			if(--freq[ ((int) s2.charAt(i)) ]  < 0) return false;	// String2 check-out
				// must be pre--, otherwise post-- will miss a letter difference!!
		}
		return true;
	}
	
	public static void main (String[] args) {
		String[] testStr1 = {null, "xyz", "xxxx", "xyz", "xyz", "xyzxzy", "1233"};
		String[] testStr2 = {null, null,  "xxx",  "xzz", "yzx", "xxzzyy", "3132"};
		System.out.printf("Tested String:\t\tAre they anagrams?\n");
		for (int i = 0; i < testStr1.length; ++i) {
			System.out.printf("%s\t%s\t\t%s\n", testStr1[i], testStr2[i], isAnagram(testStr1[i], testStr2[i]));
		}
	}
}
