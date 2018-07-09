package Chapter1;

public class CompressString_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compress("aaabbcdd"));
	}
	
	
	static String compress(String word) {
		StringBuilder compressedWord= new StringBuilder();
		int letterCount=1;
		for (int i=0; i<word.length();i++) {
			if(i==0) compressedWord.append(word.charAt(i));
			else {
				if(word.charAt(i)==word.charAt(i-1)) letterCount++;
				else {
					compressedWord.append(letterCount);
					compressedWord.append(word.charAt(i));
					letterCount=1;
					
				}
			}
		}
		
		return compressedWord.toString();
	}

}
