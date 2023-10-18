package Javaprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eneter
		//Stringbuffer
		//StringBuffer  buf = new StringBuffer("NANDA");
		//buf.append(s);
		//buf.reverse();
		//System.out.println(buf);
		
  //ownlogic
		
//		String s="NANDA";
//		int len=s.length();
//		char[] ch=s.toCharArray();
//		String rev="";
//		for(int i=ch.length-1;i>=0;i--) {
//			rev= rev +ch[i];	
//		}
//		System.out.println(rev);
		
		
	String str="Nanda";
	char[] ch= str.toCharArray();
	
	List<Character> list= new ArrayList<Character>();
	for (Character list1 : ch) {
		list.add(list1);
		
	}
Collections.reverse(list);
  Iterator it= list.iterator();
  
  while (it.hasNext()) {
	System.out.print(it.next());
	
}



	

	}

}
