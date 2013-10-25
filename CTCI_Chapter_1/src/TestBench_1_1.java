public class TestBench_1_1 {
	public static boolean checkUnique (String s) {	// function: input a string to see if all letters are unique
		if (s == null) {	// if empty => unique;  do this to remove null-pointer exception
			return true;
		}
		
		char[] c = s.toCharArray();			// convert to char array
		int[] checkList = new int[128];		// ASCII list storing the appearance frequency of ASCII chars in String 
		boolean result = true;				// initialize result to be true
		
		for (char letter : c) {			// scan through the string 
			if (checkList[letter] != 0) {	// if this char repeats 
				result = false;		// return false
				return result;
			}
			checkList[letter]++;		// otherwise update checkList
		}
		return result;		// reach here means all unique and return true
	}
	
	public static void main(String[] arg) {	// Testbench method
		String[] testList = {null, "abcde", "aaaaaaa", "abcdc", "1233", "0000000"};	
			// test empty, successive repetition, numbers
		System.out.println("Now start checking uniquenes of Strings:");
			// Info output
		for (String testWord : testList) {	// test all the words
			System.out.printf("Does \"%s\" only contain unique characters? %b\n", testWord, TestBench_1_1.checkUnique(testWord));
		}
	}
}
