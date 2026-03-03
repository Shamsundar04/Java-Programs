package in.numeric;

public class RemoveAllZero {

	public static void main(String[] args) {
		
		int num=10204;
		StringBuilder remove=new StringBuilder(); 
		
		
		while (num!=0) {
			
			if (num%10!=0) {
				remove.append(num%10);
			}
			num=num/10;
		}
		String string = remove.reverse().toString();
		System.out.println(Integer.parseInt(string));
	}
}
