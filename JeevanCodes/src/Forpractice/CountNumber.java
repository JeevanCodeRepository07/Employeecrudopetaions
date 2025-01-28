package Forpractice;

public class CountNumber {
	public static void main(String[] args) {
		int n=12345,rem,count=0;
		while (n>0) {
			rem=n%10;
			n=n/10;
			count++;
			}
		System.out.println(count);

}
}