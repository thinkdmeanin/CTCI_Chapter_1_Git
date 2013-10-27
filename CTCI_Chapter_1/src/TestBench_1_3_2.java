import java.util.Arrays;

public class TestBench_1_3_2 {
	public static String removeDup (String str) {
		if (str == null) return str;	// avoid nullPointer Exception
		boolean[] appeared = new boolean[256];	// 256 array is powerful to check appearance & times / location
		int end = 0; // the tail of updated String
		char[] resultArray = new char[256];  // updated String
		
		for (int i = 0; i < str.length(); ++i) {
			appeared[str.charAt(i)] = true;		// flag the appeared chars
		}
		
		for (int i = 0; i < appeared.length; ++i) {
			if (appeared[i]) resultArray[end++] = (char)i;		// update the appeared chars
				// (char)65 => 'A'
		}
		String result = null;
		if (end > 0) result = new String(Arrays.copyOfRange(resultArray, 0, end));
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
