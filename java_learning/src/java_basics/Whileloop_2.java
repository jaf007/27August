package java_basics;

public class Whileloop_2 {

	public static void main(String[] args) {
		int i= 1;
		int sum= 0;
		
		while (i <= 1000)
		{
		sum = sum + (i * 5);
		i= i + 1;
		}
		System.out.println(sum);
	}

}
