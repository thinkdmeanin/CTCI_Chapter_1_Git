public class TestBench_1_8 {
	public static boolean isRotateStr (String s1, String s2) {
		if ( (s1 == null) || (s2 == null) ) return false;
		if ( s1.length() != s2.length() ) return false;
		StringBuffer sb = new StringBuffer().append(s2).append(s2);
		return isSubString(s1, sb.toString());
	}
}
