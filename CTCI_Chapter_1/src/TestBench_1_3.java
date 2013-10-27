import java.util.Arrays;

public class TestBench_1_3 {
	public static String removeDup (String str) {
		if (str == null) return str;	// avoid nullPointer Exception
		char[] cArray = str.toCharArray();
		int[] lastAppear = new int[256];	// record the index this ASCII char last appears in str
		int len = str.length();
		int val = -1;	// store the int casted from ASCII
		int end = 0;	// store the next position to put in new unique char
		
		for (int i = 0; i < lastAppear.length; ++i) {
			lastAppear[i] = -1;		// reset lastAppear array to -1
		}
		
		for (int i = 0; i < len; ++i) {
			val = cArray[i];	// cast ASCII char to int
			if (lastAppear[val] != -1) {	// if appears again
				cArray[lastAppear[val]] = '\0';		// clear the pre-appear char in cArray
			}
			lastAppear[val] = i;	// anyway record the only and newest appear position of such char
		}
		
		for (int i = 0; i < len; ++i) {
			if (cArray[i] != '\0') cArray[end++] = cArray[i];	// record each unique char to the beginning string tail
		}
		
		String result = null;	// if all char is '\0'
		if (end > 0)  result = new String(Arrays.copyOfRange(cArray, 0, end));	// if not all char is '\0', copy to a String
			// be very careful that: Arrays.copyOfRange(<arrayName>, from, to) => from: 1 to: 4 copys [1],[2],[3] element!!
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
