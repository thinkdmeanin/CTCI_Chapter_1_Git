public class TestBench_1_2 {
	public static String reverseCStr (String str) {
		if (str == null) return str;
		char[] cArray = str.toCharArray();
		int len = str.length();
		char temp = '\0';
		for (int i = 0; i < (Math.floor((len-1)/2)); ++i) {
			temp = cArray[i];
			cArray[i] = cArray[len-2-i];
			cArray[len-2-i] = temp;
		}
		new String(cArray);
		return 
	}
	
	public static void main (String[] args) {
		String[] testStr = {"abcd\0", "abcde\0", "123\0", "ab1p4\0", null};
		System.out.printf("Test Strings: \t\t Reverse Result: \n");
		String temp = null;
		for (String str : testStr) {
//			temp = reverseCStr(str);
//			char[] ctemp = {'a', 'b', 'c', 'd'};
//			temp = new String(ctemp);
			System.out.printf("%s \t\t\t %s\n", str, temp);
		}
	}
}
