package understandingtestngxml_file;

import org.testng.annotations.Test;

public class Child2 extends TestBase_Parent {
	@Test
	public void child1Addition() {
	  String Child1= "Hello";
	  String Child2 = "World";
	  
	  System.out.println(Child1 + Child2);

}
}
