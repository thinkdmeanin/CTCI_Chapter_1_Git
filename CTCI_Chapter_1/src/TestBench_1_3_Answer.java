public class TestBench_1_3_Answer {
	public static void removeDuplicatesEff (char[] str) {
		if (str == null) return;
		int len = str.length;
		if (len < 2) return;
		boolean[] hit = new boolean[256];
		for (int i = 0; i < 256; ++i) {
			hit[i] = false;
		}
		hit[str[0]] = true;
		int tail = 1;
		for (int i = 1; i < len; ++i) {
			if (!hit[str[i]]) {	
				// find every new unique and copy to updated string tail and move on 
				str[tail] = str[i];
				++tail;
				hit[str[i]] = true;
			}
		}
		str[tail] = 0;
	}
	
	public static void main (String[] args) {
		String[] testStr = {"abcd", "aaaa", "aaabbbb", "ababab", null};
		System.out.printf("Tested String: \t\tCleared Sting:\n");
		char[] tmp = null;
		for (String str : testStr) {
			tmp = str.toCharArray();
			removeDuplicatesEff(tmp);
			System.out.printf("%s\t\t%s\n", str, new String(tmp));
		}
	}
}
