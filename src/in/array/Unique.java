package in.array;

public class Unique {

	public static void main(String[] args) {
		
		int a[]= {1,2,1,3,4,6,2,5,4};
		int counter=0;
		
		for(int i=0;i<a.length;i++) {
			
			
			for(int j=0;j<a.length;j++) {
				
				if (a[i]==a[j]) {
					counter++;
				}
			}
			
			if (counter==1) {
				System.out.println(a[i]);
			}
			
			counter=0;
		}
	}
}
