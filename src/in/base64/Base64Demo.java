package in.base64;

import java.util.Base64;

public class Base64Demo {
//	int x=100;
	public static void main(String[] args) {

//		Base64 is encoding techinque not encryption 
//		it is used to convert binary data(image, file, password) into a text format
//		it use the 64 ASCII character 

		String str = "Hello";
		String encode = Base64.getEncoder().encodeToString(str.getBytes());
		System.out.println(encode);

		byte[] decode = Base64.getDecoder().decode(encode);
		String decoder = new String(decode);
		System.out.println(decoder);
	

//		here we cannto access static fields directly into a static context we need object 
//		because static field, block, method is first layer data it execute first and then second layer data
		
//		Base64Demo base = new Base64Demo();
//		System.out.println(base.x);
	}
}