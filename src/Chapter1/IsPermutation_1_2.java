package Chapter1;

public class IsPermutation_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("isPermutationTwoWords: " + isPermutation2("elloh", "hello"));
	}

	// 1.2_A
	static boolean isPermutation(String word1, String word2) {

		if (!(word1.length() == word2.length()))
			return false;

		for (int i = 0; i < word1.length(); i++) {
			boolean found = false;
			char c = word1.charAt(i);
			for (int j = 0; j < word2.length(); j++) {
				if (word2.charAt(j) == c) {
					found = true;
					break;
				}
			}

			if (found)
				continue;
			else {
				return false;
			}

		}
		return true;
	}

	// 1.2_B
	static boolean isPermutation2(String word1, String word2) {

		if (!(word1.length() == word2.length()))
			return false;

		boolean[] char_set = new boolean[128];

		for (int i = 0; i < word1.length(); i++) {
			int val = word1.charAt(i);
			char_set[val] = true;
		}

		for (int j = 0; j < word2.length(); j++) {
			int val = word2.charAt(j);
			if (!char_set[val])
				return false;
		}
		return true;

	}
}
