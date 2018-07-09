package Chapter1;

public class IsPalindromePermutation_1_4 {

	public static void main(String[] args) {

		System.out.println("isPalindromePermutation: " + isPalindromePermutation("tactcoae"));

	}

	private static boolean isPalindromePermutation(String word) {

		int[] char_set = new int[128];

		for (int i = 0; i < word.length(); i++) {
			int val = word.charAt(i);
			char_set[val]++;
		}

		boolean foundOdd = false;
		for (int i : char_set) {
			if (i % 2 == 1) {
				if (foundOdd)
					return false;
				else {
					foundOdd = true;
				}
			}
		}

		return true;
	}

}
