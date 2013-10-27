import java.util.Arrays;

public class TestBench_1_3 {
	public static String removeDup (String str) {
		if (str == null) return str;
		char[] cArray = str.toCharArray();
		int[] lastAppear = new int[256];
		int len = str.length();
		int val = -1;
		int end = 0;
		
		for (int i = 0; i < lastAppear.length; ++i) {
			lastAppear[i] = -1;
		}
		
		for (int i = 0; i < len; ++i) {
			val = cArray[i];
			if (lastAppear[val] != -1) {
				cArray[lastAppear[val]] = '\0';
			}
			lastAppear[val] = i;
		}
		
		for (int i = 0; i < len; ++i) {
			if (cArray[i] != '\0') cArray[end++] = cArray[i];
		}
		
		String result = null;
		if (end > 0)  result = new String(Arrays.copyOfRange(cArray, 0, end));
		return result;
	}
	
	public static void main (String[] args) {
		String[] testStr = {"aabbccdd", "abacdeggeg", "00113355", "03rv689ut8ur9", null};
		System.out.printf("Tested String: \t\tCleared Sting:\n");
		for (String str : testStr) {
			System.out.printf("%s\t\t%s\n", str, removeDup(str));
		}
	}
}
