package intern;

public class Trainee {
    private int x;
    private int y;
    private char ori;

    public Trainee(int x, int y, char ori) {
        this.x = x;
        this.y = y;
        this.ori = ori;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public char getori() {
        return ori;
    }

    public Boolean move(char p, int grid_x, int grid_y) {
        if (p == 'L') {
            if (this.ori == 'N') {
                this.ori = 'W';
                return true;
            }else if (this.ori == 'S') {
                this.ori = 'E';
                return true;
            }else if (this.ori == 'W') {
                this.ori = 'S';
                return true;
            }else if (this.ori == 'E') {
                this.ori = 'N';
                return true;
            }
        }else if (p == 'R') {
            if (this.ori == 'N') {
                this.ori = 'E';
                return true;
            }else if (this.ori == 'S') {
                this.ori = 'W';
                return true;
            }else if (this.ori == 'W') {
                this.ori = 'N';
                return true;
            }else if (this.ori == 'E') {
                this.ori = 'S';
                return true;
            }
        }else if (p == 'M') {
            if (this.ori == 'N' && this.y+1 <= grid_y) {
                this.y = this.y+1;
                return true;
            }else if (this.ori == 'S' && this.y-1 > -1) {
                this.y = this.y-1;
                return true;
            }else if (this.ori == 'W' && this.x-1 > -1) {
                this.x = this.x-1;
                return true;
            }else if (this.ori == 'E' && this.x+1 <= grid_x) {
                this.x = this.x+1;
                return true;
            }
        }
		return false;
    }
}
