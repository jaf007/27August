package java_basics;

public class Whileloop_sum {

	public static void main(String[] args) {
		
		int i= 5;
		int sum= 0;
		while (i <= 5000)
		{
           sum = sum + i;
           i = i+5;
		}
		System.out.println(sum);
	}

}
