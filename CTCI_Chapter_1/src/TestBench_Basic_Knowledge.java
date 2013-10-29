import java.util.HashMap;

public class TestBench_Basic_Knowledge {
	public HashMap<Integer, Student> buildMap (Student[] students) {
			// only object allowed in HashMap! int cause error
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		for (Student s : students) map.put(s.getId, s); // Hashmap use put
		return map;
	}
	
	public ArrayList<String> merge (String[] words, String[] more) {
		ArrayList<String> sentence = new ArrayList<String>();
		for (String w : words) sentence.add(w);	// ArrayList use add
		for (String m : more) sentence.add(m);
		return sentence;
	}
	
	public String makeSentence (String[] words) {
		StringBuffer sentence = new StringBuffer();
		for (String w : words) sentence.append(w); //StringBuffer use append
		return sentence.toString();
	}
}
