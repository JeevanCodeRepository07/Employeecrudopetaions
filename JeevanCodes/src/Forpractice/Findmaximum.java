package Forpractice;

import java.util.Collections;
import java.util.HashSet;

public class Findmaximum {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,7,20};
		miss(a);
		
		
	}
	public static void miss(int a[]) {
		HashSet<Integer> hs=new HashSet<>();
		{
			for (Integer in : a) {
				hs.add(in);
			}
		}
		int aa=Collections.max(hs);
		for(int i=0;i<=aa;i++) {
			
			System.out.println(i);
			
			}
		
	}

}
