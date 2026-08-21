package in.string;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		
		String vowel="hello";
		int consonants=0;
		
		for (int i = 0; i < vowel.length(); i++) {
			
			char ch=vowel.charAt(i);
			
//			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			if("aeiou".contains(String.valueOf(ch))){				
				System.out.println(ch+ " is the vowels");
			} else {
				consonants++;
			}
		}
		
		System.out.println(consonants);

	}

}
