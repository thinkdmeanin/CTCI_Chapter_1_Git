public class TestBench_1_5 {
	public static String removeSpace (String str) {
		if (str == null) return str;
		String[] words = str.split("\\s+");	// split
		
		StringBuffer result = new StringBuffer();
		for (String word : words) {
			result.append(word);	// and combine
			result.append("%20");
		}
		return result.toString(); // return converted
	}
	
	public static void main (String[] args) {
		String[] testStr = {null, "abc", "a b c", "a    b c", "a \t\tb \t \t"};
		System.out.printf("Tested String:\tNo Space String:\n");
		for (String str : testStr) {
			System.out.printf("%s\t\t%s\n", str, removeSpace(str));
		}
	}
}
