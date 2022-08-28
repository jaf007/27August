package java_basics;

public class Reversing_number {

	public static void main(String[] args) {
		
		int n= 12345;
		int r,a,b,c,d,e;
		
		a= n%10;
		n= n/10;
		b= n%10;
		n= n/10;
		c= n%10;
		n= n/10;
		d= n%10;
		n= n/10;
		e= n;
		
		r= a*10000 + b*1000+ c*100 + d*10 + e;
		
		System.out.println(r);

	}

}
