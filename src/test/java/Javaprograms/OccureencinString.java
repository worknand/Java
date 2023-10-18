package Javaprograms;

public class OccureencinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s="NandaKumar";
//		s=s.toLowerCase();
//		
//		char find = 'n';
//		
//		int occ=0;
//		char[] ch=s.toCharArray();
////		 for(char c:ch) {
////			 if(c==find) {
////				occ++; 
////			 }
////		 }
//		for (int i = 0; i < ch.length; i++) {
//			if(ch[i]==find) {
//				occ=occ+1;
//			}
//			
//		}
//		 System.out.println(occ);
//	}
     // withoutiteration
		
		String s="Nandakumar";
		s=s.toLowerCase();
		char find='A';
		String tofind=Character.toString(find).toLowerCase();;
		int actual=s.length();
		System.out.println(actual);
		s=s.replaceAll(tofind, "");
		int changelen=s.length();
		System.out.println(changelen);
		int occ=actual-changelen;
		System.out.println("number of occurence" +" " +occ );
	}		
}
