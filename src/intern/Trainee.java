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

    public void move(char p) {
        if (p == 'L') {
            if (this.ori == 'N') {
                this.ori = 'W';
            }else if (this.ori == 'S') {
                this.ori = 'E';
            }else if (this.ori == 'W') {
                this.ori = 'S';
            }else if (this.ori == 'E') {
                this.ori = 'N';
            }
        }else if (p == 'R') {
            if (this.ori == 'N') {
                this.ori = 'E';
            }else if (this.ori == 'S') {
                this.ori = 'W';
            }else if (this.ori == 'W') {
                this.ori = 'N';
            }else if (this.ori == 'E') {
                this.ori = 'S';
            }
        }else if (p == 'M') {
            if (this.ori == 'N') {
                this.y = this.y+1;
            }else if (this.ori == 'S') {
                this.y = this.y-1;
            }else if (this.ori == 'W') {
                this.x = this.x-1;
            }else if (this.ori == 'E') {
                this.x = this.x+1;
            }
        }
    }
}
