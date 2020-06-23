package intern;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class fitbit {
	public static void main(String[] args) {
		FileInputStream file = null;
		try {
			file = new FileInputStream("src/intern/input.txt"); // open the input file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        Scanner sr = new Scanner(file); // scan input file line by line
        String grid = sr.nextLine();
        int grid_x = grid.charAt(0);
        int grid_y = grid.charAt(2);
        ArrayList<Trainee> array = new ArrayList<Trainee>(); // creating arraylist to store the output
        
        while( sr.hasNextLine() ){
            String position = sr.nextLine();
            if (position.length() < 1) {
            	break;
            }
            int x = Character.getNumericValue(position.charAt(0));  
            int y = Character.getNumericValue(position.charAt(2));
            char ori = position.charAt(4);
            Trainee ee = new Trainee(x,y,ori);  // initialize the trainee
            String move = sr.nextLine();
            for(int i = 0; i < move.length(); i++) {  // move the trainee in the grid
            	char c = move.charAt(i);
            	ee.move(c);
            	if (ee.getx() > grid_x || ee.gety() > grid_y || ee.getx() < 0 || ee.gety() < 0 ) {  // check if the trainee out of grid
            		System.out.println("Exception thrown  : out of Grid");
            		return;
            	}
            }
            array.add(ee);
        }
        System.out.println("Output is:");
        for (Trainee t : array) {                                              
        	System.out.println(t.getx() + " " + t.gety() + " "+ t.getori());  // print the output
        }
        sr.close(); //close the file
    }
}
