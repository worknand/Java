package Javaprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Missingalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Nandakumar";
		s=s.toLowerCase();
		s.trim();
		String[] str=s.split("");
		System.out.println(s);
		String[] check=("abcdefghijklmnopqrstuvwxyz").split("");
		
		HashSet set1=new HashSet();
		for(String old:str) {
			set1.add(old);
		}
		System.out.println(set1);
		
		HashSet set2=new HashSet();
		for(String old1:check) {
			set2.add(old1);
		}
		System.out.println(set2);
		
		System.out.println(set2.removeAll(set1));
		System.out.println(set2);
		int len=set2.size();
		System.out.println(len);
		
		
		
		}

	}


