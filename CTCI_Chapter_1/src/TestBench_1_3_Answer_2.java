
public class TestBench_1_3_Answer_2 {
	public static void removeDuplicates (char[] str) {
		if (str == null) return;
		int len = str.length;
		if (len < 2) return;
		
		int tail = 1;
		
		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j]) break;
			}
			if (j == tail) {
				str[tail] = str[i];
				++tail;
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
			removeDuplicates(tmp);
			System.out.printf("%s\t\t%s\n", str, new String(tmp));
		}
	}
}


