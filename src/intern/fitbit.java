package intern;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class fitbit {
	public static void main(String[] args) {
		System.out.println("Enter Input:");
		
		FileInputStream file = null;
		try {
			file = new FileInputStream("./Trainee.java");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Scanner sr = new Scanner(file);
        String grid = sr.nextLine();
        int grid_x = grid.charAt(0);
        int grid_y = grid.charAt(2);
        ArrayList<Trainee> array = new ArrayList<Trainee>();
        
        while( sr.hasNextLine() ){
            String position = sr.nextLine();
            if (position.length() < 1) {
            	break;
            }
            int x = Character.getNumericValue(position.charAt(0));
            int y = Character.getNumericValue(position.charAt(2));
            char ori = position.charAt(4);
            Trainee ee = new Trainee(x,y,ori);
            String move = sr.nextLine();
            for(int i = 0; i < move.length(); i++) {
            	char c = move.charAt(i);
            	ee.move(c);
            	if (ee.getx() > grid_x || ee.gety() > grid_y || ee.getx() < 0 || ee.gety() < 0 ) {
            		System.out.println("Exception thrown  : out of Grid");
            		return;
            	}
            }
            array.add(ee);
        }
        System.out.println("Output is:");
        for (Trainee t : array) {
        	System.out.println(t.getx() + " " + t.gety() + " "+ t.getori());
        }
        sr.close();
    }
}
