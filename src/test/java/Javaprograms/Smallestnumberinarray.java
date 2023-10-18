package Javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class Smallestnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {11,12,13,14,10,12,15,16,17,18};
		System.out.println(arr.length);
		//Arrays.sort(arr);
		//Arrays.parallelSort(arr);
		//System.out.println(arr[1]);
		ArrayList list= new ArrayList();
		
		 
		
		for(int a:arr) {
			list .add(a);	
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(1));
		
	    int min=arr[0];
	    for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Min is " +min );
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max is " +max );
	}

}
