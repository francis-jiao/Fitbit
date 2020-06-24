package intern;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class MyUnitTest {
	
	@Test
	public void test1() {
        fitbit fb1 = new fitbit("src/intern/input1.txt");
        ArrayList<Trainee> array = fb1.moving();
        Trainee ee0 = new Trainee(1,2,'N');
        Trainee ee1 = new Trainee(1,3,'N');
        Trainee ee2 = new Trainee(5,1,'E');
        assertEquals(ee0.getx(),array.get(0).getx());
        assertEquals(ee0.gety(),array.get(0).gety());
        assertEquals(ee0.getori(),array.get(0).getori());
        assertEquals(ee1.getx(),array.get(1).getx());
        assertEquals(ee1.gety(),array.get(1).gety());
        assertEquals(ee1.getori(),array.get(1).getori());
        assertEquals(ee2.getx(),array.get(2).getx());
        assertEquals(ee2.gety(),array.get(2).gety());
        assertEquals(ee2.getori(),array.get(2).getori());
	}
}