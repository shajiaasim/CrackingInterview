package Chapter1;

public class OneEditAway_1_5 {

	
	public static void main(String[] args) {
	
		System.out.println("isOneEditAway: "+isOneEditAway("bale","ble"));
	}

	private static boolean isOneEditAway(String word1, String word2) {
		// TODO Auto-generated method stub
		
		if(word1.length()==word2.length()) {
			return isOneReplaceAway(word1,word2);
		} else if(word1.length()>word2.length()) {
			return isOneInsertAway(word1,word2);
		}
		
		
		return true;
	}

	private static boolean isOneInsertAway(String word1, String word2) {
		// TODO Auto-generated method stub
	int index1=0;
	int index2=0;
	
		while (index1<word1.length() && index2<word2.length()) {
			
			if (word1.charAt(index1)!=word2.charAt(index2)) {
				if(index1!=index2) {
					return false;
				}else {
					index1++;
				}
			} else {
				index1++;
				index2++;
			}
		}
		
		return true;
	}

	private static boolean isOneReplaceAway(String word1, String word2) {
		// TODO Auto-generated method stub
		boolean foundReplacement= false;
		for (int i=0; i<word1.length();i++) {
			
			if(!(word1.charAt(i)==word2.charAt(i)))
			if (!foundReplacement) {
				foundReplacement=true;
			} else {
				return false;
			}
			
		}
		
		return true;
	}
	
	
	
}
