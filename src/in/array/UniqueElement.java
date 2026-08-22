package in.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueElement {
	public static void main(String[] args) {
		
		int arr[]= {1,2,1,3,4,6,2,5,4};
		
		
		Map<Integer, Integer> freq=new HashMap<>();
		
		for (int num : arr) {
			freq.put(num, freq.getOrDefault(num, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entrySet : freq.entrySet()) {
			System.out.println(entrySet.getKey()+" "+entrySet.getValue());
		}
		
		
//		for(int i=0;i<arr.length;i++) {
//			int c=0;
//			for(int j=0;j<arr.length;j++) {
//				
//				if (arr[i]==arr[j]) {
//					c++;
//				}
//			}
//
//			if (c==1) {
//				System.out.println(arr[i]);
//			}			
//		}
		
		
//		3 6 5
//		int c=0;
//		for(int i=0;i<arr.length;i++) {
//			
//			c=0;
//			for(int j=0;j<arr.length;j++) {
//				
//				if (arr[i]==arr[j]) {
//					c++;
//				}
//			}
//	
//			if (c==1) {
//				System.out.print(arr[i]+" ");
//			}
//		}		
	}
}