package intern;

import java.io.*;
import static org.junit.Assert.*;

public class test {
	
	public void test1() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        
        System.setOut(new PrintStream(outContent));

        
        fitbit fb1 = new fitbit("src/intern/input1.txt");
        fb1.moving();
        assertEquals("1 2 N\n" +
        		"1 3 N\n" + 
        		"5 1 E\n", outContent.toString());
	}
	
	public void test2() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        
        System.setOut(new PrintStream(outContent));

        
        fitbit fb1 = new fitbit("src/intern/input2.txt");
        fb1.moving();
        assertEquals("Exception thrown  : out of Grid\n", outContent.toString());
	}
	
	
	public static void main(String[] args) {
		test a = new test();
		a.test1();
		a.test2();
	}
}