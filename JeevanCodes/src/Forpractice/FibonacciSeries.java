package Forpractice;

public class FibonacciSeries {
public static void main(String[] args) {
	int a=10,n1=1,n2=2,temp;
	System.out.println(n1+"\n"+n2);
	int aa[]=new int[10];
	for(int i=1;i<a;i++) {
		temp=n1+n2;
		System.out.println(temp);
		n1=n2;
		n2=temp;
		aa[i]=temp;
	
		}
	System.out.println("reverse Fibonacci : -");
	for(int i=aa.length-1;i>0;i--) {
		System.out.println(aa[i]);
		
	}
	
}
}
