package java_basics;

public class Reversingnumber_whileloop {

	public static void main(String[] args) {
		int a = 12345;
		int r;
		System.out.print("The reversed number is: ");
		while(a>0)
		{
			r= a%10;
			System.out.print(r);
			a=a/10;
			
		}

	}

}
