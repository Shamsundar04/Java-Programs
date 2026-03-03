package in.string;

public class LargestAndSmallestWord {

	public static void main(String[] args) {
		String str = "Java is very powerful language";
		
		String[] split = str.split(" ");
		
		String max=split[0];
		String min=split[0];
		
		
		for (String string : split) {
			
			if (max.length()<=string.length()) {
				max=string;
			}			
			
			if (min.length()>string.length()) {
				min=string;
			}
		}
		
		System.out.println(min+" "+max);
		
	}

}
