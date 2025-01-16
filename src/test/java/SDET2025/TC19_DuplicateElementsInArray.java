package SDET2025;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TC19_DuplicateElementsInArray {

	public static void main(String[] args) {

		int a[]= {20,4,5,15,24,62,78,13,68,59,35,74,85,26,4};
		
		
		// approach 1
		boolean status=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					System.out.println("Duplicate Elements are "+a[i]);
					status=true;
				}
			}
		}
		if(status==false) {
			System.out.println("No Duplicates");
		}
		
		// approach2 Hashset
		// hashset not maintain insertion order
		HashSet hs=new HashSet();
		
		for(int temp:a) {
			boolean result=hs.add(temp)	;
			if(result==false) {
				System.out.println("Duplicate element is "+temp);
			}
		}
		
		System.out.println(hs);
		
		// maintain insertion order
//		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>();
//		for(int temp:a) {
//			System.out.println(linkedHashSet.add(temp));	
//			
//		}
//		System.out.println(linkedHashSet);
		}
	
}
