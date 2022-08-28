package java_basics;

public class String_Operations {

	public static void main(String[] args) {
		
		String S1 = "   I am learning JAVA   ";
		
		
		 System.out.println(S1.length());  // length() method
		 
		 
		 System.out.println(S1.isEmpty());   // isEmpty() method
		 
		 
		 System.out.println(S1.trim());       // trim() method
		 
		 
		 System.out.println(S1.trim().length());    // trim() + length() method
		 
		 
		 String S2 = "I want to learn Python";
		 
		 System.out.println(S1.equals(S2));         // equals() method 
		 
		 String S3 = "I Want To Learn Python";
		 
		 System.out.println(S2.equalsIgnoreCase(S3));   // equalsIgnorecase() method
		 
		 
		 System.out.println(S1.compareTo(S3));           // compare() method (S1- S3 )
		 
		 
		 System.out.println(S1.compareToIgnoreCase(S3));    // compareIgnoreCase() method  
		 
		 
		 String S4 = "10";
		 String S5 = "Selenium";
		 String S6 = "20";
		 String S7 = "JAVA";
		 
		 System.out.println(S4 +S5 + S6 + S7);
		 System.out.println(S4.concat(S5).concat(S6).concat(S7));
		 
		 System.out.println((S4 + S6) + S5 + S7);
		 
		 
		 System.out.println(String.join(" , ", S4,S5,S6,S7));    // join() method
		 
		 
		   String S8 = "I like to play cricket";    
		   
		   System.out.println(S8.subSequence(4, 12));            // subSequence() method
		   
		   System.out.println(S8.substring(8));                  // substring() method
		   System.out.println(S8.substring(4, 12));              
		   
		   

	}

}
