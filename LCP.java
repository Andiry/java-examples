import java.util.*;

public class LCP {
	public static void main(String [] args)
	{
		LCP test = new LCP();
		String ret = null;
		ret = test.longestCommonPrefix(new String[] {"flower", "flow", "flwwww"});
		System.out.println(ret);
	}

    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1)
            return "";
        
        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
      
	System.out.println(strs[0]);
	System.out.println(strs[1]);
	System.out.println(strs[2]);
 
        String candidate = strs[0];
        int i = 0;
        int j;
        for (i = 1; i < strs.length; i++) {
            int len = candidate.length();
            for (j = 0; j < len; j++) {
                if (candidate.charAt(j) != strs[i].charAt(j)) {
                    candidate = candidate.substring(0, j);
			break;
                }
            }
            if (j == 0)
                return "";
        }
        
        return candidate;
    }
}
