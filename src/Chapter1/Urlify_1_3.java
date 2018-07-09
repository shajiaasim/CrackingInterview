package Chapter1;

public class Urlify_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("urlify: "+urlify("Mr Smith don   "));
	}

	@SuppressWarnings("null")
	static String urlify(String word) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<word.length();i++) {
			int val = word.charAt(i);
			if(val ==32) sb.append("%20");
			else {
				sb.append(word.charAt(i));
			}
			
		}
		
		
		return sb.toString();
	}
	
}
