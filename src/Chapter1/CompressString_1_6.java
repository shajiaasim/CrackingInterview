package Chapter1;

public class CompressString_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compress("aaabbcdd"));
	}
	
	
	static String compress(String word) {
		StringBuilder compressedWord= new StringBuilder();
		int letterCount=0;
		for (int i=0; i<word.length();i++) {
			letterCount++;
			
			if (i+1==word.length()|| word.charAt(i)!=word.charAt(i+1)){
			  compressedWord.append(word.charAt(i));
			  compressedWord.append(letterCount);
			  letterCount=0;
			}
		}
		
		return compressedWord.toString();
	}

}
