package java_basics;

public class For_loop2 {

	public static void main(String[] args) {
		int sum= 0;
		for(int i=5; i<=500; i+= 5)
		{
          sum= sum + i;
	}
		System.out.println("Sum of first 100 multiples of 5 is: " + sum);
	}
}


