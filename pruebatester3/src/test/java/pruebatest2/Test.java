package pruebatest2;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class Test {
	@AfterClass
	public static void test2() {
		GoogleTest obj1=new GoogleTest();
		obj1.setUp();
		String salida= obj1.testGooglePage("10","50");
		assertEquals("5", salida);
		obj1.tearDown();
	}
	
}
