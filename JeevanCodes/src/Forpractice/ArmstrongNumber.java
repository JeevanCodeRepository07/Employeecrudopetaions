package Forpractice;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=153,rem,sum=0,temp=n;
		
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum=sum+rem*rem*rem;
		}
		if(temp==sum) {
			System.out.println("armstrong");
		}
		System.out.println("not armstrong");

	}
	

}
