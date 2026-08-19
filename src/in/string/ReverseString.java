package in.string;

public class ReverseString {

	public static void main(String[] args) {
		
		
		int[] arr = {3, 1, 3, 4, 5};
		//repeating and missing
		
		boolean visited[]=new boolean[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int count=1;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			
			if (count>1) {
				System.out.println(arr[i]);
			}
		}
		

//		String word = "Hello";
//		
//		String reverse="";
//		
//		for(int i=word.length()-1;i>=0;i--) {
//			reverse+=word.charAt(i);
//		}
//
//		System.out.println(reverse);
//
//		String word1 = new StringBuilder(word).reverse().toString();
//		System.out.println(word1);
	}
}
