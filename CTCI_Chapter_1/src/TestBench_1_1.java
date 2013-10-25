public class TestBench_1_1 {
	public static boolean checkUnique (String s) {
		if (s == null) {
			return true;
		}
		char[] c = s.toCharArray();
		int[] checkList = new int[128];
		boolean flag = true;
		for (char letter : c) {
			if (checkList[letter] != 0) {
				flag = false;
				return flag;
			}
			checkList[letter]++;
		}
		return flag;
	}
	
	public static void main(String[] arg) {
		String[] testList = {null, "abcde", "aaaaaaa", "abcdc", "1233", "0000000"};
		System.out.println("Now start checking uniquenes of Strings:");
		for (String testWord : testList) {
			System.out.printf("Does \"%s\" only contain unique characters? %b\n", testWord, TestBench_1_1.checkUnique(testWord));
		}
	}
}
