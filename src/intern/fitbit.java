package intern;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class fitbit {
	private String input;
	
	public fitbit(String input) {
        this.input = input;
    }
	
	public void moving() {
		FileInputStream file = null;
		try {
			file = new FileInputStream(this.input); // open the input file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        Scanner sr = new Scanner(file); // scan input file line by line
        String grid = sr.nextLine();
        int grid_x = Character.getNumericValue(grid.charAt(0));
        int grid_y = Character.getNumericValue(grid.charAt(2));
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
            	if (ee.move(c, grid_x, grid_y) == false){
            		System.out.println("Exception thrown  : out of Grid");
            		return;
            	}
            }
            array.add(ee);
        }
        for (Trainee t : array) {                                              
        	System.out.println(t.getx() + " " + t.gety() + " "+ t.getori());  // output
        }
        sr.close();
    }
	
	public void loadfile(String file) {
		this.input = file;
	}
}
