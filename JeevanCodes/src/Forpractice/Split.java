package Forpractice;

public class Split {
	public static void main(String[] args) {
		String s="jeevan sonawane";
		String ss[]=s.split(" ");
		for(int i=0;i<ss.length;i++) {
			String s1=ss[i];
			
			System.out.println(s1.charAt(0));
			
		}
	}

}
