package Forpractice;

public class removespaces {
	public static void main(String[] args) {
		String s="jeevan sonawane";
		String ss="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				ss=ss+s.substring(i,i+1);
			}
			
		}
		System.out.println("Remove spaces : "+ss);
	}

}
